class Student1 {

    int id;
    String name;
}

class TestStudent3
{
    public static void main(String args[])
    {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.id = 101;
        s1.name = "Aditya";

        s2.id = 102;
        s2.name = "Adi";

        System.out.println(s1.id+","+s1.name);
        System.out.println(s2.id+","+s2.name);
    }
}
