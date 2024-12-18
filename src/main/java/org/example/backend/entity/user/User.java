package org.example.backend.entity.user;

import java.time.LocalDateTime;

public class User {
  private String userId;
  private String username;
  private String password;
  private String email;
  private String phone;
  private LocalDateTime registrationDate;
  private LocalDateTime lastLogin;
  private String status; // enum ('active', 'disabled')
  private String avatarUrl;
  private String openid;
  private String sessionKey;

  public String getUserId() {
    return userId;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  public LocalDateTime getRegistrationDate() {
    return registrationDate;
  }

  public LocalDateTime getLastLogin() {
    return lastLogin;
  }

  public String getStatus() {
    return status;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public String getOpenid() {
    return openid;
  }

  public String getSessionKey() {
    return sessionKey;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setRegistrationDate(LocalDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }

  public void setLastLogin(LocalDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  // getters and setters
  @Override
  public String toString() {
    return "User{"
        + "userId='"
        + userId
        + '\''
        + ", username='"
        + username
        + '\''
        + ", password='"
        + password
        + '\''
        + ", email='"
        + email
        + '\''
        + ", phone='"
        + phone
        + '\''
        + ", registrationDate="
        + registrationDate
        + ", lastLogin="
        + lastLogin
        + ", status='"
        + status
        + '\''
        + ", avatarUrl='"
        + avatarUrl
        + '\''
        + '}';
  }
}
