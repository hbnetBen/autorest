// Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace ApplicationGateway.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// Response for CheckIPAddressAvailability API service call
    /// </summary>
    public partial class IPAddressAvailabilityResult
    {
        /// <summary>
        /// Initializes a new instance of the IPAddressAvailabilityResult
        /// class.
        /// </summary>
        public IPAddressAvailabilityResult()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the IPAddressAvailabilityResult
        /// class.
        /// </summary>
        /// <param name="available">Private IP address availability.</param>
        /// <param name="availableIPAddresses">Contains other available private
        /// IP addresses if the asked for address is taken.</param>
        public IPAddressAvailabilityResult(bool? available = default(bool?), IList<string> availableIPAddresses = default(IList<string>))
        {
            Available = available;
            AvailableIPAddresses = availableIPAddresses;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets private IP address availability.
        /// </summary>
        [JsonProperty(PropertyName = "available")]
        public bool? Available { get; set; }

        /// <summary>
        /// Gets or sets contains other available private IP addresses if the
        /// asked for address is taken.
        /// </summary>
        [JsonProperty(PropertyName = "availableIPAddresses")]
        public IList<string> AvailableIPAddresses { get; set; }

    }
}
