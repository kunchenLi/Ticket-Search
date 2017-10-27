package entity;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Item {
	private String itemId;
	private String name;
	private double rating;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zipcode;
	private double latitude;
	private double longitude;
	private String description;
	private Set<String> categories;
	private String imageUrl;
	private String url;
	private String snippet;
	private String snippetUrl;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
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
		Item other = (Item) obj;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		return true;
	}

	private Item(ItemBuilder builder) {
		this.itemId = builder.itemId;
		this.name = builder.name;
		this.rating = builder.rating;
		this.address = builder.address;
		this.city = builder.city;
		this.country = builder.country;
		this.state = builder.state;
		this.zipcode = builder.zipcode;
		this.latitude = builder.latitude;
		this.longitude = builder.longitude;
		this.description = builder.description;
		this.categories = builder.categories;
		this.imageUrl = builder.imageUrl;
		this.url = builder.url;
		this.snippet = builder.snippet;
		this.snippetUrl = builder.snippetUrl;
	}

	public String getItemId() {
		return itemId;
	}
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public String getDescription() {
		return description;
	}
	public Set<String> getCategories() {
		return categories;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getUrl() {
		return url;
	}
	public String getSnippet() {
		return snippet;
	}
	public String getSnippetUrl() {
		return snippetUrl;
	}

	public JSONObject toJSONObject() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("item_id", itemId);
			obj.put("name", name);
			obj.put("rating", rating);
			obj.put("address", address);
			obj.put("city", city);
			obj.put("country", country);
			obj.put("state", state);
			obj.put("zipcode", zipcode);
			obj.put("latitude", latitude);
			obj.put("longitude", longitude);
			obj.put("description", description);
			obj.put("categories", new JSONArray(categories));
			obj.put("image_url", imageUrl);
			obj.put("url", url);
			obj.put("snippet_url", snippetUrl);
			obj.put("snippet", snippet);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}

	
	public static class ItemBuilder {
		private String itemId;
		private String name;
		private double rating;
		private String address;
		private String city;
		private String country;
		private String state;
		private String zipcode;
		private double latitude;
		private double longitude;
		private String description;
		private Set<String> categories;
		private String imageUrl;
		private String url;
		private String snippet;
		private String snippetUrl;

		public ItemBuilder setItemId(String itemId) {
			this.itemId = itemId;
			return this;
		}

		public ItemBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public ItemBuilder setRating(double rating) {
			this.rating = rating;
			return this;
		}

		public ItemBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public ItemBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public ItemBuilder setCountry(String country) {
			this.country = country;
			return this;
		}

		public ItemBuilder setState(String state) {
			this.state = state;
			return this;
		}

		public ItemBuilder setZipcode(String zipcode) {
			this.zipcode = zipcode;
			return this;
		}

		public ItemBuilder setLatitude(double latitude) {
			this.latitude = latitude;
			return this;
		}

		public ItemBuilder setLongitude(double longitude) {
			this.longitude = longitude;
			return this;
		}

		public ItemBuilder setDescription(String description) {
			this.description = description;
			return this;
		}

		public ItemBuilder setCategories(Set<String> categories) {
			this.categories = categories;
			return this;
		}

		public ItemBuilder setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
			return this;
		}

		public ItemBuilder setUrl(String url) {
			this.url = url;
			return this;
		}

		public ItemBuilder setSnippet(String snippet) {
			this.snippet = snippet;
			return this;
		}

		public ItemBuilder setSnippetUrl(String snippetUrl) {
			this.snippetUrl = snippetUrl;
			return this;
		}

		public Item build() {
			return new Item(this);
		}
	}

}
