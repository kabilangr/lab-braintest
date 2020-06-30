package service;
public class PersonalityCalculator
{
	public  String findYourBrainType(String options) {
		int value[]=findAnswers(options);
		int n =value.length;
		int a =value[0]+value[1]+value[2]+value[4]+value[7]+value[9]+value[11]+value[13]+value[17]+value[19];
		int b =value[3]+value[5]+value[6]+value[8]+value[12]+value[14]+value[15]+value[16]+value[18];
		int sum = 66-a+b;
		if(sum>=20 && sum<=54)
			return "leftbrained";
		else if(sum>=55 && sum<=64)
			return "No clear preference";
		else if(sum>=65 && sum<=100)
			return "rightbrained";
		else
			return "false";
	}
	public int[] findAnswers(String options) {
		String c[]=options.split(",");
		int n = c.length;
		int a[]=new int[n];
		int sum=0,count=1;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(c[i]);
			count=count+1;
			System.out.println("The answer for questions -"+count+" is "a[i]);
		}
		return a;
	}
}