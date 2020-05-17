package com.javaweb.model.entity.freight;
import com.javaweb.controller.InitializeAirplanes;

public class FreightLightWeight extends FreightAirplane {
    private boolean isUsingForJumping;
    private boolean isPostal;
    public FreightLightWeight(InitializeAirplanes init) {
        super(init);
        this.isPostal = init.isPostal();
        this.isUsingForJumping = init.isUsingForJumping();
    }
    public boolean isUsingForJumping() {
        return isUsingForJumping;
    }
    public void setUsingForJumping(boolean usingForJumping) {
        isUsingForJumping = usingForJumping;
    }
    public boolean isPostal() {
        return isPostal;
    }
    public void setPostal(boolean postal) {
        isPostal = postal;
    }
    @Override
    public String toString() {
        return super.toString() +
                String.format(bundle.getString(
                        "IS_USING_FOR_JUMPING"), isUsingForJumping) +
                String.format(bundle.getString(
                        "IS_POSTAL"), isPostal);
    }
}
