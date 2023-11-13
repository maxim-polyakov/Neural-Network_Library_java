package Interfaces;

public interface IMLError {
    /// <summary>
    /// Calculate the error of the ML method, given a dataset.
    /// </summary>
    ///
    /// <param name="data">The dataset.</param>
    /// <returns>The error.</returns>
    double CalculateError(IMLDataSet data);
}
