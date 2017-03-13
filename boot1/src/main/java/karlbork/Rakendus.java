package karlbork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!!!!!";
    }
	
	@RequestMapping("/algus2")
	String tervitusfunktsioon2() {
        return "\n\n\n\n\nOK!";
    }
	
	@RequestMapping("/tervita")
	String tervitusfunktsioon3(String eesnimi) {
        return "Tere, " + eesnimi;
    }
	
	@RequestMapping("/arvuta")
	String arvutusfunktsioon(String num1, String num2) {
		double arv = Math.sqrt(Double.parseDouble(num1) * Double.parseDouble(num2));
        return String.valueOf(arv);
    }
 
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4221);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot1-1.0-SNAPSHOT.jar

//localost:5556 -> greeny.cs.tlu.ee:4221

//localhost:5555/~karlbork ...
//http://greeny.cs.tlu.ee:4221/algus