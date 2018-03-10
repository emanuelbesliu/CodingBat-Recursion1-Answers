/*Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.


count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
*/

public int count11(String str) {
  int cnt = 0;
  if(str.length() <= 1) return cnt;
  
  if(str.substring(0,2).equals("11")){
    cnt++;
    return count11(str.substring(2))+cnt;
  } 

  return count11(str.substring(1))+cnt;
}
