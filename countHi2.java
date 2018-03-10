/**
 * Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
 *
 * 
 * countHi2("ahixhi") → 1
 * countHi2("ahibhi") → 2
 * countHi2("xhixhi") → 0
 **/
 
 public int countHi2(String str) {
  int cnt = 0;
  if(str.length() <= 1) return cnt;
  
  
  if(str.length() > 2 && str.substring(0,3).equals("xhi")){
    return countHi2(str.substring(3))+cnt;
  }
  
  if(str.substring(0,2).equals("hi")){ 
    cnt++;
    return countHi2(str.substring(2))+cnt;
  }
  
  return countHi2(str.substring(1))+cnt;
}
