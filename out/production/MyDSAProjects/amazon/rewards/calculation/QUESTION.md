Amazon Shopping is running a reward collection event for its customers There are n customers and the ith customer
collectd initialRewards[i] points so far.

One final tournament is to take place where the winner will be awarded n points, the runner-up will be awarded n-1
points, the customer in third place will get n-2 points, and so on until the one in last place gets 1 point.

Given an integer array initialRewards of length n representing the initial reward points of the customer initially
before the final tournament.

Find the number of customers i (1 <= i <= n) such that, if the ith customer wins the final tournament, i.e, they would
have the highest total points.

**Note:** The total points for a customer are calculated as the sum of the initialRewards points and the points they
would receive from the final tournament(with the winner receiving n points).

- Exercise 1:

        Input: [98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98,
        100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98,
        100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98,
        100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100, 98, 100]
        Output: 50

- Exercise 2:

        Input:  [4, 2, 7, 1]
        Output: 1
