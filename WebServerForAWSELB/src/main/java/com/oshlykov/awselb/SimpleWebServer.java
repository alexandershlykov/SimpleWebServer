package com.oshlykov.awselb;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.BufferedWriter;

public class SimpleWebServer implements HttpFunction {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
            final BufferedWriter writer = response.getWriter();
            writer.write("Remote Hello world!");
    }
}
