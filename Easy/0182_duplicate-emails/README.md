
# 182.  Duplicate Emails

🟢 Easy &nbsp;&nbsp;&nbsp; ⚙️ MySQL &nbsp;&nbsp;&nbsp; ⏱ 395 ms &nbsp;&nbsp;&nbsp; 💾 0.0B



`Database`


## Overview

<div align="center">
<table>
<tr>

<td valign="top">

<h3> Problem</h3>

|Property            |Value        |
|--------------------|-------------|
|Problem ID          |**182**|
|Difficulty          |**Easy**|
|Leetcode Link       |[link!](https://leetcode.com/problems/duplicate-emails/description/)

</td>

<td valign="top">
<h3> Community Stats</h3>


| Metric          | Count                         |
|-----------------|------------------------------:|
|Acceptance Rate  |**74.1%**          |
|Total Submission |**1.7M** |
|Total Accepted   |**1.2M**   |



</td>


</tr>
</table>
</div>


## Question
<p>Table: <code>Person</code></p>

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| email       | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table contains an email. The emails will not contain uppercase letters.
</pre>

<p>&nbsp;</p>

<p>Write a solution to report all the duplicate emails. Note that it&#39;s guaranteed that the email&nbsp;field is not NULL.</p>

<p>Return the result table in <strong>any order</strong>.</p>

<p>The&nbsp;result format is in the following example.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> 
Person table:
+----+---------+
| id | email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
<strong>Output:</strong> 
+---------+
| Email   |
+---------+
| a@b.com |
+---------+
<strong>Explanation:</strong> a@b.com is repeated two times.
</pre>


<br>
<p align="right">Last Sync: 2026-07-24 &nbsp;</p>
