
#Add an engine
To add a new engine it should be extended the DBCleaner class. In the new class it is required to fill the maps for process and construct  according couple (clean field, raw data field). In addiction it might be required to override existing methods for transformations of fields.

#Add a new engine version
To add a new engine version, the process is similar to add an engine or in case of minor changes it might be more easier to extend the previous engine version. Mainly it is required to override existing methods for transformations of fields and fill the maps for process and construct  according couple (clean field, raw data field).

#Add a new application
To add a new application, it is required to extend the Cleaner class. The new application might mantains its data in a database or plain text file, therefore a suitable method that extract data must be implemented together with transfromation method. To store the converted data can be used the store method of the Cleaner class. Moreover it should be used the Cleaner class method for generating IDs.