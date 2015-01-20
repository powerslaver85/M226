package basics;

//Title:	BitOp.Java
//Author:	Lrd. R. Schenk
//Date:		11/08/2014


public class BitOp {

	public static void main(String[] args) {
		// Im Kommentar ist jeweils das rechte Byte bin�r dargestellt
		// Bit 1 ist das am weitesten rechts stehende Bit
		
		int x, y;
		x = 0xAA;	//10101010
		
		y = 0xF0;	//11110000
		//Bits 1 bis 4 werden auf 0 gesetzt:
		x &= y;		//10100000
		System.out.println(x);
		
		y = 0xF; 	//00001111
		//Bits 1 bis 4 werden auf 1 gesetzt:
		x |= y;		//10101111
		System.out.println(x);
		
		y = 0x90;	//10010000
		//Bits 5 und 8 werden umgeschaltet:
		x ^= y; 	//00111111
		System.out.println(x);

	}

}