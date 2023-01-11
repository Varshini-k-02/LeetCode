# Print all possible strings
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string <strong>str</strong> your task is to complete the function<strong>&nbsp;spaceString</strong> which takes only one argument the string<strong> str </strong>and&nbsp;&nbsp;finds all possible strings that can be made by placing spaces (zero or one) in between them.&nbsp;<br>
<br>
For eg . &nbsp;for the string abc all valid strings will be<br>
&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;abc<br>
&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;ab c<br>
&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;a bc<br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; a b c<br>
<br>
<strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>str = abc
<strong>Output: </strong>abc$ab&nbsp;c$a bc$a b c$<strong>
</strong></span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>str = xy
<strong>Output: </strong>xy$x y$

</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Complete the function&nbsp;<strong>spaceString()&nbsp;</strong>which takes a character array as an input parameter and returns list of all possible answers in lexographically&nbsp;reverse order(largest String first then smaller). The driver code will print the all possible answer '$' separated.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N * 2<sup>N</sup>)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;= length of string str&nbsp;&lt;=10<br>
<br>
<strong>Note:</strong>The <strong>Input/Ouput</strong> format and <strong>Example</strong> given are used for system's internal purpose, and should be used by a user for <strong>Expected Output</strong> only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.</span></p>
</div>