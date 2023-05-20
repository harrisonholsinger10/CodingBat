// This is the main class file for the Codingbat Java exercises that executes the methods with example information and/or input

package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.demo.basicStreams.*;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception
	{
		// sleepIn method
		// Determine whether we get to sleep in or not based on weekend or vacation

		System.out.println();
		
		sample s1 = new sample();

		boolean result1 = s1.sleepIn(false, false);
		System.out.println("(sleepIn) The result is " + result1);

		// monkeyTrouble method
		// Determine whether we are in trouble based on if the monkeys are smiling
		monkeyTrouble m1 = new monkeyTrouble();

		boolean monkeyTroubleResult = m1.monkeyTrouble(false, false);
		if(monkeyTroubleResult == true)
		{
			System.out.println("(monkeyTrouble) We are in trouble");
		}
		else
		{
			System.out.println("(monkeyTrouble) We are safe");
		}

		// sumDouble method
		// Add two numbers together, if they are different, double their sum

		sumDouble sd1 = new sumDouble();

		int sumDoubleResult = sd1.sumDouble(2, 2);
		System.out.println("(sumDouble)The result is " + sumDoubleResult);


		diff21 df21 = new diff21();

		int diff21result = df21.diff21(16);
		System.out.println("(diff21) The absolute difference is " + diff21result);

		// parrotTrouble method
		// If parrot is talking before 7 and after 20 on the clock, we are in trouble

		parrotTrouble pt = new parrotTrouble();
		boolean parrotTroubleResult = pt.parrotTrouble(true, 8);
		if (parrotTroubleResult == true)
		{
			System.out.println("(parrotTrouble) We are in trouble");
		}
		else
		{
			System.out.println("(parrotTrouble) We are NOT in trouble");
		}

		// makes10 method
		// Returns true if either parameter or their sum is equal to 10

		makes10 m10 = new makes10();
		boolean makes10Result = m10.makes10(5,5);
		System.out.println("(makes10) The result is " + makes10Result);


		// nearHundred method
		// Returns true if number is within 10 of 100 or 200, else, false

		nearHundred nh = new nearHundred();
		boolean nearHundredResult = nh.nearHundred(93);
		System.out.println("(nearHundred) The result is " + nearHundredResult);


		// posNeg
		// Returns true if a or b is negative except if negative is true, then it will return true if both are negative

		posNeg pn = new posNeg();
		boolean posNegResult = pn.posNeg(-1, -1, false);
		System.out.println("(posNeg) The result is " + posNegResult);


		notString ns = new notString();
		String notStringResult = ns.notString("candy");
		System.out.println("(notString) The result is '" + notStringResult + "'");


		missingChar mc = new missingChar();
		String missingCharResult = mc.missingChar("kitten", 4);
		System.out.println("(missingChar) The result is " + missingCharResult);


		// frontBack
		// Takes in a string, returns the string after swapping the first and last character

		frontBack fb = new frontBack();
		String frontBackResult = fb.frontBack("Chocolate");
		System.out.println("(frontBack) The result is " + frontBackResult);


		// front3
		// Triples the first three characters of a String

		front3 f3 = new front3();
		String front3Result = f3.front3("Chocolate");
		System.out.println("(front3) The result is " + front3Result);

		// backAround
		// Returns a given string with the last letter added to the front and the back

		backAround bA = new backAround();
		String backAroundResult = bA.backAround("Chocolate");
		System.out.println("(backAround) The result is " + backAroundResult);

		// or35
		// Determines whether a number is divisible by 3 or 5

		or35 or = new or35();
		boolean or35Result = or.or35(9);
		System.out.println("(or35) The result is " + or35Result);

		// front22
		// Returns a given string with the first two letters added to the front and the back

		front22 f22 = new front22();
		String front22Result = f22.front22("Chocolate");
		System.out.println("(front22) The result is " + front22Result);

		// startHi
		// Determines whether a string begins with "hi"

		startHi sH = new startHi();
		boolean startHiResult = sH.startHi("Hi there stranger");
		System.out.println("(startHi) The result is " + startHiResult);

		// icyHot
		// Returns true if one of the temperatures is greater than 100 and the other is less than 0

		icyHot iH = new icyHot();
		boolean icyHotResults = iH.icyHot(1, 101);
		System.out.println("(icyHot) The result is " + icyHotResults);

		// in1020
		// Returns true if either integer is between 10 and 20, inclusive

		in1020 in = new in1020();
		boolean in1020Result = in.in1020(21, 19);
		System.out.println("(in1020) The result is " + in1020Result);

		// hasTeen
		// Returns true if either integer is between 13 and 19, inclusive

		hasTeen hT = new hasTeen();
		boolean hasTeenResult = hT.hasTeen(15, 35, 87);
		System.out.println("(hasTeen) The result is " + hasTeenResult);

		// loneTeen
		// Returns true if either integer is between 13 and 19, inclusive, but
		// not both

		loneTeen lT = new loneTeen();
		boolean loneTeenResult = lT.loneTeen(11, 18);
		System.out.println("(loneTeen) The result is " + loneTeenResult);

		// delDel
		// Removes the string "del" if it occurs at index 1, otherwise returns the string unchanged

		delDel dD = new delDel();
		String delDelResults = dD.delDel("adelbc");
		System.out.println("(delDel) The result is " + delDelResults);

		// mixStart
		// Returns true if a string has "ix" at index one

		mixStart mS = new mixStart();
		boolean mixStartResult = mS.mixStart("pix snacks");
		System.out.println("(mixStart) The result is " + mixStartResult);

		// startOz
		// returns the first two chars, only include first char if it is 'o' and the second if it is 'z'

		startOz sT  = new startOz();
		String startOzResult = sT.startOz("z");
		System.out.println("(startOz) The result is " + startOzResult);

		// intMax
		// Returns the largest value of 3 input integers

		intMax Im = new intMax();
		int intMaxResult = Im.intMax(1, 2, 3);
		System.out.println("(intMax) The result is " + intMaxResult);

		// close10
		// Returns the integer that is closest to the value 10, returns 0 if there is a tie

		close10 c10 = new close10();
		int close10Result = c10.close10(5, 21);

		if (close10Result == 10)
		{
			System.out.println("(close10) It is a tie!");
		}
		else
		{
			System.out.println("(close10) The result is " + close10Result);
		}


		// in3050
		// Returns true if both integers are in between 30 and 40 or 40 and 50

		in3050 inE = new in3050();
		boolean in3050Result = inE.in3050(30, 41);
		System.out.println("(in3050) The result is " + in3050Result);

		// max1020
		// Returns the larger value that is in between 10 and 20, returns 0 if neither are in that range

		max1020 max = new max1020();
		int max1020Results = max.max1020(11, 19);
		System.out.println("(max1020) The result is " + max1020Results);

		// stringE
		// Returns true if the given string contains between 1 and 3 e's

		stringE sE = new stringE();
		boolean stringEResult = sE.stringE("Helelle");
		System.out.println("(stringE) The result is " + stringEResult);

		// lastDigit
		// Returns true if two integers share the same last digit

		lastDigit lD = new lastDigit();
		boolean lastDigitResult = lD.lastDigit(114, 64);
		System.out.println("(lastDigit) The result is " + lastDigitResult);

		// endUp
		// Takes in a string and returns it where the last 3 chars are upper case

		endUp eU = new endUp();
		String endUpResult = eU.endUp("hi there");
		System.out.println("(endUp) The result is " + endUpResult);

		// everyNth
		// Given a non-empty string and an int N, returns a string starting with zero and skips to every Nth char

		everyNth eN = new everyNth();
		String everyNthResult = eN.everyNth("Chocolate", 2);
		System.out.println("(everyNth) The result is " + everyNthResult);

		// stringTimes
		// Given a string and an int, n. Returns a string n times

		stringTimes sTS = new stringTimes();
		String stringTimesResult = sTS.stringTimes("Hello", 5);
		System.out.println("(stringTimes) The result is "+ stringTimesResult);

		// frontTimes
		// Given a string and an int, n. Returns the first 3 chars are a string n times

		frontTimes fT  = new frontTimes();
		String frontTimesResult = fT.frontTimes("Chocolate", 5);
		System.out.println("(frontTimes) The result is " + frontTimesResult);

		// countXX
		// Counts the number of occurring "xx", overlapping is allowed

		countXX cXX = new countXX();
		int countXXResult = cXX.countXX("abcxxx");
		System.out.println("(countXX) The result is " + countXXResult);

		// doubleX
		// Returns true if the first instance of "x" in the string is immediately followed by another "x"

		doubleX dX = new doubleX();
		boolean doubleXResult = dX.doubleX("axbxc");
		System.out.println("(doubleX) The result is " + doubleXResult);

		// stringBits
		// Returns a new string made of every other char starting with the first

		stringBits sB = new stringBits();
		String stringBitsResult = sB.stringBits("Hello there");
		System.out.println("(stringBits) The result is " + stringBitsResult);

		// stringSplosion
		// Takes in a string, and returns it with an additional char each time
		// ie. Code -> CCoCodCode

		stringSplosion sSp = new stringSplosion();
		String stringSplosionResult = sSp.stringSplosion("Harrison");
		System.out.println("(stringSplosion) " + stringSplosionResult);

		// last2
		// Counts the number of times that the last two chars of a string appear in the rest of the string, excluding
		// the original last two chars

		last2 l2 = new last2();
		int last2Result = l2.last2("axxxaaxx");
		System.out.println("(last2) The result is " + last2Result);

		// arrayCount9
		// Counts the number of 9's in an array

		Integer[] intArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		arrayCount9 a9 = new arrayCount9();
		int arrayCount9Result = a9.arrayCount9(intArray);
		int arrayCount9StreamResult = a9.arrayCount9Stream(numbers);
		System.out.println("(arrayCount9) The result is " + arrayCount9Result);
		System.out.println("(arrayCount9) The result is " + arrayCount9StreamResult);

		// arrayFront9
		// Returns true if one of the first 4 elements in the array is 9

		Integer[] array9 = {1, 2, 3, 4, 9};
		arrayFront9 aF9 = new arrayFront9();
		boolean arrayFront9Result = aF9.arrayFront9(array9);
		System.out.println("(arrayFront9) The result is " + arrayFront9Result);

		// array123
		// Returns true if the sequence of numbers 1, 2, 3, appear in the array somewhere

		array123 a123 = new array123();
		boolean array123Result = a123.array123(new int[]{1, 2, 3, 4, 5, 6});
		System.out.println("(array123) The result is " + array123Result);

		stringMatch sM = new stringMatch();
		int stringMatchResult = sM.stringMatch("xxcaazz", "xxbaaz");
		System.out.println("(stringMatch) The result is " + stringMatchResult);

		// stringX
		// Given a string, it returns a string with the x's removed except the one's at the beginning or end

		stringX sX = new stringX();
		String stringXResult = sX.stringX("xxHxix");
		System.out.println("(stringX) The result is " + stringXResult);

		// altPairs
		// Given a string, returns a string made of the chars at indexes 0, 1, 4, 5, 8, 9

		altPairs aP = new altPairs();
		String altPairsResult = aP.altPairs("Chocolate");
		System.out.println("(altPairs) The result is " + altPairsResult);

		// stringYak
		// Returns a string without "yak" but the 'a' can be any character

		stringYak sY = new stringYak();
		String stringYakResult = sY.stringYak("xxxyakyyyakzzz");
		System.out.println("(stringYak) The result is " + stringYakResult);

		// array667
		// Counts the number of times that an array contains "[6], [6]" or "[6], [7]"

		array667 a667 = new array667();
		int array667Result = a667.array667(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8});
		System.out.println("(array667) The result is " + array667Result);

		// noTriples
		// Returns true if a value does not occur three times in a row in the given array

		noTriples nT = new noTriples();
		boolean noTriplesResult = nT.noTriples(new int[]{1, 1, 2, 2, 1, 2, 1});
		System.out.println("(noTriples) The result is " + noTriplesResult);

		// has271
		// Returns true of the array contains a 271 pattern: a value, followed by the value plus 5,
		// followed by the value minus 1

		has271 h271 = new has271();
		boolean has271Result = h271.has271(new int[]{1, 2, 7, 1});
		System.out.println("(has271) The result is " + has271Result);

		// STREAM EXERCISES!!!

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

		List<Integer> numberss = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		printOddNumbersInList(numberss);
		printAllCourses(courses);
		printCoursesWSpring(courses);
		printCourses4Letters(courses);
		printCubesOfOddNumbers(numbers);
		printNumOfCharsInEachCourse(courses);
		System.out.println(printSumOfSquares(numberss));
		System.out.println(printSumOfCubes(numberss));
		System.out.println(sumOfOddNums(numberss));
		System.out.println(printListOfEvenNums(numberss));
		System.out.println(printListOfLengths(courses));
		System.out.println(printCubesOfOddNumbersSorted(numberss));

		// MAPPING EXERCISES

		Map<String, String> map = new HashMap<>();
		map.put("a", "apple");
		map.put("b", "banana");
		map.put("c", "candy");
		map.put("ice cream", "chocolate");
		map.put("potato", "lunch");

		mapBully mapBully = new mapBully();
		Map<String, String> mapBullyResult = mapBully.mapBully(map);
		System.out.println(mapBullyResult);

		mapShare mapShare = new mapShare();
		Map<String, String> mapShareResult = mapShare.mapShare(map);
		//System.out.println(mapShareResult);

		mapAB mapAB = new mapAB();
		Map<String, String> mapABResult = mapAB.mapAB(map);
		System.out.println(mapABResult);

		topping1 topping1 = new topping1();
		Map<String, String> topping1Result = topping1.topping1(map);
		System.out.println(topping1Result);

		topping2 topping2 = new topping2();
		Map<String, String> topping2Result = topping2.topping2(map);
		System.out.println(topping2Result);

		topping3 topping3 = new topping3();
		Map<String, String> topping3Result = topping3.topping3(map);
		System.out.println(topping3Result);

		mapAB2 mapAB2 = new mapAB2();
		Map<String, String> mapAB2Result = mapAB2.mapAB2(map);
		System.out.println(mapAB2Result);

		mapAB3 mapAB3 = new mapAB3();
		Map<String, String> mapAB3Result = mapAB3.mapAB3(map);
		System.out.println(mapAB3Result);

		mapAB4 mapAB4 = new mapAB4();
		Map<String, String> mapAB4Result = mapAB4.mapAB4(map);
		System.out.println(mapAB4Result);

		String[] map1 = {"ab", "ac"};

		word0 word0 = new word0();
		Map<String, Integer> word0Result = word0.word0(map1);
		System.out.println(word0Result);

		wordLen wordLen = new wordLen();
		Map<String, Integer> wordLenResult = wordLen.wordLen(map1);
		System.out.println(wordLenResult);

		pairs pairs = new pairs();
		Map<String, String> pairsResult = pairs.pairs(map1);
		System.out.println(pairsResult);

		wordCount wordCount = new wordCount();
		Map<String, Integer> wordCountResult = wordCount.wordCount(map1);
		System.out.println(wordCountResult);

		firstChar firstChar = new firstChar();
		Map<String, String> firstCharResult = firstChar.firstChar(map1);
		System.out.println(firstCharResult);

		wordAppend wordAppend = new wordAppend();
		String wordAppendResult = wordAppend.wordAppend(map1);
		System.out.println(wordAppendResult);

		wordMultiple wordMultiple = new wordMultiple();
		Map<String, Boolean> wordMultipleResult = wordMultiple.wordMultiple(map1);
		System.out.println(wordMultipleResult);

		allSwap allSwap = new allSwap();
		String[] allSwapResult = allSwap.allSwap(map1);
		System.out.println(allSwapResult);

		firstSwap firstSwap = new firstSwap();
		String[] firstSwapResult = firstSwap.firstSwap(map1);
		System.out.println(firstSwapResult);

		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15, -12);
		List<String> strs = List.of("Springz", "Spring BootZ", "API" , "Microservices", "AWS", "PCF","Azure", "Docker");

		doubling doubling = new doubling();
		List<Integer> doublingResult = doubling.doubling(nums);
		System.out.println(doublingResult);

		square square = new square();
		List<Integer> squareResult = square.square(nums);
		System.out.println(squareResult);

		addStar addStar = new addStar();
		List<String> addStarResult = addStar.addStar(strs);
		System.out.println(addStarResult);

		copies3 copies3 = new copies3();
		List<String> copies3Result = copies3.copies3(strs);
		System.out.println(copies3Result);

		moreY moreY = new moreY();
		List<String> moreYResult = moreY.moreY(strs);
		System.out.println(moreYResult);

		math1 math1 = new math1();
		List<Integer> math1Result = math1.math1(nums);
		System.out.println(math1Result);

		rightDigit rightDigit = new rightDigit();
		List<Integer> rightDigitResult = rightDigit.rightDigit(nums);
		System.out.println(rightDigitResult);
		
		lower lower = new lower();
		List<String> lowerResult = lower.lower(strs);
		System.out.println(lowerResult);

		noX noX = new noX();
		List<String> noXResult = noX.noX(strs);
		System.out.println(noXResult);

		noNeg noNeg = new noNeg();
		List<Integer> noNegResult = noNeg.noNeg(nums);
		System.out.println(noNegResult);

		no9 no9 = new no9();
		List<Integer> no9Result = no9.no9(nums);
		System.out.println(no9Result);

		noTeen noTeen = new noTeen();
		List<Integer> noTeenResult = noTeen.noTeen(nums);
		System.out.println(noTeenResult);

		noZ noZ = new noZ();
		List<String> noZResult = noZ.noZ(strs);
		System.out.println(noZResult);

		noLong noLong = new noLong();
		List<String> noLongResult = noLong.noLong(strs);
		System.out.println(noLongResult);

		no34 no34 = new no34();
		List<String> no34Result = no34.no34(strs);
		System.out.println(no34Result);

		noYY noYY = new noYY();
		List<String> noYYResult = noYY.noYY(strs);
		System.out.println(noYYResult);

		two2 two2 = new two2();
		List<Integer> two2Result = two2.two2(nums);
		System.out.println(two2Result);

		square56 square56 = new square56();
		List<Integer> square56Result = square56.square56(nums);
		System.out.println(square56Result);

	}
}
