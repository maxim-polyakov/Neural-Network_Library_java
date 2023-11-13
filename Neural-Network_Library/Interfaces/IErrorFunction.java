package Interfaces;

public interface IErrorFunction {
    /// <summary>
    /// Calculate the error.
    /// </summary>
    /// <param name="ideal">The ideal values.</param>
    /// <param name="actual">The actual values.</param>
    /// <param name="error">The rror output.</param>
    void CalculateError(double[] ideal, double[] actual, double[] error);
}
