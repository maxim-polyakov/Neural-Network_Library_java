package Classes;

public class ActivationBiPolar {
        /// <summary>
        /// The parameters.
        /// </summary>
        ///
        private final double[] _paras;

        /// <summary>
        /// Construct the bipolar activation function.
        /// </summary>
        ///
        public ActivationBiPolar()
        {
            _paras = new double[0];
        }

        /// <inheritdoc/>
        public double DerivativeFunction(double b, double a)
        {
            return 1;
        }

        /// <returns>Return true, bipolar has a 1 for derivative.</returns>
        public boolean HasDerivative()
        {
            return true;
        }

        /// <inheritdoc />
        public void ActivationFunction(double[] x, int start,
                                           int size)
        {
            for (int i = start; i < start + size; i++)
            {
                if (x[i] > 0)
                {
                    x[i] = 1;
                }
                else
                {
                    x[i] = -1;
                }
            }
        }

        /// <inheritdoc />
        //public String[] ParamNames {
          //  String[] result = { "slope" };
            //return result;
        //}


        /// <inheritdoc />
        //public double[] Params
        //{
          //  return this._paras;
        //}

        /// <summary>
        /// Clone the object.
        /// </summary>
        /// <returns>The cloned object.</returns>
        public Object Clone()
        {
            return new ActivationBiPolar();
        }
}

