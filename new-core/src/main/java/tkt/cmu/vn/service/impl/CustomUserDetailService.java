package tkt.cmu.vn.service.impl;

import tkt.cmu.vn.converter.UserConverter;
import tkt.cmu.vn.dto.MyUserDetail;
import tkt.cmu.vn.dto.UserDTO;
import tkt.cmu.vn.entity.UserEntity;
import tkt.cmu.vn.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUserName(username);
        UserDTO userDTO = userConverter.convertToDto(userEntity);

        if (userDTO == null) {
            throw new UsernameNotFoundException("Username not found");
        }

        //neu tai khoản tồn tại, lấy tất cả role của user
        //sau đó thêm vào cho security thông qua đối tượng GrantedAuthority
        List<GrantedAuthority> authorities = new ArrayList<>();
        userDTO.getRoles().forEach(item -> {
            authorities.add(new SimpleGrantedAuthority(item.getCode()));
        });

        //lấy các thông tin cần thiết đưa vào MyUserDetail
        //security duy trì thông tin user khi truy cập vào hệ thống
        MyUserDetail myUserDetail = new MyUserDetail(username, userDTO.getPassword(), true, true, true, true, authorities);
        BeanUtils.copyProperties(userDTO, myUserDetail);
        return myUserDetail;
    }
}
