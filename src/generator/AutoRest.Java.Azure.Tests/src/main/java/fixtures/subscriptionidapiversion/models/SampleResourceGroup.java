/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SampleResourceGroup model.
 */
public class SampleResourceGroup {
    /**
     * resource group name 'testgroup101'.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * resource group location 'West US'.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SampleResourceGroup object itself.
     */
    public SampleResourceGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the SampleResourceGroup object itself.
     */
    public SampleResourceGroup withLocation(String location) {
        this.location = location;
        return this;
    }

}
