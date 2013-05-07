package com.parts;

import org.anddev.andengine.entity.sprite.AnimatedSprite;
import org.anddev.andengine.opengl.texture.region.TiledTextureRegion;

import com.perpixelperfectcollision.IPixelPerfectShape;
import com.perpixelperfectcollision.PixelPerfectBitMask;

public class gameAnimatedPart extends AnimatedSprite implements IPixelPerfectShape{

	public gameAnimatedPart(float pX, float pY,TiledTextureRegion pTiledTextureRegion) {
		super(pX, pY, pTiledTextureRegion);
		// TODO Auto-generated constructor stub
	}

	// Iteracion en classe
	@Override
    protected void onManagedUpdate(final float pSecondsElapsed) {
		if (!this.isAnimationRunning())
		{
		   	this.animate(150, true);
		}    
        super.onManagedUpdate(pSecondsElapsed);
    }
	
	public PixelPerfectBitMask getMask() {
		// TODO Auto-generated method stub
		return null;
	}


}
