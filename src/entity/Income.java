/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Income {
    private Long id;
    private int generalMoney;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGeneralMoney() {
        return generalMoney;
    }

    public void setGeneralMoney(int generalMoney) {
        this.generalMoney = generalMoney;
    }
}
