package net.zerotodev.api.optional;

import lombok.Data;

import java.util.Date;
import java.util.Optional;

public class OptionalTest {
    @Data class Order {
        private final Long id;
        private final Date date;
        private final Member member;
    }
    @Data class Member {
        private final Long id;
        private final String name;
        private final Address address;
    }

    @Data class Address {
        private final String street;
        private final String city;
        private final String zipcode;
    }
    /* 주문을 한 회원이 사는 도시는 ? */
    public String getCityOfMemberFromOrder(Order order){
        return Optional.ofNullable(order)
                .map(Order::getMember)
                .map(Member::getAddress)
                .map(Address::getCity)
                .orElse("No Address");
    }
    /* 주어진 시간(분) 내에 생성된 주문을 한 회원정보는 ? */
    public Optional<Member> getMemberIfOrderWithin(Order order, int min){
        return Optional.ofNullable(order)
                .filter( o -> o.getDate().getTime() > System.currentTimeMillis() - min * 1000 )
                .map(Order::getMember)
                ;
    }
}
