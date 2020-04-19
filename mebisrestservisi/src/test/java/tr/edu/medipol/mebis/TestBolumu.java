package tr.edu.medipol.mebis;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
public class TestBolumu {
	@RestController
	@RequestMapping("/Giris")
	public class OgrenciBilgileriTest {
		
		@Test
		public void testSonucuBul() {
		
		List<String> ogrenciler = new ArrayList<>();
			 {
				 String ogrenciNo1 ="Ahmet";
				 String ogrenciNo2 ="Nil";
				 String ogrenciNo3 ="Fatih";
				 String ogrenciNo4 ="Ayla";
				 
		  
			
			ogrenciler.add(ogrenciNo1);
			ogrenciler.add(ogrenciNo2);
			ogrenciler.add(ogrenciNo3);
			ogrenciler.add(ogrenciNo4);	
		  
				assertEquals("Ahmet",ogrenciNo1);
				assertEquals("Nil",ogrenciNo2);
				assertEquals("Fatih",ogrenciNo3);
				assertEquals("Ayla",ogrenciNo4);
				
			}
			 
			
			
		}
	@GetMapping("/ogrenciEkle/{ogrenciAdi}")
	@Test
	
	public void   OgrenciEkle() {
		List<String> ogrenciler = new ArrayList<>();
		 {
			 String ogrenciNo1 ="Ahmet";
			 String ogrenciNo2 ="Nil";
			 String ogrenciNo3 ="Fatih";
			 String ogrenciNo4 ="Ayla";
		 }
		
		 String yeniogrenci="Halil";
		 ogrenciler.add(yeniogrenci);
		 //Then
		 assertEquals(yeniogrenci,"Halil");
	   
	}
	@GetMapping("/ogrenciSil/{ogrenciAdi}")
	@Test	
	public void OgrenciSil() {

			List<String> ogrenciler = new ArrayList<>();
			 {
				 String ogrenciNo1 ="Ahmet";
				 String ogrenciNo2 ="Nil";
				 String ogrenciNo3 ="Fatih";
				 String ogrenciNo4 ="Ayla";
				 
			 
				 
				 ogrenciler.remove(ogrenciNo3);
		    
			 
				 assertEquals(ogrenciNo1,"Ahmet");
			 }	
		
		
	}
	@GetMapping("/ogrenciGuncelle")
	@Test
	public void OgrenciGuncelle() {
		
				
		List<String> ogrenciler = new ArrayList<>();
		 {
			 String ogrenciNo1 ="Ahmet";
			 String ogrenciNo2 ="Nil";
			 String ogrenciNo3 ="Fatih";
			 String ogrenciNo4 ="Ayla";
			 
			 ogrenciNo1 = "Ahmet";
			 ogrenciler.remove(ogrenciNo1);
				ogrenciler.add(ogrenciNo1);
			
				assertEquals(ogrenciNo4,"Ayla");
				
		 }
		 
	}

	@GetMapping("/ogrenciNotEkleGuncelle")
	@Test
	public void ogrenciNotEkle() {
		
		List<String> ogrenciler = new ArrayList<>();
		 {
			 String ogrenciNo1 ="Ahmet";
			 String ogrenciNo2 ="Nil";
			 String ogrenciNo3 ="Fatih";
			 String ogrenciNo4 ="Ayla";
			 String eklenenNot="50";
			 String guncelNot ="80";		
			 ogrenciler.remove(ogrenciNo1+" "+eklenenNot);
				ogrenciler.add(ogrenciNo1+" "+eklenenNot.replace(eklenenNot, guncelNot));
				ogrenciler.remove(ogrenciNo1+" "+eklenenNot);
			 
				assertEquals(ogrenciNo2,"Nil");
				assertEquals(eklenenNot,"20");
				assertEquals(guncelNot,"100");
				
		 }
		
	}
	}
}
