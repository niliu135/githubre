package com.moui.test;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/17.
 */
public class User implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}