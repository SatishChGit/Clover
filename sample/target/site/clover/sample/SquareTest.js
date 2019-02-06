var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":2,"methods":[{"el":23,"sc":3,"sl":18},{"el":30,"sc":6,"sl":27},{"el":35,"sc":2,"sl":32}],"name":"SquareTest","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":32}],"name":"test","pass":true,"statements":[{"sl":34}]},"test_1":{"methods":[{"sl":32}],"name":"test","pass":true,"statements":[{"sl":34}]},"test_2":{"methods":[{"sl":32}],"name":"test","pass":true,"statements":[{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [0, 2, 1], [], [0, 2, 1], [], [], []]
