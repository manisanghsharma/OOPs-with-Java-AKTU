import java.util.Base64;

public class Encode {
    public static void main(String[] args) {
        String originalInput = "Hi, I am a string!";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println(encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        System.out.println(decodedBytes);

        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);

        //Url encoding

        String originalURL = "https://teams.microsoft.com/v2/";
        String encodedURL = Base64.getUrlEncoder().encodeToString(originalURL.getBytes());
        System.out.println(encodedURL);

        byte[] decodedURLBytes = Base64.getUrlDecoder().decode(encodedURL);
        System.out.println(decodedURLBytes);
        
        String decodedURL = new String(decodedURLBytes);
        System.out.println(decodedURL);
    }
}
