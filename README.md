# Maintenance System

The Maintenance System is a desktop-based application designed to manage maintenance operations, including client records, technician assignments, service types, and status tracking through a structured and efficient system.

## Overview

This project was developed as part of academic coursework to demonstrate practical implementation of software development using a desktop-based architecture. It focuses on organizing maintenance workflows, improving data management, and providing a user-friendly interface for tracking operations.

## Features

- Client record management  
- Technician assignment and tracking  
- Maintenance type categorization  
- Status monitoring of maintenance tasks  
- CRUD operations for efficient data handling  
- User-friendly desktop interface  

## Technology Stack

### Frontend (UI)
- JavaFX  

### Backend
- Java  
- Spring Boot  

### Database
- MySQL  

## System Architecture

The Maintenance System follows a layered architecture with separation between user interface, business logic, and data management.

### Architecture Components

#### Presentation Layer (UI)
- Built using JavaFX  
- Handles user interactions and displays system data  
- Provides forms for managing records and operations  

#### Application Layer (Backend)
- Developed using Spring Boot  
- Manages business logic and system processes  
- Handles requests between UI and database  

#### Data Layer (Database)
- MySQL database for persistent storage  
- Stores client information, technician data, and maintenance records  

## Data Flow

1. User interacts with the JavaFX interface  
2. UI sends requests to the backend services  
3. Backend processes logic and validates data  
4. Data is retrieved from or stored in the MySQL database  
5. Backend returns results to the UI  
6. UI updates and displays the latest information  

## Design Approach

The system is designed with maintainability and clarity in mind by:

- Separating UI, backend, and database layers  
- Implementing structured CRUD operations  
- Using Spring Boot for organized backend services  
- Ensuring a simple and intuitive desktop user experience  
