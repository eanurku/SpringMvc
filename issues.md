1.
        Caused by: java.lang.IllegalArgumentException: More than one fragment with the name [spring_web] was found.
solution:
        add below tag in web.xml <absolute-ordering />
        
        
2. 
        org.springframework.http.converter.HttpMessageNotWritableException: No converter found for return value of type: class java.util.ArrayList

sol:
        