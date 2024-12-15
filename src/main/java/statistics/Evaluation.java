package statistics;

/**
 * Evaluation class contains methods to evaluate the performance of a model.
 *
 * The following metrics are available:
 * - Accuracy
 * - Precision
 * - Recall
 * - F1 Score
 * - Mean Squared Error
 * - Mean Absolute Error
 * - R2 Score
 * - Confusion Matrix
 * - ROC Curve
 * - AUC
 * - PR Curve
 * - PR AUC
 * - Gain Chart
 * - Lift
 * - Lift Chart
 * - PR Gain Chart
 * - PR Lift
 * - PR Lift Chart
 * - ROC AUC
 *
 * The following methods are available:
 * - accuracy
 * - precision
 * - recall
 * - f1Score
 * - mse
 * - mae
 * - r2Score
 * - confusionMatrix
 * - rocCurve
 * - auc
 * - prCurve
 * - prAuc
 * - gainChart
 * - lift
 * - liftChart
 * - prGainChart
 * - prLift
 * - prLiftChart
 * - rocAuc
 *
 * Example:
 *
 * int[] predicted = {1, 0, 1, 0, 1};
 * int[] actual = {1, 1, 0, 0, 1};
 *
 * double accuracy = Evaluation.accuracy(predicted, actual);
 * double precision = Evaluation.precision(predicted, actual);
 * double recall = Evaluation.recall(predicted, actual);
 * double f1Score = Evaluation.f1Score(predicted, actual);
 * double mse = Evaluation.mse(predicted, actual);
 * double mae = Evaluation.mae(predicted, actual);
 * double r2Score = Evaluation.r2Score(predicted, actual);
 * double[] confusionMatrix = Evaluation.confusionMatrix(predicted, actual);
 * double[] rocCurve = Evaluation.rocCurve(predicted, actual);
 * double auc = Evaluation.auc(predicted, actual);
 * double[] prCurve = Evaluation.prCurve(predicted, actual);
 * double prAuc = Evaluation.prAuc(predicted, actual);
 * double[] gainChart = Evaluation.gainChart(predicted, actual);
 * double lift = Evaluation.lift(predicted, actual);
 * double[] liftChart = Evaluation.liftChart(predicted, actual);
 * double[] prGainChart = Evaluation.prGainChart(predicted, actual);
 * double prLift = Evaluation.prLift(predicted, actual);
 */
public class Evaluation {
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double accuracy(int[] predicted, int[] actual) {
        int correct = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == actual[i]) {
                correct++;
            }
        }
        return (double) correct / predicted.length;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double precision(int[] predicted, int[] actual) {
        int truePositive = 0;
        int falsePositive = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                truePositive++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                falsePositive++;
            }
        }
        return (double) truePositive / (truePositive + falsePositive);
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double recall(int[] predicted, int[] actual) {
        int truePositive = 0;
        int falseNegative = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                truePositive++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                falseNegative++;
            }
        }
        return (double) truePositive / (truePositive + falseNegative);
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double f1Score(int[] predicted, int[] actual) {
        double precision = precision(predicted, actual);
        double recall = recall(predicted, actual);
        return 2 * precision * recall / (precision + recall);
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double mse(double[] predicted, double[] actual) {
        double sum = 0;
        for (int i = 0; i < predicted.length; i++) {
            sum += Math.pow(predicted[i] - actual[i], 2);
        }
        return sum / predicted.length;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double mae(double[] predicted, double[] actual) {
        double sum = 0;
        for (int i = 0; i < predicted.length; i++) {
            sum += Math.abs(predicted[i] - actual[i]);
        }
        return sum / predicted.length;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double r2Score(double[] predicted, double[] actual) {
        double sum1 = 0;
        double sum2 = 0;
        double mean = 0;
        for (int i = 0; i < predicted.length; i++) {
            sum1 += Math.pow(predicted[i] - actual[i], 2);
            sum2 += Math.pow(actual[i], 2);
            mean += actual[i];
        }
        mean /= predicted.length;
        return 1 - sum1 / sum2;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double[] confusionMatrix(int[] predicted, int[] actual) {
        double[] matrix = new double[4];
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                matrix[0]++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                matrix[1]++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                matrix[2]++;
            } else {
                matrix[3]++;
            }
        }
        return matrix;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double[] rocCurve(int[] predicted, int[] actual) {
        double[] curve = new double[2];
        double tp = 0;
        double fp = 0;
        double tn = 0;
        double fn = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                tp++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                fp++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                fn++;
            } else {
                tn++;
            }
        }
        curve[0] = tp / (tp + fn);
        curve[1] = fp / (fp + tn);
        return curve;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double auc(int[] predicted, int[] actual) {
        double[] curve = rocCurve(predicted, actual);
        return curve[0] * curve[1] / 2;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double[] prCurve(int[] predicted, int[] actual) {
        double[] curve = new double[2];
        double tp = 0;
        double fp = 0;
        double tn = 0;
        double fn = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                tp++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                fp++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                fn++;
            } else {
                tn++;
            }
        }
        curve[0] = tp / (tp + fp);
        curve[1] = tp / (tp + fn);
        return curve;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double prAuc(int[] predicted, int[] actual) {
        double[] curve = prCurve(predicted, actual);
        return curve[0] * curve[1] / 2;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double[] gainChart(int[] predicted, int[] actual) {
        double[] chart = new double[2];
        double tp = 0;
        double fp = 0;
        double tn = 0;
        double fn = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                tp++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                fp++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                fn++;
            } else {
                tn++;
            }
        }
        chart[0] = tp / (tp + fn);
        chart[1] = (tp + fp) / (tp + fp + tn + fn);
        return chart;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double lift(int[] predicted, int[] actual) {
        double[] chart = gainChart(predicted, actual);
        return chart[0] / chart[1];
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double[] liftChart(int[] predicted, int[] actual) {
        double[] chart = new double[2];
        double tp = 0;
        double fp = 0;
        double tn = 0;
        double fn = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                tp++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                fp++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                fn++;
            } else {
                tn++;
            }
        }
        chart[0] = tp / (tp + fn);
        chart[1] = (tp + fp) / (tp + fp + tn + fn);
        return chart;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double[] prGainChart(int[] predicted, int[] actual) {
        double[] chart = new double[2];
        double tp = 0;
        double fp = 0;
        double tn = 0;
        double fn = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                tp++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                fp++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                fn++;
            } else {
                tn++;
            }
        }
        chart[0] = tp / (tp + fp);
        chart[1] = tp / (tp + fn);
        return chart;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double prLift(int[] predicted, int[] actual) {
        double[] chart = prGainChart(predicted, actual);
        return chart[0] / chart[1];
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double[] prLiftChart(int[] predicted, int[] actual) {
        double[] chart = new double[2];
        double tp = 0;
        double fp = 0;
        double tn = 0;
        double fn = 0;
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                tp++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                fp++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                fn++;
            } else {
                tn++;
            }
        }
        chart[0] = tp / (tp + fp);
        chart[1] = tp / (tp + fn);
        return chart;
    }
    /**
     * Calculate the accuracy of the predicted values.
     *
     * @param predicted the predicted values
     * @param actual the actual values
     * @return the accuracy
     */
    public static double[] rocAuc(int[] predicted, int[] actual) {
        double[] curve = rocCurve(predicted, actual);
        double[] auc = new double[2];
        auc[0] = curve[0] * curve[1] / 2;
        auc[1] = curve[0] * (1 - curve[1]) / 2;
        return auc;
    }

}

