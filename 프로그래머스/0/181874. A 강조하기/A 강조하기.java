class Solution {
    public String solution(String myString) {
        String result = ""; // 결과를 저장할 문자열
        
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            
            if (currentChar == 'a') {
                result += 'A'; // 소문자 'a'를 대문자 'A'로 변환
            } else if (currentChar != 'A' && Character.isUpperCase(currentChar)) {
                result += Character.toLowerCase(currentChar); // 대문자는 소문자로 변환
            } else {
                result += currentChar; // 나머지 문자는 그대로 유지
            }
        }
        
        return result;
    }
}
