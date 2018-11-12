package src;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherHtml{

    public static String findId(String file, String patternString) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(file); // corporationId\" value=\"17243\" />\n" +//name=\"masterUserId\" value=\"6218839\" />\n" +
        matcher.find();
        String rowFound = matcher.group(1);
        String result = rowFound.substring(rowFound.indexOf('"') + 1);
        String result2 = result.substring(result.indexOf('"') + 1);
        int result3 = result2.indexOf('"');

        String subString = null;
        if (result3 != -1) {
            subString = result2.substring(0, result3);

        }
        return subString;


    }

    public static void main(String[] args) {

        String html = "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "    <title>Bullhorn OAuth - Get Consent</title>\n" +
                "    <meta name=\"HandheldFriendly\" content=\"True\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\">\n" +
                "    <meta name=\"apple-touch-fullscreen\" content=\"yes\">\n" +
                "    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n" +
                "    <link rel='stylesheet' type='text/css' href='css/login.css'/>\n" +
                "    <link rel='localizations' type='text/json' href='l10n/localizations.json' />\n" +
                "    <script type=\"text/javascript\" src=\"js/json2.js\"></script>\n" +
                "    <script type=\"text/javascript\" src=\"js/l10n.js\"></script>\n" +
                "    <script type=\"text/javascript\">\n" +
                "        String.toLocaleString(\"l10n/localizations.json\");\n" +
                "    </script>\n" +
                "</head>\n" +
                "<body onLoad=\"onLoaded()\">\n" +
                "    <div class=\"consent\">\n" +
                "        <header>\n" +
                "            <h1 id=\"logo\">BULLHORN</h1>\n" +
                "            <h3 id=\"title\">Get Consent</h3>\n" +
                "        </header>\n" +
                "        <form method=\"POST\" name=\"consentForm\">\n" +
                "            <h1>Contax360-17243</h1>\n" +
                "            <h2 id=\"tos\" >Terms of Service</h2>\n" +
                "            <p>n/a</p>\n" +
                "            <input type=\"hidden\" name=\"corporationId\" value=\"17243\" />\n" +
                "            <input type=\"hidden\" name=\"masterUserId\" value=\"6218839\" />\n" +
                "            <input type=\"hidden\" name=\"expiresAt\" value=\"0\" />\n" +
                "            <input id=\"agreebtn\" type=\"submit\" name=\"action\" value=\"Agree\">\n" +
                "            <input id=\"declinebtn\" type=\"submit\" name=\"action\" value=\"Decline\">\n" +
                "        </form>\n" +
                "        <footer></footer>\n" +
                "    </div>\n" +
                "    <script type=\"text/javascript\">\n" +
                "        function onLoaded(){\n" +
                "            document.getElementById('tos').innerHTML = \"Terms of Service\".localize();\n" +
                "            document.getElementById('title').innerHTML = \"Get Consent\".localize();\n" +
                "            document.getElementById('agreebtn').value = \"Agree\".localize();\n" +
                "            document.getElementById('declinebtn').value = \"Decline\".localize();\n" +
                "        }\n" +
                "    </script>  \n" +
                "</body>\n" +
                "</html>.";

        String value = findId(html, "(corporationId(.*))");
        System.out.println(value);
        String value2 = findId(html, "(masterUserId(.*))");
        System.out.println(value2);
        String value3 = findId(html, "(expiresAt(.*))");
        System.out.println(value3);

    }


}

