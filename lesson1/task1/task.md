# View and ViewGroups

<img src="assets/view-and-viewgroups.png" width="720" />

The `View` objects are usually called `Widgets` and can be on of many subclasses, such as `Button`
or `TextView`.

The `ViewGroup` objects, usually called "layouts" and are containers for other `View`
objects, such as `LinearLayout` or `ConstraintLayout`.

### You can declare the layouts in two ways:
1. In XML file
2. At runtime

## Attributes and layout parameters
XML attributes are used to set the properties of the `View` objects. Eg. `android:text` and `android:textColor` for `TextView`.
```xml
<TextView 
    android:text="Hello World!" 
    android:textColor="@color/white" />
```
XML layout attributes named `layout_something` define layout parameters for the View that are appropriate for the ViewGroup in which it resides
```xml
<LinearLayout 
    android:layout_width="match_parent" 
    android:layout_height="match_parent"
    android:orientation="vertical">

  <TextView 
      android:layout_width="wrap_content" 
      android:layout_height="wrap_content"
      android:text="Hello World!" />
</LinearLayout>
```

# Exercise
- Follow the designs on figma to create and customize the buttons using a material
  library. [Ui/Ux on Mobile](https://www.figma.com/file/yoK55huhMrsyC21CwaJrwF/Ui%2FUx-On-Mobile?node-id=11%3A2555&t=2UX0xtAnW5EUbzMy-4)
- Implement your code
  in [activity_main.xml](course://lesson1/task1/library/src/main/res/layout/activity_main.xml) file
- [Buttons - Material Design](https://m2.material.io/components/buttons/android)
