package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjc {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final uda c;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis() * 1000;
        b = jCurrentTimeMillis;
        SystemClock.elapsedRealtime();
        vtw vtwVarM = uda.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uda.c((uda) vtwVarM.b);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uda.b((uda) vtwVarM.b);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uda udaVar = (uda) vtwVarM.b;
        udaVar.b |= 1;
        udaVar.c = jCurrentTimeMillis;
        c = (uda) vtwVarM.r();
    }

    public static ucz a() {
        vtw vtwVarM = ucz.a.m();
        long andIncrement = a.getAndIncrement();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ucz uczVar = (ucz) vucVar;
        uczVar.b |= 2;
        uczVar.d = andIncrement;
        uda udaVar = c;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ucz uczVar2 = (ucz) vtwVarM.b;
        udaVar.getClass();
        uczVar2.c = udaVar;
        uczVar2.b |= 1;
        return (ucz) vtwVarM.r();
    }
}
