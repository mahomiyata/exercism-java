class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder sb = new StringBuilder();
        boolean isAfterDash = false;
        char[] charArray = identifier.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (isAfterDash) {
                sb.append(Character.toUpperCase(charArray[i]));
                isAfterDash = false;
            } else if(Character.isSpaceChar(charArray[i])) {
                sb.append('_');
            } else if (Character.isISOControl(charArray[i])) {
                sb.append("CTRL");
            } else if (charArray[i] == '-') {
                isAfterDash = true;
            } else if(isGreekLEtter(charArray[i])) {
                continue;
            } else if(Character.isLetter(charArray[i])){
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }

    static boolean isGreekLEtter(char c) {
        return (c >= 'α' && c <= 'ω');
    }
}
