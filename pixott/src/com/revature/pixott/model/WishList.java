package com.revature.pixott.model;

public class WishList {
	private int id;
	private int wishlist_id;
	private String name;
	
	public WishList() {
		
	}

	public WishList(int id, int wishlist_id, String name) {
		super();
		this.id = id;
		this.wishlist_id = wishlist_id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWishlist_id() {
		return wishlist_id;
	}

	public void setWishlist_id(int wishlist_id) {
		this.wishlist_id = wishlist_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + wishlist_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WishList other = (WishList) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wishlist_id != other.wishlist_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return   wishlist_id + "." + name ;
	}
	

}
