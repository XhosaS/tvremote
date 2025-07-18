package defpackage;

import android.accounts.Account;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oun {
    private static final zdy b = zdy.h("com/google/android/libraries/home/auth/AuthTokenCacheImpl");
    public final ovi a;

    public oun(ovi oviVar) {
        this.a = oviVar;
    }

    public final synchronized String a(Account account, String str) {
        String strA = this.a.a(account, str);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        ((zdv) ((zdv) b.c()).q("com/google/android/libraries/home/auth/AuthTokenCacheImpl", "getToken", 28, "AuthTokenCacheImpl.java")).u("No auth token returned from gms");
        return null;
    }
}
