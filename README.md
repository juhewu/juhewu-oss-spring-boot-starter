## s3 通用存储操作

支持所有兼容s3协议的云存储: 阿里云OSS，腾讯云COS，七牛云，京东云，minio等。

## 快速开始

1. 引入依赖
```xml
        <dependency>
            <groupId>org.juhewu</groupId>
            <artifactId>juhewu-oss-spring-cloud-starter</artifactId>
            <version>1.0.0</version>
        </dependency>
```

2. 添加配置

```yaml
juhewu:
  # oss 存储
  oss:
    access-key: ${CIIC_S3_ACCESS:minioadmin}
    secret-key: ${CIIC_S3_SECRET:minioadmin}
    endpoint: ${CIIC_S3_ENDPOINT:ciic-base-minio}
    bucket-name: ${CIIC_S3_BUCKET:100}
```

2. 注入 oss 对象

```java
    private final OssTemplate template;
```
## 功能说明

1. 创建bucket

如果bucket 不存，则会创建，已存在不会创建。

```java
    template.createBucket(bucketName);
```

2. 上传对象

在指定的 bucket 上传对象，objectName 需要唯一，重名会覆盖，可以使用文件的 md5 + 文件扩展名来命名。

```java
   template.putObject(bucketName, objectName, inputStream);
```

3. 下载对象

在指定的 bucket 下载对象。

```java
   template.getObject(bucketName, objectName); // 获取文件 InputStream： .getObjectContent();
```