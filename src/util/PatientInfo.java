package util;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;

import java.io.File;
import java.io.IOException;

/*
* 读取病人信息
* */
public class PatientInfo {


    private static String ID ;
    private static String name ;
    private static String sex ;
    private static String modality ;
    private static String date ;



    public void  getUserInfo(String filePath) throws IOException {

        File src = new File(filePath);
        Attributes attr1 = ReadTag.loadDicomObject(src);

        String patientID = new String(attr1.getBytes(Tag.PatientID) , "gb18030").toString().trim();
        String  patientName = new String(attr1.getBytes(Tag.PatientName) , "gb18030").toString().trim();
        String  patientSex = new String( attr1.getBytes(Tag.PatientSex) , "gb18030").toString().trim();
        String  type = new String(attr1.getBytes(Tag.Modality),"gb18030").toString().trim();
        String studyDate = new String( attr1.getBytes(Tag.StudyDate) , "gb18030").toString().trim();

        ID = patientID;
        name = patientName;
        sex = patientSex;
        modality = type;
        date = studyDate;
    }

    public static String getID() {
        return ID;
    }
    public static void setID(String iD) {
        ID = iD;
    }
    public static String getName() {
        return name;
    }
    public static void setName(String name) {
        PatientInfo.name = name;
    }
    public static String getSex() {
        return sex;
    }
    public static void setSex(String sex) {
        PatientInfo.sex = sex;
    }
    public static String getModality() {
        return modality;
    }
    public static void setModality(String modality) {
        PatientInfo.modality = modality;
    }
    public static String getDate() {
        return date;
    }
    public static void setDate(String date) {
        PatientInfo.date = date;
    }




}
