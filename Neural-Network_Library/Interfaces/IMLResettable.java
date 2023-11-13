package Interfaces;

public interface IMLResettable {
    /// <summary>
    /// Cause a "break" in the data by creating a the beginning of a new sequence.
    /// </summary>
    void StartNewSequence();

    /// <summary>
    /// Get a count of the number of sequences.
    /// </summary>
    int SequenceCount  = 0;

    /// <summary>
    /// Get an individual sequence.
    /// </summary>
    /// <param name="i">The index to get.</param>
    /// <returns>The sequence.</returns>
    IMLDataSet GetSequence(int i);

    /// <summary>
    /// A list of all of the sequences.
    /// </summary>
    /// <returns>The index of the sequence.</returns>
    //ICollection<IMLDataSet> Sequences = null;

    /// <summary>
    /// Add a new sequence.
    /// </summary>
    /// <param name="sequence">The sequence to add.</param>
    void Add(IMLDataSet sequence);
}
