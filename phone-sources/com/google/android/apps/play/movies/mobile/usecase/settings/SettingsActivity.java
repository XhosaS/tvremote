package com.google.android.apps.play.movies.mobile.usecase.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.play.movies.common.presenter.activity.GmsErrorActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.cwm;
import defpackage.cwn;
import defpackage.cww;
import defpackage.gda;
import defpackage.gdb;
import defpackage.gqz;
import defpackage.hjt;
import defpackage.idf;
import defpackage.ids;
import defpackage.idy;
import defpackage.iea;
import defpackage.ieg;
import defpackage.iej;
import defpackage.iod;
import defpackage.isi;
import defpackage.jbr;
import defpackage.kdw;
import defpackage.kfw;
import defpackage.krd;
import defpackage.krh;
import defpackage.ksk;
import defpackage.ksn;
import defpackage.kwy;
import defpackage.ldy;
import defpackage.lfz;
import defpackage.lgx;
import defpackage.lid;
import defpackage.lie;
import defpackage.llu;
import defpackage.ltp;
import defpackage.lxc;
import defpackage.lys;
import defpackage.lzi;
import defpackage.mem;
import defpackage.mnu;
import defpackage.mpz;
import defpackage.mqf;
import defpackage.mqg;
import defpackage.mqj;
import defpackage.mqk;
import defpackage.mwm;
import defpackage.rmp;
import defpackage.rmr;
import defpackage.wae;
import defpackage.wkc;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import defpackage.xid;
import defpackage.xjq;
import defpackage.xke;
import defpackage.xmg;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SettingsActivity extends mqj implements gda, gdb, iej, xce {
    private PreferenceCategory A;
    private Preference B;
    private Preference C;
    private Preference D;
    private Preference E;
    private Preference F;
    private ids G;
    private Toast H;
    private idf I;
    private lid J;
    public SharedPreferences b;
    public lie c;
    public lzi d;
    public mem e;
    public lxc f;
    public Executor g;
    public iea h;
    public xmg i;
    public xid j;
    public xjq k;
    public xke l;
    public Dialog m;
    public xcd n;
    public lys o;
    public isi p;
    public lfz q;
    public ltp r;
    public kwy s;
    private PreferenceScreen w;
    private ListPreference x;
    private ListPreference y;
    private ListPreference z;
    private final idy u = new lgx(this, 11);
    private ieg v = ieg.a;
    private final Runnable K = new mpz(this, 5);

    public static /* synthetic */ void $r8$lambda$mTc08jOlsb6DT86j3UkxYtxZdi8(SettingsActivity settingsActivity) throws Resources.NotFoundException {
        settingsActivity.h();
        Toast toastMakeText = Toast.makeText(settingsActivity, R.string.setting_saving, 1);
        settingsActivity.H = toastMakeText;
        toastMakeText.show();
    }

    public static Intent createIntent(Context context) {
        return new Intent(context, (Class<?>) SettingsActivity.class);
    }

    private static Preference f(Preference preference, String str, boolean z, PreferenceGroup preferenceGroup) {
        if (!z) {
            if (preference == null) {
                return null;
            }
            preferenceGroup.T(preference);
            return null;
        }
        if (preference != null) {
            return preference;
        }
        Preference preferenceL = preferenceGroup.l(str);
        preferenceGroup.U(preferenceL);
        return preferenceL;
    }

    private final String g() {
        String string;
        String string2;
        iod iodVar = this.p.i;
        if (!iodVar.t) {
            return getString(R.string.pref_content_filtering_title_with_status, new Object[]{iodVar.s ? getString(R.string.menu_family_library_on) : getString(R.string.menu_family_library_off)});
        }
        wkc wkcVar = iodVar.p;
        if (wkcVar == null) {
            wkcVar = wkc.a;
        }
        if (wkcVar.c.isEmpty()) {
            string = getString(R.string.allow_all_settings_title);
        } else {
            wkc wkcVar2 = this.p.i.p;
            if (wkcVar2 == null) {
                wkcVar2 = wkc.a;
            }
            string = wkcVar2.c;
        }
        wkc wkcVar3 = this.p.i.q;
        if (wkcVar3 == null) {
            wkcVar3 = wkc.a;
        }
        if (wkcVar3.c.isEmpty()) {
            string2 = getString(R.string.allow_all_settings_title);
        } else {
            wkc wkcVar4 = this.p.i.q;
            if (wkcVar4 == null) {
                wkcVar4 = wkc.a;
            }
            string2 = wkcVar4.c;
        }
        return getString(R.string.parental_controls_settings_title_kids, new Object[]{string, string2});
    }

    private final void h() {
        Toast toast = this.H;
        if (toast != null) {
            toast.cancel();
            this.H = null;
        }
    }

    private final void i(int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.disconnect_account_dialog_title);
        builder.setMessage(R.string.disconnect_account_dialog_message);
        builder.setPositiveButton(R.string.disconnect_btn, new mqf(this, i, (ksn) this.v.g(), this.o, this.u, this.I, this.s, this.r, this.g));
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    private final void k() {
        this.F.G(g());
        this.w.T(this.F);
        this.w.U(this.E);
    }

    public static Intent settingsActivityScrollToNotificationsIntent(Context context) {
        return createIntent(context).addCategory("android.intent.category.NOTIFICATION_PREFERENCES");
    }

    @Override // defpackage.gda
    public final void a(Preference preference, Object obj) {
        this.c.aa(preference.t, obj);
        if (preference == this.y || preference == this.x || preference == this.z) {
            ListPreference listPreference = (ListPreference) preference;
            listPreference.n(listPreference.g[listPreference.k((String) obj)]);
        }
        if (preference.t.equals(krh.ENABLE_VIRTUAL_REMOTE_FAB)) {
            krh.setVirtualRemoteFabEnabledInPreferences(this.b, ((Boolean) obj).booleanValue());
        }
    }

    @Override // defpackage.xcf, defpackage.xce
    public final xby<Object> androidInjector() {
        return this.n;
    }

    @Override // defpackage.mqj
    public final void b(mqk mqkVar) {
        int length;
        mqkVar.e = new mnu();
        mqkVar.a.f(krh.SHARED_NAME);
        mqkVar.c(R.xml.preferences);
        boolean zC = this.e.c();
        this.w = mqkVar.b();
        PreferenceCategory preferenceCategory = (PreferenceCategory) mqkVar.a(krh.NOTIFICATIONS_CATEGORY);
        if (this.k.b() || (this.j.a() && this.t.cL())) {
            preferenceCategory.U(mqkVar.a("update_notification_preference"));
            preferenceCategory.U(mqkVar.a("update_gnp_notification_preference"));
        } else {
            preferenceCategory.U(mqkVar.a("update_chime_notification_preference"));
            preferenceCategory.U(mqkVar.a("update_gnp_notification_preference"));
        }
        Preference preferenceA = mqkVar.a(krh.WARNING_STREAMING_BANDWIDTH);
        Preference preferenceA2 = mqkVar.a(krh.ADAPTIVE_DISABLE_HD_ON_MOBILE_NETWORK);
        Preference preferenceA3 = mqkVar.a(krh.MOBILE_NETWORK_STREAMING_CATEGORY);
        if (zC) {
            preferenceA.n = this;
            if (this.t.ag(((WindowManager) getSystemService("window")).getDefaultDisplay()) < 720) {
                this.w.U(preferenceA2);
            } else {
                preferenceA2.n = this;
            }
        } else {
            this.w.U(preferenceA);
            this.w.U(preferenceA2);
            this.w.U(preferenceA3);
        }
        boolean z = true;
        boolean z2 = !this.t.bK() || this.d.b().size() <= 1;
        boolean z3 = (this.t.bK() && zC) ? false : true;
        File[] fileArrP = kfw.P(this);
        if (!this.t.bK() || (length = fileArrP.length) <= 1) {
            PreferenceScreen preferenceScreen = this.w;
            preferenceScreen.U(preferenceScreen.l(krh.DOWNLOAD_STORAGE));
            z = false;
        } else {
            if (length > 2) {
                krd.f("Skipped storage options: don't know how to map external storage device to the user.");
            }
            CharSequence[] charSequenceArr = {getString(R.string.primary_storage), getString(R.string.sd_card)};
            ListPreference listPreference = (ListPreference) this.w.l(krh.DOWNLOAD_STORAGE);
            this.z = listPreference;
            listPreference.e(charSequenceArr);
            ListPreference listPreference2 = this.z;
            listPreference2.h = new CharSequence[]{"0", "1"};
            listPreference2.f(kfw.K(this.b));
            ListPreference listPreference3 = this.z;
            listPreference3.n(listPreference3.l());
            this.z.n = this;
        }
        if (this.l.b()) {
            this.w.U(mqkVar.a(krh.MANAGE_DOWNLOADS));
        }
        if (z2) {
            this.w.U(mqkVar.a(krh.DOWNLOAD_QUALITY));
        } else {
            ListPreference listPreference4 = (ListPreference) mqkVar.a(krh.DOWNLOAD_QUALITY);
            this.x = listPreference4;
            listPreference4.n(listPreference4.l());
            this.x.n = this;
        }
        if (z3) {
            this.w.U(mqkVar.a(krh.DOWNLOAD_NETWORK));
            if (z2 && !z) {
                this.w.U(mqkVar.a(krh.DOWNLOAD_CATEGORY));
            }
        } else {
            this.y = (ListPreference) mqkVar.a(krh.DOWNLOAD_NETWORK);
            kdw.z(this.e.f(), this.b);
            String[] stringArray = (this.i.b() && kdw.A(this.b)) ? getResources().getStringArray(R.array.download_network_entries_v2) : getResources().getStringArray(R.array.download_network_entries);
            String[] stringArray2 = (this.i.b() && kdw.A(this.b)) ? getResources().getStringArray(R.array.download_network_values_v2) : getResources().getStringArray(R.array.download_network_values);
            this.y.e(stringArray);
            ListPreference listPreference5 = this.y;
            listPreference5.h = stringArray2;
            if (listPreference5.i == null) {
                listPreference5.o(stringArray2[0].toString());
            }
            ListPreference listPreference6 = this.y;
            listPreference6.n(listPreference6.l());
            this.y.n = this;
        }
        Preference preferenceA4 = mqkVar.a(krh.ENABLE_SURROUND_SOUND);
        if (!this.t.bM()) {
            this.w.U(preferenceA4);
            this.w.U(mqkVar.a(krh.SURROUND_SOUND_CATEGORY));
        }
        Preference preferenceA5 = mqkVar.a(krh.ENABLE_BINGE_WATCHING);
        if (!this.t.bR()) {
            this.w.U(preferenceA5);
        }
        mqkVar.a(krh.GSERVICES_ID).n(String.valueOf(this.t.aJ()));
        mqkVar.a(krh.DEVICE_SUMMARY).n(Build.MANUFACTURER + ", " + Build.MODEL);
        mqkVar.a(krh.OPEN_SOURCE_LICENSES).o = this;
        Preference preferenceA6 = mqkVar.a(krh.CONTENT_FILTERING_SETTINGS);
        this.E = preferenceA6;
        preferenceA6.o = this;
        Preference preferenceA7 = mqkVar.a(krh.CONTENT_FILTERING_SETTINGS_V2);
        this.F = preferenceA7;
        preferenceA7.G(g());
        this.F.o = this;
        this.w.U(this.E);
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) mqkVar.a(krh.CONNECTED_ACCOUNTS_CATEGORY);
        this.A = preferenceCategory2;
        Preference preferenceL = preferenceCategory2.l(krh.DMA_UNLINK_ACCOUNT);
        this.B = preferenceL;
        preferenceL.o = this;
        Preference preferenceL2 = this.A.l(krh.MOVIES_ANYWHERE_UNLINK_ACCOUNT);
        this.C = preferenceL2;
        preferenceL2.o = this;
        this.A.U(this.B);
        this.A.U(this.C);
        this.w.U(this.A);
        this.D = mqkVar.a(krh.VERSION);
        e();
        ListView listView = (ListView) findViewById(android.R.id.list);
        Intent intent = getIntent();
        if (listView != null && zC && "android.intent.action.MANAGE_NETWORK_USAGE".equals(intent.getAction())) {
            intent.setAction("android.intent.action.VIEW");
            ksk.g(new gqz(listView, preferenceA3, 7));
        }
    }

    public final void c() {
        Dialog dialog = this.m;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.m.dismiss();
        this.m = null;
    }

    @Override // defpackage.iej
    public final void dM() {
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.preference.PreferenceGroup] */
    public final void e() {
        boolean zN = this.o.n(this.v, 3);
        boolean zN2 = this.o.n(this.v, 5);
        PreferenceCategory preferenceCategory = this.A;
        boolean z = false;
        if (!zN && !zN2) {
            z = true;
        }
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) f(preferenceCategory, krh.CONNECTED_ACCOUNTS_CATEGORY, z, this.w);
        this.A = preferenceCategory2;
        PreferenceCategory preferenceCategory3 = preferenceCategory2;
        if (preferenceCategory2 == null) {
            preferenceCategory3 = (PreferenceGroup) this.w.l(krh.CONNECTED_ACCOUNTS_CATEGORY);
        }
        this.B = f(this.B, krh.DMA_UNLINK_ACCOUNT, !zN, preferenceCategory3);
        this.C = f(this.C, krh.MOVIES_ANYWHERE_UNLINK_ACCOUNT, !zN2, preferenceCategory3);
        Preference preference = this.D;
        lxc lxcVar = this.f;
        boolean zM = this.v.m();
        String strBh = this.t.bh();
        String str = " [" + strBh + "]";
        String strCg = zM ? a.cg(this.o.c(this.v), " [", "]") : "";
        preference.n(lxcVar.a + str + strCg);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // defpackage.gdb
    public final void ej(Preference preference) {
        String str = preference.t;
        switch (str.hashCode()) {
            case -1431958147:
                if (str.equals(krh.CONTENT_FILTERING_SETTINGS_V2)) {
                    startActivity(jbr.S(this));
                    break;
                }
                break;
            case 358502622:
                if (str.equals(krh.CONTENT_FILTERING_SETTINGS)) {
                    this.q.j();
                    break;
                }
                break;
            case 804688424:
                if (str.equals(krh.DMA_UNLINK_ACCOUNT)) {
                    i(0);
                    break;
                }
                break;
            case 1074553857:
                if (str.equals(krh.OPEN_SOURCE_LICENSES)) {
                    startActivity(new Intent(this, (Class<?>) LicenseMenuActivity.class));
                    break;
                }
                break;
            case 2095562057:
                if (str.equals(krh.MOVIES_ANYWHERE_UNLINK_ACCOUNT)) {
                    i(1);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mqj, defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wae.y(this);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 30) {
            cwn.c(getWindow(), false);
            getWindow().setNavigationBarColor(0);
        }
        if (GmsErrorActivity.startIfNecessary(this)) {
            finish();
            return;
        }
        this.J = lid.b(getIntent());
        this.v = ((ldy) this.h).a();
        this.I = new llu(getResources());
        if (this.v.m()) {
            this.o.f((ksn) this.v.g(), krh.b(this.u));
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            String string = getString(R.string.settings_title);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new mwm(this, R.style.TextStyle_Movies_ActionBar), 0, string.length(), 33);
            supportActionBar.setTitle(spannableString);
            supportActionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
        } else {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_bar_root);
            if (viewGroup != null) {
                viewGroup.addView(getLayoutInflater().inflate(R.layout.app_bar_layout_settings, viewGroup, false), 0);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
                mqg mqgVar = new mqg(2);
                int[] iArr = cww.a;
                cwm.l(toolbar, mqgVar);
            }
        }
        this.G = hjt.d(this.q.c(), this.e);
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        ksk.i(this.K);
        h();
        super.onPause();
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.c.af(this.J);
        rmr.a().d(new rmp("SettingsOnResume"));
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStart() {
        super.onStart();
        this.G.ea(this);
        k();
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.G.ee(this);
    }
}
