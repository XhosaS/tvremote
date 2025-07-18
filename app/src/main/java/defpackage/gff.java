package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gff implements gfd, gfg {
    private final geu a;
    private final ggf b;

    public gff(geu geuVar, ggf ggfVar) {
        geuVar.getClass();
        this.a = geuVar;
        this.b = ggfVar;
    }

    @Override // defpackage.gfd
    public final gfg a(String str) {
        str.getClass();
        ggf ggfVar = this.b;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar = (ggi) ggfVar.b;
        ggi ggiVar2 = ggi.a;
        ggiVar.e = 6;
        ggiVar.f = str;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar3 = (ggi) ggfVar.b;
        ggiVar3.j = 2;
        ggiVar3.b |= 8;
        return this;
    }

    @Override // defpackage.gfd
    public final gfg b() {
        ggf ggfVar = this.b;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar = (ggi) ggfVar.b;
        ggi ggiVar2 = ggi.a;
        ggiVar.f = 3;
        ggiVar.e = 7;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar3 = (ggi) ggfVar.b;
        ggiVar3.j = 3;
        ggiVar3.b |= 8;
        return this;
    }

    @Override // defpackage.gfg
    public final void c(abqb abqbVar) {
        abqbVar.getClass();
        ggf ggfVar = this.b;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        geu geuVar = this.a;
        ggi ggiVar = (ggi) ggfVar.b;
        ggi ggiVar2 = ggi.a;
        ggiVar.d = Integer.valueOf(abqbVar.s);
        ggiVar.c = 5;
        abxd abxdVarV = ggfVar.v();
        abxdVarV.getClass();
        geuVar.a((ggi) abxdVarV);
    }

    @Override // defpackage.gfg
    public final void d(int i) {
        ggf ggfVar = this.b;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        geu geuVar = this.a;
        ggi ggiVar = (ggi) ggfVar.b;
        ggi ggiVar2 = ggi.a;
        ggiVar.d = Integer.valueOf(ggj.a(i));
        ggiVar.c = 4;
        abxd abxdVarV = ggfVar.v();
        abxdVarV.getClass();
        geuVar.a((ggi) abxdVarV);
    }

    @Override // defpackage.gfg
    public final void e(Duration duration) {
        ggf ggfVar = this.b;
        abwf abwfVarA = acbk.a(duration);
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar = (ggi) ggfVar.b;
        ggi ggiVar2 = ggi.a;
        ggiVar.i = abwfVarA;
        ggiVar.b |= 4;
    }

    @Override // defpackage.gfg
    public final void f(ahrs ahrsVar) {
        ahrsVar.getClass();
        ggf ggfVar = this.b;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar = (ggi) ggfVar.b;
        ggi ggiVar2 = ggi.a;
        ggiVar.m = ahrsVar;
        ggiVar.b |= 32;
    }

    @Override // defpackage.gfg
    public final void g(String str) {
        str.getClass();
        ggf ggfVar = this.b;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar = (ggi) ggfVar.b;
        ggi ggiVar2 = ggi.a;
        ggiVar.b |= 16;
        ggiVar.l = str;
    }

    @Override // defpackage.gfg
    public final void h(String str) {
        if (str != null) {
            this.b.a("APP_FLOW_TAG_FLOW_REQUEST_ID", str);
        }
    }
}
