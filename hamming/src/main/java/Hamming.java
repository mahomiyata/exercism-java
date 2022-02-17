public class Hamming {

    String leftStrand;
    String rightStrand;
    int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length()) {
            this.leftStrand = leftStrand;
            this.rightStrand = rightStrand;
            this.hammingDistance = 0;

            for (int i = 0; i < this.leftStrand.length(); i++) {
                if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
                    this.hammingDistance += 1;
                }
            }

        } else if (leftStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        return this.hammingDistance;
    }
}
