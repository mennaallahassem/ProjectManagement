/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import javax.swing.JTextField;

/**
 *
 * @author compac
 */
public class RealRegisteration extends registration{
     JTextField ID;
     JTextField FirstName;
     JTextField LastName;
     JTextField Email;
     JTextField Phone;
     JTextField Password;
     Member memberObject;
     MemberFactory memberFactoryObj;
    public RealRegisteration(JTextField MemberIDEnteredData,JTextField FirstNameEnteredData,JTextField LastNameEnteredData,JTextField EmailEnteredData,JTextField PhoneEnteredData,JTextField TxtBox_Password,String typeOfMember) {
    ID = MemberIDEnteredData;
    FirstName = FirstNameEnteredData;
    LastName = LastNameEnteredData;
    Email = EmailEnteredData;
    Phone = PhoneEnteredData;
    Password = TxtBox_Password;
    memberFactoryObj = new MemberFactory();
    memberObject = memberFactoryObj.getmember(typeOfMember);
    memberObject.fillClassData(ID,FirstName, LastName, Email, Phone,Password,typeOfMember);
    
    
    }

    @Override
    public void setData() {
      memberObject.add();
    }

    @Override
    public boolean isNull() {
   return false;
    }
    }

