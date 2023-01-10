class Student {
  private String name;
  private String surname;
  private String cpf;
  private String email;
  private String registrationCode;
  private String registrationStatus;
  private Address address = new Address();

  public Student (String name, String surname, String cpf) {
    this.name = name;
    this.surname = surname;
    this.cpf = cpf;
    this.registrationStatus = "ACTIVE";
    this.registrationCode = this.setRegistrationCode();
  }

  private String setRegistrationCode() {
    double f = Math.random()/Math.nextDown(1.0);
    double x = (2*(1.0 - f) + 8*f)*100000;
    int y = (int)x;
    return y + "RA";
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getSurname() {
      return surname;
  }

  public void setSurname(String surname) {
      this.surname = surname;
  }

  public String getCpf() {
      return cpf;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getRegistrationCode() {
      return registrationCode;
  }

  public String getRegistrationStatus() {
      return registrationStatus;
  }

  public void setRegistrationStatus(String registrationStatus) {
    if (registrationStatus == "ACTIVE"){
        this.registrationStatus = registrationStatus;
    } else if (registrationStatus == "INACTIVE") {
        this.registrationStatus = registrationStatus;
    }
      
  }

  public Address getAddress() {
      return address;
  }

  public void setAddress(Address address) {
      this.address = address;
  }
}
