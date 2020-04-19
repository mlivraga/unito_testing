package it.reply.iriscube.unito.app.viewassertion

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import org.hamcrest.CoreMatchers.`is`

/**
 * Created by Reply on 2020-04-18.
 */
class RecyclerViewCounterViewAssertion(val expectedItemCount: Int) : ViewAssertion {

    override fun check(view: View?, noViewFoundException: NoMatchingViewException?) {
        if (noViewFoundException != null) {
            throw noViewFoundException
        }

        val recyclerView = view as RecyclerView
        val adapter = recyclerView.adapter

        assertThat(adapter?.itemCount, `is`(expectedItemCount))
    }
}