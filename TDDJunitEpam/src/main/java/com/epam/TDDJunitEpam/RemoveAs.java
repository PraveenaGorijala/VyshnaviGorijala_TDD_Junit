package com.epam.TDDJunitEpam;

public class RemoveAs {

	public String remove2(String string) {
		// TODO Auto-generated method stub
		int i=0,t=0;
		while(i<=1){
			if(string.charAt(t)=='A'){
				string = removeCharAt(string, t);
				t=0;
			}
			else{
				t=1;
			}
			i++;
		}
		return string;
	}
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}
}