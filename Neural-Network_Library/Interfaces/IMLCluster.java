package Interfaces;

public interface IMLCluster {
    /// <value>The data in this cluster.</value>
    //IList<IMLData> Data = null;

    /// <summary>
    /// Add data to this cluster.
    /// </summary>
    ///
    /// <param name="pair">The data to add.</param>
    void Add(IMLData pair);

    /// <summary>
    /// Create a machine learning dataset from the data.
    /// </summary>
    ///
    /// <returns>A dataset.</returns>
    IMLDataSet CreateDataSet();

    /// <summary>
    /// Get the specified data item by index.
    /// </summary>
    ///
    /// <param name="pos">The index of the data item to get.</param>
    /// <returns>The data item.</returns>
    IMLData Get(int pos);


    /// <summary>
    /// Remove the specified item.
    /// </summary>
    ///
    /// <param name="data">The item to remove.</param>
    void Remove(IMLData data);


    /// <returns>The number of items.</returns>
    int Count = 0;
}
