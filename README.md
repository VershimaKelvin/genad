# 🧪 HNG Stage 8 Task (GenzAD QA Team)

This repository includes **Playwright** tests using the **Page Object Model (POM)** methodology. POM helps to create a structured and scalable approach to testing by separating the UI logic from the test cases. Written by GenzAd QA team using Java.

---

## 🌟 **Features**
✅ End-to-End (E2E) testing with Playwright  
✅ Page Object Model (POM) structure for cleaner and more maintainable tests  
✅ Cross-browser and cross-platform testing  
✅ **Authentication (Signin and Signup) with Google**  
✅ **Ad Generation**  

---

## 🏛️ **Project Structure**
The project follows a modular Page Object Model (POM) structure:

```plaintext
genzad/
├── pages/                    # Page object files
│   ├── login_page.ts         # Login page object
│   ├── signup_page.ts        # Signup page object
│   ├── dashboard_page.ts     # Dashboard page object
│   └── ad_generation_page.ts # Ad generation page object
├── test/                    # Test files
│   ├── login.spec.ts         # Login test cases
│   ├── signup.spec.ts        # Signup test cases
│   ├── dashboard.spec.ts     # Dashboard test cases
│   └── ad_generation.spec.ts # Ad generation test cases
└── utils/
    └── TestBase.java         #  Base clase
