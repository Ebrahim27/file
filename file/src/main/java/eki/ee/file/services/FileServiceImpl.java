package eki.ee.file.services;
import org.springframework.stereotype.Service;
import java.io.FileReader;




  @Service                   //  reads json file
  public class FileServiceImpl implements FileService {
    public String readJsonFile() throws Exception  {
        FileReader fr =new FileReader(".json");
        int i;
        while((i = fr.read())!=-1)
            System.out.print((char) i);
        fr.close();
        return null   ;
      }
  }
