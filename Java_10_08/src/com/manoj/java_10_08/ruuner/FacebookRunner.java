package com.manoj.java_10_08.ruuner;

import com.manoj.java_10_08.app.Facebook;

public class FacebookRunner {

	public static void main(String[] args) {
		Facebook myFacebookProfile = new Facebook();

		myFacebookProfile.setUserName("manojbasaragi");
		myFacebookProfile.setFullName("Manoj");
		myFacebookProfile.setBio("Software Developer | Nature Enthusiast");
		myFacebookProfile.setEmail("manu@gmail.com");
		myFacebookProfile.setLocation("India");
		myFacebookProfile.setProfilePicture("profile.jpg");
		myFacebookProfile.setFriendsCount(500);
		myFacebookProfile.setFollowersCount(1000);
		myFacebookProfile.setPostsCount(300);
		myFacebookProfile.setLikesCount(1500);
		myFacebookProfile.setVerified(true);
		myFacebookProfile.setPrivate(false);
		myFacebookProfile.setRelationshipStatus("Single");
		myFacebookProfile.setLastActive("2023-08-10 15:30");

		System.out.println("User Name: " + myFacebookProfile.getUserName());
		System.out.println("Full Name: " + myFacebookProfile.getFullName());
		System.out.println("Bio: " + myFacebookProfile.getBio());
		System.out.println("Email: " + myFacebookProfile.getEmail());
		System.out.println("Location: " + myFacebookProfile.getLocation());
		System.out.println("Profile Picture: " + myFacebookProfile.getProfilePicture());
		System.out.println("Friends Count: " + myFacebookProfile.getFriendsCount());
		System.out.println("Followers Count: " + myFacebookProfile.getFollowersCount());
		System.out.println("Posts Count: " + myFacebookProfile.getPostsCount());
		System.out.println("Likes Count: " + myFacebookProfile.getLikesCount());
		System.out.println("Verified: " + myFacebookProfile.isVerified());
		System.out.println("Private: " + myFacebookProfile.isPrivate());
		System.out.println("Relationship Status: " + myFacebookProfile.getRelationshipStatus());
		System.out.println("Last Active: " + myFacebookProfile.getLastActive());
	}

}
