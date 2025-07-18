package com.google.android.apps.play.movies.mobile.usecase.settings;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.SpannableString;
import android.widget.Toast;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.google.android.videos.R;
import defpackage.gda;
import defpackage.iea;
import defpackage.ieg;
import defpackage.iei;
import defpackage.krh;
import defpackage.krn;
import defpackage.ksk;
import defpackage.ksn;
import defpackage.ldy;
import defpackage.lie;
import defpackage.lkt;
import defpackage.lua;
import defpackage.luc;
import defpackage.lud;
import defpackage.mjo;
import defpackage.mpz;
import defpackage.mqj;
import defpackage.mqk;
import defpackage.mwm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationSettingsActivity extends mqj implements gda {
    public lie b;
    public iea c;
    public Toast d;
    public final Runnable e = new mpz(this, 4);
    public lkt f;
    private mqk g;

    /* renamed from: $r8$lambda$ImF4z-PejCeh96x5fboquoQFJ-A, reason: not valid java name */
    public static /* synthetic */ void m131$r8$lambda$ImF4zPejCeh96x5fboquoQFJA(NotificationSettingsActivity notificationSettingsActivity) throws Resources.NotFoundException {
        notificationSettingsActivity.d();
        Toast toastMakeText = Toast.makeText(notificationSettingsActivity, R.string.setting_saving, 1);
        notificationSettingsActivity.d = toastMakeText;
        toastMakeText.show();
    }

    private final void g(mqk mqkVar, int i) {
        Preference preferenceA = mqkVar.a(getString(i));
        if (preferenceA != null) {
            preferenceA.n = this;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gda
    public final void a(Preference preference, Object obj) {
        this.b.aa(preference.t, obj);
        String str = preference.t;
        int i = 5;
        int i2 = str.equals(getString(R.string.deals_for_you_notification_preference_key)) ? 4 : str.equals(getString(R.string.product_updates_notification_preference_key)) ? 5 : str.equals(getString(R.string.library_notification_preference_key)) ? 1 : str.equals(getString(R.string.new_to_your_service_notification_preference_key)) ? 7 : str.equals(getString(R.string.movies_and_show_recommendations_notification_preference_key)) ? 3 : str.equals(getString(R.string.available_to_buy_or_rent_notification_preference_key)) ? 10 : str.equals(getString(R.string.available_to_watch_free_notification_preference_key)) ? 9 : str.equals(getString(R.string.price_drop_notification_preference_key)) ? 8 : str.equals(getString(R.string.watch_reminders_notification_preference_key)) ? 6 : 0;
        if (i2 != 0) {
            this.f.e((ksn) c().g(), i2, ((Boolean) obj).booleanValue());
            lkt lktVar = this.f;
            ksn ksnVar = (ksn) c().g();
            for (NotificationSettingsActivity notificationSettingsActivity : lktVar.c) {
                Runnable runnable = notificationSettingsActivity.e;
                ksk.i(runnable);
                notificationSettingsActivity.d();
                ksk.h(runnable, 100L);
            }
            lktVar.d(ksnVar, i2, System.currentTimeMillis() / 1000);
            lud ludVar = new lud(ksnVar, new luc(i2, lktVar.g(ksnVar, i2)));
            mjo.e(krh.b(new krn(lktVar, ludVar, i, null)), new iei(lktVar.d, ludVar), lktVar.a);
        }
    }

    @Override // defpackage.mqj
    public final void b(mqk mqkVar) {
        this.g = mqkVar;
        mqkVar.a.f(krh.SHARED_NAME);
        this.g.c(R.xml.notification_preferences);
        g(this.g, R.string.library_notification_preference_key);
        g(this.g, R.string.watch_reminders_notification_preference_key);
        g(this.g, R.string.product_updates_notification_preference_key);
        g(this.g, R.string.available_to_buy_or_rent_notification_preference_key);
        g(this.g, R.string.price_drop_notification_preference_key);
        g(this.g, R.string.available_to_watch_free_notification_preference_key);
        g(this.g, R.string.new_to_your_service_notification_preference_key);
        g(this.g, R.string.movies_and_show_recommendations_notification_preference_key);
        g(this.g, R.string.deals_for_you_notification_preference_key);
        e();
    }

    public final ieg c() {
        return ((ldy) this.c).a();
    }

    public final void d() {
        Toast toast = this.d;
        if (toast != null) {
            toast.cancel();
            this.d = null;
        }
    }

    public final void e() {
        f(1);
        f(3);
        f(4);
        f(5);
        f(6);
        f(7);
        f(8);
        f(9);
        f(10);
    }

    public final void f(int i) {
        String string;
        CheckBoxPreference checkBoxPreference;
        switch (i) {
            case 1:
                string = getString(R.string.library_notification_preference_key);
                break;
            case 2:
            default:
                string = null;
                break;
            case 3:
                string = getString(R.string.movies_and_show_recommendations_notification_preference_key);
                break;
            case 4:
                string = getString(R.string.deals_for_you_notification_preference_key);
                break;
            case 5:
                string = getString(R.string.product_updates_notification_preference_key);
                break;
            case 6:
                string = getString(R.string.watch_reminders_notification_preference_key);
                break;
            case 7:
                string = getString(R.string.new_to_your_service_notification_preference_key);
                break;
            case 8:
                string = getString(R.string.price_drop_notification_preference_key);
                break;
            case 9:
                string = getString(R.string.available_to_watch_free_notification_preference_key);
                break;
            case 10:
                string = getString(R.string.available_to_buy_or_rent_notification_preference_key);
                break;
        }
        if (string == null || (checkBoxPreference = (CheckBoxPreference) this.g.a(string)) == null) {
            return;
        }
        checkBoxPreference.k(this.f.g((ksn) c().g(), i));
    }

    @Override // defpackage.mqj, defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            String string = getString(R.string.notification_settings_title_string);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new mwm(this, R.style.TextStyle_Movies_ActionBar), 0, string.length(), 33);
            supportActionBar.setTitle(spannableString);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        this.f.c.remove(this);
        ksk.i(this.e);
        d();
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v1, types: [idf, java.lang.Object] */
    @Override // defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.f.c.add(this);
        if (c().m()) {
            lkt lktVar = this.f;
            ksn ksnVar = (ksn) c().g();
            mjo.e(new krn(lktVar, ksnVar, 6, null), new iei(lktVar.b, new lua(ksnVar)), lktVar.a);
        }
    }
}
