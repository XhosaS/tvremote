package com.google.android.gms.auth;

import android.content.Intent;
import defpackage.nhc;
import defpackage.nho;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends nhc {
    public final Intent b;
    public final nho c;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, nho.LEGACY);
    }

    public static UserRecoverableAuthException a(String str, Intent intent) {
        ocv.aF(intent);
        return new UserRecoverableAuthException(str, intent, nho.AUTH_INSTANTIATION);
    }

    private UserRecoverableAuthException(String str, Intent intent, nho nhoVar) {
        super(str);
        this.b = intent;
        ocv.aF(nhoVar);
        this.c = nhoVar;
    }
}
