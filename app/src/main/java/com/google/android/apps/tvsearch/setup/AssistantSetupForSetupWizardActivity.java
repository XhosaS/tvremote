package com.google.android.apps.tvsearch.setup;

import android.accounts.Account;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import com.google.android.katniss.R;
import defpackage.adzk;
import defpackage.agow;
import defpackage.gph;
import defpackage.idj;
import defpackage.igg;
import defpackage.ihk;
import defpackage.iht;
import defpackage.iot;
import defpackage.ipg;
import defpackage.iqk;
import defpackage.irm;
import defpackage.rbl;
import defpackage.zdv;
import defpackage.zdy;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AssistantSetupForSetupWizardActivity extends igg {
    private static final zdy bo = zdy.h("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity");
    private static final Duration bp = Duration.ofSeconds(50);
    private static final Duration bq = Duration.ofSeconds(4);
    public agow bh;
    public Context bi;
    public ConnectivityManager bj;
    public Boolean bk;
    public Supplier bl;
    public ipg bm;
    boolean bn = false;

    private final int au(int i) {
        return i == 1 ? !av() ? 0 : -1 : i;
    }

    private final boolean av() {
        Intent intent = getIntent();
        return intent == null || intent.getBooleanExtra("movingForward", true);
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final int C() {
        return R.raw.setup_vp_animation_watson_black;
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final Bundle F() {
        Bundle bundleF = super.F();
        iot iotVar = iot.a;
        String strB = iotVar.b(getIntent());
        if (!TextUtils.isEmpty(strB)) {
            bundleF.putString("hotword_description_appendage", strB);
        }
        Uri uriA = iotVar.a(getIntent());
        if (uriA != null) {
            bundleF.putParcelable("hotword_graphic_uri", uriA);
        }
        return bundleF;
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final Duration L() {
        return bp;
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final void O() {
        setResult(au(0), new Intent().putExtra("user_initiated", true));
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01c0  */
    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.setup.AssistantSetupForSetupWizardActivity.Q():void");
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final void R() {
        this.aJ.ifPresent(new Consumer() { // from class: ifu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.a.aa.G((Boolean) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        JobScheduler jobScheduler = this.J;
        zdy zdyVar = iqk.a;
        Account account = this.bn ? this.aO : null;
        boolean z = this.aU;
        PersistableBundle persistableBundle = new PersistableBundle();
        if (account != null) {
            persistableBundle.putString("accountType", account.type);
            persistableBundle.putString("authAccount", account.name);
        }
        persistableBundle.putBoolean("skip_legacy_linking", z);
        ComponentName componentName = irm.a;
        JobInfo jobInfoBuild = new JobInfo.Builder(16, irm.h).setRequiredNetworkType(1).setExtras(persistableBundle).build();
        jobInfoBuild.getClass();
        jobScheduler.schedule(jobInfoBuild);
        this.av = true;
        this.au = true;
        this.az = true;
        P();
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final void S(boolean z, adzk adzkVar) {
        super.S(z, adzkVar);
        this.aa.v(this.aO, this.bn);
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final void U(boolean z) {
        super.U(z);
        this.aa.v(this.aO, this.bn);
        if (this.F == gph.b || this.F == gph.c) {
            ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "shouldLaunchHomeGraphSetup", 356, "AssistantSetupForSetupWizardActivity.java")).u("Not launching HG setup on non-Amati.");
            return;
        }
        if (!this.aU) {
            if (!((Boolean) this.bh.a()).booleanValue()) {
                ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "shouldLaunchHomeGraphSetup", 363, "AssistantSetupForSetupWizardActivity.java")).u("Not launching HG setup when Mendel flag is OFF.");
                return;
            }
            if (this.aa.N(this.aO)) {
                ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "shouldLaunchHomeGraphSetup", 366, "AssistantSetupForSetupWizardActivity.java")).u("Not launching HG setup when Assistant Settings have been initialized.");
                return;
            }
            if (Settings.Secure.getInt(this.bi.getContentResolver(), "user_setup_complete", 0) != 0) {
                ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "shouldLaunchHomeGraphSetup", 370, "AssistantSetupForSetupWizardActivity.java")).u("Not launching HG setup from non-1S OOBE");
                return;
            }
            if (this.aa.e(this.aO) == idj.c && !((Boolean) this.A.a()).booleanValue()) {
                ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "shouldLaunchHomeGraphSetup", 374, "AssistantSetupForSetupWizardActivity.java")).u("Not launching HG setup when cast linking was skipped due to user denying UDC permission.");
                return;
            } else {
                if (getIntent().hasExtra("choobe_entry_point")) {
                    ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "shouldLaunchHomeGraphSetup", 379, "AssistantSetupForSetupWizardActivity.java")).u("Not launching HG setup when user is going through CHOOBE.");
                    return;
                }
                ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "shouldLaunchHomeGraphSetup", 382, "AssistantSetupForSetupWizardActivity.java")).u("HomeGraph setup is enabled.");
            }
        }
        ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "finishSetupFlow", 325, "AssistantSetupForSetupWizardActivity.java")).u("Launching HomeGraph setup.");
        Bundle bundle = new Bundle();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            bundle.putString("accountType", extras.getString("accountType"));
            bundle.putString("authAccount", extras.getString("authAccount"));
            bundle.putString("tv_setup_theme", extras.getString("tv_setup_theme", ""));
        }
        bundle.putInt("homegraph_oobe_entry_point", 1);
        bundle.putBoolean("device_legacy_linked", !this.aU);
        Intent intent = new Intent();
        ComponentName componentName = irm.a;
        this.p.b(intent.setComponent(irm.m).putExtras(bundle));
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final void W() {
        this.am.R(2, 2);
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final void X() {
        this.am.R(3, 2);
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final boolean aj() {
        return false;
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final boolean al() {
        return true;
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final boolean am() {
        return true;
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final boolean an(boolean z) {
        return true;
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final boolean ao() {
        Intent intent = getIntent();
        return intent == null || intent.getBooleanExtra("show_assistant_hotword", true);
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity
    public final void ap(int i) {
        setResult(au(i));
    }

    final void ar(adzk adzkVar) {
        this.ad.c(adzkVar);
        setResult(au(-1));
        finish();
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity, defpackage.ige, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "onCreate", 112, "AssistantSetupForSetupWizardActivity.java")).u("#onCreate");
        super.onCreate(bundle);
        this.bm.a();
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity, defpackage.ige, defpackage.gf, defpackage.bw, android.app.Activity
    public final void onDestroy() {
        this.bm.c(rbl.SUCCESS);
        Account accountC = this.K.c();
        if (accountC == null || this.aO == null) {
            ((zdv) ((zdv) bo.d()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "onDestroy", 144, "AssistantSetupForSetupWizardActivity.java")).u("searchAccount or setupAccount is null");
        } else if (!accountC.name.equals(this.aO.name)) {
            ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "onDestroy", 150, "AssistantSetupForSetupWizardActivity.java")).u("Schedule work to check and fix device settings for non-primary account immediately.");
            this.ak.c(iht.a.a(ihk.a(bq)));
        }
        super.onDestroy();
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity, defpackage.bw, android.app.Activity
    public final void onPause() {
        ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "onPause", 129, "AssistantSetupForSetupWizardActivity.java")).u("#onPause");
        super.onPause();
        View viewB = cT().b(R.id.loading_frame);
        if (viewB != null) {
            viewB.setVisibility(8);
        }
    }

    @Override // com.google.android.apps.tvsearch.setup.AssistantSetupActivity, defpackage.bw, android.app.Activity
    protected final void onResume() {
        ((zdv) ((zdv) bo.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupForSetupWizardActivity", "onResume", 119, "AssistantSetupForSetupWizardActivity.java")).u("#onResume");
        super.onResume();
        View viewB = cT().b(R.id.loading_frame);
        if (viewB != null) {
            viewB.setVisibility(0);
        }
    }
}
