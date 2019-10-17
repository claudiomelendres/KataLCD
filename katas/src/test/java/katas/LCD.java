package katas;

import java.text.MessageFormat;
import java.util.*; 

public class LCD {
	Dictionary<String, String[]> numbers;
	String alto = "|";
	String ancho = "_"; 
	String espacio = " ";
	
	
	public LCD() {
		
		
		
		
	}
	
	public void GenerateMatrix() {
		numbers = new Hashtable<String, String[]>(); 
		numbers.put("1", new String[]{MessageFormat.format(" {0} ", espacio, ancho ),
                                      MessageFormat.format(" {0}|", espacio, ancho),
                                      MessageFormat.format(" {0}|", espacio, ancho)});
		numbers.put("2", new String[]{MessageFormat.format(" {1} ", espacio, ancho ),
				                      MessageFormat.format(" {1}|", espacio, ancho),
				                      MessageFormat.format("|{1} ", espacio, ancho)});
		numbers.put("3", new String[]{MessageFormat.format(" {1} ", espacio, ancho ),
                                      MessageFormat.format(" {1}|", espacio, ancho),
                                      MessageFormat.format(" {1}|", espacio, ancho)});
		numbers.put("4", new String[]{MessageFormat.format(" {0} ", espacio, ancho ),
                                      MessageFormat.format("|{1}|", espacio, ancho),
                                      MessageFormat.format(" {0}|", espacio, ancho)});
		numbers.put("5", new String[]{MessageFormat.format(" {1} ", espacio, ancho ),
                                      MessageFormat.format("|{1} ", espacio, ancho),
                                      MessageFormat.format(" {1}|", espacio, ancho)});
		numbers.put("6", new String[]{MessageFormat.format(" {1} ", espacio, ancho ),
                                      MessageFormat.format("|{1} ", espacio, ancho),
                                      MessageFormat.format("|{1}|", espacio, ancho)});
		numbers.put("7", new String[]{MessageFormat.format(" {1} ", espacio, ancho ),
                                      MessageFormat.format(" {0}|", espacio, ancho),
                                      MessageFormat.format(" {0}|", espacio, ancho)});
		numbers.put("8", new String[]{MessageFormat.format(" {1} ", espacio, ancho ),
                                      MessageFormat.format("|{1}|", espacio, ancho),
                                      MessageFormat.format("|{1}|", espacio, ancho)});
		numbers.put("9", new String[]{MessageFormat.format(" {1} ", espacio, ancho ),
                                      MessageFormat.format("|{1}|", espacio, ancho),
                                      MessageFormat.format(" {1}|", espacio, ancho)});
		numbers.put("0", new String[]{MessageFormat.format(" {1} ", espacio, ancho ),
                                      MessageFormat.format("|{0}|", espacio, ancho),
                                      MessageFormat.format("|{1}|", espacio, ancho)});
	}
	
	
	public String GetNumber(String num) {
		GenerateMatrix();
		String[] result = {"","",""};
		for (char i : num.toCharArray()) {
			System.out.println(i);
			result[0] = result[0] + numbers.get(String.valueOf(i))[0];
			result[1] = result[1] + numbers.get(String.valueOf(i))[1];
			result[2] = result[2] + numbers.get(String.valueOf(i))[2];
		}
		result[0] = result[0] + "\n";
		result[1] = result[1] + "\n";
		
		return String.join("", result);
	}
	
	public String GetNumber(String num, int alto, int ancho) {
		SetAncho(ancho);
		GenerateMatrix();
		String[] result = {"","",""};
		for (char i : num.toCharArray()) {
			//System.out.println(i);
			result[0] = result[0] + numbers.get(String.valueOf(i))[0];
			result[1] = result[1] + numbers.get(String.valueOf(i))[1];
			result[2] = result[2] + numbers.get(String.valueOf(i))[2];
		}
		result[0] = result[0] + "\n";
		result[1] = result[1] + "\n";
		
		return String.join("", result);
	}
	
	public void SetAncho(int ancho) {
		
		for (int i=2; i<=ancho; i++)
		{
			this.ancho=this.ancho+"_";
			this.espacio=this.espacio+" ";
		}
		//System.out.println(this.ancho.length());
	}
	
}
