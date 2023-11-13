package Interfaces;

public interface IInnovationList {
    /// <value>A list of innovations.</value>
    //IList<IInnovation> Innovations = null;

    /// <summary>
    /// Add an innovation.
    /// </summary>
    ///
    /// <param name="innovation">The innovation added.</param>
    void Add(IInnovation innovation);

    /// <summary>
    /// Get the innovation specified by index.
    /// </summary>
    ///
    /// <param name="id">The index.</param>
    /// <returns>The innovation.</returns>
    IInnovation Get(int id);
}
