# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Storage
  module Models
    #
    # The parameters to provide for the account.
    #
    class StorageAccountCreateParameters

      include MsRestAzure

      # @return [String] Resource location
      attr_accessor :location

      # @return [Hash{String => String}] Resource tags
      attr_accessor :tags

      # @return [AccountType] Gets or sets the account type. Possible values
      # include: 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS',
      # 'Standard_RAGRS', 'Premium_LRS'
      attr_accessor :account_type


      #
      # Mapper for StorageAccountCreateParameters class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          required: false,
          serialized_name: 'StorageAccountCreateParameters',
          type: {
            name: 'Composite',
            class_name: 'StorageAccountCreateParameters',
            model_properties: {
              location: {
                required: true,
                serialized_name: 'location',
                type: {
                  name: 'String'
                }
              },
              tags: {
                required: false,
                serialized_name: 'tags',
                type: {
                  name: 'Dictionary',
                  value: {
                      required: false,
                      serialized_name: 'StringElementType',
                      type: {
                        name: 'String'
                      }
                  }
                }
              },
              account_type: {
                required: true,
                serialized_name: 'properties.accountType',
                type: {
                  name: 'Enum',
                  module: 'AccountType'
                }
              }
            }
          }
        }
      end
    end
  end
end
