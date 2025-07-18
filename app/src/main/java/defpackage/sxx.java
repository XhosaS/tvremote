package defpackage;

import j$.time.Instant;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxx implements sxr {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl");
    public final Executor b;
    private final Queue c = new zdi(new yxl(128));

    public sxx(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.sxr
    public final void a(rux ruxVar, int i, long j, sgo sgoVar) {
        zyd zydVarB = ruxVar.b();
        zxe zxeVarF = wyo.f(new sxt(this, i, j, sgoVar));
        Executor executor = this.b;
        zxn.p(zydVarB, zxeVarF, executor);
        zxn.p(((ruw) ruxVar.c()).a(), wyo.f(new sxs(this, i, j, sgoVar)), executor);
    }

    @Override // defpackage.sxr
    public final void b(rye ryeVar) {
        rxs rxsVar = rxs.a;
        rxr rxrVar = new rxr();
        long epochMilli = Instant.now().toEpochMilli();
        if ((rxrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxrVar.y();
        }
        rxs rxsVar2 = (rxs) rxrVar.b;
        rxsVar2.b |= 1;
        rxsVar2.e = epochMilli;
        if ((rxrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxrVar.y();
        }
        rxs rxsVar3 = (rxs) rxrVar.b;
        rxsVar3.d = ryeVar;
        rxsVar3.c = 2;
        rxs rxsVar4 = (rxs) rxrVar.v();
        zer zerVar = zfi.a;
        this.c.add(rxsVar4);
    }

    @Override // defpackage.sxr
    public final void c(ryg rygVar) {
        rxs rxsVar = rxs.a;
        rxr rxrVar = new rxr();
        long epochMilli = Instant.now().toEpochMilli();
        if ((rxrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxrVar.y();
        }
        rxs rxsVar2 = (rxs) rxrVar.b;
        rxsVar2.b |= 1;
        rxsVar2.e = epochMilli;
        if ((rxrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxrVar.y();
        }
        rxs rxsVar3 = (rxs) rxrVar.b;
        rygVar.getClass();
        rxsVar3.d = rygVar;
        rxsVar3.c = 4;
        rxs rxsVar4 = (rxs) rxrVar.v();
        zer zerVar = zfi.a;
        this.c.add(rxsVar4);
    }

    @Override // defpackage.sxr
    public final void d(sdj sdjVar, sdo sdoVar, sgo sgoVar) {
        zyd zydVarI = zxn.i(sdjVar.e);
        zxe zxeVarF = wyo.f(new sxv(this, sdoVar, sgoVar));
        Executor executor = this.b;
        zxn.p(zydVarI, zxeVarF, executor);
        zxn.p(zxn.i(sdjVar.f), wyo.f(new sxu(this, sdoVar, sgoVar)), executor);
    }

    public final void e(ryi ryiVar) {
        rxs rxsVar = rxs.a;
        rxr rxrVar = new rxr();
        long epochMilli = Instant.now().toEpochMilli();
        if ((rxrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxrVar.y();
        }
        rxs rxsVar2 = (rxs) rxrVar.b;
        rxsVar2.b |= 1;
        rxsVar2.e = epochMilli;
        if ((rxrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rxrVar.y();
        }
        rxs rxsVar3 = (rxs) rxrVar.b;
        ryiVar.getClass();
        rxsVar3.d = ryiVar;
        rxsVar3.c = 3;
        rxs rxsVar4 = (rxs) rxrVar.v();
        zer zerVar = zfi.a;
        this.c.add(rxsVar4);
    }
}
