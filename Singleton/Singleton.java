public final  class Singleton{
    private static final Singleton singleton = new Singleton();
    private static int count;

    private Singleton(){
        System.out.println("I've been created again");
    }

    public static Singleton getSingleton(){
        count++;
        return singleton;
    }

    public static void callsCount(){
         System.out.println("It has called the method "+count+" times");
    }

}