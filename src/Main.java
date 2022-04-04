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

        Rectangle first = new Rectangle(10, 20);
        Rectangle second = new Rectangle(30, 40);

        System.out.println("area of first is " + first.getArea());
        System.out.println("perimeter of first is " + first.getPerimeter());
        System.out.println("area of second is " + second.getArea());
        System.out.println("perimeter of second is " + second.getPerimeter());

        Coin FiftyFifty = new Coin();

        System.out.println(FiftyFifty.getFace());

        FourSides NoParameters = new FourSides();
        NoParameters.displaySides();
        System.out.println();
        FourSides OneParameters = new FourSides(2);
        OneParameters.displaySides();
        System.out.println();
        FourSides TwoParameters = new FourSides(2,4);
        TwoParameters.displaySides();
        System.out.println();
        FourSides ThreeParameters = new FourSides(2,4,6);
        ThreeParameters.displaySides();
        System.out.println();
        FourSides FourParameters = new FourSides(2,4,6,8);
        FourParameters.displaySides();


    }
}
