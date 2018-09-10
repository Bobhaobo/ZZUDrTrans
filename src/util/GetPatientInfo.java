package util;

import java.io.File;
import java.io.IOException;
/**
 * 获取病人信息
 * */
public class GetPatientInfo {
    //将读取的病人信息存储在集合中
    public String[] readInfo(String path) {

        getFiles(path);
        String[] strings = verInfo();
        return strings;
    }

    private static void getFiles(String filePath)
    {
        File root = new File(filePath);
        File[] files = root.listFiles();
        for(File file:files)
        {
            if(file.isDirectory())
            {
                getFiles(file.getAbsolutePath());
            }
            else
            {
                String dcmName = file.getName();
                if(dcmName.endsWith(".dcm"))
                {
                    try
                    {
                        new PatientInfo().getUserInfo(file.getAbsolutePath());
                        return;
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();

                    }
                }
            }
        }
    }



    private String[] verInfo()
    {
        String[] s = new String[5];

        s[0]= PatientInfo.getID();
        s[1] = PatientInfo.getName();
        s[2] = PatientInfo.getSex();
        s[3] = PatientInfo.getModality();
        s[4] = PatientInfo.getDate();
        return s;
    }


}
