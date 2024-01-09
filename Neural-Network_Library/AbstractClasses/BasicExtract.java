package AbstractClasses;
import Interfaces.IExtract;
import Interfaces.IExtractListener;
import java.util.Collection;
import java.util.ArrayList;

public abstract class BasicExtract implements IExtract {
    /// <summary>
    /// The classes registered as listeners for the extraction.
    /// </summary>
    private final Collection<IExtractListener> _listeners =
            new ArrayList<IExtractListener>();

    //#region IExtract Members

    /// <summary>
    /// Add a listener for the extraction.
    /// </summary>
    /// <param name="listener">The listener to add.</param>
}
