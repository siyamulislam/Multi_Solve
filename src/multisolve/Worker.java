package multisolve;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SiamPC
 */
class Worker {
    
    private int wID;
    private String WFName;
    private String WLName;
    private String WAdd;
    private String WEmail;
    private String Wgender;
    private String joinAs;
    private int WAge;
    private String WPhone;
    private String WPassword;
    
    
    public Worker( int wID, String WFName, String WLName,String WAdd,String WEmail,String Wgender,String joinAs, int WAge,String WPhone,String WPassword){
        this.wID=wID;
        this.WFName=WFName;
        this.WLName=WLName;
        this.WAdd=WAdd;
        this.WEmail=WEmail;
        this.Wgender=Wgender;
        this.joinAs=joinAs;
        this.WAge= WAge;
        this.WPhone=WPhone;
        this.WPassword=WPassword;
    
    }
    
    public int getwID(){
        return wID;
    }
    public String getWFName(){
        return WFName;
    }
    public String getWLName(){
        return WLName;
    }
     public String getWAdd(){
        return WAdd;
    }
     public String getWEmail(){
        return WEmail;
    }
     public String getWgender(){
        return Wgender;
    }
     public String getjoinAs(){
        return joinAs;
    }
      public int getWAge(){
        return WAge;
    }
        public String getWPhone(){
        return WPhone;
    }
     public String getWPassword(){
        return WPassword;
    }
    
    
}
