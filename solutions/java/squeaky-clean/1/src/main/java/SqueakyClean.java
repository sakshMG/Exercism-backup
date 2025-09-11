class SqueakyClean {
    static String clean(String identifier) {
        var result = new StringBuilder();
        var doUpper = false;
        for (int i = 0; i < identifier.length(); i++) {
            final var c = identifier.charAt(i);
            if (c == '4') {
                result.append('a');
            } else if (c == '3') {
                result.append('e');
            } else if (c == '0') {
                result.append('o');
            } else if (c == '1') {
                result.append('l');
            } else if (c == '7') {
                result.append('t');
            } else if (Character.isSpaceChar(c)) {
                result.append('_');
            } else if (Character.isISOControl(c)) {
                result.append("CTRL");
            } else if (c == '-') {
                // Turn state on.
                doUpper = true;
            } else if (c >= 'α' && c <= 'ω') {
                // Skip.
            } else if (doUpper) {
                result.append(Character.toUpperCase(c));
                // Turn state back off.
                doUpper = false;
            } else if (Character.isLetter(c) || c == '_') {
                // Copy over, no change.
                result.append(c);
            }
        }
        return result.toString();
        
    }
}
