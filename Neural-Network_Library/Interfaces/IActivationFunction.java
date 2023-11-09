package Interfaces;

public interface IActivationFunction {
        /// <returns>The params for this activation function.</returns>
        double[] Params = null;

        /// <returns>The names of the parameters.</returns>
        String[] ParamNames = null;


        void ActivationFunction(double[] d, int start, int size);


        double DerivativeFunction(double b, double a);


        /// <returns>Return true if this function has a derivative.</returns>
        boolean HasDerivative();
}
