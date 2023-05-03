//package com.zbkj.common.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.core.config.GlobalConfig;
//import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
//import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
//import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class MybatisPlusConfig {
//
//    @Bean(name = "globalConfig")
//    public GlobalConfig globalConfig() {
//        GlobalConfig globalConfig = new GlobalConfig();
//        MetaObjectHandler handler = new MetaObjectHandler() {
//            @Override
//            public void insertFill(MetaObject metaObject) {
//                // 获取所有字段名
//                String[] fieldNames = metaObject.getGetterNames();
//                for (String fieldName : fieldNames) {
//                    // 获取字段类型
//                    Class<?> fieldType = metaObject.getGetterType(fieldName);
//                    // 获取字段值
//                    Object fieldValue = metaObject.getValue(fieldName);
//                    if (fieldValue == null) {
//                        if (Number.class.isAssignableFrom(fieldType)) {
//                            // 数字类型字段为空时赋值为0
//                            metaObject.setValue(fieldName, 0);
//                        } else {
//                            // 非数字类型字段为空时赋值为null
//                            metaObject.setValue(fieldName, null);
//                        }
//                    }
//                }
//            }
//
//            @Override
//            public void updateFill(MetaObject metaObject) {
//                // 获取所有字段名
//                String[] fieldNames = metaObject.getGetterNames();
//                for (String fieldName : fieldNames) {
//                    // 获取字段类型
//                    Class<?> fieldType = metaObject.getGetterType(fieldName);
//                    // 获取字段值
//                    Object fieldValue = metaObject.getValue(fieldName);
//                    if (fieldValue == null) {
//                        if (Number.class.isAssignableFrom(fieldType)) {
//                            // 数字类型字段为空时赋值为0
//                            metaObject.setValue(fieldName, 0);
//                        } else {
//                            // 非数字类型字段为空时赋值为null
//                            metaObject.setValue(fieldName, null);
//                        }
//                    }
//                }
//            }
//        };
//        globalConfig.setMetaObjectHandler(handler);
//        return globalConfig;
//    }
//
//    /**
//     * DruidConfig 中已经配置了
//     * driverClassName：数据库驱动类名
//     * url：数据库URL
//     * username：数据库用户名
//     * password：数据库密码
//     * initialSize：初始化连接数
//     * minIdle：最小空闲连接数
//     * maxActive：最大活跃连接数
//     * maxWait：获取连接的最大等待时间，单位毫秒
//     * timeBetweenEvictionRunsMillis：间隔多久进行一次检测，检测需要关闭的空闲连接，单位毫秒
//     * minEvictableIdleTimeMillis：一个连接在池中最小生存的时间，单位毫秒
//     * validationQuery：验证连接是否有效的SQL语句
//     * testWhileIdle：是否在空闲时检查连接的有效性
//     * testOnBorrow：是否在获取连接时检查连接的有效性
//     * testOnReturn：是否在归还连接时检查连接的有效性
//     * poolPreparedStatements：是否缓存PreparedStatement，即PSCache
//     * maxPoolPreparedStatementPerConnectionSize：每个连接PSCache的大小
//     * @return 数据库连接池
//     */
//    //@Bean
//    //public DataSource dataSource(@Value("${spring.datasource.driver-class-name}") String driverClassName,
//    //                             @Value("${spring.datasource.url}") String url,
//    //                             @Value("${spring.datasource.username}") String userName,
//    //                             @Value("${spring.datasource.password}") String password) {
//    //    // 创建Druid数据源
//    //    DruidDataSource dataSource = new DruidDataSource();
//    //    // 配置数据源属性
//    //    dataSource.setDriverClassName(driverClassName); // 驱动类名
//    //    dataSource.setUrl(url); // 数据库URL
//    //    dataSource.setUsername(userName); // 数据库用户名
//    //    dataSource.setPassword(password); // 数据库密码
//    //    dataSource.setInitialSize(5); // 初始化连接数
//    //    dataSource.setMinIdle(5); // 最小空闲连接数
//    //    dataSource.setMaxActive(20); // 最大活跃连接数
//    //    dataSource.setMaxWait(60000); // 获取连接的最大等待时间，单位毫秒
//    //    dataSource.setTimeBetweenEvictionRunsMillis(60000); // 间隔多久进行一次检测，检测需要关闭的空闲连接，单位毫秒
//    //    dataSource.setMinEvictableIdleTimeMillis(300000); // 一个连接在池中最小生存的时间，单位毫秒
//    //    dataSource.setValidationQuery("SELECT 1"); // 验证连接是否有效的SQL语句
//    //    dataSource.setTestWhileIdle(true); // 是否在空闲时检查连接的有效性
//    //    dataSource.setTestOnBorrow(false); // 是否在获取连接时检查连接的有效性
//    //    dataSource.setTestOnReturn(false); // 是否在归还连接时检查连接的有效性
//    //    dataSource.setPoolPreparedStatements(true); // 是否缓存PreparedStatement，即PSCache
//    //    dataSource.setMaxPoolPreparedStatementPerConnectionSize(20); // 每个连接PSCache的大小
//    //    return dataSource;
//    //}
//    @Bean("dataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource druidDataSource() {
//        return new DruidDataSource();
//    }
//
//    @Bean
//    @Primary
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource,
//                                               @Qualifier("globalConfig") GlobalConfig globalConfig) throws Exception {
//        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(dataSource);
//
//        //添加分页功能================================================================================================
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//
//        sqlSessionFactory.setPlugins(interceptor);
//        sqlSessionFactory.setGlobalConfig(globalConfig);
//
//        return sqlSessionFactory.getObject();
//    }
//
//    @Bean
//    @Primary
//    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//    @Bean
//    @Primary
//    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
