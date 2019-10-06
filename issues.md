1.
        Caused by: java.lang.IllegalArgumentException: More than one fragment with the name [spring_web] was found. This is not legal with relative ordering. 
        See section 8.2.2 2c of the Servlet specification for details. Consider using absolute ordering.
solution:
        add below tag in web.xml
        <absolute-ordering />
        
        
2. 
        org.springframework.http.converter.HttpMessageNotWritableException: No converter found for return value of type: class java.util.ArrayList

solution:
        <mvc:annotation-driven/>
    
    
    
        