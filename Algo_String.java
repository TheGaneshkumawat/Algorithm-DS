//Reduction of duplicate elements from the string - aabbasx -> asx
	private static String reduction(String a) {
		if(null == a || a.trim().equals(""))
		{
			return "Empty String";
		}
		boolean isDupPre = false;
		xx:for(int i = 0 ; i<a.length();i++)
		{
			for(int j = 0 ; j<a.length();j++)
			{
				if(i == j)
				{
					continue;
				}
				if(a.charAt(i) == a.charAt(j))
				{
					isDupPre= true;
					break xx;
				}
			}
		}
		if(!isDupPre)
		{
			return a;
		}
		//String res = "";
		a=a.trim();
		for(int i = 0 ; i<a.length();i++)
		{
			System.out.println("i: "+i);
			System.out.println("length: "+a.length());
			if(i+1>=a.length())
			{
				break;				
			}
			if(a.charAt(i) == a.charAt(i+1))
			{
				System.out.println("Iteration: "+i+" x: "+a.substring(0,i)+" y: "+a.substring(i+2));
				a= a.substring(0,i)+a.substring(i+2);
				System.out.println("Updated a: "+a);
				i=-1;
			}
		}
		
		if(a.trim().equals(""))
		{
			a = "Empty String";
		}
		return a;
	}
	
	//find minimum sum from a array of integers
	private static int minSum2(int[] a) {
		if(null == a || a.length == 0 )
		{
			return 0;			
		}
		
		int tmp1 = Integer.MAX_VALUE;
		int tmp2 = Integer.MAX_VALUE;
				
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] < tmp1)
			{
				tmp2 = tmp1;
				tmp1 = a[i];				
			}			
		}		
		return tmp1+tmp2;
		
	}

	

	//Compress String from aaabbbsddd -> a3b3s1d3
	private static String compressStr(String a) {
		if(null == a||a.trim().equals(""))
		{
			return null;
		}
		StringBuffer res= new StringBuffer();
		int count=0;
		for(int i = 0 ; i < a.length() ; i++)
		{
			count++;
			if(i+1 >= a.length() ||a.charAt(i) != a.charAt(i+1))
			{
				res.append(a.charAt(i));
				res.append(count);
				count=0;
			}
		}			
		return res.length()<a.length() ? res.toString():a;
		
	}
	
	
	
	//Check a string for Palindrome -1 
	private static boolean isStringContainsPalindrome(String a) {
		if(null == a || a.trim().equals(""))
		{
			return false;
		}
		a = a.trim();
		for(int i = 0,j=a.length()-1 ; i<a.length() && j>=0;i++,j--)
		{
		
		}
		
		return true;
	}
	
	//Check a string for Palindrome -1
	private static boolean isPalindrome(String a) {
		
		if(null == a || a.trim().equals(""))
		{
			return false;
		}
		a = a.trim();
		
		for(int i = 0,j=a.length()-1 ; i<a.length() && j>=0;i++,j--)
		{
			
			if(a.charAt(i) != a.charAt(j))
			{
				return false;
			}
			if(i == j && a.charAt(i) == a.charAt(j))
			{				
				return true;
			}
			
			
		}
		
		
		return true;
	}
