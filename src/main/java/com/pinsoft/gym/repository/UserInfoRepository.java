package com.pinsoft.gym.repository;

import com.pinsoft.gym.model.User;
import com.pinsoft.gym.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, User> {
}
