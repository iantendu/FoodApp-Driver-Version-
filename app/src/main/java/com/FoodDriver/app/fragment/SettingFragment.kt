package com.FoodDriver.app.fragment

import android.view.View
import android.widget.CompoundButton
import com.FoodDriver.app.activity.EditProfileActivity
import com.FoodDriver.app.R
import com.FoodDriver.app.activity.ChangePasswordActivity
import com.FoodDriver.app.activity.DashboardActivity
import com.FoodDriver.app.base.BaseFragmnet
import com.FoodDriver.app.utils.Common.getCurrentLanguage
import com.FoodDriver.app.utils.SharePreference
import kotlinx.android.synthetic.main.fragment_home.ivMenu
import kotlinx.android.synthetic.main.fragment_setting.*


class SettingFragment: BaseFragmnet() {
    override fun setView(): Int {
        return R.layout.fragment_setting
    }
    override fun Init(view: View) {
        getCurrentLanguage(activity!!,false)
        ivMenu.setOnClickListener {
            (activity as DashboardActivity?)!!.onDrawerToggle()
        }

        cvBtnEditProfile.setOnClickListener {
            openActivity(EditProfileActivity::class.java)
        }

        cvBtnPassword.setOnClickListener {
           openActivity(ChangePasswordActivity::class.java)
        }

        if (SharePreference.getStringPref(
                activity!!,
                SharePreference.SELECTED_LANGUAGE
            ) == resources.getString(R.string.language_english)
        ) {
            ivSelectArabic.isChecked = false
            ivSelectEnglish.isChecked = true
        } else {
            ivSelectArabic.isChecked = true
            ivSelectEnglish.isChecked = false
        }

        llArabic.setOnClickListener {
            ivSelectArabic.isChecked = true
            ivSelectEnglish.isChecked = false
            SharePreference.setStringPref(
                activity!!,
                SharePreference.SELECTED_LANGUAGE,
                activity!!.resources.getString(R.string.language_hindi)
            )
            getCurrentLanguage(activity!!, true)
        }
        llEnglish.setOnClickListener {
            ivSelectArabic.isChecked = false
            ivSelectEnglish.isChecked = true
            SharePreference.setStringPref(
                activity!!,
                SharePreference.SELECTED_LANGUAGE,
                activity!!.resources.getString(R.string.language_english)
            )
            getCurrentLanguage(activity!!, true)
        }

        ivSelectArabic.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    ivSelectArabic.isChecked = true
                    ivSelectEnglish.isChecked = false
                    SharePreference.setStringPref(
                        activity!!,
                        SharePreference.SELECTED_LANGUAGE,
                        activity!!.resources.getString(R.string.language_hindi)
                    )
                    getCurrentLanguage(activity!!, true)
                }
            }
        });

        ivSelectEnglish.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    ivSelectArabic.isChecked = false
                    ivSelectEnglish.isChecked = true
                    SharePreference.setStringPref(
                        activity!!,
                        SharePreference.SELECTED_LANGUAGE,
                        activity!!.resources.getString(R.string.language_english)
                    )
                    getCurrentLanguage(activity!!, true)
                }
            }
        });



    }

    override fun onResume() {
        super.onResume()
        getCurrentLanguage(activity!!,false)
    }
}