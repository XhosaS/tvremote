package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class khk implements luu {
    private final kgu a;
    private final int b;
    private final kfq c;
    private final long d;
    private final long e;

    public khk(kgu kguVar, int i, kfq kfqVar, long j, long j2) {
        this.a = kguVar;
        this.b = i;
        this.c = kfqVar;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration b(kgq kgqVar, kiz kizVar, int i) {
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = kizVar.q;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !klh.a(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !klh.a(iArr2, i))) || kgqVar.k >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // defpackage.luu
    public final void a(lvf lvfVar) {
        kgq kgqVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        kgu kguVar = this.a;
        if (kguVar.h()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = kko.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (kgqVarB = kguVar.b(this.c)) != null) {
                Object obj = kgqVarB.b;
                if (obj instanceof kiz) {
                    long j3 = this.d;
                    int i6 = 0;
                    boolean z = j3 > 0;
                    kiz kizVar = (kiz) obj;
                    int i7 = kizVar.l;
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        boolean zE = kizVar.E();
                        i = rootTelemetryConfiguration.d;
                        i3 = rootTelemetryConfiguration.e;
                        i2 = rootTelemetryConfiguration.a;
                        if (zE && !kizVar.n()) {
                            ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(kgqVarB, kizVar, this.b);
                            if (connectionTelemetryConfigurationB == null) {
                                return;
                            }
                            boolean z2 = connectionTelemetryConfigurationB.c && j3 > 0;
                            i3 = connectionTelemetryConfigurationB.e;
                            z = z2;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int iElapsedRealtime = -1;
                    if (lvfVar.i()) {
                        i5 = 0;
                    } else if (((lvn) lvfVar).a) {
                        i6 = -1;
                        i5 = 100;
                    } else {
                        Exception excD = lvfVar.d();
                        if (excD instanceof kej) {
                            Status status = ((kej) excD).a;
                            i4 = status.f;
                            ConnectionResult connectionResult = status.i;
                            if (connectionResult != null) {
                                i5 = i4;
                                i6 = connectionResult.c;
                            }
                        } else {
                            i4 = 101;
                        }
                        i5 = i4;
                        i6 = -1;
                    }
                    if (z) {
                        long j4 = this.e;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    Handler handler = kguVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new khl(new MethodInvocation(this.b, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i2, i, i3)));
                }
            }
        }
    }
}
