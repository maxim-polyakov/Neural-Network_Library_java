package Interfaces;

public interface ICalculateScore {
    /// <returns>True if the goal is to minimize the score.</returns>
    boolean ShouldMinimize = false;

    /// <summary>
    /// Calculate this T's score.
    /// </summary>
    ///
    /// <param name="T">The T.</param>
    /// <returns>The score.</returns>
    double CalculateScore(IT T);
}
