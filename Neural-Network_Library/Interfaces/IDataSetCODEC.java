package Interfaces;

public interface IDataSetCODEC {
    /// <summary>
    /// The size of the input data.
    /// </summary>
    int InputSize = 0;

    /// <summary>
    /// The size of the ideal data.
    /// </summary>
    int IdealSize = 0;

    /// <summary>
    /// Read one record of data from an external source.
    /// </summary>
    /// <param name="input">The input data array.</param>
    /// <param name="ideal">The ideal data array.</param>
    /// <param name="significance">The signficance. (by reff)</param>
    /// <returns>True, if there is more data to be read.</returns>
    boolean Read(double[] input, double[] ideal, double significance);

    /// <summary>
    /// Write one record of data to an external destination.
    /// </summary>
    /// <param name="input">The input data array.</param>
    /// <param name="ideal">The ideal data array.</param>
    /// <returns>True, if there is more data to be read.</returns>
    void Write(double[] input, double[] ideal, double significance);

    /// <summary>
    /// Prepare to write to an external data destination.
    /// </summary>
    /// <param name="recordCount">The total record count, that will be written.</param>
    /// <param name="inputSize">The input size.</param>
    /// <param name="idealSize">The ideal size.</param>
    void PrepareWrite(int recordCount, int inputSize, int idealSize);

    /// <summary>
    /// Prepare to read from an external data source.
    /// </summary>
    void PrepareRead();

    /// <summary>
    /// Close any open files.
    /// </summary>
    void Close();
}
