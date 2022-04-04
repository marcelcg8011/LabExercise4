public class Main
{
    public static void main(String[] args)
    {
        Student Poggers = new Student();
        Student Champ = new Student();

        Poggers.setName("Poggers");
        Poggers.setAge(20);
        Champ.setName("Pepe");
        Champ.setAge(25);

        System.out.println("Name is " + Poggers.getName());
        System.out.println("Age is " + Poggers.getAge());
        System.out.println("Name is " + Champ.getName());
        System.out.println("Age is " + Champ.getAge());

    }
}
