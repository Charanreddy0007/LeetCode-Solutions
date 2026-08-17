
# 20.  Valid Parentheses

🟢 Easy &nbsp;&nbsp;&nbsp; ⚙️ Java &nbsp;&nbsp;&nbsp; ⏱ 3 ms &nbsp;&nbsp;&nbsp; 💾 43.5 MB



`String`&nbsp;&nbsp;&nbsp;`Stack`&nbsp;&nbsp;&nbsp;`Bracket Sequences`


## Overview

<div align="center">
<table>
<tr>

<td valign="top">

<h3> Problem</h3>

|Property            |Value        |
|--------------------|-------------|
|Problem ID          |**20**|
|Difficulty          |**Easy**|
|Leetcode Link       |[link!](https://leetcode.com/problems/valid-parentheses/description/)

</td>

<td valign="top">
<h3> Community Stats</h3>


| Metric          | Count                         |
|-----------------|------------------------------:|
|Acceptance Rate  |**44.7%**          |
|Total Submission |**17.9M** |
|Total Accepted   |**8M**   |



</td>


</tr>
</table>
</div>


## Question
<p>Given a string <code>s</code> containing just the characters <code>&#39;(&#39;</code>, <code>&#39;)&#39;</code>, <code>&#39;{&#39;</code>, <code>&#39;}&#39;</code>, <code>&#39;[&#39;</code> and <code>&#39;]&#39;</code>, determine if the input string is valid.</p>

<p>An input string is valid if:</p>

<ol>
	<li>Open brackets must be closed by the same type of brackets.</li>
	<li>Open brackets must be closed in the correct order.</li>
	<li>Every close bracket has a corresponding open bracket of the same type.</li>
</ol>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;()&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;()[]{}&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;(]&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;([])&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 5:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;([)]&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s</code> consists of parentheses only <code>&#39;()[]{}&#39;</code>.</li>
</ul>


<br>
<p align="right">Last Sync: 2026-08-17 &nbsp;</p>
