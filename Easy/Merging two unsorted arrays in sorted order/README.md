<h2><a href="https://practice.geeksforgeeks.org/problems/merging-two-unsorted-arrays-in-sorted-order1020/1?page=1&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Samsung&company[]=Accolite&company[]=MakeMyTrip&company[]=Snapdeal&company[]=Zoho&company[]=Paytm&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=OYO%20Rooms&company[]=FactSet&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=Oracle&company[]=MAQ%20Software&company[]=SAP%20Labs&company[]=VMWare&company[]=Hike&company[]=Facebook&company[]=Qualcomm&company[]=Intuit&company[]=Cisco&company[]=Visa&company[]=Directi&company[]=Linkedin&company[]=Yahoo&company[]=Payu&company[]=Wipro&company[]=BankBazaar&company[]=Synopsys&company[]=Citrix&company[]=Codenation&company[]=PayPal&company[]=TCS&company[]=Twitter&company[]=Housing.com&company[]=Atlassian&company[]=Media.net&company[]=GE&company[]=Yatra.com&company[]=Nutanix&company[]=Oxigen%20Wallet&company[]=Teradata&company[]=Accenture&company[]=Myntra&company[]=One97&company[]=Belzabar&company[]=Rockstand&company[]=Expedia&company[]=Kritikal%20Solutions&company[]=Drishti-Soft&company[]=Times%20Internet&company[]=Infosys&company[]=Veritas&company[]=IBM&company[]=Groupon&company[]=Juniper%20Networks&company[]=Opera&company[]=BrowserStack&company[]=Arcesium&company[]=Cognizant&company[]=Moonfrog%20Labs&company[]=Bloomberg&company[]=Netskope&company[]=Brocade&company[]=Sapient&company[]=Zillious&company[]=ABCO&company[]=OATS%20Systems&company[]=Kuliza&company[]=Airtel&company[]=Sprinklr&company[]=HSBC&company[]=Fab.com&company[]=Informatica&company[]=National%20Instruments&company[]=JUSPAY&company[]=Zomato&category[]=Arrays&sortBy=accuracy">Merging two unsorted arrays in sorted order</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">GIven two different arrays <strong>A</strong> and <strong>B</strong> of size <strong>N</strong> and <strong>M</strong>, the task is to merge the two arrays which are unsorted into another array which is sorted.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 3, M = 3
A[] = {10, 5, 15}
B[] = {20, 3, 2}
<strong>Output:</strong> 2 3 5 10 15 20
<strong>Explanation</strong>: After merging both the 
array's and sorting it with get the 
desired output.  
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 4, M = 3
A[] = {1, 10, 5, 15}
B[] = {20, 0, 2}
<strong>Output:</strong> 0 1 2 5 10 15 20
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>sortedMerge</strong>() that takes array<strong> A, </strong>array<strong> B, </strong>array<strong> res,&nbsp;</strong>integer<strong> N, </strong>and integer<strong> M</strong>&nbsp;as parameters and stores&nbsp;merged and sorted array in array <strong>res</strong>.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O (NlogN&nbsp;+ MlogM&nbsp;+ (N&nbsp;+ M))<br>
<strong>Expected Auxiliary Space:</strong> O(N+M).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N, M ≤ 10<sup>5</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Amdocs</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Sorting</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;