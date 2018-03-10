/**Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 *
 *   countAbc("abc") → 1
 *   countAbc("abcxxabc") → 2
 *   countAbc("abaxxaba") → 2
 **/
 
 public int countAbc(String str) {
  int cnt = 0;
  if(str.length() == 0) return cnt;
  
  if(str.startsWith("abc") || str.startsWith("aba")) cnt++;
  
  return countAbc(str.substring(1))+cnt;
}
