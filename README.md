# InventoryReport
Report generator based on online applications. 

<h1> Pre-Task </h1>

ensure database is presistant, check the following if it has been completed.

 `select sys_context('USERENV', 'SID') from dual;`

 `select * from v$version;`

 if there is no classFound error related to the database
 need to check the server.xml and include the external jars there
 when websphere depolyment is complete we need to check the files
 odjb6 needs to be present. dmb jars may cause additional error

    <library id="ExternalLibs">
    	<fileset dir="path_to_ojdbc_version" includes="*.jar"/>
    </library>
    

    <webApplication id="Web" location="Web.war" name="Web" contextRoot="Web" >
    	<classloader commonLibraryRef="ExternalLibs" />
    </webApplication>


<h1> Build the project </h1>

select `build.xml` run as `Ant Build`
select `buildAll` as the target then Run
`Web.war` archive should be generated in the project level directory for deployment.

<h1> Deployment </h1>

D. Websphere
   - for liberty websphere simply drop the Web.war into the dropins installation
   - for classic websphere deploy it through web console by installing new application
   
D. Tomcat
   - copy the war archive to the tomcat's webApp folder
   
   
