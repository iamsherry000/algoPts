# data structure and dynamic array
- Interface: waht u want to do.
    1. specification
    2. what data can store
    3. what operations are supported and what they mean
    - 2 main interface: 1. set 2. sequences
- Data structure: how you do it. 
    1. representation
    2. how to store data
    3. algorithms to support operations
    - 2 main data structure tools: 1. arrays 2. pointer based (linked)

## Static sequence interface: maintain a sequence of items to these operations
- build(x): make new DS for item in x 
- len(): return n
- iter_seq(): output items in seq order
- get_at(i): return Xi (index i)
- set_at(i,x): set Xi to x
- get_first()
- get_last()
- set_first(x)
- set_last(x) 

## Summary
- 靜態陣列不能直接進行動態操作，但可以通過創建新陣列和拷貝數據來實現低效率的動態行為。