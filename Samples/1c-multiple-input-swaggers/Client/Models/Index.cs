// Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Searchservice.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// Represents an index definition in Azure Search, which describes the
    /// fields and search behavior of an index.
    /// </summary>
    public partial class Index
    {
        /// <summary>
        /// Initializes a new instance of the Index class.
        /// </summary>
        public Index()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Index class.
        /// </summary>
        /// <param name="name">Gets or sets the name of the index.</param>
        /// <param name="fields">Gets or sets the fields of the index.</param>
        /// <param name="scoringProfiles">Gets or sets the scoring profiles for
        /// the index.</param>
        /// <param name="defaultScoringProfile">Gets or sets the name of the
        /// scoring profile to use if none is specified in the query. If this
        /// property is not set and no scoring profile is specified in the
        /// query, then default scoring (tf-idf) will be used.</param>
        /// <param name="corsOptions">Gets or sets options to control
        /// Cross-Origin Resource Sharing (CORS) for the index.</param>
        /// <param name="suggesters">Gets or sets the suggesters for the
        /// index.</param>
        public Index(string name, IList<Field> fields, IList<ScoringProfile> scoringProfiles = default(IList<ScoringProfile>), string defaultScoringProfile = default(string), CorsOptions corsOptions = default(CorsOptions), IList<Suggester> suggesters = default(IList<Suggester>))
        {
            Name = name;
            Fields = fields;
            ScoringProfiles = scoringProfiles;
            DefaultScoringProfile = defaultScoringProfile;
            CorsOptions = corsOptions;
            Suggesters = suggesters;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the name of the index.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the fields of the index.
        /// </summary>
        [JsonProperty(PropertyName = "fields")]
        public IList<Field> Fields { get; set; }

        /// <summary>
        /// Gets or sets the scoring profiles for the index.
        /// </summary>
        [JsonProperty(PropertyName = "scoringProfiles")]
        public IList<ScoringProfile> ScoringProfiles { get; set; }

        /// <summary>
        /// Gets or sets the name of the scoring profile to use if none is
        /// specified in the query. If this property is not set and no scoring
        /// profile is specified in the query, then default scoring (tf-idf)
        /// will be used.
        /// </summary>
        [JsonProperty(PropertyName = "defaultScoringProfile")]
        public string DefaultScoringProfile { get; set; }

        /// <summary>
        /// Gets or sets options to control Cross-Origin Resource Sharing
        /// (CORS) for the index.
        /// </summary>
        [JsonProperty(PropertyName = "corsOptions")]
        public CorsOptions CorsOptions { get; set; }

        /// <summary>
        /// Gets or sets the suggesters for the index.
        /// </summary>
        [JsonProperty(PropertyName = "suggesters")]
        public IList<Suggester> Suggesters { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Name == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Name");
            }
            if (Fields == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Fields");
            }
            if (Fields != null)
            {
                foreach (var element in Fields)
                {
                    if (element != null)
                    {
                        element.Validate();
                    }
                }
            }
            if (ScoringProfiles != null)
            {
                foreach (var element1 in ScoringProfiles)
                {
                    if (element1 != null)
                    {
                        element1.Validate();
                    }
                }
            }
            if (CorsOptions != null)
            {
                CorsOptions.Validate();
            }
            if (Suggesters != null)
            {
                foreach (var element2 in Suggesters)
                {
                    if (element2 != null)
                    {
                        element2.Validate();
                    }
                }
            }
        }
    }
}
