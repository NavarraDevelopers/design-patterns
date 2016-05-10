public  class TestSingleton{

    public static void main(String... args){
        		Singleton mySingleton1 = Singleton.getSingleton();
        		Singleton mySingleton2 = Singleton.getSingleton();
        		Singleton mySingleton3 = Singleton.getSingleton();
        		Singleton mySingleton4 = Singleton.getSingleton();
        		Singleton mySingleton5 = Singleton.getSingleton();
        		Singleton mySingleton6 = Singleton.getSingleton();
        		Singleton mySingleton7 = Singleton.getSingleton();
        		Singleton mySingleton8 = Singleton.getSingleton();
        		Singleton mySingleton9 = Singleton.getSingleton();

        		mySingleton4.callsCount();
        		System.out.println("I've finished of create the objects");


    }
}