package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edl implements ecn {
    protected edl() {
    }

    @Override // defpackage.ecn
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ecn
    public final ecu b(Looper looper, Handler.Callback callback) {
        return new edm(new Handler(looper, callback));
    }
}
