Project Description:
Developed a full-featured e-commerce shopping web application that allows users to browse, search, and purchase products with a seamless user experience. The application consists of customer and admin panels, integrated with payment gateway, email services, and strong security features.

Key Features Implemented:
✅ User Authentication & Authorization

Implemented Spring Security for login/logout functionality and secure access control.

Users and Admins have different roles and dashboards.

Added JWT-based authentication for session management.

✅ User Registration & Login with Email Verification

Users can register via the UI.

Verification email is sent with a token link for account activation using Spring Boot Mail API.

✅ Forgot Password & Change Password

Password reset functionality using secure email token links.

Logged-in users (Admin/User) can update their password from profile settings.

✅ Product Catalog & Cart Functionality

Users can browse product categories, view product details, and add/remove items to/from the cart.

Cart supports quantity updates and automatic price calculation.

✅ Payment Gateway Integration

Integrated Stripe (or any preferred payment gateway) for secure payments.

Order status updates in real-time after successful payment.

✅ Admin Panel

Admin can manage products (Add, Edit, Delete), categories, orders, and user accounts.

Admin dashboard displays order stats, revenue reports, and recent transactions.

✅ Database Integration (MySQL)

MySQL used for managing product data, user info, cart data, and order history.

Efficiently designed schema with proper relationships and indexing.

✅ RESTful APIs

Backend exposes well-structured APIs for all functionalities.

Frontend (React JS) consumes these APIs for dynamic interactions.

✅ Responsive UI with React JS

Created a modern, responsive user interface using React JS.

Smooth routing, loading spinners, and error handling included.
