import android.os.AsyncTask
import android.util.Log
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL


/*
package com.mobile.leetcode.linkedlist


*/
/*

 Maps and Hash-maps
 Optimised programs wrt stack, arrays
 Four Rounds: 1) DSA -- Stack Trees 2) Machine Coding 3) HLD --- Netflix Design 4) LLD -- Uber Design 5) HR -- Behavioural questions Change this less than 30 words. Concise words can have more meaning

Given a string consisting of opening and closing parenthesis, find the length of the longest valid parenthesis substring.
Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island.


Design and develop a key value store.
Key should be wrapper and string.
Value can store multiple attributes and corresponding value.
A record can have any number of attributes. Once the schema of attributes is fixed it will not change.



Design a cab booking service for an IT park.
Functional requirement-
1. Can view the available cabs.
2. Can book and cancel a cab.
3. If a cab is cancelled the next waiting customer should get the confirmation of booking.



1. Given an array of pairs, find all symmetric pairs in it
2. Reverse a Stack without using additional space
3. Reverse a String and maintain spaces,
eg: input: I Am Not String
output : g ni rtS toNmAI



Minimum sum path of tree
Subarray sum
Stack using queue

3 round interview process
1.Coding test
2. Technical interview
3. Managerial interview
4. HR interview
Be well versed with oops ,os, DBMS, Data structures and algorithms.
4. HR interview
Be well versed with oops ,os, DBMS, Data structures and algorithms.



Interview
there were 3 rounds after coding test
1. domain interview- coding questions
a.min sum path of a tree
b. sum of sub array
c.stack using queue

and oops ,os ,dbms questions
2. managerial round
oops,projects,design of real world examples
3. hr round

Interview Questions
a.min sum path of a tree
b. sum of sub array
c.stack using queue

coding round : build the notification service to send the notification to users if critical eroor occurs


Interview Questions
1. Implement secured file queue with multi threading functionality(working code)
2. Classes scheduling
3. Design architecture for a hyper local market space for many constraints
https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
__________________________________________________________________________________________
[1] Functional Requirements

Of course, you can’t design the whole Facebook in the next 1 hour. So, discuss with your interviewer what features he wants you to design in 1 hour if he has not stated it already.

Should the design include a "detailed" discussion of the following features —
- Signup/Login of users?
- Send/Accept Friend Requests?
- Personalized NewsFeed for a user?
- Can the post contain images/text or video as well?

Basically, get a very clear idea of what needs to be designed in the next 1 hour.

________

[2] Non-Functional Requirements

Think about what would you expect out of the system as a user in terms of speed, security, reliability etc.
- Probably 2 seconds is acceptable to display a user’s feed
- It’s okay to show a friend’s post maybe a few minutes late but make sure that system is able to read & display some data.
- We should protect user’s data for security reasons

________

[3] Constraints & Capacity Estimates

In simple terms, What’s the scale we are dealing with and how many approx. servers needed?
- How many daily active users? 10k or 10M or 1Billion?
- Avg. size of 1 post?
- How many servers are needed to serve the traffic?
- How much bandwidth is required to open Facebook and scroll the feed?

________

[4] API schema

Come up with the functional APIs for the system like:
- CRUD operations on a post.
- Send/Accept/Reject Friend Request APIs
- Get User NewsFeed

Preferably, follow REST protocols and define:
Method Type: POST/PUT/GET/DELETE
Method Name: NewsFeed
Request Parameters: In URL or body
Response HTTP Codes: 2xx/3xx/4xx/5xx

________

[5] High-level System Design

You need to have a lot of experience to answer this most complex section. For starters:
- Start identifying your services like UserService, FeedService, NotificationService
- Start mentioning which API would go to which service
- Think if there are certain things that can be handled asynchronously

There’s a LOT more. Check the first comment of this post in detail.
________

[6] Database Design

I prefer discussing this after I high-level design my system.

- Discuss what are the tables and relevant columns
- Discuss the relationship between the User/Post/Feed. One-to-one or one-to-many?
- More importantly, discuss tradeoffs for why you are choosing SQL vs No-SQL.
- Any key-value cache for improving performance

________

At each point, pause and let your interviewer absorb things, don’t be in a hurry. They will steer you on the right path if you’re discussing something which he is not interested in.

If there’s still some time left, discuss the extra problems:
- Ranking logic for posts? How to solve the Hot Users problem who have millions of followers?
- How to do Monitoring/Alerting/Observability
*/


class Fucj {

    fun main() {
        var listv = mutableListOf<Ab>()
        listv.add(Ab.bc(""))
    }

    class GetMethodDemo : AsyncTask<String?, Void?, String?>() {
        private var server_response: String? = null
        override fun doInBackground(vararg strings: String?): String? {
            val url: URL
            var urlConnection: HttpURLConnection? = null
            try {
                url = URL(strings[0])
                urlConnection = url.openConnection() as HttpURLConnection
                val responseCode = urlConnection.responseCode
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    server_response = readStream(urlConnection!!.inputStream)
                    Log.v("CatalogClient", server_response!!)
                }
            } catch (e: MalformedURLException) {
                e.printStackTrace()
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return null
        }

        override fun onPostExecute(s: String?) {
            super.onPostExecute(s)
            Log.e("Response", "" + server_response)
        }

        // Converting InputStream to String
        private fun readStream(input: InputStream): String? {
            var reader: BufferedReader? = null
            val response = StringBuffer()
            try {
                reader = BufferedReader(InputStreamReader(input))
                var line: String? = ""
                while (reader.readLine().also { line = it } != null) {
                    response.append(line)
                }
            } catch (e: IOException) {
                e.printStackTrace()
            } finally {
                if (reader != null) {
                    try {
                        reader.close()
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }
            return response.toString()
        }
    }


    // Converting InputStream to String

    // Converting InputStream to String

}

sealed interface Ab {
    class bc(val inas: String) : Ab
    data object db : Ab
}




