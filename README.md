# streams-api
Streams API Practise

## Fail fast vs Fail safe
Fail safe : fail safe iterator means they will not throw any exception even if the 
collection is modified while iterating over it.
Fail fast : fail fast iterators throws an exception(ConcurrentModificationException)
if the collection is modified while iterating over it.

