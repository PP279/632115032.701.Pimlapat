public class NerfGun {

    //632115032 Pimlapat Pimsarn
    
    private int totalbullet = 15;
    private int reload,j;

   

	public NerfGun(int i) {
        totalbullet = i;
	}

	public void fire() {
        totalbullet = totalbullet - 1;
        System.out.println(" BANG !");
    }

    public void displayNumOfAmmunition(){        
        System.out.println(totalbullet + " bullet left");
    }

    public void reload(int reload){
      this.reload = reload ;
      System.out.println("reload " + reload );
      
      totalbullet = reload + totalbullet;
    }

    public void displayGunID() {
        
        System.out.println("The ID of This gun is "  );
    }
}
