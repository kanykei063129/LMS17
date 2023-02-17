public class Main {
    public static void main(String[] args) {
    Java java1 = new Java("Davran", 17,"M","davran@gmail.com");
    Java java2 = new Java("Khafiz",18,"M","khafiz@gmail.com");
    Java java3 = new Java("Madina",16,"F","madina@gmail.com");
    Java java4 = new Java("Kanykei",16,"F","kanykei@gmail.com");
    Java java5 = new Java("Dastan",19,"M","dastan@gmail.com");

    Android android1 = new Android("Ernazar",20,"M","ernazar@gmail.com");
    Android android2 = new Android("Aizad",19,"F","aizad@gmail.com");
    Android android3 = new Android("Kutman",18,"M","kutman@gmail.com");

    Go go1 = new Go("Manas",28,"M","manas@gmail.com");
    Go go2 = new Go("Adilet",19,"M","manas@gmail.com");

    Java[] javas={java1,java2,java3,java4,java5};
    Android [] androids ={android1,android2,android3};
    Go[] gos = {go1,go2};
        System.out.println("Peaksoft company:");
    Company company = new Company("Alamidin-1",javas,androids,gos,"Davran");
        System.out.println(company);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Java java6 = new Java("Adilet",22,"M","adilet@gmail.com");
        Java java7 = new Java("Keldibek",19,"M","akeldibek@gmail.com");

        Android android4 = new Android("Erjan",18,"M","erjan@gmail.com");

        Go go = new Go("Malik",18,"M","malik@gmail.com");

        Java[] javas1 = {java6,java7};
        Android[] androids1 = {android4};
        Go[] gos1= {go};

        System.out.println("Google company: ");

        Company company1 = new Company("Kant",javas1,androids1,gos1,"Davran");
        System.out.println(company1);


    }
}