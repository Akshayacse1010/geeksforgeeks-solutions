<h2><a href="https://practice.geeksforgeeks.org/problems/b0cc054e97350ba5d7081b76cf67821d8990e259/1?page=1&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Samsung&company[]=Accolite&company[]=MakeMyTrip&company[]=Snapdeal&company[]=Zoho&company[]=Paytm&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=OYO%20Rooms&company[]=FactSet&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=Oracle&company[]=MAQ%20Software&company[]=SAP%20Labs&company[]=VMWare&company[]=Hike&company[]=Facebook&company[]=Qualcomm&company[]=Intuit&company[]=Cisco&company[]=Visa&company[]=Directi&company[]=Linkedin&company[]=Yahoo&company[]=Payu&company[]=Wipro&company[]=BankBazaar&company[]=Synopsys&company[]=Citrix&company[]=Codenation&company[]=PayPal&company[]=TCS&company[]=Twitter&company[]=Housing.com&company[]=Atlassian&company[]=Media.net&company[]=GE&company[]=Yatra.com&company[]=Nutanix&company[]=Oxigen%20Wallet&company[]=Teradata&company[]=Accenture&company[]=Infosys&company[]=Myntra&company[]=One97&company[]=Belzabar&company[]=Rockstand&company[]=Expedia&company[]=Kritikal%20Solutions&company[]=Drishti-Soft&company[]=Times%20Internet&company[]=Veritas&company[]=IBM&company[]=Groupon&company[]=Juniper%20Networks&company[]=Opera&company[]=BrowserStack&company[]=Arcesium&company[]=Cognizant&company[]=Moonfrog%20Labs&company[]=Bloomberg&company[]=Netskope&company[]=Brocade&company[]=Sapient&company[]=Zillious&company[]=ABCO&company[]=OATS%20Systems&company[]=Kuliza&company[]=Airtel&company[]=Sprinklr&company[]=HSBC&company[]=Fab.com&company[]=Informatica&company[]=National%20Instruments&company[]=JUSPAY&company[]=Zomato&category[]=Arrays&sortBy=accuracy">Leaders in an array</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array A of positive integers. Your task is to find the leaders in the array.&nbsp;An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 6
A[] = {16,17,4,3,5,2}
<strong>Output: </strong>17 5 2<strong>
Explanation: </strong>The first leader is 17 
as it is greater than all the elements
to its right.&nbsp; Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 5
A[] = {1,2,3,4,0}
<strong>Output: </strong>4 0
<strong>Explanation: </strong>The first leader is 4
as all the other numbers aren't greater than
the other elements to their right side.
The second leader is 0 as there are no elements
at right side so its greater itself.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything.&nbsp;The task is to complete the function <strong>leader</strong>() which takes array A and n&nbsp;as input parameters and&nbsp;returns an array of leaders in order of their appearance.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong></span><span style="font-size:18px">&nbsp;O(n)</span><br>
<span style="font-size:18px"><strong>Expected Auxiliary Space:</strong>&nbsp;O(n)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n&nbsp;&lt;= 10<sup>5</sup><br>
0 &lt;= A<sub>i</sub> &lt;= 10<sup>9</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Payu</code>&nbsp;<code>Adobe</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;