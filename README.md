# Kotlin MutableList removeIf Unexpected Behavior

This repository demonstrates a subtle bug related to using the `removeIf` function on a `MutableList` in Kotlin. The issue occurs because `removeIf` modifies the list in place.  If the predicate depends on the index or the current state of the list (after some elements have been removed), unexpected results might arise.

The `bug.kt` file contains the faulty code, and `bugSolution.kt` provides a corrected version, along with explanations.