public final class Martians{
    /* Clase final :  Por SEGURIDAD. No permite a otros crear subclases a partir de esta
     * O porque bien queremos una clase PERFECTA y no queremos que tenga subclases
    */
    private static final Martians martians = new Martians();
    private static int count;

    private static Martians(){
        count = 10;
    }

    public static Martians getMartians(){
        return martians;
    }

    public static void attackMartians(){
        if(count>0){
            count--;
            System.out.println("I've attacked one martian");
        }
    }

    public static void createMartians(){
        if(count>0){
            count++;
            System.out.println("The enemy have created one martian");
        }
    }

    public static void resultMartians(){
        if(count>0){
			System.out.println("There are in the game: "+count+" martians");
		} else {
			System.out.println("Congratulations, you winner!!!");
		}
    }

}