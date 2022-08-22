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
class Tutor_Order {
    
    private String Tversion;
    private String Tclass;
    private String Tsubject;
    private String sertype;
    private String sdate;
    private String phone;
           
    public Tutor_Order( String Tversion, String Tclass,String Tsubject,String sertype, String sdate, String phone){
        this.Tversion=Tversion;
        this.Tclass=Tclass ;
        this.Tsubject=Tsubject;
        this.sertype=sertype;
        this.sdate=sdate;
        this.phone=phone;
    
    }
    
     public String getuTversion(){
        return Tversion;
    }
    public String getTclass(){
        return Tclass;
    }
    public String getTsubject(){
        return Tsubject;
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
