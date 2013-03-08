<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<!-- Title of the page -->
	<title><tiles:insertAttribute name="title" /></title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/templatemo_style.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/styles.css"/>

<script type="text/javascript">
function clearText(field)
{
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}
</script>
<script src="<%=request.getContextPath() %>/resources/js/mootools-1.2.1-core.js"></script>
<script src="<%=request.getContextPath() %>/resources/js/mootools-1.2-more.js"></script>
<script src="<%=request.getContextPath() %>/resources/js/slideitmoo-1.1.js"></script>

<script type="text/javascript">
	window.addEvents({
		'domready': function(){
			/* thumbnails example , div containers */
			new SlideItMoo({
						overallContainer: 'SlideItMoo_outer',
						elementScrolled: 'SlideItMoo_inner',
						thumbsContainer: 'SlideItMoo_items',		
						itemsVisible: 5,
						elemsSlide: 3,
						duration: 200,
						itemsSelector: '.SlideItMoo_element',
						itemWidth: 140,
						showControls:1});
		},
		
	});
</script>
</head>
<body>
<div id="templatemo_wrapper">

	<tiles:insertAttribute name="header" />

    
    <!-- side bar -->
	<tiles:insertAttribute name="leftsidebar" />
    <!-- end of sidebar -->
    

    
    <div id="templatmeo_content">
     
     <tiles:insertAttribute name="features" />
        
        <div class="content_section">
			<tiles:insertAttribute name="body" />
        </div>
    
    </div> <!-- end of templatmeo_content -->
 </div> <!-- end of templatemo_wrapper -->


<tiles:insertAttribute name="footer" />

</body>
</html>