/**
 * Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
 *
 *
 * strCount("catcowcat", "cat") → 2
 * strCount("catcowcat", "cow") → 1
 * strCount("catcowcat", "dog") → 0
 **/
 
 public int strCount(String str, String sub) {
  int cnt = 0;
  if(str.length() == 0) return cnt;
  
  if(str.startsWith(sub)){ 
    cnt++;
    return strCount(str.substring(sub.length()),sub)+cnt;
  }
  
  return strCount(str.substring(1),sub)+cnt;
}
