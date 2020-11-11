package com.opencart.util;

import com.opencart.enums.URLs;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomEmailUtil {

    public static String email;

    private static HttpResponse<String> getJsonByURL(String URL) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    private static String getSubstringByRegularExpression(String string, String regularExpression) {
        Pattern r = Pattern.compile(regularExpression);
        Matcher m = r.matcher(string);
        if (m.find()) {
            return m.group(1);
        }
        return "";
    }

    public static String getRandomEmail() {
        try {
            HttpResponse<String> response = getJsonByURL(URLs.TEMP_MAILS_URL.getValue() + "genRandomMailbox&count=1");
            email = response.body().substring(2, response.body().length() - 2);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        return email;
    }

    public static String getChangePasswordURL() throws IOException, InterruptedException {
        String[] emailDomains = email.split("@");
        String URL = URLs.TEMP_MAILS_URL.getValue() + "getMessages&login=" + emailDomains[0] + "&domain=" + emailDomains[1];
        HttpResponse<String> response = getJsonByURL(URL);
        String emailId = RandomEmailUtil.getSubstringByRegularExpression(response.body(), "\"id\":(\\d+)");
        String URL1 = URLs.TEMP_MAILS_URL.getValue() + "readMessage&login=" + emailDomains[0] + "&domain=" + emailDomains[1] + "&id=" + emailId;
        String messageBody = Helper.getValueByURLAndKey(URL1, "textBody");
        return  RandomEmailUtil.getSubstringByRegularExpression(messageBody, "(http.*?)\\n\\n");
    }
}
