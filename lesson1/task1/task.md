## What is a Style?

A style is a collection of view attribute values. You can think of a style as
a `Map<view attribute, resource>`. That is the keys are all view attributes i.e. attributes that a
widget declares and you might set in a layout file. Styles are specific to a single type of widget
because different widgets support different sets of attributes:

```xml
<style name="Widget.App.Button" parent="Widget.AppCompat.Button">
  <item name="android:textColor">@color/white_100</item>
  <item name="android:backgroundTint">@color/blue_50</item>
</style>
```
As you can see, each of the keys in the style are things you could set in a layout:

```xml
<androidx.appcompat.widget.AppCompatButton
  android:text="Hello World"
  android:textColor="@color/white_100"
  android:backgroundTint="@color/blue_50" />
```

### Action item
In the [styles.xml](file://lesson1/task1/library/src/main/res/values/styles.xml) file, 
1. Create two styles named `Widget.App.Button` and `Widget.App.Button.Alert` that extend `Widget.AppCompat.Button` 
2. Set the `android:textColor` attribute to `@color/white_100` for both styles
3. Set the `android:backgroundTint` attribute to `@color/blue_50` for `Widget.App.Button` and `@color/red_50` for `Widget.App.Button.Alert`
4. Once done, apply them to the `@id/button_brand` and `@id/button_alert` in the [activity_main.xml](file://lesson1/task1/library/src/main/res/layout/activity_main.xml) file.

End result should look like this [screenshot](file://lesson1/task1/library/src/test/snapshots/images/com.example.android.library_MainActivityLayoutTest_layout.png)

### Reading material
- https://developer.android.com/develop/ui/views/theming/themes
