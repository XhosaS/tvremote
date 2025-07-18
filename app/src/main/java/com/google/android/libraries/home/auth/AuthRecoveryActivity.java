package com.google.android.libraries.home.auth;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import com.google.android.libraries.home.auth.AuthRecoveryActivity;
import defpackage.agvy;
import defpackage.ouk;
import defpackage.oup;
import defpackage.uq;
import defpackage.ur;
import defpackage.vd;
import defpackage.zdv;
import defpackage.zdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AuthRecoveryActivity extends oup {
    private static final zdy c = zdy.h("com/google/android/libraries/home/auth/AuthRecoveryActivity");
    public ouk a;
    private final ur d = dd(new vd(), this.h, new uq() { // from class: ouf
        @Override // defpackage.uq
        public final void a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            activityResult.getClass();
            int i = activityResult.a;
            AuthRecoveryActivity authRecoveryActivity = this.a;
            if (i != 0) {
                authRecoveryActivity.b();
            } else {
                authRecoveryActivity.finish();
                authRecoveryActivity.a().a();
            }
        }
    });

    public final ouk a() {
        ouk oukVar = this.a;
        if (oukVar != null) {
            return oukVar;
        }
        agvy.b("authServiceRunner");
        return null;
    }

    public final void b() {
        finish();
        a().b();
    }

    @Override // defpackage.oup, defpackage.tt, defpackage.eq, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        Intent intent2 = (Intent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) intent.getParcelableExtra("userRecoveryIntent", Intent.class) : intent.getParcelableExtra("userRecoveryIntent"));
        if (intent2 == null) {
            ((zdv) c.c().q("com/google/android/libraries/home/auth/AuthRecoveryActivity", "onCreate", 35, "AuthRecoveryActivity.kt")).u("Unable to execute auth recovery, intent is null!");
            b();
        } else if (bundle == null) {
            this.d.b(intent2);
        }
    }
}
