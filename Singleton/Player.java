public  class Player{
    private Martians martians;

    public Player(){
        martians = Martians.getMartians();
    }

    public void destroyMartians(){
        martians.attackMartians();
    }



}