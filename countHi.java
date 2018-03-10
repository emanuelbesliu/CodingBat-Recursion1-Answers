/**
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 *
 *
 * countHi("xxhixx") → 1
 * countHi("xhixhix") → 2
 * countHi("hi") → 1
 **/
 
 public int countHi(String str) {
  int cnt = 0;
  
  if(str == null || str.length()<=0) return cnt;
  
  if(str.startsWith("hi")) cnt++;
  return countHi(str.substring(1))+cnt;
}

