package Interfaces;

public interface IMLData {
    /// <summary>
    /// Get or set the specified index.
    /// </summary>
    /// <param name="x">The index to access.</param>
    /// <returns></returns>
    //double this[int x];

    /// <summary>
    /// Allowes indexed access to the data.
    /// </summary>
    double[] Data = null;

    /// <summary>
    /// How many elements in this data structure.
    /// </summary>
    int Count = 0;

    /// <summary>
    /// Clear the data to zero values.
    /// </summary>
    void Clear();
}
