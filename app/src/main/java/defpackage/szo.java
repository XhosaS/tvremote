package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szo {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/store/session/SessionAudioStore");
    public static final slp b;
    public final ahbt c;
    public final Executor d;
    public final Executor e;
    public final sma f;
    public final long g;
    public final zyd h;
    public final zyd i;
    public final ruo j;
    public final String k;
    public final syf l;
    private final sgo m;

    static {
        slp slpVar = slp.a;
        slo sloVar = new slo();
        if ((sloVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            sloVar.y();
        }
        slp slpVar2 = (slp) sloVar.b;
        slpVar2.c = 2;
        slpVar2.b |= 1;
        abxd abxdVarV = sloVar.v();
        abxdVarV.getClass();
        b = (slp) abxdVarV;
    }

    public szo(ahbt ahbtVar, Executor executor, Executor executor2, syf syfVar, sma smaVar, long j, sgo sgoVar, zyd zydVar, zyd zydVar2, ruo ruoVar, String str) {
        ahbtVar.getClass();
        executor.getClass();
        executor2.getClass();
        syfVar.getClass();
        ruoVar.getClass();
        str.getClass();
        this.c = ahbtVar;
        this.d = executor;
        this.e = executor2;
        this.l = syfVar;
        this.f = smaVar;
        this.g = j;
        this.m = sgoVar;
        this.h = zydVar;
        this.i = zydVar2;
        this.j = ruoVar;
        this.k = str;
    }

    public final syb a(String str) {
        int iBitCount;
        ryr ryrVar = ryr.a;
        ryq ryqVar = new ryq();
        ruo ruoVar = this.j;
        int i = ruoVar.d;
        if ((ryqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryqVar.y();
        }
        ryr ryrVar2 = (ryr) ryqVar.b;
        ryrVar2.b |= 1;
        ryrVar2.c = i;
        if (agvy.c(str, "loopback")) {
            rul rulVar = ruoVar.k;
            if (rulVar == null) {
                rulVar = rul.a;
            }
            iBitCount = Integer.bitCount(rulVar.d);
        } else {
            iBitCount = Integer.bitCount(ruoVar.e);
        }
        if ((ryqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryqVar.y();
        }
        ryr ryrVar3 = (ryr) ryqVar.b;
        ryrVar3.b |= 2;
        ryrVar3.d = iBitCount;
        int i2 = ruoVar.f;
        if ((ryqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ryqVar.y();
        }
        syf syfVar = this.l;
        ryr ryrVar4 = (ryr) ryqVar.b;
        ryrVar4.b |= 4;
        ryrVar4.e = i2;
        abxc abxcVar = slt.a;
        abxcVar.getClass();
        ryqVar.f(abxcVar, this.m);
        abxc abxcVar2 = slt.b;
        abxcVar2.getClass();
        ryqVar.f(abxcVar2, str);
        abxc abxcVar3 = slt.c;
        abxcVar3.getClass();
        ryqVar.f(abxcVar3, this.k);
        abxc abxcVar4 = sls.a;
        abxcVar4.getClass();
        slp slpVar = b;
        slpVar.getClass();
        ryqVar.f(abxcVar4, slpVar);
        abxd abxdVarV = ryqVar.v();
        abxdVarV.getClass();
        ryr ryrVar5 = (ryr) abxdVarV;
        abxcVar4.getClass();
        return syfVar.a((slp) acay.a(ryrVar5, abxcVar4)) ? new sye(syfVar, ryrVar5) : syf.a;
    }

    public final ahcb b(String str, rsp rspVar) {
        ahaz ahazVar = new ahaz();
        syb sybVarA = a(str);
        agwh agwhVar = new agwh();
        agwhVar.a = rspVar.a(new szn(sybVarA, ahazVar, agwhVar, this), new rsn(Integer.MAX_VALUE));
        return ahazVar;
    }
}
