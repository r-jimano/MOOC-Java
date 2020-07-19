public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] arr = new double[(int) (a.length * alpha)];
        for (int i = 0; i < arr.length; i++) {
            if (i < a.length)
                arr[i] = a[i];
            else
                arr[i] = a[i - a.length];
        }

        return arr;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] reverse = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            reverse[i] = a[a.length - i - 1];
        }
        return reverse;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] merge = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merge[a.length + i] = b[i];
        }
        return merge;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] arr;
        if (a.length >= b.length) {
            arr = new double[a.length];
            for (int i = 0; i < arr.length; i++) {
                if (i < b.length)
                    arr[i] = a[i] + b[i];
                else
                    arr[i] = a[i];
            }
        } else {
            arr = new double[b.length];
            for (int i = 0; i < arr.length; i++) {
                if (i < a.length)
                    arr[i] = a[i] + b[i];
                else
                    arr[i] = b[i];
            }
        }

        return arr;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        // TODO
        double[] arr = new double[(int) (a.length / alpha)];

        return a;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        amplify(StdAudio.read("piano.wav"), 1.5);
        reverse(StdAudio.read("beatbox.wav"));
        merge(StdAudio.read("chimes.wav"),StdAudio.read("dialup.wav"));
        mix(StdAudio.read("exposure.wav"),StdAudio.read("harp.wav"));
        changeSpeed(StdAudio.read("piano.wav"), 1.5);
    }
}