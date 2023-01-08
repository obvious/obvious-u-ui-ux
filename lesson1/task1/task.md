# View and ViewGroups

<img src="assets/view-and-viewgroups.png" width="720" />

The `View` objects are usually called `Widgets` and can be on of many subclasses, such as `Button`
or `TextView`.

The `ViewGroup` objects, usually called "layouts" and are containers for other `View`
objects, such as `LinearLayout` or `ConstraintLayout`.

### You can declare the layouts in two ways:
1. In XML file
2. At runtime

## Find your views

Any `View` object may have an integer ID associated with it. This ID can be used to find the `View`
within the tree

```
<TextView android:id="@+id/textView" .../>

val textView = findViewById<TextView>(R.id.textView)
```

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
## Size, Padding, and Margin

# Exercise
- Implement your code in [activity_main.xml](course://lesson1/task1/library/src/main/res/layout/activity_main.xml) file
