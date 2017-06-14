// Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Searchservice.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Additional parameters for a set of operations.
    /// </summary>
    public partial class SearchRequestOptions
    {
        /// <summary>
        /// Initializes a new instance of the SearchRequestOptions class.
        /// </summary>
        public SearchRequestOptions()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the SearchRequestOptions class.
        /// </summary>
        /// <param name="clientRequestId">Tracking ID sent with the request to
        /// help with debugging.</param>
        public SearchRequestOptions(System.Guid? clientRequestId = default(System.Guid?))
        {
            ClientRequestId = clientRequestId;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets tracking ID sent with the request to help with
        /// debugging.
        /// </summary>
        [JsonProperty(PropertyName = "")]
        public System.Guid? ClientRequestId { get; set; }

    }
}
