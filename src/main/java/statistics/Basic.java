package statistics;

/**
 * Basic statistical functions.
 */
public class Basic {
    /**
     * Returns the maximum value in the data array.
     * @param data the data array
     * @return the maximum value
     */
    public static float max(float[] data) {
        float max = data[0];
        for (float d : data) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }
    /**
     * Returns the minimum value in the data array.
     * @param data the data array
     * @return the minimum value
     */
    public static float min(float[] data) {
        float min = data[0];
        for (float d : data) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }
    /**
     * Returns the sum of the values in the data array.
     * @param data the data array
     * @return the sum of the values
     */
    public static float sum(float[] data) {
        float sum = 0;
        for (float d : data) {
            sum += d;
        }
        return sum;
    }
    /**
     * Returns the mean of the values in the data array.
     * @param data the data array
     * @return the mean of the values
     */
    public static float mean(float[] data) {
        float sum = 0;
        for (float d : data) {
            sum += d;
        }
        return sum / data.length;
    }
    /**
     * Returns the median of the values in the data array.
     * @param data the data array
     * @return the median of the values
     */
    public static float median(float[] data) {
        int n = data.length;
        if (n % 2 == 0) {
            return (data[n / 2 - 1] + data[n / 2]) / 2;
        } else {
            return data[n / 2];
        }
    }
    /**
     * Returns the mode of the values in the data array.
     * @param data the data array
     * @return the mode of the values
     */
    public static float mode(float[] data) {
        int n = data.length;
        float mode = data[0];
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            float value = data[i];
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (data[j] == value) {
                    count++;
                }
            }
            if (count > maxCount) {
                mode = value;
                maxCount = count;
            }
        }
        return mode;
    }
    /**
     * Returns the variance of the values in the data array.
     * @param data the data array
     * @return the variance of the values
     */
    public static float variance(float[] data) {
        float mean = mean(data);
        float sum = 0;
        for (float d : data) {
            sum += (d - mean) * (d - mean);
        }
        return sum / data.length;
    }
    /**
     * Returns the standard deviation of the values in the data array.
     * @param data the data array
     * @return the standard deviation of the values
     */
    public static float standardDeviation(float[] data) {
        return (float) Math.sqrt(variance(data));
    }
    /**
     * Returns the covariance of the values in the data arrays.
     * @param data1 the first data array
     * @param data2 the second data array
     * @return the covariance of the values
     */
    public static float covariance(float[] data1, float[] data2) {
        if (data1.length != data2.length) {
            throw new IllegalArgumentException("Data arrays must have the same length");
        }
        float mean1 = mean(data1);
        float mean2 = mean(data2);
        float sum = 0;
        for (int i = 0; i < data1.length; i++) {
            sum += (data1[i] - mean1) * (data2[i] - mean2);
        }
        return sum / data1.length;
    }
    /**
     * Returns the correlation of the values in the data arrays.
     * @param data1 the first data array
     * @param data2 the second data array
     * @return the correlation of the values
     */
    public static float correlation(float[] data1, float[] data2) {
        return covariance(data1, data2) / (standardDeviation(data1) * standardDeviation(data2));
    }
}
