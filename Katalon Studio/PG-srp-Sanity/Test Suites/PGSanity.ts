<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>PG Sanity Testcases</description>
   <name>PGSanity</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>bf080fc2-f99d-480a-9f7f-db82b8f51373</testSuiteGuid>
   <testCaseLink>
      <guid>93ccba82-cafd-464a-979d-8213386ac337</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/BasicURLNav</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>64f9602c-f2d4-4e6a-bba5-274b85e0e9fb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>''</defaultValue>
         <description></description>
         <id>0a6f747e-6595-4c60-94f1-ea602aed2e62</id>
         <masked>false</masked>
         <name>Location</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/CitySearch</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ac58c217-c929-4793-b91e-3bae6aff3253</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/PGSRP</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>ac58c217-c929-4793-b91e-3bae6aff3253</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Location</value>
         <variableId>0a6f747e-6595-4c60-94f1-ea602aed2e62</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
