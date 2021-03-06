package com.kodilla.customer.domain;

import com.kodilla.customer.dto.AccountDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAccountsResponse {

    private List<AccountDto> accounts;

}