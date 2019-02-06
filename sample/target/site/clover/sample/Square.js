var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":9,"id":0,"methods":[{"el":7,"sc":2,"sl":5}],"name":"Square","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":5}],"name":"test","pass":true,"statements":[{"sl":6}]},"test_1":{"methods":[{"sl":5}],"name":"test","pass":true,"statements":[{"sl":6}]},"test_2":{"methods":[{"sl":5}],"name":"test","pass":true,"statements":[{"sl":6}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [0, 2, 1], [0, 2, 1], [], [], []]
