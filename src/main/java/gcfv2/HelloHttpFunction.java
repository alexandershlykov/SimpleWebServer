package gcfv2;


import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloHttpFunction implements HttpFunction {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        PrintWriter writer = new PrintWriter(response.getWriter());
        writer.write("Hi, This is simple Java 17 web-server with using Cloud Functions!");
        writer.flush();
    }
}
