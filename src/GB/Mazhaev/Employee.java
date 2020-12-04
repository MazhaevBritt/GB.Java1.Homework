package GB.Mazhaev;

public class Employee {
    private String fullName;
    private int age;
    private String position;
    private int salary;
    private String p_number;
    private String e_mailAddress;



    public Employee (String fullName, int age,  String position, int salary, String p_number, String e_mailAddress) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.p_number = p_number;
        this.e_mailAddress = e_mailAddress;
    }

    public void getInfoEmployee () {
        System.out.println("Ф.И.О. - " + fullName + " Возраст - " + age);
        System.out.println("Должность - " + position + " З/п - " + salary);
        System.out.println("Телефонный номер: " + p_number + " Почта: " + e_mailAddress);
        System.out.println("---------------------------------------------------------");
    }

    public int getAge() {
        return age;
    }
}