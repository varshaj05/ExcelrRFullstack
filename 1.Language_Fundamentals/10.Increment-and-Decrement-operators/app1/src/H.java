class H
{
	public static void main(String[] args) 
	{
		int i = 0;
		//       0  + -1 + -1 + -2
		int j = i-- + i + i-- + i;
		System.out.println(j);// 
	    System.out.println(i);//
	}
}

//i=0, -1 , -2