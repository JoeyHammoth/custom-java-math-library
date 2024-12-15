package finance;
/**
 * Basic class contains methods to calculate the basic financial formulas
 * like simple interest, compound interest, future value, present value, etc.
 * The class contains methods to calculate the following:
 * 1. Simple Interest
 * 2. Compound Interest
 * 3. Future Value
 * 4. Present Value
 * 5. Future Value of Annuity
 * 6. Present Value of Annuity
 * 7. Future Value of Annuity Due
 * 8. Present Value of Annuity Due
 * 9. Future Value of Perpetuity
 * 10. Present Value of Perpetuity
 * 11. Future Value of Growing Annuity
 * 12. Present Value of Growing Annuity
 * 13. Future Value of Growing Perpetuity
 * 14. Present Value of Growing Perpetuity
 * 15. Future Value of Continuous Compounding
 * 16. Present Value of Continuous Compounding
 * 17. Future Value of Annuity with Continuous Compounding
 * 18. Present Value of Annuity with Continuous Compounding
 * 19. Future Value of Growing Annuity with Continuous Compounding
 * 20. Present Value of Growing Annuity with Continuous Compounding
 * 21. Future Value of Perpetuity with Continuous Compounding
 * 22. Present Value of Perpetuity with Continuous Compounding
 * 23. Future Value of Growing Perpetuity with Continuous Compounding
 * 24. Present Value of Growing Perpetuity with Continuous Compounding
 * 25. Future Value of Annuity Due with Continuous Compounding
 * 26. Present Value of Annuity Due with Continuous Compounding
 * 27. Future Value of Growing Annuity Due with Continuous Compounding
 * 28. Present Value of Growing Annuity Due with Continuous Compounding
 * 29. Future Value of Perpetuity Due with Continuous Compounding
 * 30. Present Value of Perpetuity Due with Continuous Compounding
 * 31. Future Value of Growing Perpetuity Due with Continuous Compounding
 * 32. Present Value of Growing Perpetuity Due with Continuous Compounding
 */
public class Basic {
    /**
     * Calculate the simple interest
     * @param principal The principal amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The simple interest
     */
    public static float simpleInterest(float principal, float rate, float time) {
        return (principal * rate * time) / 100;
    }
    /**
     * Calculate the compound interest
     * @param principal The principal amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The compound interest
     */
    public static float compoundInterest(float principal, float rate, float time) {
        return (float) (principal * Math.pow(1 + rate / 100, time) - principal);
    }
    /**
     * Calculate the future value
     * @param principal The principal amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The future value
     */
    public static float futureValue(float principal, float rate, float time) {
        return principal + simpleInterest(principal, rate, time);
    }
    /**
     * Calculate the present value
     * @param principal The principal amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The present value
     */
    public static float presentValue(float principal, float rate, float time) {
        return principal - simpleInterest(principal, rate, time);
    }
    /**
     * Calculate the future value of annuity
     * @param principal The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The future value of annuity
     */
    public static float futureValueCI(float principal, float rate, float time) {
        return principal + compoundInterest(principal, rate, time);
    }
    /**
     * Calculate the present value of annuity
     * @param principal The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The present value of annuity
     */
    public static float presentValueCI(float principal, float rate, float time) {
        return principal - compoundInterest(principal, rate, time);
    }
    /**
     * Calculate the future value of annuity
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The future value of annuity
     */
    public static float futureValueAnnuity(float payment, float rate, float time) {
        return payment * ((float) (Math.pow(1 + rate / 100, time) - 1) / (rate / 100));
    }
    /**
     * Calculate the present value of annuity
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The present value of annuity
     */
    public static float presentValueAnnuity(float payment, float rate, float time) {
        return payment * ((1 - (float) Math.pow(1 + rate / 100, -time)) / (rate / 100));
    }
    /**
     * Calculate the future value of annuity due
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The future value of annuity due
     */
    public static float futureValueAnnuityDue(float payment, float rate, float time) {
        return payment * ((float) (Math.pow(1 + rate / 100, time) - 1) / (rate / 100)) * (1 + rate / 100);
    }
    /**
     * Calculate the present value of annuity due
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The present value of annuity due
     */
    public static float presentValueAnnuityDue(float payment, float rate, float time) {
        return payment * ((1 - (float) Math.pow(1 + rate / 100, -time)) / (rate / 100)) * (1 + rate / 100);
    }
    /**
     * Calculate the future value of perpetuity
     * @param payment The payment amount
     * @param rate The rate of interest
     * @return The future value of perpetuity
     */
    public static float futureValuePerpetuity(float payment, float rate) {
        return payment / (rate / 100);
    }
    /**
     * Calculate the present value of perpetuity
     * @param payment The payment amount
     * @param rate The rate of interest
     * @return The present value of perpetuity
     */
    public static float presentValuePerpetuity(float payment, float rate) {
        return payment / (rate / 100);
    }
    /**
     * Calculate the future value of growing annuity
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @param time The time period
     * @return The future value of growing annuity
     */
    public static float futureValueGrowingAnnuity(float payment, float rate, float growth, float time) {
        return payment * ((float) (Math.pow(1 + rate / 100, time) - Math.pow(1 + growth / 100, time)) / (rate - growth));
    }
    /**
     * Calculate the present value of growing annuity
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @param time The time period
     * @return The present value of growing annuity
     */
    public static float presentValueGrowingAnnuity(float payment, float rate, float growth, float time) {
        return payment * ((1 - (float) Math.pow(1 + growth / 100, -time)) / (rate - growth));
    }
    /**
     * Calculate the future value of growing perpetuity
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @return The future value of growing perpetuity
     */
    public static float futureValueGrowingPerpetuity(float payment, float rate, float growth) {
        return payment / (rate - growth);
    }
    /**
     * Calculate the present value of growing perpetuity
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @return The present value of growing perpetuity
     */
    public static float presentValueGrowingPerpetuity(float payment, float rate, float growth) {
        return payment / (rate - growth);
    }
    /**
     * Calculate the future value with continuous compounding
     * @param principal The principal amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The future value with continuous compounding
     */
    public static float futureValueContinuousCompounding(float principal, float rate, float time) {
        return (float) (principal * Math.exp(rate * time));
    }
    /**
     * Calculate the present value with continuous compounding
     * @param principal The principal amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The present value with continuous compounding
     */
    public static float presentValueContinuousCompounding(float principal, float rate, float time) {
        return (float) (principal / Math.exp(rate * time));
    }
    /**
     * Calculate the future value of annuity with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The future value of annuity with continuous compounding
     */
    public static float futureValueAnnuityContinuousCompounding(float payment, float rate, float time) {
        return payment * ((float) (Math.exp(rate * time) - 1) / rate);
    }
    /**
     * Calculate the present value of annuity with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The present value of annuity with continuous compounding
     */
    public static float presentValueAnnuityContinuousCompounding(float payment, float rate, float time) {
        return payment * ((1 - (float) Math.exp(-rate * time)) / rate);
    }
    /**
     * Calculate the future value of growing annuity with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @param time The time period
     * @return The future value of growing annuity with continuous compounding
     */
    public static float futureValueGrowingAnnuityContinuousCompounding(float payment, float rate, float growth, float time) {
        return payment * ((float) (Math.exp(rate * time) - Math.exp(growth * time)) / (rate - growth));
    }
    /**
     * Calculate the present value of growing annuity with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @param time The time period
     * @return The present value of growing annuity with continuous compounding
     */
    public static float presentValueGrowingAnnuityContinuousCompounding(float payment, float rate, float growth, float time) {
        return payment * ((1 - (float) Math.exp(-growth * time)) / (rate - growth));
    }
    /**
     * Calculate the future value of perpetuity with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @return The future value of perpetuity with continuous compounding
     */
    public static float futureValuePerpetuityContinuousCompounding(float payment, float rate) {
        return payment / rate;
    }
    /**
     * Calculate the present value of perpetuity with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @return The present value of perpetuity with continuous compounding
     */
    public static float presentValuePerpetuityContinuousCompounding(float payment, float rate) {
        return payment / rate;
    }
    /**
     * Calculate the future value of growing perpetuity with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @return The future value of growing perpetuity with continuous compounding
     */
    public static float futureValueGrowingPerpetuityContinuousCompounding(float payment, float rate, float growth) {
        return payment / (rate - growth);
    }
    /**
     * Calculate the present value of growing perpetuity with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @return The present value of growing perpetuity with continuous compounding
     */
    public static float presentValueGrowingPerpetuityContinuousCompounding(float payment, float rate, float growth) {
        return payment / (rate - growth);
    }
    /**
     * Calculate the future value of annuity due with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The future value of annuity due with continuous compounding
     */
    public static float futureValueAnnuityDueContinuousCompounding(float payment, float rate, float time) {
        return payment * ((float) (Math.exp(rate * time) - 1) / rate) * (1 + rate);
    }
    /**
     * Calculate the present value of annuity due with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The present value of annuity due with continuous compounding
     */
    public static float presentValueAnnuityDueContinuousCompounding(float payment, float rate, float time) {
        return payment * ((1 - (float) Math.exp(-rate * time)) / rate) * (1 + rate);
    }
    /**
     * Calculate the future value of growing annuity due with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @param time The time period
     * @return The future value of growing annuity due with continuous compounding
     */
    public static float futureValueGrowingAnnuityDueContinuousCompounding(float payment, float rate, float growth, float time) {
        return payment * ((float) (Math.exp(rate * time) - Math.exp(growth * time)) / (rate - growth)) * (1 + rate);
    }
    /**
     * Calculate the present value of growing annuity due with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @param time The time period
     * @return The present value of growing annuity due with continuous compounding
     */
    public static float presentValueGrowingAnnuityDueContinuousCompounding(float payment, float rate, float growth, float time) {
        return payment * ((1 - (float) Math.exp(-growth * time)) / (rate - growth)) * (1 + rate);
    }
    /**
     * Calculate the future value of perpetuity due with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @return The future value of perpetuity due with continuous compounding
     */
    public static float futureValuePerpetuityDueContinuousCompounding(float payment, float rate) {
        return payment / rate * (1 + rate);
    }
    /**
     * Calculate the present value of perpetuity due with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @return The present value of perpetuity due with continuous compounding
     */
    public static float presentValuePerpetuityDueContinuousCompounding(float payment, float rate) {
        return payment / rate * (1 + rate);
    }
    /**
     * Calculate the future value of growing perpetuity due with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @return The future value of growing perpetuity due with continuous compounding
     */
    public static float futureValueGrowingPerpetuityDueContinuousCompounding(float payment, float rate, float growth) {
        return payment / (rate - growth) * (1 + rate);
    }
    /**
     * Calculate the present value of growing perpetuity due with continuous compounding
     * @param payment The payment amount
     * @param rate The rate of interest
     * @param growth The growth rate
     * @return The present value of growing perpetuity due with continuous compounding
     */
    public static float presentValueGrowingPerpetuityDueContinuousCompounding(float payment, float rate, float growth) {
        return payment / (rate - growth) * (1 + rate);
    }
}
