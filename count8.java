/**
 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 *
 *
 * count8(8) → 1
 * count8(818) → 2
 * count8(8818) → 4
 **/
 
 public int count8(int n) {
  int cnt = 0;
  if(n%10 == 8) cnt++;
  if(n%10 == 8 && n/10%10 == 8) cnt *=2;
  
  n /= 10;
  
  if(n==0) return cnt;
  else return count8(n)+cnt;
}
