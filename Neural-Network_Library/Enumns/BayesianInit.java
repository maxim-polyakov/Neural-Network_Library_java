package Enumns;

public enum BayesianInit {
    /// <summary>
    /// No init, do not change anything.
    /// </summary>
    InitNoChange,

    /// <summary>
    /// Start with no connections.
    /// </summary>
    InitEmpty,

    /// <summary>
    /// Init as Naive Bayes.
    /// </summary>
    InitNaiveBayes
}
