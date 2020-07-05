public class WorldMap {
    public static void main(String[] args) {
        int xmax = StdIn.readInt();
        int ymax = StdIn.readInt();
        StdDraw.setCanvasSize(xmax, ymax);
        StdDraw.setXscale(0, xmax);
        StdDraw.setYscale(0, ymax);

        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int cnt = StdIn.readInt();
            double[] x = new double[cnt];
            double[] y = new double[cnt];
            for (int i = 0; i < cnt; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            
            StdDraw.polygon(x, y);
        }
    }
}