public class Main {

    public static void main(String[] args) {
        System.out.println("omo been a while o");

        Object o = new Student();

        if(o instanceof Student) {
            System.out.println("yes it is an instance of Student");
        }
        else{
            System.out.println("yes it is not an instance of Student");
        }

        System.out.println("the type is a " + o.getClass().getSimpleName());
    }
}