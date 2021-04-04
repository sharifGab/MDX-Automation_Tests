@sgab-allah @smoke
@aatt @zap @burp

Feature: Login/Logout Smoke Test

  Scenario: Able to log in and out of HQR application successfully with Google Authentication
    Given User logs into HQR where role = HQRUserGA, mfa = google auth
    And  User Logs out of HQR application
      Then testable outcome