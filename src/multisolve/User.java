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
class User {
    
    
    private int uID;
    private String UFName;
    private String ULName;
    private String UAdd;
    private String UEmail;
    private String Ugender;
    private int UAge;
    private int UPhone;
    private String UPassword;
    
    
    public User( int uID, String UFName, String ULName,String UAdd,String UEmail,String Ugender,int UAge,int UPhone,String UPassword){
        this.uID=uID;
        this.UFName=UFName;
        this.ULName=ULName;
        this.UAdd=UAdd;
        this.UEmail=UEmail;
        this.Ugender=Ugender;
        this.UAge= UAge;
        this.UPhone=UPhone;
        this.UPassword=UPassword;
    
    }
    
    public int getuID(){
        return uID;
    }
    public String getUFName(){
        return UFName;
    }
    public String getULName(){
        return ULName;
    }
     public String getUAdd(){
        return UAdd;
    }
     public String getUEmail(){
        return UEmail;
    }
     public String getUgender(){
        return Ugender;
    }
     
      public int getUAge(){
        return UAge;
    }
        public int getUPhone(){
        return UPhone;
    }
     public String getUpassword(){
        return UPassword;
    }
    
    
    
}
