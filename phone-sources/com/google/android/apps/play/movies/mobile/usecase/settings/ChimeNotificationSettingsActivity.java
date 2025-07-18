package com.google.android.apps.play.movies.mobile.usecase.settings;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.google.common.collect.ImmutableList;
import defpackage.a;
import defpackage.at;
import defpackage.cr;
import defpackage.csl;
import defpackage.cwm;
import defpackage.cwn;
import defpackage.cww;
import defpackage.czn;
import defpackage.gda;
import defpackage.iea;
import defpackage.ieg;
import defpackage.iom;
import defpackage.jat;
import defpackage.jau;
import defpackage.krd;
import defpackage.krh;
import defpackage.ksn;
import defpackage.kuw;
import defpackage.ldy;
import defpackage.lie;
import defpackage.mem;
import defpackage.mqh;
import defpackage.mqi;
import defpackage.mqj;
import defpackage.mqk;
import defpackage.mwm;
import defpackage.th;
import defpackage.vtw;
import defpackage.vuc;
import defpackage.wnl;
import defpackage.yih;
import defpackage.ykr;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChimeNotificationSettingsActivity extends mqj implements gda, mqh {
    public lie b;
    public iea c;
    public mem d;
    public iom e;
    public kuw f;
    private mqk g;

    private final ieg e() {
        return ((ldy) this.c).a();
    }

    private final void f() {
        cr supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.e(R.id.content) == null) {
            mqi mqiVar = new mqi();
            Bundle bundle = new Bundle();
            bundle.putString("error_code", "NetworkError");
            bundle.putString("error_text", "Network Issues have forced us offline");
            bundle.putString("error_action_button_text", "Retry");
            mqiVar.setArguments(bundle);
            at atVar = new at(supportFragmentManager);
            atVar.w(R.id.content, mqiVar);
            atVar.a();
        }
    }

    private final void g(mqk mqkVar, int i) {
        Preference preferenceA = mqkVar.a(getString(i));
        if (preferenceA != null) {
            preferenceA.n = this;
        }
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, yow] */
    @Override // defpackage.gda
    public final void a(Preference preference, Object obj) {
        this.b.aa(preference.t, obj);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!preference.t.contains("GOOGLE_TV_MOBILE_")) {
            kuw kuwVar = this.f;
            String str = ((ksn) e().g()).a;
            ImmutableList immutableListOf = ImmutableList.of(new jat(preference.t, true != zBooleanValue ? 2 : 3));
            immutableListOf.getClass();
            ykr.q(kuwVar.a, null, 0, new jau(immutableListOf, kuwVar, str, this, null, 0), 3);
            return;
        }
        vtw vtwVarM = wnl.a.m();
        String str2 = preference.t;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        str2.getClass();
        ((wnl) vucVar).b = str2;
        int i = true != zBooleanValue ? 4 : 3;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((wnl) vtwVarM.b).c = a.aF(i);
        this.e.b(ImmutableList.of((wnl) vtwVarM.r()), false);
    }

    @Override // defpackage.mqj
    public final void b(mqk mqkVar) {
        if (!this.d.d()) {
            f();
            return;
        }
        this.g = mqkVar;
        mqkVar.a.f(krh.SHARED_NAME);
        this.g.c(com.google.android.videos.R.xml.chime_notification_preferences);
        g(this.g, com.google.android.videos.R.string.gtv_mobile_offers_preference_key);
        g(this.g, com.google.android.videos.R.string.gtv_mobile_recommendations_preference_key);
        g(this.g, com.google.android.videos.R.string.gtv_mobile_feedback_preference_key);
        g(this.g, com.google.android.videos.R.string.chime_library_notification_preference_key);
        g(this.g, com.google.android.videos.R.string.chime_watch_reminders_notification_preference_key);
        g(this.g, com.google.android.videos.R.string.chime_product_updates_notification_preference_key);
        g(this.g, com.google.android.videos.R.string.chime_available_to_buy_or_rent_notification_preference_key);
        g(this.g, com.google.android.videos.R.string.price_drops_notification_preference_key);
        g(this.g, com.google.android.videos.R.string.deals_notification_preference_key);
        g(this.g, com.google.android.videos.R.string.movie_and_show_recommendations_notification_preference_key);
        g(this.g, com.google.android.videos.R.string.movie_available_to_watch_free_notification_preference_key);
        g(this.g, com.google.android.videos.R.string.new_in_google_tv_notification_preference_key);
    }

    public final void c(String str, int i) {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.g.a(str);
        if (checkBoxPreference != null) {
            runOnUiThread(new csl(checkBoxPreference, i, 9));
        }
    }

    @Override // defpackage.mqh
    public final void d(String str) {
        if (Objects.equals(str, "NetworkError")) {
            krd.e(String.format("Handling %s: Restarting activity.", str));
            startActivity(getIntent());
        } else {
            krd.e(String.format("Handling %s: Closing activity.", str));
        }
        finish();
    }

    @Override // defpackage.by, defpackage.fl, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 35) {
            startActivity(getIntent());
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yow] */
    @Override // defpackage.mqj, defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        cwn.c(window, false);
        View decorView = window.getDecorView();
        czn cznVar = new czn(decorView, 13);
        int[] iArr = cww.a;
        cwm.l(decorView, cznVar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            String string = getString(com.google.android.videos.R.string.notification_settings_title_string);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new mwm(this, com.google.android.videos.R.style.TextStyle_Movies_ActionBar), 0, string.length(), 33);
            supportActionBar.setTitle(spannableString);
            supportActionBar.setHomeAsUpIndicator(com.google.android.videos.R.drawable.ic_arrow_back_24dp);
        } else {
            ViewGroup viewGroup = (ViewGroup) findViewById(com.google.android.videos.R.id.action_bar_root);
            if (viewGroup != null) {
                viewGroup.addView(getLayoutInflater().inflate(com.google.android.videos.R.layout.app_bar_layout_settings, viewGroup, false), 0);
                setSupportActionBar((Toolbar) findViewById(com.google.android.videos.R.id.toolbar));
                getSupportActionBar().setTitle(com.google.android.videos.R.string.notification_settings_title_string);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setHomeAsUpIndicator(com.google.android.videos.R.drawable.ic_arrow_back_24dp);
            }
        }
        if (this.d.d()) {
            iom iomVar = this.e;
            ArrayList arrayList = new ArrayList();
            arrayList.add(getString(com.google.android.videos.R.string.gtv_mobile_offers_preference_key));
            arrayList.add(getString(com.google.android.videos.R.string.gtv_mobile_recommendations_preference_key));
            arrayList.add(getString(com.google.android.videos.R.string.gtv_mobile_feedback_preference_key));
            ykr.q(iomVar.c, null, 0, new th(iomVar, arrayList, this, (yih) null, 18), 3);
        } else {
            f();
        }
        kuw kuwVar = this.f;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getString(com.google.android.videos.R.string.gtv_mobile_offers_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.gtv_mobile_recommendations_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.gtv_mobile_feedback_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.movie_available_to_watch_free_notification_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.new_in_google_tv_notification_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.chime_library_notification_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.chime_watch_reminders_notification_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.chime_product_updates_notification_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.chime_available_to_buy_or_rent_notification_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.price_drops_notification_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.movie_and_show_recommendations_notification_preference_key));
        arrayList2.add(getString(com.google.android.videos.R.string.deals_notification_preference_key));
        ykr.q(kuwVar.a, null, 0, new jau(arrayList2, kuwVar, ((ksn) e().g()).a, this, null, 1, null), 3);
    }
}
