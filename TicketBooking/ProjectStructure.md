src/
└── main/
├── java/
│   └── com/
│       └── ticketbooking/
│           ├── TicketBookingApplication.java
│           │
│           ├── config/                 # 🔐 Security & DB Config
│           │   ├── SecurityConfig.java
│           │   └── JdbcConfig.java
│           │
│           ├── controller/             # 🌐 API Controllers
│           │   ├── AuthController.java
│           │   └── TicketController.java
│           │
│           ├── entity/                 # 💾 DB Models
│           │   ├── User.java
│           │   ├── Profile.java
│           │   └── Ticket.java
│           │
│           ├── repository/             # 📡 JDBC Queries
│           │   ├── UserRepository.java
│           │   ├── TicketRepository.java
│           │   └── ProfileRepository.java
│           │
│           ├── service/                # ⚙️ Business Logic
│           │   ├── AuthService.java
│           │   ├── TicketService.java
│           │   └── ProfileService.java
│           │
│           ├── aspect/                 # 🌀 AOP Logging
│           │   └── LoggingAspect.java
│           │
│           └── exception/              # 🚨 Global Exception Handling
│               ├── GlobalExceptionHandler.java
│               └── CustomException.java
│
└── resources/
├── application.properties          # 🔧 Configuration
└── schema.sql                      # 📄 Database Schema