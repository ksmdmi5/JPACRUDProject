package com.skilldistillery.tkd.data;

import com.skilldistillery.tkd.entities.TKD;

public interface TKDDAO {
	public TKD create (TKD tkd);
	public TKD update (int id, TKD tkd);
	public boolean destroy(int id);
}
