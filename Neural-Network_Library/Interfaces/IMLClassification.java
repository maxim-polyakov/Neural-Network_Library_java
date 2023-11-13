package Interfaces;

public interface IMLClassification {
    /// <summary>
    /// Classify the input into a group.
    /// </summary>
    ///
    /// <param name="input">The input data to classify.</param>
    /// <returns>The group that the data was classified into.</returns>
    int Classify(IMLData input);
}
