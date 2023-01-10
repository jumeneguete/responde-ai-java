public class App {
    public static void main(String[] args) throws Exception {
        // Testing Examples
        Student student = new Student("Juliana", "Meneguete", "111.222.333-04");
        Address address = new Address("Rua Aristóteles", "812", "Catete", 
                                        "Rio de Janeiro", "RJ", "20990-000");

        student.setAddress(address);
        System.out.println(student.getRegistrationStatus());
        System.out.println(student.getRegistrationCode());
        System.out.println(student.getAddress().getCity());
        
    }
}
