<h2><a href="https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>3185. Count Pairs That Form a Complete Day II</a></h2><h3>Medium</h3><hr><div><p>Given an integer array <code>hours</code> representing times in <strong>hours</strong>, return an integer denoting the number of pairs <code>i</code>, <code>j</code> where <code>i &lt; j</code> and <code>hours[i] + hours[j]</code> forms a <strong>complete day</strong>.</p>

<p>A <strong>complete day</strong> is defined as a time duration that is an <strong>exact</strong> <strong>multiple</strong> of 24 hours.</p>

<p>For example, 1 day is 24 hours, 2 days is 48 hours, 3 days is 72 hours, and so on.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">hours = [12,12,30,24,24]</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong> The pairs of indices that form a complete day are <code>(0, 1)</code> and <code>(3, 4)</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">hours = [72,48,24,3]</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong> The pairs of indices that form a complete day are <code>(0, 1)</code>, <code>(0, 2)</code>, and <code>(1, 2)</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= hours.length &lt;= 5 * 10<sup>5</sup></code></li>
	<li><code>1 &lt;= hours[i] &lt;= 10<sup>9</sup></code></li>
</ul>
</div>