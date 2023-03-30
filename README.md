<!-- #######  CRAFTY SOUTHERN HEIFER APPLICATION README! #########-->
<h1>Crafty Southern Heifers Employee and Product Managment <span style="color:#2b2301">System.io</span></h1>

<h2>Final Design Report:</h2>

<p>This application was written as an assignment from Grand Canyon University as a Student. This application handles daliy managment properties for two roles. Admin and User. Both have to be authenticated before resuming exploration of the applcation. Login details are listed below. MySQL databse is also listed in the directory. &nbsp;</p>

<p>Click the <strong>Test</strong> branch button to view source code.</p>

<h2>Key Technical Design Decisions :</h2>

<p>&nbsp;<img alt="interactive connection" src="https://avatars1.githubusercontent.com/u/1492367?s=280&amp;v=4" style="float:left; width:35px" />&nbsp;Thymeleaf</p>

<p>&nbsp;</p>

<p><img alt="html cleaner" src="https://getbootstrap.com/docs/5.2/assets/brand/bootstrap-logo-shadow.png" style="float:left; width:45px" />Boostrap</p>

<p>&nbsp;</p>

<p><img alt="Word to html" src="https://www.logolynx.com/images/logolynx/98/980c5fe716efb66c936eebe1937d5489.png" style="float:left; width:45px" /> Spring Boot</p>

<p>&nbsp;</p>

<p><img alt="replace text" src="https://th.bing.com/th/id/OIP.D87KXcDLtggvLLrmHnairwHaJG?pid=ImgDet&amp;rs=1" style="float:left; width:35px" />&nbsp; &nbsp;Spring Security</p>

<p>&nbsp;</p>

<p><img alt="gibberish" src="https://th.bing.com/th/id/OIP.Wd9moNdvBsgsNDMl6V1BegHaCn?pid=ImgDet&amp;rs=1" style="float:left; width:45px" />&nbsp;Rest API</p>

<p><img alt="html table div" src="https://courses.javacodegeeks.com/wp-content/uploads/2021/03/hibernate-logo-1024x1024.jpg" style="float:left; width:45px" />&nbsp;Hibernate</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>

<h2>Risks:</h2>

<p>Thymeleaf version 3.0 is deprecated and moving to new version. SecurityFilterChain bean is new and still in beta stages</p>

<h2>Initial Planning:</h2>

<p>Create a new class Validation which will implement our Security Service Also going to have to create a new table in our SQL Database. This will store the username and password associated with a user. In Spring Security 5.7.0-M2, WebSecurityConfigurerAdapter class is deprecated, and the Spring team encourages users to move towards a component-based security configuration. We will use this innovative approach that is component-based security configuration. We will build two main functionalities:</p>

<ol>
	<li>1. Register user (stored data into MySQL database</li>
</ol>

<ol>
	<li>2. Login Authentication - validate user login credentials with database email and password.</li>
</ol>

<ol>
	<li>3. We will secure the Registered Users Page with role-based Spring Security.</li>
</ol>

<p>Create Role JPA entities and establish a many-to-many mapping between them one user can have multiple roles and one role can be assigned to multiple users. The @ManyToMany JPA annotation is used to link the source entity with the target entity. A many-to-many association always uses an intermediate join table to store the association that joins two entities. The join table is defined using the @JoinTable JPA annotation. Create the form for add a product. Create the Thymeleaf action/object. Touch up a few grids on html. Will be implementing:</p>

<ol>
	<li>1. Add the update and delete product options on the products page.</li>
</ol>

<ol>
	<li>2. Create a Test Plan and Test Cases. Execute all Test Cases.</li>
</ol>

<ol>
	<li>3. Add new pages using Spring MVC to support the new functionality.</li>
</ol>

<p>New Page: Update Product There is no reason to create another business service since I created an interface which contracted the ProductBussinesClass. Just letting you all know I designed this application using Data Access Object (DAO) and not a Repository design pattern. The backend of this week&#39;s milestone is complete with the SQL queries. Im only going to create a button for the deletion key. The update a product will be a separate html page.</p>

<h2>UML/Flowcharts:</h2>

<p>Here we have the anticipation of the applications work flow:</p>

<p><img alt="Appflow" src="https://github.com/AtlasWriter/CST-339-Milestone-Project/blob/test/CSH%20Site%20Flow%20Chart.PNG" /></p>

<p>Here is the Security flow for the application. This application requires authentication then authorization for roles.</p>

<p><img alt="securityflow" src="https://github.com/AtlasWriter/CST-339-Milestone-Project/blob/test/CSH%20Security%20Flowchart.PNG" /></p>

<p>Here is the Databse flow with MySQL.</p>

<p><img alt="databaseflow" src="https://github.com/AtlasWriter/CST-339-Milestone-Project/blob/test/database%20diagram.PNG" /></p>

<p>Here is the REST API flow with GET/UPDATE/DELETE/ADD. This API was used with POSTMAN and is recomended. We can also use this API to create a new user and call products in JSON.</p>

<p><img alt="databaseflow" src="https://github.com/AtlasWriter/CST-339-Milestone-Project/blob/test/REST%20API%20flow.PNG" /></p>

<h2>SiteMaps:</h2>

<p>Here is a view of the Login Screen, The User and Admin view together, and ADMIN view only with the edit/add/update/delete option.</p>

<p><img alt="databaseflow" src="https://github.com/AtlasWriter/CST-339-Milestone-Project/blob/test/loginpage.PNG" /></p>

<h2>SiteMaps:</h2>

<p>Here is a view of the USER/ADMIN option.</p>

<p><img alt="databaseflow" src="https://github.com/AtlasWriter/CST-339-Milestone-Project/blob/test/userrole.PNG" /></p>

<h2>SiteMaps:</h2>

<p>Here is a view of the ADMIN Only Screen.</p>

<p><img alt="databaseflow" src="https://github.com/AtlasWriter/CST-339-Milestone-Project/blob/test/adminonly.PNG" /></p>

<p>&nbsp;
<p><strong>&nbsp;</strong></p>
</p>
