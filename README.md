1. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

2. Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged

3. Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz"


4. Return true if the given string contains between 1 and 3 'e' chars.

5. Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

6. Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

7. 
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
test cases: 
- countXX("abcxx") → 1
- countXX("xxx") → 2
- countXX("xxxx") → 3

8. Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

- stringBits("Hello") → "Hlo"
- stringBits("Hi") → "H"
- stringBits("Heeololeo") → "Hello"

```
public String stringBits(String str) {
  String result = "";
  // Note: the loop increments i by 2
  for (int i=0; i<str.length(); i+=2) {
    result = result + str.substring(i, i+1);
    // Alternately could use str.charAt(i)
  }
  return result;
}
```

9. Given a non-empty string like "Code" return a string like "CCoCodCode".


* stringSplosion("Code") → "CCoCodCode"
* stringSplosion("abc") → "aababc"
* stringSplosion("ab") → "aab

10. Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


* last2("hixxhi") → 1
* last2("xaxxaxaxx") → 1
* last2("axxxaaxx") → 2

11. Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


* stringYak("yakpak") → "pak"
* stringYak("pakyak") → "pak"
* stringYak("yak123ya") → "123ya"

12. Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


* has271([1, 2, 7, 1]) → true
* has271([1, 2, 8, 1]) → false
* has271([2, 7, 1]) → true 
