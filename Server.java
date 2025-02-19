// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
   public SimpleWebServer() {
   }

   public static void main(String[] var0) {
      try {
         ServerSocket var1 = new ServerSocket(1989);
         System.out.println("Sunucu \u00e7al\u0131\u015f\u0131yor, 1989 portunu dinliyor...");

         while(true) {
            Socket var2 = var1.accept();
            PrintWriter var3 = new PrintWriter(var2.getOutputStream(), true);
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var2.getInputStream()));

            String var5;
            while((var5 = var4.readLine()) != null && !var5.isEmpty()) {
            }

            var3.println("HTTP/1.1 200 OK");
            var3.println("Content-Type: text/html");
            var3.println();
            var3.println("<html><body>");
            var3.println("<h1>azo ismail</h1>");
            var3.println("<h2>xxxxxxxxxxxx</h2>");
            var3.println("<p>Merhaba, ben AZO \u0130SMA\u0130L. K\u0131rklareli \u00dcniversitesi'nde Yaz\u0131l\u0131m M\u00fchendisli\u011fi 2. s\u0131n\u0131f \u00f6\u011frencisiyim. Yaz\u0131l\u0131m geli\u015ftirme ile ilgileniyor ve kariyerimde bu alanda ilerlemek istiyorum.</p>");
            var3.println("</body></html>");
            var3.close();
            var4.close();
            var2.close();
         }
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }
}
