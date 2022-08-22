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
class PGrapher_Order {
    private String Pevent;
    private String  Duration;
    private String sertype;
    private String sdate;
    private String phone;
    
      public PGrapher_Order( String Pevent, String  Duration,String sertype, String sdate, String phone){
        this.Pevent=Pevent;
        this. Duration= Duration ;
        this.sertype=sertype;
        this.sdate=sdate;
        this.phone=phone;
    
    }
      
      public String getPevent(){
        return Pevent;
    }
    public String getDuration(){
        return  Duration;
    }
   
     public String getsertype(){
        return sertype;
    }
     public String getsdate(){
        return sdate;
    }
     public String getphone(){
        return phone;
    }
    
    
}
