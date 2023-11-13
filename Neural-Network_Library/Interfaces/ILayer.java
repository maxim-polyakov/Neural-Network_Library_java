package Interfaces;

public interface ILayer {
    /// <value>The activation function used for this layer.</value>
    IActivationFunction ActivationFunction = null;


    /// <summary>
    /// Set the network that this layer belongs to.
    /// </summary>
    //BasicNetwork Network = null;


    /// <value>The neuron count.</value>
    int NeuronCount = 0;


    /// <summary>
    /// Most layer types will default this value to one. However, it is possible
    /// to use other values. This is the activation that will be passed over the
    /// bias weights to the inputs of this layer. See the Layer interface
    /// documentation for more information on how Synt handles bias values.
    /// </summary>
    double BiasActivation = 0.0;


    /// <summary>
    /// Set the activation function.
    /// </summary>
    ///
    /// <value>The activation function.</value>
    IActivationFunction Activation = null;

    /// <returns>True if this layer has a bias.</returns>
    boolean HasBias();
}
