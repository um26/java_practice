// Chef considers the number 7 lucky. As a result, he believes that the 7-th letter he sees on a day is his lucky letter of the day.
// You are given a string S of length 10, denoting the first 10 letters Chef saw today.
// What is Chef's lucky letter?

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner n= new Scanner(System.in);
		String S = n.next();
		int index = 6;
        char luckyLetter = S.charAt(index);
		System.out.println(luckyLetter);

	}
}
