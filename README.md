<!-- #######  CRAFTY SOUTHERN HEIFER APPLICATION README! #########-->
<h1 style="color: #5e9ca0;">Crafty Southern Heifers Employee and Product Managment <span style="color: #2b2301;">System.io</span></h1>
<h2 style="color: #2e6c80;">Final Design Report:</h2>
<p>This application was written as an assignment from Grand Canyon University as a Student. This application handles daliy managment properties for two roles. Admin and User. Both have to be authenticated before resuming exploration of the applcation. Login details are listed below. MySQL databse is also listed in the directory. &nbsp;</p>
<p>Click the <span style="background-color: #2b2301; color: #fff; display: inline-block; padding: 3px 10px; font-weight: bold; border-radius: 5px;">Test</span> branch button to view source code.</p>
<h2 style="color: #2e6c80;">Key Technical Design Decisions :</h2>
<ol style="list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;">
<li style="clear: both;"><img style="float: left;" src="https://avatars1.githubusercontent.com/u/1492367?s=280&amp;v=4" alt="interactive connection" width="35" />Thymeleaf</li>
<li style="clear: both;"><img style="float: left;" src="https://getbootstrap.com/docs/5.2/assets/brand/bootstrap-logo-shadow.png" alt="html cleaner" width="45" /> Boostrap</li>
<li style="clear: both;"><img style="float: left;" src="https://www.logolynx.com/images/logolynx/98/980c5fe716efb66c936eebe1937d5489.png" alt="Word to html" width="45" /> Spring Boot</li>
<li style="clear: both;"><img style="float: left;" src="https://th.bing.com/th/id/OIP.D87KXcDLtggvLLrmHnairwHaJG?pid=ImgDet&amp;rs=1" alt="replace text" width="35" /> Spring Security</li>
<li style="clear: both;"><img style="float: left;" src="https://th.bing.com/th/id/OIP.Wd9moNdvBsgsNDMl6V1BegHaCn?pid=ImgDet&amp;rs=1" alt="gibberish" width="45" />Rest API</li>
<li style="clear: both;"><img style="float: left;" src="https://courses.javacodegeeks.com/wp-content/uploads/2021/03/hibernate-logo-1024x1024.jpg" alt="html table div" width="45" /> Hibernate</li>
</ol>
<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>
<h2 style="color: #2e6c80;">Risks:</h2>
<p>Thymeleaf version 3.0 is deprecated and moving to new version. SecurityFilterChain bean is new and still in beta stages</p>
<h2 style="color: #2e6c80;">Initial Planning:</h2>
<p>Create a new class Validation which will implement our Security Service Also going to have to create a new table in our SQL Database. This will store the username and password associated with a user. In Spring Security 5.7.0-M2, WebSecurityConfigurerAdapter class is deprecated, and the Spring team encourages users to move towards a component-based security configuration. We will use this innovative approach that is component-based security configuration. We will build two main functionalities:</p>
<ol style="list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;">
<li style="clear: both;">1. Register user (stored data into MySQL database</li>
</ol>
<ol style="list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;">
<li style="clear: both;">2. Login Authentication - validate user login credentials with database email and password.</li>
</ol>
<ol style="list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;">
<li style="clear: both;">3. We will secure the Registered Users Page with role-based Spring Security.</li>
</ol>
<p>Create Role JPA entities and establish a many-to-many mapping between them one user can have multiple roles and one role can be assigned to multiple users. The @ManyToMany JPA annotation is used to link the source entity with the target entity. A many-to-many association always uses an intermediate join table to store the association that joins two entities. The join table is defined using the @JoinTable JPA annotation. Create the form for add a product. Create the Thymeleaf action/object. Touch up a few grids on html. Will be implementing:</p>
<ol style="list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;">
<li style="clear: both;">1. Add the update and delete product options on the products page.
</li>
</ol>
<ol style="list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;">
<li style="clear: both;">2. Create a Test Plan and Test Cases. Execute all Test Cases.</li>
</ol>
<ol style="list-style: none; font-size: 14px; line-height: 32px; font-weight: bold;">
<li style="clear: both;">3. Add new pages using Spring MVC to support the new functionality.</li>
</ol>
<p>New Page: Update Product There is no reason to create another business service since I created an interface which contracted the ProductBussinesClass. Just letting you all know I designed this application using Data Access Object (DAO) and not a Repository design pattern. The backend of this week's milestone is complete with the SQL queries. Im only going to create a button for the deletion key. The update a product will be a separate html page.</p>

<p>
  https://github.com/AtlasWriter/CST-339-Milestone-Project/blob/test/CSH%20Site%20Flow%20Chart.PNG
  </p>
<table class="editorDemoTable">
<thead>
<tr>
<td>Name of the feature</td>
<td>Example</td>
<td>Default</td>
</tr>
</thead>
<tbody>
<tr>
<td>Remove tag attributes</td>
<td><img style="margin: 1px 15px;" src="images/smiley.png" alt="laughing" width="40" height="16" /> (except <strong>img</strong>-<em>src</em> and <strong>a</strong>-<em>href</em>)</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>Remove inline styles</td>
<td><span style="color: green; font-size: 13px;">You <strong style="color: blue; text-decoration: underline;">should never</strong>&nbsp;use inline styles!</span></td>
<td><strong style="font-size: 17px; color: #2b2301;">x</strong></td>
</tr>
<tr>
<td>Remove classes and IDs</td>
<td><span id="demoId">Use classes to <strong class="demoClass">style everything</strong>.</span></td>
<td><strong style="font-size: 17px; color: #2b2301;">x</strong></td>
</tr>
<tr>
<td>Remove all tags</td>
<td>This leaves <strong style="color: blue;">only the plain</strong> <em>text</em>. <img style="margin: 1px;" src="images/smiley.png" alt="laughing" width="16" height="16" /></td>
<td>&nbsp;</td>
</tr>
<tr>
<td>Remove successive &amp;nbsp;s</td>
<td>Never use non-breaking spaces&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;to set margins.</td>
<td><strong style="font-size: 17px; color: #2b2301;">x</strong></td>
</tr>
<tr>
<td>Remove empty tags</td>
<td>Empty tags should go!</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>Remove tags with one &amp;nbsp;</td>
<td>This makes&nbsp;no sense!</td>
<td><strong style="font-size: 17px; color: #2b2301;">x</strong></td>
</tr>
<tr>
<td>Remove span tags</td>
<td>Span tags with <span style="color: green; font-size: 13px;">all styles</span></td>
<td><strong style="font-size: 17px; color: #2b2301;">x</strong></td>
</tr>
<tr>
<td>Remove images</td>
<td>I am an image: <img src="images/smiley.png" alt="laughing" /></td>
<td>&nbsp;</td>
</tr>
<tr>
<td>Remove links</td>
<td><a href="https://html-online.com" rel="nofollow">This is</a> a link.</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>Remove tables</td>
<td>Takes everything out of the table.</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>Replace table tags with structured divs</td>
<td>This text is inside a table.</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>Remove comments</td>
<td>This is only visible in the source editor <!-- HELLO! --></td>
<td><strong style="font-size: 17px; color: #2b2301;">x</strong></td>
</tr>
<tr>
<td>Encode special characters</td>
<td><span style="color: red; font-size: 17px;">&hearts;</span> <strong style="font-size: 20px;">☺ ★</strong> &gt;&lt;</td>
<td><strong style="font-size: 17px; color: #2b2301;">x</strong></td>
</tr>
<tr>
<td>Set new lines and text indents</td>
<td>Organize the tags in a nice tree view.</td>
<td>&nbsp;</td>
</tr>
</tbody>
</table>
<p><strong>&nbsp;</strong></p>
<p><strong>Save this link into your bookmarks and share it with your friends. It is all FREE! </strong><br /><strong>Enjoy!</strong></p>
<p><strong>&nbsp;</strong></p>
