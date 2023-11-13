package Interfaces;

public interface IMLProperties {
    /// <summary>
    /// Compute regression.
    /// </summary>
    ///
    /// <param name="input">The input data.</param>
    /// <returns>The output data.</returns>
    IMLData Compute(IMLData input);
}
