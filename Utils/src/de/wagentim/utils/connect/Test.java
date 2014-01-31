package de.wagentim.utils.connect;

import org.apache.commons.codec.binary.Base64;

public class Test {
	
	public static void main(String[] args)
	{
		String s = "QUFlZDJrOi8vfGZpbGV855Sf5rS75aSn54iG54K4LlRoZS5CaWcuQmFuZy5UaGVvcnkuUzA3RTE0LuS4reiLseWtl+W5lS5IUi1IRFRWLkFDMy4xMDI0WDU3Ni54MjY0Lm1rdnwyNDg0OTYzNTR8Njk4MEYzMDU4NTY4MkZDN0QzM0RFQkM0NTdGMUNBNTV8aD1TQ0NJQTJJQUdaNEdKSkw1TE5EUE1FVVFYVTVWQ05UT3wvWlo=";
		String t = "";
		Base64 h = new Base64();
		
		byte[] result = h.decode(s);
		
		System.out.println(new String(result));
	}
}
