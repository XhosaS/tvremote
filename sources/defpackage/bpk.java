package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpk implements cpi {
    private final cpm a;

    public bpk(cpm cpmVar) {
        this.a = cpmVar;
    }

    public static Looper c(HandlerThread handlerThread) {
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        return looper;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Looper a() {
        return c((HandlerThread) this.a.a());
    }
}
