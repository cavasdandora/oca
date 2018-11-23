package Cap5;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLProcessorImpl extends URLProcessorBase{

    @Override
    protected void processURLData(InputStream input) throws IOException {
        int data = input.read();
        while(data != -1){
            System.out.println((char) data);
            data = input.read();
        }
    }
    public static void main(String[] args) throws IOException {
        URLProcessorBase url = new URLProcessorImpl();
        url.process(new URL("http://jenkov.com"));
    }
}
