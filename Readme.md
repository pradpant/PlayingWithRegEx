Hi,
I'm exploring all the possible ways to write the Desired RegEx for this Question Link- https://www.codechef.com/COOK126C/problems/PASSWD
Already tried to write the possible If else program it's working fine but I think there can be a beautiful RegEx that can satisfies the Question conditions as follows:

Chef is planning to setup a secure password for his Codechef account. For a password to be secure the following conditions should be satisfied:

1) Password must contain at least one lower case letter [a−z];

2) Password must contain at least one upper case letter [A−Z] strictly inside, i.e. not as the first or the last character;

3) Password must contain at least one digit [0−9] strictly inside;

4) Password must contain at least one special character from the set { '@', '#', '%', '&', '?' } strictly inside;

5) Password must be at least 10 characters in length, but it can be longer.

Chef has generated several strings and now wants you to check whether the passwords are secure based on the above criteria. Please help Chef in doing so.

Input
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, string S.
Output
For each testcase, output in a single line "YES" if the password is secure and "NO" if it is not.

Test Case :
Example Input:
3
#cookOff#P1
U@code4CHEFINA
gR3@tPWD

Example Output:
NO
YES
NO

/*************************************/
