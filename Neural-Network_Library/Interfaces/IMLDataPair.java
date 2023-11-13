package Interfaces;

public interface IMLDataPair {
    /// <summary>
    /// The input that the neural network.
    /// </summary>
    IMLData Input = null;

    /// <summary>
    /// The ideal data that the neural network should produce
    /// for the specified input.
    /// </summary>
    IMLData Ideal = null;

    /// <summary>
    /// True if this training pair is supervised.  That is, it has
    /// both input and ideal data.
    /// </summary>
    boolean Supervised = false;

    /// <summary>
    /// The supervised ideal data.
    /// </summary>
    double[] IdealArray = null;

    /// <summary>
    /// The input array.
    /// </summary>
    double[] InputArray = null;

    /// <summary>
    /// The significance of this training element.
    /// </summary>
    double Significance = 0.0;
}
