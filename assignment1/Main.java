public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setLength(4);
        rect1.setWidth(40);
        System.out.println(rect1.toString());
        System.out.println();

        Rectangle rect2 = new Rectangle();
        rect2.setLength(3.5);
        rect2.setWidth(39.5);
        System.out.println(rect2.toString());
        System.out.println();
        System.out.println();


        Person person = new Person();
        person.name = "Rou";
        person.age = 23;
        person.gender = "Female";
        person.id = 20101313;
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
        System.out.println("ID: " + person.id);
        System.out.println();
        

        Person person2 = new Person();
        person2.name = "Hassan";
        person2.age = 19;
        person2.gender = "Male";
        person2.id = 20101313;
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
        System.out.println("Gender: " + person2.gender);
        System.out.println("ID: " + person2.id);
        System.out.println();
        

        Person person3 = new Person();
        person3.name = "Zyad";
        person3.age = 26;
        person3.gender = "Male";
        person3.id = 20101313;
        System.out.println("Name: " + person3.name);
        System.out.println("Age: " + person2.age);
        System.out.println("Gender: " + person2.gender);
        System.out.println("ID: " + person2.id);
        System.out.println();
        System.out.println();
        


        BankAccount account = new BankAccount();
        account.balance = 1000;
        account.accountNumber = "123456789";
        account.annualInterestRate = 0.05;
        account.deposit(100);
        account.withdraw(50);
        System.out.println(account.toString());
        System.out.println();
        

        BankAccount account2 = new BankAccount();
        account2.balance = 175800;
        account2.accountNumber = "123456789";
        account2.annualInterestRate = 0.25;
        account2.deposit(6000);
        account2.withdraw(24000);
        System.out.println(account2.toString());
    }

}
