package LeetCode;

// https://leetcode.com/problems/minimum-window-substring/

class Minimum_Window_Substring {


    public static String min_subString_window(String s, String t){
        int freq_s[] = new int[256];
        int[] freq_t = new int[256];

        for(char c : t.toCharArray()){
            freq_t[c]++;
        }

        int count = 0;
        int start = 0;
        int min_len = Integer.MAX_VALUE;
        int strat_index = -1;

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);

            freq_s[ch]++;
            if(freq_s[ch] <= freq_t[ch]) {
                count++;
            }
            if(count == t.length()){
                // shrink the window
                while(freq_s[s.charAt(start)] > freq_t[s.charAt(start)] || freq_t[s.charAt(start)] == 0){
                    if(freq_s[s.charAt(start)] > freq_t[s.charAt(start)]){
                        freq_s[s.charAt(start)]--;
                    }
                    start++;
                }
                if(min_len > i - start + 1){
                    min_len = i - start + 1;
                    strat_index = start;
                }
            }
        }
        if(strat_index == -1){
            return "";
        }
        return s.substring(strat_index, strat_index + min_len);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(min_subString_window(s, t));
    }
}
