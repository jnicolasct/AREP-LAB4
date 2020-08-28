package co.edu.escuelaing.sparkd.microspring;

public class HelloController {

    @RequestMapping("/hello")
    static public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/pi")
    static public String pi() {
        return "PI: " + Math.PI;
    }

    @RequestMapping("/pag")
    static public String pagina() {
        String outputLine = "<!D0CTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Constante de Euler</h1>\n"
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }
}
