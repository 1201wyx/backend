# backend


后端
# 项目结构

backend
├── .idea
├── src
│   └── main
│       ├── java
│       │   └── org.example.backend
│       │       ├── config
│       │       │   ├── CorsConfig
│       │       │   └── SecurityConfig
│       │       ├── controller
│       │       │   ├── admin
│       │       │   │   ├── AdminController
│       │       │   └── user
│       │       │       └── ChildController
│       │       ├── entity
│       │       │   ├── admin
│       │       │   │   ├── Admin
│       │       │   │   └── AdminLog
│       │       │   ├── doctor
│       │       │   │   ├── Doctor
│       │       │   │   ├── DoctorChildRelation
│       │       │   │   └── DoctorData
│       │       │   ├── others
│       │       │   │   ├── HealthArticle
│       │       │   │   ├── LoginToken
│       │       │   │   ├── Statistics
│       │       │   │   └── Unit
│       │       │   └── user
│       │       │       ├── Child
│       │       │       ├── Consultation
│       │       │       ├── Message
│       │       │       ├── ParentChildRelation
│       │       │       ├── Report
│       │       │       ├── User
│       │       │       └── WeChatUser
│       │       ├── mapper
│       │       │   ├── admin
│       │       │   │   ├── AdminLogMapper
│       │       │   │   └── AdminMapper
│       │       │   ├── doctor
│       │       │   │   ├── DoctorChildRelationMapper
│       │       │   │   ├── DoctorDataMapper
│       │       │   │   └── DoctorMapper
│       │       │   ├── others
│       │       │   │   ├── HealthArticleMapper
│       │       │   │   ├── LoginTokenMapper
│       │       │   │   ├── StatisticsMapper
│       │       │   │   └── UnitMapper
│       │       │   └── user
│       │       │       ├── ChildMapper
│       │       │       ├── ConsultationMapper
│       │       │       ├── MessageMapper
│       │       │       ├── ParentChildRelationMapper
│       │       │       ├── ReportMapper
│       │       │       ├── UserMapper
│       │       │       └── WeChatUserMapper
│       │       ├── service
│       │       │   ├── admin
│       │       │   │   ├── AdminLogService
│       │       │   │   └── AdminService
│       │       │   ├── doctor
│       │       │   │   ├── DoctorChildRelationService
│       │       │   │   ├── DoctorDataService
│       │       │   │   └── DoctorService
│       │       │   ├── others
│       │       │   │   ├── HealthArticleService
│       │       │   │   ├── LoginTokenService
│       │       │   │   ├── StatisticsService
│       │       │   │   └── UnitService
│       │       │   └── user
│       │       │       ├── ChildService
│       │       │       ├── ConsultationService
│       │       │       ├── MessageService
│       │       │       ├── ParentChildRelationService
│       │       │       ├── ReportService
│       │       │       ├── UserService
│       │       │       └── WeChatUserService
│       │       ├── util
│       │       │   └── JsonParser
│       │       └── BackendApplication
│       ├── resources
│       │   ├── mybatis
│       │   │   └── mybatis-config.xml
│       │   ├── sql
│       │   │   └── table.sql
│       │   ├── static
│       │   │   └── index.html
│       │   └── application.properties
│       └── test
│           └── java
│               └── org.example.backend
