A stateful composable holds and modifies its own state internally, while a stateless composable relies on its caller to hold and modify the state.

When a composable is stateful, its internal state is managed independently of its caller. For example, the **`itemOrder`** composable in your app manages its own count state. The caller, in this case, the **`appScreen`** composable, has no direct control over the count in **`itemOrder`**.

On the other hand, a stateless composable doesn't manage its own state. Instead, it relies on the caller to pass the necessary state as parameters. This makes the composable more reusable because it can be used in different contexts by different callers, with the state being managed externally.

To make a composable stateless, you can move the state management responsibility to a higher-level composable using a technique called "state hoisting." This involves moving the state variable from the stateful composable to the caller composable and passing it as a parameter to the stateless composable. The state modifications are also handled by the caller, and the stateless composable reflects those changes.

By making a composable stateless and hoisting the state to the caller, you improve reusability and maintainability. It allows you to easily reuse the same composable in different parts of your app, providing flexibility and making your code easier to maintain.

Stateful Composable (CountButton):

```kotlin

@Composable
fun CountButton() {
    var count by remember { mutableStateOf(0) }

    Button(onClick = { count++ }) {
        Text("Increase Count")
    }
    Text("Count: $count")
}

```

In this example, the **`CountButton`** composable is stateful because it manages its own count state using **`remember { mutableStateOf(0) }`**. Whenever the button is clicked, the count value is incremented, and the updated count is displayed using the **`Text`** composable.

Stateless Composable (Greeting):

```kotlin

@Composable
fun Greeting(name: String) {
    Text("Hello, $name!")
}

```

In this example, the **`Greeting`** composable is stateless because it does not manage its own state. It relies on the caller to provide the name as a parameter. It simply displays a greeting message using the **`Text`** composable.
