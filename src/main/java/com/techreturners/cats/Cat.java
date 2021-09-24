package com.techreturners.cats;

interface Animal {
    public boolean isAsleep();
    public void goToSleep();
    public void wakeUp();
    public String eat();
	public void run();
}

abstract class Cat implements Animal {
	protected boolean asleep = false;
	protected int height;
	protected String setting; // Ex: "domestic" or "wild"
   
    public boolean isAsleep() { 
        return asleep; 
    }
    public void goToSleep() { 
        asleep = true;
    }   
    public void wakeUp() { 
        asleep = false;
    }   
    public int getAverageHeight() { 
        return height; 
    }

    public String getSetting() { 
        return setting; 
    }

	public void run(){};
}

class DomesticCat extends Cat {
    public boolean hungry;
    public DomesticCat (){
        setting = "domestic";
        height = 23;
        hungry  = false ;
    }
    public String eat(){
         if ((int)(Math.random()* 2) == 1) {  // random 0 or 1
            System.out.println("It will do I suppose");   
        };
        return "Purrrrrrr";
    }   

}	

class LionCat extends Cat {
    public LionCat (){
        setting = "wild";
        height = 1100;
    }
    public String eat(){
        return "Roar!!!!";
    };
}

class CheetahCat extends Cat {
    public String eat(){
        return "Zzzzzzz";
    };

}




