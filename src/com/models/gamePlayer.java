package com.models;

import org.anddev.andengine.opengl.texture.region.TiledTextureRegion;

import com.parts.gameAnimatedPart;

public class gamePlayer extends gameWarrior{
	
	public gamePlayer(int tid,int tX,int tY,String tname,TiledTextureRegion tTTexture)
	{
		this.id=tid;
		this.name=tname;
		this.body=new gameAnimatedPart(tX,tY,tTTexture);
		
		// Anadimos la imagen del cuerpo como parte del Warrior
		this.parts.add(body);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		
	}
	




}
