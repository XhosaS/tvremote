package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjn extends ixi {
    public static final Handler d;
    public final Map e;
    public final gag f;

    static {
        Handler handlerK = crh.k(Looper.getMainLooper());
        handlerK.getClass();
        d = handlerK;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jjn(gag gagVar, wkx wkxVar) {
        vvd vvdVar = wti.e;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.f = gagVar;
        this.e = new LinkedHashMap();
    }
}
