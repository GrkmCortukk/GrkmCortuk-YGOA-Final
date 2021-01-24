package tr.edu.medipol.yazilimaracfinal.SpringBootRestApiFinal;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/hasta")
public class HastaRestApi {
	
	public static List<String> hastalar = new ArrayList<>();
	
	@GetMapping("/listele")
	public List<String> hastaListele(){
		return hastalar;
	}
	
	@PostMapping("/ekle")
	public String hastaEkle(@RequestBody String isim) {
		hastalar.add(isim);
		return isim;
	}
	
	@PostMapping("/sil")
	public String hastaSil(@RequestBody String isim) {
		hastalar.remove(isim);
		return isim;
	}
}
