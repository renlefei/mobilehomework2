package com.example.layouthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FrameLayout_banner_container.setOnClickListener {
            val intent = Intent(this, GreetingActivity::class.java)
            startActivity(intent)
        }

        initView()
    }

    private fun initView(){

        val chatsFragment = ChatsFragment()
        var contactsFragment = ContactsFragment()
        var discoverFragment = DiscoverFragment()
        var meFragment = MeFragment()
        var replaceFragment = ReplaceFragment()

        chats.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            if (!chatsFragment.isAdded) {
                transaction
                    .add(R.id.content, chatsFragment)
            }
            transaction.show(chatsFragment)
            transaction.commit()
        }

        contacts.setOnClickListener{
            var transaction = supportFragmentManager.beginTransaction()
            if(!contactsFragment.isAdded){
                transaction
                    .add(R.id.content, contactsFragment)
            }
            transaction.show(contactsFragment)
            transaction.commit()
        }

        discover.setOnClickListener{
            var transaction = supportFragmentManager.beginTransaction()
            if(!contactsFragment.isAdded){
                transaction
                    .add(R.id.content, discoverFragment)
            }
            transaction.show(discoverFragment)
            transaction.commit()
        }

        me.setOnClickListener{
            var transaction = supportFragmentManager.beginTransaction()
            if(!contactsFragment.isAdded){
                transaction
                    .add(R.id.content, meFragment)
            }
            transaction.show(meFragment)
            transaction.commit()
        }

        replace.setOnClickListener{
            var transaction = supportFragmentManager.beginTransaction()
            if(!contactsFragment.isAdded){
                transaction
                    .add(R.id.content, replaceFragment)
            }
            transaction.show(replaceFragment)
            transaction.commit()
        }

        remove.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction
                .remove(chatsFragment)
                .remove(contactsFragment)
                .remove(discoverFragment)
                .remove(meFragment)
                .remove(replaceFragment)
                .commit()
        }

    }


}
