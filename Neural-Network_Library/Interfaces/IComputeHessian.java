package Interfaces;

public interface IComputeHessian {
    /// <summary>
    /// The gradeints.
    /// </summary>
    double[] Gradients = null;

    /// <summary>
    /// The sum of squares error over all of the training elements.
    /// </summary>
    double SSE = 0.0;

    /// <summary>
    /// The Hessian matrix.
    /// </summary>
    //Matrix HessianMatrix;

    /// <summary>
    /// Get the Hessian as a 2d array.
    /// </summary>
    double[][] Hessian = null;

    /// <summary>
    /// Init the class.
    /// </summary>
    /// <param name="theNetwork">The neural network to train.</param>
    /// <param name="theTraining">The training set to train with.</param>
    //void Init(BasicNetwork theNetwork, IMLDataSet theTraining);

    /// <summary>
    /// Compute the Hessian.
    /// </summary>
    void Compute();

    /// <summary>
    /// Clear the Hessian and gradients.
    /// </summary>
    void Clear();
}
