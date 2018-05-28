# OrientedImageView
ImageView with aspect ratio and orientation

[ ![Download](https://api.bintray.com/packages/imrhk/OrientedImageView/oriented-image-view/images/download.svg) ](https://bintray.com/imrhk/OrientedImageView/oriented-image-view/_latestVersion)


### Installation
```sh
implementation 'com.litedevs:oriented-image-view:1.0'
```


### Example
```
<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <!--With Fixed Width -->

    <!-- Aspect Ratio 16:9 -->
    <com.litedevs.view.OrientedImageView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:src="@android:color/holo_red_light"
        app:fixedOrientation="horizontal"
        app:aspectRatio="1.77">
    </com.litedevs.view.OrientedImageView>


    <!--With Fixed Height -->
    <!-- Aspect Ratio 2:3 -->
    <com.litedevs.view.OrientedImageView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:src="@android:color/holo_blue_bright"
        app:fixedOrientation="vertical"
        app:aspectRatio="0.67">
        
    </com.litedevs.view.OrientedImageView>
</LinearLayout>

```

### Sample Screenshot
![Screenshot](screenshot-v1.png?raw=true "Screenshot")


### Licence
Copyright 2018 Rahul Kumar

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
