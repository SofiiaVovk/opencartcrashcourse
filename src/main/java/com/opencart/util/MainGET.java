package com.opencart.util;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MainGET {

    public static String getValueByURLAndKey(String url, String key) {
        try {
            URL URL = new URL(url);

            HttpURLConnection conn = (HttpURLConnection) URL.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(URL.openStream());

                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                scanner.close();

                JSONParser parse = new JSONParser();
                JSONObject data_obj = (JSONObject) parse.parse(inline);
                return data_obj.get("textBody").toString();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}