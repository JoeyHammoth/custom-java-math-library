package statistics;

/**
 * Regression analysis functions.
 */
public class Regression {
    /**
     * Returns the slope of the regression line for the data points.
     * @param x the x values
     * @param y the y values
     * @return the slope of the regression line
     */
    public static float slope(float[] x, float[] y) {
        float xMean = Basic.mean(x);
        float yMean = Basic.mean(y);
        float numerator = 0;
        float denominator = 0;
        for (int i = 0; i < x.length; i++) {
            numerator += (x[i] - xMean) * (y[i] - yMean);
            denominator += (x[i] - xMean) * (x[i] - xMean);
        }
        return numerator / denominator;
    }
    /**
     * Returns the y-intercept of the regression line for the data points.
     * @param x the x values
     * @param y the y values
     * @return the y-intercept of the regression line
     */
    public static float intercept(float[] x, float[] y) {
        return Basic.mean(y) - slope(x, y) * Basic.mean(x);
    }
    /**
     * Returns the correlation coefficient of the data points.
     * @param x the x values
     * @param y the y values
     * @return the correlation coefficient
     */
    public static float correlation(float[] x, float[] y) {
        float xMean = Basic.mean(x);
        float yMean = Basic.mean(y);
        float numerator = 0;
        float denominatorX = 0;
        float denominatorY = 0;
        for (int i = 0; i < x.length; i++) {
            numerator += (x[i] - xMean) * (y[i] - yMean);
            denominatorX += (x[i] - xMean) * (x[i] - xMean);
            denominatorY += (y[i] - yMean) * (y[i] - yMean);
        }
        return numerator / (float) Math.sqrt(denominatorX * denominatorY);
    }
    /**
     * Returns the coefficient of determination of the data points.
     * @param x the x values
     * @param y the y values
     * @return the coefficient of determination
     */
    public static float determination(float[] x, float[] y) {
        return correlation(x, y) * correlation(x, y);
    }
    /**
     * Returns the residuals of the data points.
     * @param x the x values
     * @param y the y values
     * @return the residuals
     */
    public static float[] leastSquares(float[] x, float[] y) {
        float[] result = new float[2];
        result[0] = slope(x, y);
        result[1] = intercept(x, y);
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x the x values
     * @param y the y values
     * @param z the z values
     * @return the residuals
     */
    public static float[] leastSquares(float[] x, float[] y, float[] z) {
        float[] result = new float[3];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = y[i] - z[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = Basic.mean(z);
        return result;
    }

    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static float[] linearRegression(float[] x, float[] y, float[] z) {
        float[] result = new float[3];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = y[i] - z[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = Basic.mean(z);
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static float[] multipleRegression(float[] x, float[] y, float[] z) {
        return linearRegression(x, y, z);
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @param z
     * @param w
     * @return
     */
    public static float[] multipleRegression(float[] x, float[] y, float[] z, float[] w) {
        float[] result = new float[4];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = y[i] - z[i] - w[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = Basic.mean(z);
        result[3] = Basic.mean(w);
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @param z
     * @param w
     * @param v
     * @return
     */
    public static float[] multipleRegression(float[] x, float[] y, float[] z, float[] w, float[] v) {
        float[] result = new float[5];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = y[i] - z[i] - w[i] - v[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = Basic.mean(z);
        result[3] = Basic.mean(w);
        result[4] = Basic.mean(v);
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @param z
     * @param w
     * @param v
     * @param u
     * @return
     */
    public static float[] multipleRegression(float[] x, float[] y, float[] z, float[] w, float[] v, float[] u) {
        float[] result = new float[6];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = y[i] - z[i] - w[i] - v[i] - u[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = Basic.mean(z);
        result[3] = Basic.mean(w);
        result[4] = Basic.mean(v);
        result[5] = Basic.mean(u);
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @param z
     * @param w
     * @param v
     * @param u
     * @param t
     * @return
     */
    public static float[] multipleRegression(float[] x, float[] y, float[] z, float[] w, float[] v, float[] u, float[] t) {
        float[] result = new float[7];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = y[i] - z[i] - w[i] - v[i] - u[i] - t[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = Basic.mean(z);
        result[3] = Basic.mean(w);
        result[4] = Basic.mean(v);
        result[5] = Basic.mean(u);
        result[6] = Basic.mean(t);
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @param z
     * @param w
     * @param v
     * @param u
     * @param t
     * @param s
     * @return
     */
    public static float[] multipleRegression(float[] x, float[] y, float[] z, float[] w, float[] v, float[] u, float[] t, float[] s) {
        float[] result = new float[8];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = y[i] - z[i] - w[i] - v[i] - u[i] - t[i] - s[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = Basic.mean(z);
        result[3] = Basic.mean(w);
        result[4] = Basic.mean(v);
        result[5] = Basic.mean(u);
        result[6] = Basic.mean(t);
        result[7] = Basic.mean(s);
        return result;
    }

    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] exponentialRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] logarithmicRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < y.length; i++) {
            yPrime[i] = (float) Math.log(x[i]);
        }
        float[] b = leastSquares(yPrime, y);
        result[0] = b[1];
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] powerRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.log(x[i]);
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] quadraticRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xSquared = new float[x.length];
        float[] xCubed = new float[x.length];
        float[] xFourth = new float[x.length];
        float[] xFifth = new float[x.length];
        float[] xSixth = new float[x.length];
        float[] xSeventh = new float[x.length];
        float[] xEighth = new float[x.length];
        float[] xNinth = new float[x.length];
        float[] xTenth = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xSquared[i] = x[i] * x[i];
            xCubed[i] = xSquared[i] * x[i];
            xFourth[i] = xCubed[i] * x[i];
            xFifth[i] = xFourth[i] * x[i];
            xSixth[i] = xFifth[i] * x[i];
            xSeventh[i] = xSixth[i] * x[i];
            xEighth[i] = xSeventh[i] * x[i];
            xNinth[i] = xEighth[i] * x[i];
            xTenth[i] = xNinth[i] * x[i];
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = b[2];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] cubicRegression(float[] x, float[] y) {
        float[] result = new float[4];
        float[] xSquared = new float[x.length];
        float[] xCubed = new float[x.length];
        float[] xFourth = new float[x.length];
        float[] xFifth = new float[x.length];
        float[] xSixth = new float[x.length];
        float[] xSeventh = new float[x.length];
        float[] xEighth = new float[x.length];
        float[] xNinth = new float[x.length];
        float[] xTenth = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xSquared[i] = x[i] * x[i];
            xCubed[i] = xSquared[i] * x[i];
            xFourth[i] = xCubed[i] * x[i];
            xFifth[i] = xFourth[i] * x[i];
            xSixth[i] = xFifth[i] * x[i];
            xSeventh[i] = xSixth[i] * x[i];
            xEighth[i] = xSeventh[i] * x[i];
            xNinth[i] = xEighth[i] * x[i];
            xTenth[i] = xNinth[i] * x[i];
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = b[2];
        result[3] = b[3];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] quarticRegression(float[] x, float[] y) {
        float[] result = new float[5];
        float[] xSquared = new float[x.length];
        float[] xCubed = new float[x.length];
        float[] xFourth = new float[x.length];
        float[] xFifth = new float[x.length];
        float[] xSixth = new float[x.length];
        float[] xSeventh = new float[x.length];
        float[] xEighth = new float[x.length];
        float[] xNinth = new float[x.length];
        float[] xTenth = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xSquared[i] = x[i] * x[i];
            xCubed[i] = xSquared[i] * x[i];
            xFourth[i] = xCubed[i] * x[i];
            xFifth[i] = xFourth[i] * x[i];
            xSixth[i] = xFifth[i] * x[i];
            xSeventh[i] = xSixth[i] * x[i];
            xEighth[i] = xSeventh[i] * x[i];
            xNinth[i] = xEighth[i] * x[i];
            xTenth[i] = xNinth[i] * x[i];
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(x, yPrime);
        result[0] = b[0];
        result[1] = b[1];
        result[2] = b[2];
        result[3] = b[3];
        result[4] = b[4];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @param degree
     * @return
     */
    public static float[] polynomialRegression(float[] x, float[] y, int degree) {
        float[] result = new float[degree + 1];
        float[] xSquared = new float[x.length];
        float[] xCubed = new float[x.length];
        float[] xFourth = new float[x.length];
        float[] xFifth = new float[x.length];
        float[] xSixth = new float[x.length];
        float[] xSeventh = new float[x.length];
        float[] xEighth = new float[x.length];
        float[] xNinth = new float[x.length];
        float[] xTenth = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xSquared[i] = x[i] * x[i];
            xCubed[i] = xSquared[i] * x[i];
            xFourth[i] = xCubed[i] * x[i];
            xFifth[i] = xFourth[i] * x[i];
            xSixth[i] = xFifth[i] * x[i];
            xSeventh[i] = xSixth[i] * x[i];
            xEighth[i] = xSeventh[i] * x[i];
            xNinth[i] = xEighth[i] * x[i];
            xTenth[i] = xNinth[i] * x[i];
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(x, yPrime);
        for (int i = 0; i < degree + 1; i++) {
            result[i] = b[i];
        }
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] sinusoidalRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.sin(x[i]);
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = b[1];
        result[1] = b[0];
        result[2] = b[2];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] gaussianRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.exp(-x[i] * x[i]);
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = b[1];
        result[1] = b[0];
        result[2] = b[2];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] logisticRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = 1 / (1 + (float) Math.exp(-x[i]));
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = b[1];
        result[1] = b[0];
        result[2] = b[2];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] exponentialGrowthRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = x[i];
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] exponentialDecayRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = x[i];
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] powerLawRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.log(x[i]);
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] sinusoidalDecayRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.sin(x[i]);
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = b[1];
        result[1] = b[0];
        result[2] = b[2];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] gaussianDecayRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.exp(-x[i] * x[i]);
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = b[1];
        result[1] = b[0];
        result[2] = b[2];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] logisticGrowthRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = 1 / (1 + (float) Math.exp(-x[i]));
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = b[1];
        result[1] = b[0];
        result[2] = b[2];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] logisticDecayRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = 1 / (1 + (float) Math.exp(-x[i]));
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = b[1];
        result[1] = b[0];
        result[2] = b[2];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] exponentialGrowthDecayRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = x[i];
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] exponentialDecayGrowthRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = x[i];
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] powerLawGrowthDecayRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.log(x[i]);
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] powerLawDecayGrowthRegression(float[] x, float[] y) {
        float[] result = new float[2];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.log(x[i]);
            yPrime[i] = (float) Math.log(y[i]);
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = (float) Math.exp(b[1]);
        result[1] = b[0];
        return result;
    }
    /**
     * Returns the residuals of the data points.
     * @param x
     * @param y
     * @return
     */
    public static float[] sinusoidalDecayGrowthRegression(float[] x, float[] y) {
        float[] result = new float[3];
        float[] xPrime = new float[x.length];
        float[] yPrime = new float[y.length];
        for (int i = 0; i < x.length; i++) {
            xPrime[i] = (float) Math.sin(x[i]);
            yPrime[i] = y[i];
        }
        float[] b = leastSquares(xPrime, yPrime);
        result[0] = b[1];
        result[1] = b[0];
        result[2] = b[2];
        return result;
    }
}
