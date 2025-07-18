package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkl extends Exception {
    public final ConnectionResult a;

    public kkl(ConnectionResult connectionResult) {
        kkk.b(connectionResult.b(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = connectionResult;
    }
}
