# Corporate Expense Approval & Audit Trail API

A backend RESTful service built with Spring Boot to handle corporate expense submissions, hierarchical approval workflows, and immutable audit logs.

## Tech Stack
- **Java:** 21 (LTS)
- **Framework:** Spring Boot 3
- **Database:** PostgreSQL / Spring Data JPA
- **Security:** Spring Security & JWT (Planned)
- **Documentation:** OpenAPI / Swagger (Planned)

## Core Features (Roadmap)
- [ ] Multi-tier approval state machine (Draft -> Submitted -> Manager Approved -> Finance Approved -> Paid)
- [ ] Role-Based Access Control (Employee, Manager, Finance Admin)
- [ ] Concurrency-safe audit trail for expense modifications
- [ ] Receipt attachment handling