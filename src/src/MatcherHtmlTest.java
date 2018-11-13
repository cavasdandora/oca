package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static src.MatcherHtml.findId;


class MatcherHtmlTest {


    String file = "<html>\n" +
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




    @Test
    void valueReturned_corporationId() {
        String actual = findId(file, "corporationId");
        assertEquals("17243", actual);
    }

    @Test
    void valueReturned_masterUserId() {
        String actual2 = findId(file, "masterUserId");
        assertEquals("6218839", actual2);
    }

    @Test
    void valueReturned_duplicatedValueSameRow() {

        String file2 = "<html>\n" +
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
                "            <input type=\"hidden\" name=\"corporationId\" value=\"17243\"corporationId\" value=\"17243\" />\n value=\"17243\"/>\n/>" +
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



        String actual4 = findId(file2,"corporationId"  );
        assertEquals("17243", actual4);
    }
}