package com.company;

import javax.imageio.IIOException;
import javax.sql.rowset.spi.XmlReader;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
//задание6 +++добавить код с задания
    public static void main(String[] args) {
	XmlReader[] xmlReaders=new XmlReader[];
        for (int i = 0; i < 5; i++) {
            xmlReaders[i] = new XmlReader();
            runner(xmlReaders);
        }
    }

    public static void runner(XmlReader[] xmlReaders){
        for (XmlReader xmlReader:xmlReaders){
            try {
                xmlReader.read();
            }catch (IIOException e){
                e.printStackTrace();
            }
            catch (FileSystemAlreadyExistsException e){
                throw new FileNotFoundException();
            }
        }

    }
}
