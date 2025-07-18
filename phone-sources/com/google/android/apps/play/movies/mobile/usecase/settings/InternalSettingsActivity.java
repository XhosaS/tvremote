package com.google.android.apps.play.movies.mobile.usecase.settings;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.googletv.app.internal.MaterialActivity;
import com.google.android.apps.play.movies.mobile.presenter.activity.HomeLauncherActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity;
import com.google.android.videos.R;
import defpackage.at;
import defpackage.bv;
import defpackage.cr;
import defpackage.czi;
import defpackage.gda;
import defpackage.gdb;
import defpackage.gqz;
import defpackage.idf;
import defpackage.idr;
import defpackage.ihq;
import defpackage.krh;
import defpackage.kri;
import defpackage.krv;
import defpackage.ksa;
import defpackage.kwy;
import defpackage.leu;
import defpackage.lge;
import defpackage.lgf;
import defpackage.lgr;
import defpackage.lgx;
import defpackage.lht;
import defpackage.llu;
import defpackage.lyz;
import defpackage.mpz;
import defpackage.mqc;
import defpackage.mqd;
import defpackage.mqj;
import defpackage.mqk;
import defpackage.wae;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InternalSettingsActivity extends mqj implements xce {
    private static final String m = mqd.class.getName();
    public ExecutorService b;
    public leu c;
    public lgr d;
    public lge e;
    public lht f;
    public idf g;
    public idr h;
    public xcd i;
    public lyz j;
    public ihq k;
    public kwy l;
    private kri n;

    public static /* synthetic */ boolean $r8$lambda$3UDV8NtvxmXuCfE58csdMKvFECI(InternalSettingsActivity internalSettingsActivity, Preference preference) {
        internalSettingsActivity.b.execute(new gqz(internalSettingsActivity.j, internalSettingsActivity.c, 4, null));
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$MDAoLCL3jHhaDUlgaXw3Np8hq00(InternalSettingsActivity internalSettingsActivity, Preference preference) {
        internalSettingsActivity.startActivity(new Intent(internalSettingsActivity, (Class<?>) MaterialActivity.class));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r0.equals("STAGING") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r0.equals("DOGFOOD") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r0.equals("DONT_OVERRIDE") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r0.equals("PRODUCTION") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r0.equals("AUTOPUSH") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0.equals("DEV") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.equals("QA") != false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean $r8$lambda$PoMkj1pC2NvzB6ciPNg4TBWIYu4(com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity r0, androidx.preference.Preference r1, java.lang.Object r2) {
        /*
            java.lang.String r0 = r2.toString()
            int r1 = r0.hashCode()
            switch(r1) {
                case -2072769207: goto L42;
                case -2056856391: goto L39;
                case -1811311430: goto L30;
                case -1744822406: goto L27;
                case -1179540453: goto L1e;
                case 2576: goto L15;
                case 67573: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L4c
        Lc:
            java.lang.String r1 = "DEV"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            goto L4a
        L15:
            java.lang.String r1 = "QA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            goto L4a
        L1e:
            java.lang.String r1 = "STAGING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            goto L4a
        L27:
            java.lang.String r1 = "DOGFOOD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            goto L4a
        L30:
            java.lang.String r1 = "DONT_OVERRIDE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            goto L4a
        L39:
            java.lang.String r1 = "PRODUCTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            goto L4a
        L42:
            java.lang.String r1 = "AUTOPUSH"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
        L4a:
            r0 = 0
            throw r0
        L4c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity.$r8$lambda$PoMkj1pC2NvzB6ciPNg4TBWIYu4(com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity, androidx.preference.Preference, java.lang.Object):boolean");
    }

    public static /* synthetic */ boolean $r8$lambda$cc3OwBfE8pCD_qhNrijZNDgD7os(InternalSettingsActivity internalSettingsActivity, Preference preference) {
        lgf lgfVar = (lgf) internalSettingsActivity.e;
        SQLiteDatabase sQLiteDatabaseA = lgfVar.b.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("license_force_sync", (Integer) 1);
            sQLiteDatabaseA.update("purchased_assets", contentValues, "pinned IS NOT NULL AND pinned > 0", null);
            lgfVar.b.e(sQLiteDatabaseA, true);
            internalSettingsActivity.b.execute(new mpz(internalSettingsActivity, 2));
            return true;
        } catch (Throwable th) {
            lgfVar.b.e(sQLiteDatabaseA, true);
            throw th;
        }
    }

    /* renamed from: $r8$lambda$zID3aQwq9qFz1fkgp-vVoo7jicg, reason: not valid java name */
    public static /* synthetic */ boolean m130$r8$lambda$zID3aQwq9qFz1fkgpvVoo7jicg(InternalSettingsActivity internalSettingsActivity, Preference preference) {
        internalSettingsActivity.b.execute(new mpz(internalSettingsActivity, 3));
        return true;
    }

    public static Intent internalSettingsActivityIntent(Context context) {
        return new Intent(context, (Class<?>) InternalSettingsActivity.class);
    }

    public final void a(Activity activity) {
        this.k.a().c(new mpz(activity, 0), czi.e(this));
    }

    @Override // defpackage.xcf, defpackage.xce
    public final xby<Object> androidInjector() {
        return this.i;
    }

    @Override // defpackage.mqj
    public final void b(mqk mqkVar) {
        mqkVar.a.f(krh.DOGFOOD_NAME);
        mqkVar.c(R.xml.internal_preferences);
        mqkVar.a("environment_value").n = new gda() { // from class: mqa
            @Override // defpackage.gda
            public final void a(Preference preference, Object obj) {
                InternalSettingsActivity.$r8$lambda$PoMkj1pC2NvzB6ciPNg4TBWIYu4(this.a, preference, obj);
            }
        };
        final int i = 1;
        ((PreferenceGroup) mqkVar.a("material")).l("open_material_playground").o = new gdb(this) { // from class: mqb
            public final /* synthetic */ InternalSettingsActivity a;

            {
                this.a = this;
            }

            @Override // defpackage.gdb
            public final void ej(Preference preference) {
                int i2 = i;
                if (i2 == 0) {
                    InternalSettingsActivity.$r8$lambda$3UDV8NtvxmXuCfE58csdMKvFECI(this.a, preference);
                    return;
                }
                if (i2 == 1) {
                    InternalSettingsActivity.$r8$lambda$MDAoLCL3jHhaDUlgaXw3Np8hq00(this.a, preference);
                } else if (i2 != 2) {
                    InternalSettingsActivity.m130$r8$lambda$zID3aQwq9qFz1fkgpvVoo7jicg(this.a, preference);
                } else {
                    InternalSettingsActivity.$r8$lambda$cc3OwBfE8pCD_qhNrijZNDgD7os(this.a, preference);
                }
            }
        };
        PreferenceGroup preferenceGroup = (PreferenceGroup) mqkVar.a("in_app_drm");
        CheckBoxPreference checkBoxPreference = new CheckBoxPreference(this, null);
        checkBoxPreference.t = "prefer_in_app_drm_player_streaming";
        if (checkBoxPreference.w && !checkBoxPreference.K()) {
            if (TextUtils.isEmpty(checkBoxPreference.t)) {
                throw new IllegalStateException("Preference does not have a key assigned.");
            }
            checkBoxPreference.w = true;
        }
        checkBoxPreference.G("Use In-App Drm Player for streaming (SD only).");
        final int i2 = 0;
        checkBoxPreference.y = false;
        checkBoxPreference.n("NOTE: You will not be able to play Offline Videos in this mode.");
        preferenceGroup.T(checkBoxPreference);
        mqkVar.a("clear_asset_cache").o = new gdb(this) { // from class: mqb
            public final /* synthetic */ InternalSettingsActivity a;

            {
                this.a = this;
            }

            @Override // defpackage.gdb
            public final void ej(Preference preference) {
                int i22 = i2;
                if (i22 == 0) {
                    InternalSettingsActivity.$r8$lambda$3UDV8NtvxmXuCfE58csdMKvFECI(this.a, preference);
                    return;
                }
                if (i22 == 1) {
                    InternalSettingsActivity.$r8$lambda$MDAoLCL3jHhaDUlgaXw3Np8hq00(this.a, preference);
                } else if (i22 != 2) {
                    InternalSettingsActivity.m130$r8$lambda$zID3aQwq9qFz1fkgpvVoo7jicg(this.a, preference);
                } else {
                    InternalSettingsActivity.$r8$lambda$cc3OwBfE8pCD_qhNrijZNDgD7os(this.a, preference);
                }
            }
        };
        final int i3 = 2;
        mqkVar.a("force_refresh_license").o = new gdb(this) { // from class: mqb
            public final /* synthetic */ InternalSettingsActivity a;

            {
                this.a = this;
            }

            @Override // defpackage.gdb
            public final void ej(Preference preference) {
                int i22 = i3;
                if (i22 == 0) {
                    InternalSettingsActivity.$r8$lambda$3UDV8NtvxmXuCfE58csdMKvFECI(this.a, preference);
                    return;
                }
                if (i22 == 1) {
                    InternalSettingsActivity.$r8$lambda$MDAoLCL3jHhaDUlgaXw3Np8hq00(this.a, preference);
                } else if (i22 != 2) {
                    InternalSettingsActivity.m130$r8$lambda$zID3aQwq9qFz1fkgpvVoo7jicg(this.a, preference);
                } else {
                    InternalSettingsActivity.$r8$lambda$cc3OwBfE8pCD_qhNrijZNDgD7os(this.a, preference);
                }
            }
        };
        final int i4 = 3;
        mqkVar.a("rebuild_app_index").o = new gdb(this) { // from class: mqb
            public final /* synthetic */ InternalSettingsActivity a;

            {
                this.a = this;
            }

            @Override // defpackage.gdb
            public final void ej(Preference preference) {
                int i22 = i4;
                if (i22 == 0) {
                    InternalSettingsActivity.$r8$lambda$3UDV8NtvxmXuCfE58csdMKvFECI(this.a, preference);
                    return;
                }
                if (i22 == 1) {
                    InternalSettingsActivity.$r8$lambda$MDAoLCL3jHhaDUlgaXw3Np8hq00(this.a, preference);
                } else if (i22 != 2) {
                    InternalSettingsActivity.m130$r8$lambda$zID3aQwq9qFz1fkgpvVoo7jicg(this.a, preference);
                } else {
                    InternalSettingsActivity.$r8$lambda$cc3OwBfE8pCD_qhNrijZNDgD7os(this.a, preference);
                }
            }
        };
    }

    @Override // defpackage.mqj, defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        mqd mqdVar;
        ViewGroup viewGroup;
        wae.y(this);
        super.onCreate(bundle);
        cr supportFragmentManager = getSupportFragmentManager();
        String str = m;
        bv bvVarF = supportFragmentManager.f(str);
        if (bvVarF instanceof mqd) {
            mqdVar = (mqd) bvVarF;
        } else {
            mqdVar = new mqd();
            at atVar = new at(supportFragmentManager);
            atVar.r(mqdVar, str);
            atVar.a();
        }
        this.h = mqdVar.a;
        this.g = new llu(getResources());
        this.n = ksa.c(krv.c(this.h, new lgx(this, 10)));
        getOnBackPressedDispatcher().a(new mqc(this, this));
        if (getSupportActionBar() != null || (viewGroup = (ViewGroup) findViewById(R.id.action_bar_root)) == null) {
            return;
        }
        viewGroup.addView(getLayoutInflater().inflate(R.layout.app_bar_layout_settings, viewGroup, false), 0);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
    }

    @Override // defpackage.mqj, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            HomeLauncherActivity.restartAppStartingWithHomeLauncherActivity(this);
            a(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStart() {
        super.onStart();
        this.n.a();
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.n.b();
    }
}
