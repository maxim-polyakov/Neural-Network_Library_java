package Interfaces;

public interface IBayesEstimator {
    /// <summary>
    /// Init the estimator.
    /// </summary>
    /// <param name="theTrainer">The trainer.</param>
    /// <param name="theNetwork">The network.</param>
    /// <param name="theData">The data.</param>
    //void Init(TrainBayesian theTrainer, BayesianNetwork theNetwork, IMLDataSet theData);

    /// <summary>
    /// Perform an iteration.
    /// </summary>
    /// <returns>True, if we should contune.</returns>
    boolean Iteration();
}
