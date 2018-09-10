package util;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.io.DicomInputStream;

import java.io.File;
import java.io.IOException;

public class ReadTag {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    /**
     *  读Tag信息
     */
    public static Attributes loadDicomObject(File f) throws IOException
    {
        if (f == null)
        {
            return null;
        }
        else
        {
            DicomInputStream dis = new DicomInputStream(f);
            Attributes obj = dis.readDataset(-1, -1);
            dis.close();
            return obj;
        }
    }

}
