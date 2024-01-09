package Enumns;

public enum EventType {
    /// <summary>
    /// The event is used as evidence to predict the outcome.
    /// </summary>
    Evidence,

    /// <summary>
    /// This event is neither evidence our outcome, but still
    /// is involved in the Bayesian Graph.
    /// </summary>
    Hidden,

    /// <summary>
    /// The event is outcome, which means that we would like to get
    /// a value for given evidence.
    /// </summary>
    Outcome
}
