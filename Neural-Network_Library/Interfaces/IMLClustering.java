package Interfaces;

public interface IMLClustering {
    /// <value>The clusters.</value>
    IMLCluster[] Clusters = null;

    /// <summary>
    /// Perform the training iteration.
    /// </summary>
    ///
    void Iteration();

    /// <summary>
    /// Perform the specified number of training iterations.
    /// </summary>
    ///
    /// <param name="count">The number of training iterations.</param>
    void Iteration(int count);


    /// <returns>The number of clusters.</returns>
    int Count = 0;
}
