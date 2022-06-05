# 说明
练习使用sharding jdbc

# 问题
1. 使用默认的hakari数据源的时候，会报错：
   java.sql.SQLFeatureNotSupportedException: 这个 org.postgresql.jdbc.PgDatabaseMetaData.getRowIdLifetime() 方法尚未被实作。  
    临时解决：换druid数据源


