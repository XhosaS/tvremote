package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pal {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final zpp c;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis() * 1000;
        b = jCurrentTimeMillis;
        SystemClock.elapsedRealtime();
        zpp zppVar = zpp.a;
        zpo zpoVar = new zpo();
        if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpoVar.y();
        }
        zpp zppVar2 = (zpp) zpoVar.b;
        zppVar2.b |= 2;
        zppVar2.d = 0;
        if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpoVar.y();
        }
        zpp zppVar3 = (zpp) zpoVar.b;
        zppVar3.b |= 4;
        zppVar3.e = 0;
        if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpoVar.y();
        }
        zpp zppVar4 = (zpp) zpoVar.b;
        zppVar4.b |= 1;
        zppVar4.c = jCurrentTimeMillis;
        c = (zpp) zpoVar.v();
    }

    public static zpn a() {
        zpn zpnVar = zpn.a;
        zpm zpmVar = new zpm();
        long andIncrement = a.getAndIncrement();
        if ((zpmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpmVar.y();
        }
        zpn zpnVar2 = (zpn) zpmVar.b;
        zpnVar2.b |= 2;
        zpnVar2.d = andIncrement;
        zpp zppVar = c;
        if ((zpmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpmVar.y();
        }
        zpn zpnVar3 = (zpn) zpmVar.b;
        zppVar.getClass();
        zpnVar3.c = zppVar;
        zpnVar3.b |= 1;
        return (zpn) zpmVar.v();
    }
}
