package Interfaces;

public interface IExtractListener {
    /// <summary>
    /// Notify that some data has been extracted.
    /// </summary>
    /// <param name="obj">The data that was extracted.</param>
    void FoundData(Object obj);
}
