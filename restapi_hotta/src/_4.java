import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class _4 {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        String uri = "http://localhost:8820/a/login";
        String XMLSRequest = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<authorities>\n" +
                "  <username>admin</username>\n" +
                "  <password>123</password> \n" +
                "</authorities>\n";

        URL url = new URL(uri);
        HttpURLConnection connection =
                (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/xml");

        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream(); //get output Stream from con
        os.write( XMLSRequest.getBytes(StandardCharsets.UTF_8) );
        os.close();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
//            System.out.println(inputLine);
            content.append(inputLine);
        }
        in.close();
        System.out.println(content);


// accessToken = eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTU4NjM0OTU4MSwiZXhwIjoxNTg3NTU5MTgxfQ.X84PQjh92tUUv-rOy_t8fhsjhxRe_o_Y-J-lK6TrOSvpvAHgPy5hMODhasCVxkSFFK7XeclsCaYrOOfDKNjFYg

    }
}
