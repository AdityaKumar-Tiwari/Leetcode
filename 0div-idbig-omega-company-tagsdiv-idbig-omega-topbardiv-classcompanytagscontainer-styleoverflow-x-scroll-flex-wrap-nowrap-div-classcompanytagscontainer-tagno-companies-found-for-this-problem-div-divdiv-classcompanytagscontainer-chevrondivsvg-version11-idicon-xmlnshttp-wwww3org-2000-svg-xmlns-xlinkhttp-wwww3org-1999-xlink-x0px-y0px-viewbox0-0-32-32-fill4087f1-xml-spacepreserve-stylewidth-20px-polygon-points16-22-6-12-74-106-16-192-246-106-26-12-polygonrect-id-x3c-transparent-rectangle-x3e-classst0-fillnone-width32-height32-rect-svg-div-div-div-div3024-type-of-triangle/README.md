<h2><a href="https://leetcode.com/problems/type-of-triangle/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>3024. Type of Triangle</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>0-indexed</strong> integer array <code>nums</code> of size <code>3</code> which can form the sides of a triangle.</p>

<ul>
	<li>A triangle is called <strong>equilateral</strong> if it has all sides of equal length.</li>
	<li>A triangle is called <strong>isosceles</strong> if it has exactly two sides of equal length.</li>
	<li>A triangle is called <strong>scalene</strong> if all its sides are of different lengths.</li>
</ul>

<p>Return <em>a string representing</em> <em>the type of triangle that can be formed </em><em>or </em><code>"none"</code><em> if it <strong>cannot</strong> form a triangle.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [3,3,3]
<strong>Output:</strong> "equilateral"
<strong>Explanation:</strong> Since all the sides are of equal length, therefore, it will form an equilateral triangle.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [3,4,5]
<strong>Output:</strong> "scalene"
<strong>Explanation:</strong> 
nums[0] + nums[1] = 3 + 4 = 7, which is greater than nums[2] = 5.
nums[0] + nums[2] = 3 + 5 = 8, which is greater than nums[1] = 4.
nums[1] + nums[2] = 4 + 5 = 9, which is greater than nums[0] = 3. 
Since the sum of the two sides is greater than the third side for all three cases, therefore, it can form a triangle.
As all the sides are of different lengths, it will form a scalene triangle.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>nums.length == 3</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 100</code></li>
</ul>
</div>