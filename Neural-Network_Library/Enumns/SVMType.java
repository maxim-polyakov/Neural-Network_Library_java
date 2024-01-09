package Enumns;

public enum SVMType {
    /// <summary>
    /// Support vector for classification.
    /// </summary>
    ///
    SupportVectorClassification,

    /// <summary>
    /// New support vector for classification. For more information see the
    /// citations in the class header.
    /// </summary>
    ///
    NewSupportVectorClassification,

    /// <summary>
    /// One class distribution estimation.
    /// </summary>
    ///
    SupportVectorOneClass,

    /// <summary>
    /// Support vector for regression. Use Epsilon.
    /// </summary>
    ///
    EpsilonSupportVectorRegression,

    /// <summary>
    /// A "new" support vector machine for regression. For more information see
    /// the citations in the class header.
    /// </summary>
    ///
    NewSupportVectorRegression
}
