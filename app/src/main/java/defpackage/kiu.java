package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kiu extends kkb {
    private kiz a;
    private final int b;

    public kiu(kiz kizVar, int i) {
        this.a = kizVar;
        this.b = i;
    }

    @Override // defpackage.kkc
    public final void c(int i, IBinder iBinder, Bundle bundle) {
        kkk.l(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.A(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.kkc
    public final void d(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        kiz kizVar = this.a;
        kkk.l(kizVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        kkk.k(connectionInfo);
        kizVar.q = connectionInfo;
        if (kizVar.e()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
            kko.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
        }
        c(i, iBinder, connectionInfo.a);
    }

    @Override // defpackage.kkc
    public final void e() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
