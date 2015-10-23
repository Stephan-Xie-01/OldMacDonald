class Chick implements Animal 
{     
     private String myType;     
     private String mySound;
     private String mySoundTwo;      
     public Chick(String type, String sound, String soundTwo)     {         
         myType = type;         
         mySound = sound;
         mySoundTwo = soundTwo;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";  
         mySoundTwo = "unknown";   
     }      
     public String getSound(){return mySound;}
     public String getSoundTwo(){return mySoundTwo;}     
     public String getType(){return myType;} 
}