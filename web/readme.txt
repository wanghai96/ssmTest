No tag "" defined in tag library imported with prefix "c"
需要引入：jstl库 standard
出现错误
  HTTP Status 500 - Request processing failed; nested exception is org.apache.ibatis.builder.IncompleteElementException: Could not find result map com.bjypc.bean.Customer

  原因是mybatis的映射xml中resultMap应该为resultType


      jstl需要standard和jstl的jar包
      http://www.mvnrepository.com/