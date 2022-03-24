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

## 功能说明


