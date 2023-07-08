<h2><a href="https://practice.geeksforgeeks.org/problems/sum-of-lengths-of-non-overlapping-subarrays2237/1?page=1&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Samsung&company[]=Accolite&company[]=MakeMyTrip&company[]=Snapdeal&company[]=Zoho&company[]=Paytm&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=OYO%20Rooms&company[]=FactSet&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=Oracle&company[]=MAQ%20Software&company[]=SAP%20Labs&company[]=VMWare&company[]=Hike&company[]=Facebook&company[]=Qualcomm&company[]=Intuit&company[]=Cisco&company[]=Visa&company[]=Directi&company[]=Linkedin&company[]=Yahoo&company[]=Payu&company[]=Wipro&company[]=BankBazaar&company[]=Synopsys&company[]=Citrix&company[]=Codenation&company[]=PayPal&company[]=TCS&company[]=Twitter&company[]=Housing.com&company[]=Atlassian&company[]=Media.net&company[]=GE&company[]=Yatra.com&company[]=Nutanix&company[]=Oxigen%20Wallet&company[]=Teradata&company[]=Accenture&company[]=Myntra&company[]=One97&company[]=Belzabar&company[]=Rockstand&company[]=Expedia&company[]=Kritikal%20Solutions&company[]=Drishti-Soft&company[]=Times%20Internet&company[]=Infosys&company[]=Veritas&company[]=IBM&company[]=Groupon&company[]=Juniper%20Networks&company[]=Opera&company[]=BrowserStack&company[]=Arcesium&company[]=Cognizant&company[]=Moonfrog%20Labs&company[]=Bloomberg&company[]=Netskope&company[]=Brocade&company[]=Sapient&company[]=Zillious&company[]=ABCO&company[]=OATS%20Systems&company[]=Kuliza&company[]=Airtel&company[]=Sprinklr&company[]=HSBC&company[]=Fab.com&company[]=Informatica&company[]=National%20Instruments&company[]=JUSPAY&company[]=Zomato&category[]=Arrays&sortBy=accuracy">Sum of Lengths of Non-Overlapping SubArrays</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-family:tahoma,geneva,sans-serif"><span style="font-size:18px">Given an array <strong>arr[]</strong> of <strong>N</strong> elements, the task is to find the&nbsp;maximum sum of lengths of all non-overlapping subarrays&nbsp;with <strong>K</strong>&nbsp;as the maximum element in the subarray.</span></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 9, K = 4
arr[] = {2, 1, 4, 9, 2, 3, 8, 3, 4} 
<strong>Output:</strong> 5
<strong>Explanation</strong>: {2, 1, 4} =&gt; Length = 3
             {3, 4} =&gt; Length = 2
             So, 3 + 2 = 5 is the answer.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 7, K = 4
arr[] = {1, 2, 3, 2, 3, 4, 1} 
<strong>Output:</strong> &nbsp;7
<strong>Explanation:</strong> {1, 2, 3, 2, 3, 4, 1} 
             =&gt; Length = 7.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>calculateMaxSumLength</strong>() that takes array <strong>arr,</strong> integer<strong> N</strong>, and integer<strong> K&nbsp;</strong>as parameters and returns <span style="font-family:arial,helvetica,sans-serif">the sum of the length of all such subarrays.</span></span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N).&nbsp;<br>
<strong>Expected Auxiliary Space:</strong> O(1).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>6</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;