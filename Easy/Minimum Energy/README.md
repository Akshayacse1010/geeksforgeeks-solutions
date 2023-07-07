<h2><a href="https://practice.geeksforgeeks.org/problems/minimum-energy1107/1?page=2&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Samsung&company[]=Accolite&company[]=MakeMyTrip&company[]=Snapdeal&company[]=Zoho&company[]=Paytm&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=OYO%20Rooms&company[]=FactSet&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=Oracle&company[]=MAQ%20Software&company[]=SAP%20Labs&company[]=VMWare&company[]=Hike&company[]=Facebook&company[]=Qualcomm&company[]=Intuit&company[]=Cisco&company[]=Visa&company[]=Directi&company[]=Linkedin&company[]=Yahoo&company[]=Payu&company[]=Wipro&company[]=BankBazaar&company[]=Synopsys&company[]=Citrix&company[]=Codenation&company[]=PayPal&company[]=TCS&company[]=Twitter&company[]=Housing.com&company[]=Atlassian&company[]=Media.net&company[]=GE&company[]=Yatra.com&company[]=Nutanix&company[]=Oxigen%20Wallet&company[]=Teradata&company[]=Accenture&company[]=Myntra&company[]=One97&company[]=Belzabar&company[]=Rockstand&company[]=Expedia&company[]=Kritikal%20Solutions&company[]=Drishti-Soft&company[]=Times%20Internet&company[]=Infosys&company[]=IBM&company[]=Groupon&company[]=Veritas&company[]=Opera&company[]=Juniper%20Networks&company[]=BrowserStack&company[]=Arcesium&company[]=Bloomberg&company[]=Cognizant&company[]=Moonfrog%20Labs&company[]=Netskope&company[]=Brocade&company[]=Sapient&company[]=Zillious&company[]=ABCO&company[]=OATS%20Systems&company[]=Kuliza&company[]=Airtel&company[]=Sprinklr&company[]=Fab.com&company[]=Informatica&company[]=National%20Instruments&company[]=JUSPAY&company[]=HSBC&company[]=Zomato&category[]=Arrays&sortBy=accuracy">Minimum Energy</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array containing positive and negative numbers. The array represents checkpoints from one end to other end of street. Positive and negative values represent amount of energy at that checkpoint. Positive numbers increase the energy and negative numbers decrease. Find the minimum initial energy required to cross the street such that Energy level never becomes 0 or less than 0.</span></p>

<p><span style="font-size:18px"><strong>Note :</strong>&nbsp; The value of minimum initial energy required will be 1 even if we cross street successfully without loosing energy to less than and equal to 0 at any checkpoint. The 1 is required for initial check point.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>
N = 5
A[] = {4, -10, 4, 4, 4}
<strong>Output</strong>
7
<strong>Explanation</strong>
By having an initial energy of 7 we can
make sure that all the checkpoints are
visited and the fuel never reaches 0
or less value.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>
N = 5
A[] = {3, 5, 2, 6, 1}
<strong>Output</strong>
1
<strong>Explanation</strong>
We need at least 1 initial energy
to reach first checkpoint.</span></pre>

<p><br>
<br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You <strong>don't</strong> need to print anything, printing is done by the driver code itself. You need to complete the function <strong>minEnergy() </strong>which takes the array <strong>A[]</strong> and its size <strong>N</strong><strong> </strong>as inputs and returns the minimum initial energy required to cross the street.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
-10<sup>3</sup> ≤ A[i] ≤ 10<sup>3</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;