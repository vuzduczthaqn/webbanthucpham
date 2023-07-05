package com.welcome.Ultil;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;

public class HttpUtil {
    private String values;

    public HttpUtil(String values) {
        this.values=values;
    }
    public <T> T toModel(Class<T> tClass) {
        try {
            return new ObjectMapper().readValue(values, tClass);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }
    public static HttpUtil of(BufferedReader reader) {
        StringBuilder builder=new StringBuilder();
        try {
            String line;
            while ((line=reader.readLine())!=null){
                builder.append(line);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new HttpUtil(builder.toString());
    }
}
