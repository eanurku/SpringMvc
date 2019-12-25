create Rest service

1. create java class with @Controller and a method with
   @ResponseBody,@RequestMapping annotations
   
2.add below jars in classpath for json response and so on:
   jackson-annotations-2.9.8.jar
   jackson-core-2.9.8.jar
   jackson-databind-2.9.8.jar
   
3. add these jars for xml response:
    
    jackson-dataformat-xml-2.8.1.jar 
   
   dependent jars:
     jackson-annotations-2.9.8.jar
     jackson-core-2.9.8.jar
     jackson-databind-2.9.8.jar
     
     jackson-module-jaxb-annotations-2.8.1.jar
     stax2-api-3.1.4.jar
     woodstox-core-5.0.2.jar
   
