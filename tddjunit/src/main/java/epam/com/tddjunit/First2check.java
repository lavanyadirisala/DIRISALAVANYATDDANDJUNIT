package epam.com.tddjunit;

public class First2check {

	public String removeAs(String s) {
		int len=s.length();
		String str="";
		if(len==1) {
			if(!s.equals("A")) {
				str=s;
			}
		}
		if(len>=2)
		{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=1;i++){
		    if(s.charAt(i)!='A'){
		        sb.append(s.charAt(i));
		    }
		}
		 str=sb.toString()+s.substring(2,len);
		}
		return str;
		
	}

}
