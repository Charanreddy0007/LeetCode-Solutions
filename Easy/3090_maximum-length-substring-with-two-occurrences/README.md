
# 3090.  Maximum Length Substring With Two Occurrences

🟢 Easy &nbsp;&nbsp;&nbsp; ⚙️ Java &nbsp;&nbsp;&nbsp; ⏱ 1 ms &nbsp;&nbsp;&nbsp; 💾 43.3 MB



`Hash Table`&nbsp;&nbsp;&nbsp;`String`&nbsp;&nbsp;&nbsp;`Sliding Window`


## Overview

<div align="center">
<table>
<tr>

<td valign="top">

<h3> Problem</h3>

|Property            |Value        |
|--------------------|-------------|
|Problem ID          |**3090**|
|Difficulty          |**Easy**|
|Leetcode Link       |[link!](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/)

</td>

<td valign="top">
<h3> Community Stats</h3>


| Metric          | Count                         |
|-----------------|------------------------------:|
|Acceptance Rate  |**74.4%**          |
|Total Submission |**179.2K** |
|Total Accepted   |**133.3K**   |



</td>


</tr>
</table>
</div>


## Question
Given a string <code>s</code>, return the <strong>maximum</strong> length of a <span data-keyword="substring">substring</span>&nbsp;such that it contains <em>at most two occurrences</em> of each character.
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;bcbbbcba&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>

<p><strong>Explanation:</strong></p>
The following substring has a length of 4 and contains at most two occurrences of each character: <code>&quot;bcbb<u>bcba</u>&quot;</code>.</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;aaaa&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>
The following substring has a length of 2 and contains at most two occurrences of each character: <code>&quot;<u>aa</u>aa&quot;</code>.</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists only of lowercase English letters.</li>
</ul>


<br>
<p align="right">Last Sync: 2026-08-14 &nbsp;</p>
