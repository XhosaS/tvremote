package com.google.android.gms.auth;

import android.content.Intent;
import android.util.Log;
import defpackage.jwj;
import defpackage.jww;
import defpackage.kkk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends jwj {
    private final Intent a;
    private final jww b;

    public UserRecoverableAuthException(String str, Intent intent, jww jwwVar) {
        super(str);
        this.a = intent;
        kkk.k(jwwVar);
        this.b = jwwVar;
    }

    public static UserRecoverableAuthException b(String str, Intent intent) {
        kkk.k(intent);
        return new UserRecoverableAuthException(str, intent, jww.AUTH_INSTANTIATION);
    }

    public final Intent a() {
        Intent intent = this.a;
        if (intent != null) {
            return new Intent(intent);
        }
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (iOrdinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (iOrdinal != 2) {
            return null;
        }
        Log.i("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }
}
