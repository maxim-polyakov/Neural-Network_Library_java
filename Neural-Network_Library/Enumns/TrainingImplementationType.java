package Enumns;

public enum TrainingImplementationType {
    /// <summary>
    /// Iterative - Each iteration attempts to improve the machine
    /// learning method.
    /// </summary>
    ///
    Iterative,

    /// <summary>
    /// Background - Training continues in the background until it is
    /// either finished or is stopped.
    /// </summary>
    ///
    Background,

    /// <summary>
    /// Single Pass - Only one iteration is necessary.
    /// </summary>
    ///
    OnePass
}
