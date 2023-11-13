package Interfaces;

public interface IGene {
    /// <summary>
    /// Get the ID of this gene, -1 for undefined.
    /// </summary>
    ///
    /// <value>The ID of this gene.</value>
    long Id = 0;


    /// <value>The innovation ID of this gene.</value>
    long InnovationId = 0;


    /// <summary>
    /// Determine if this gene is enabled.
    /// </summary>
    ///
    /// <value>True if this gene is enabled.</value>
    boolean Enabled = false;


    /// <summary>
    /// Copy another gene to this one.
    /// </summary>
    ///
    /// <param name="gene">The other gene to copy.</param>
    void Copy(IGene gene);
}
