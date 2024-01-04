class Solution {
    public String solution(String polynomial) {
        int coefficientX = 0;
        int constant = 0;

        for (String term : polynomial.split(" ")) {
            if (term.contains("x")) {
                coefficientX += term.equals("x") ? 1 : Integer.parseInt(term.replaceAll("x", ""));
            } else if (!term.equals("+")) {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder result = new StringBuilder();

        if (coefficientX != 0) {
            result.append((coefficientX > 1 ? coefficientX + "x" : "x"));
        }

        if (constant != 0) {
            result.append((coefficientX != 0 ? " + " : "") + constant);
        } else if (coefficientX == 0) {
            result.append("0");
        }

        return result.toString();
    }
}
