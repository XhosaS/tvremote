package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sau implements sat {
    private final ConnectivityManager a;

    public sau(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.sat
    public final NetworkInfo a() {
        try {
            return this.a.getActiveNetworkInfo();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
