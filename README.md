[![](https://jitpack.io/v/theonlyanil/SharedPrefs.svg)](https://jitpack.io/#theonlyanil/SharedPrefs)
SharedPrefs
===

A simple Shared Preferences library to save a few lines of code.


Implementation
===
build.gradle(Project)
```gradle
  allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

build.gradle (Module:app)
```gradle
	dependencies {
	        implementation 'com.github.theonlyanil:SharedPrefs:1.0'
	}
```


Usage
====

You can use this library to save Integer, String, Long and Boolean values to shared preferences.

Init.
---
```java
  // initialise in OnCreate
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        
        SharedPrefs.init("Name Of Preference File");
```        

Save int / String / boolean / long
---

```java
  //int
  SharedPrefs.with(getApplicationContext()).saveInt("keyNameInt", 1);

  // string
  SharedPrefs.with(getApplicationContext()).saveString("keyNameString", "Hello");

  // boolean
  SharedPrefs.with(getApplicationContext()).saveBoolean("keyNameBoolean", true);

  // long
  SharedPrefs.with(getApplicationContext()).saveLong("keyNameLong", 1);
```

Get int / String / boolean / long
---

```java
  //int
  SharedPrefs.with(getApplicationContext()).getInt("keyNameInt", 1);

  // string
  SharedPrefs.with(getApplicationContext()).getString("keyNameString", "Hello");

  // boolean
  SharedPrefs.with(getApplicationContext()).getBoolean("keyNameBoolean", true);

  // long
  SharedPrefs.with(getApplicationContext()).getLong("keyNameLong", 1);
```    
