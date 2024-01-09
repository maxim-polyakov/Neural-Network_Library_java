package AbstractClasses;

public abstract class AbstractPNN {

    /// <summary>
    /// First derivative.
    /// </summary>
    ///
    private double[] _deriv;

    /// <summary>
    /// Second derivative.
    /// </summary>
    ///
    private double[] _deriv2;

    /// <summary>
    /// Input neuron count.
    /// </summary>
    ///
    private int _inputCount;

    /// <summary>
    /// Kernel type.
    /// </summary>
    ///
    //private PNNKernelType _kernel;

    /// <summary>
    /// Output neuron count.
    /// </summary>
    ///
    private int _outputCount;

    /// <summary>
    /// Output mode.
    /// </summary>
    ///
    //private PNNOutputMode _outputMode;

    /// <summary>
    /// Confusion work area.
    /// </summary>
    ///
    private int[] _confusion;
}
