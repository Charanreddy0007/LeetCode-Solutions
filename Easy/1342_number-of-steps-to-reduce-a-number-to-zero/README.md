
# 1342.  Number of Steps to Reduce a Number to Zero

🟢 Easy &nbsp;&nbsp;&nbsp; ⚙️ Java &nbsp;&nbsp;&nbsp; ⏱ 0 ms &nbsp;&nbsp;&nbsp; 💾 42.3 MB



`Math`&nbsp;&nbsp;&nbsp;`Bit Manipulation`


## Overview

<div align="center">
<table>
<tr>

<td valign="top">

<h3> Problem</h3>

|Property            |Value        |
|--------------------|-------------|
|Problem ID          |**1342**|
|Difficulty          |**Easy**|
|Leetcode Link       |[link!](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/)

</td>

<td valign="top">
<h3> Community Stats</h3>


| Metric          | Count                         |
|-----------------|------------------------------:|
|Acceptance Rate  |**85.9%**          |
|Total Submission |**1.1M** |
|Total Accepted   |**952.7K**   |



</td>


</tr>
</table>
</div>


## Question
<p>Given an integer <code>num</code>, return <em>the number of steps to reduce it to zero</em>.</p>

<p>In one step, if the current number is even, you have to divide it by <code>2</code>, otherwise, you have to subtract <code>1</code> from it.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num = 14
<strong>Output:</strong> 6
<strong>Explanation:</strong>&nbsp;
Step 1) 14 is even; divide by 2 and obtain 7.&nbsp;
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.&nbsp;
Step 4) 3 is odd; subtract 1 and obtain 2.&nbsp;
Step 5) 2 is even; divide by 2 and obtain 1.&nbsp;
Step 6) 1 is odd; subtract 1 and obtain 0.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> num = 8
<strong>Output:</strong> 4
<strong>Explanation:</strong>&nbsp;
Step 1) 8 is even; divide by 2 and obtain 4.&nbsp;
Step 2) 4 is even; divide by 2 and obtain 2.&nbsp;
Step 3) 2 is even; divide by 2 and obtain 1.&nbsp;
Step 4) 1 is odd; subtract 1 and obtain 0.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> num = 123
<strong>Output:</strong> 12
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= num &lt;= 10<sup>6</sup></code></li>
</ul>


<br>
<p align="right">Last Sync: 2026-07-30 &nbsp;</p>
