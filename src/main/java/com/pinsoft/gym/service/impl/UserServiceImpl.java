package com.pinsoft.gym.service.impl;

import com.pinsoft.gym.dto.UserDto;
import com.pinsoft.gym.model.User;
import com.pinsoft.gym.repository.UserRepository;
import com.pinsoft.gym.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = modelMapper.map(userDto,User.class);

        return modelMapper.map(userRepository.save(user),UserDto.class);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        Optional<User>user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }

    @Override
    public User updateUser(int id, User user) {
        Optional<User> resultUser = userRepository.findById(id);
        if(resultUser.isPresent()){
            resultUser.get().setFirstName(user.getFirstName());
            resultUser.get().setLastName(user.getLastName());
            return userRepository.save(resultUser.get());
        }
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        Optional<User>user = userRepository.findById(id);
        if(user.isPresent()){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
