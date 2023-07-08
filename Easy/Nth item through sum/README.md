<h2><a href="https://practice.geeksforgeeks.org/problems/nth-item-through-sum3544/1?page=2&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Samsung&company[]=Accolite&company[]=MakeMyTrip&company[]=Snapdeal&company[]=Zoho&company[]=Paytm&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=OYO%20Rooms&company[]=FactSet&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=Oracle&company[]=MAQ%20Software&company[]=SAP%20Labs&company[]=VMWare&company[]=Hike&company[]=Facebook&company[]=Qualcomm&company[]=Intuit&company[]=Cisco&company[]=Visa&company[]=Directi&company[]=Linkedin&company[]=Yahoo&company[]=Payu&company[]=Wipro&company[]=BankBazaar&company[]=Synopsys&company[]=Citrix&company[]=Codenation&company[]=PayPal&company[]=TCS&company[]=Twitter&company[]=Housing.com&company[]=Atlassian&company[]=Media.net&company[]=GE&company[]=Yatra.com&company[]=Nutanix&company[]=Oxigen%20Wallet&company[]=Teradata&company[]=Accenture&company[]=Myntra&company[]=One97&company[]=Belzabar&company[]=Rockstand&company[]=Expedia&company[]=Kritikal%20Solutions&company[]=Drishti-Soft&company[]=Times%20Internet&company[]=Infosys&company[]=IBM&company[]=Groupon&company[]=Veritas&company[]=Opera&company[]=Juniper%20Networks&company[]=BrowserStack&company[]=Arcesium&company[]=Bloomberg&company[]=Cognizant&company[]=Moonfrog%20Labs&company[]=Netskope&company[]=Brocade&company[]=Sapient&company[]=Zillious&company[]=ABCO&company[]=OATS%20Systems&company[]=Kuliza&company[]=Airtel&company[]=Sprinklr&company[]=Fab.com&company[]=Informatica&company[]=National%20Instruments&company[]=JUSPAY&company[]=HSBC&company[]=Zomato&category[]=Arrays&sortBy=accuracy">Nth item through sum</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two sorted arrays <strong>A</strong> and <strong>B</strong> of length <strong>L1</strong>&nbsp;and <strong>L2</strong>, we can get a set of sums(add one element from the first and one from second). Find the <strong>N</strong>th element in the set considered in sorted order.<br>
<strong>Note:&nbsp;</strong>Set of sums should have unique elements.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> L1 = 2, L2 = 2
A = {1, 2}
B = {3, 4}
N = 3
<strong>Output:</strong> 6
<strong>Explaination:</strong> The set of sums are in 
the order 4, 5, 6.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> L1 = 5, L2 = 4
A = {1, 3, 4, 8, 10}
B = {20, 22, 30, 40}
N = 4
<strong>Output:</strong> 25
<strong>Explaination:</strong> The numbers before it 
are 21, 23 and 24.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>nthItem() </strong>which takes L1, L2, A, B, and the value N as input parameters and returns the Nth value of the set. If N is greater than the size of the set then it returns <strong>-1</strong>.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O((L1*L2)*log(L1*L2))<br>
<strong>Expected Auxiliary Space:</strong> O(L1*L2)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ L1, L2 ≤ 500<br>
1 ≤ A[i], B[i] ≤ 10000<br>
1 ≤ N ≤ L1*L2</span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>STL</code>&nbsp;<code>Data Structures</code>&nbsp;