 import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunMain {
    public static void main(String[] args) {
        String regexUser="^[a-zA-Z0-9]{6,}$";
        String regexPass="^[a-zA-Z0-9]{8,}$";

        Pattern patternUser =Pattern.compile(regexUser);
        Pattern patternPass =Pattern.compile(regexPass);
        Matcher matcher;
        String strUser="htuuqana3222";
        String strPass="htuuqa3eê2na";
        matcher=patternUser.matcher(strUser);
        System.out.println(matcher.find());
        matcher=patternPass.matcher(strPass);
        System.out.println(matcher.find());
    }
}
