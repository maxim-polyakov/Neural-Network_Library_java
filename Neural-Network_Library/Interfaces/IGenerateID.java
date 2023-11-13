package Interfaces;

public interface IGenerateID {
    /// <summary>
    /// Get the value for the current id.
    /// </summary>
    long CurrentID = 0;

    /// <summary>
    /// Generate an ID number.
    /// </summary>
    /// <returns>The ID number generated.</returns>
    long Generate();
}
