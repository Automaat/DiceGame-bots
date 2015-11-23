package com.diceGame;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Decision {

    private List<Dice> toReroll;
}
