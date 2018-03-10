/**
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 *
 *
 * countX("xxhixx") → 4
 * countX("xhixhix") → 3
 * countX("hi") → 0
 **/
 
 public int countX(String str) {
  int count = 0;
  
  if(str == null || str.length()<= 0) return count;
  
  if(str.charAt(0) == 'x') count++;
  
  return countX(str.substring(1))+count;
}
