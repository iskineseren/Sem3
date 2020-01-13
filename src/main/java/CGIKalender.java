import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class CGIKalender {

    private static void showHead() {
        System.out.println("Content-Type: text/html");
        System.out.println();
        System.out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2//EN\">");
        System.out.println("<HTML>");
        System.out.println("<HEAD>");
        System.out.println("<TITLE>Patient kalenderen</TITLE>");
        System.out.println("<META http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\">");
        System.out.println("<META http-equiv=\"Pragma\" content=\"no-cache\">");
        System.out.println("<META http-equiv=\"expires\" content=\"0\">");
        System.out.println("</HEAD>");
        System.out.println("<BODY style=\"text-align:center\";>");
        System.out.println("<H1 style=\"color: white; margin-button: 0px;\"> Dine aftaler på sygehuset </H1>");
        System.out.println("<h1 style=\"color: white; margin-button: 0px;\"><br>Dine tider p&aring; sygehus 4:</h1><br>\n" +
                "</div>\n" +
                "<table style=\"border: solid black;\" width=\"100%\" cellpadding=\"20\">\n" +
                "    <thead>\n" +
                "    <tr>\n" +
                "        <td style=\"border: none; font-weight: bold;\">Tidspunkt</td>\n" +
                "        <td style=\"border: none; font-weight: bold;\">Aftale Sted</td>\n" +
                "        <td style=\"border: none; font-weight: bold;\">Aftaletype</td>\n" +
                "        <td style=\"border: none; font-weight: bold;\">Varighed (min)</td>\n" +
                "        <td style=\"border: none;\">&nbsp;</td>\n" +
                "        <td style=\"border: none;\">&nbsp;</td>\n" +
                "    </tr>\n" +
                "    </thead>" +
                "<tbody> "+
                "</table> "
                );

    }

    private static void showTail() {
        System.out.println("</BODY>\n</HTML>");
    }



    public static void main(String[] args) {
        showHead();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String[] data = { in.readLine() };
            //showBody(new StringTokenizer(data[0],"&\n\r"));
        } catch(IOException ioe) {
            System.out.println("<P>IOException reading POST data: "+ioe+"</P>");
        }
        showTail();
    }
}
