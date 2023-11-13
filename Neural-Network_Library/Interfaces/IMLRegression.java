package Interfaces;

public interface IMLRegression {
    /// <summary>
    /// Reset the weights.
    /// </summary>
    ///
    void Reset();

    /// <summary>
    /// Reset the weights with a seed.
    /// </summary>
    ///
    /// <param name="seed">The seed value.</param>
    void Reset(int seed);
}
