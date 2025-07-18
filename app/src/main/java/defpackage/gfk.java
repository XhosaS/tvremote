package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfk implements gfi, gfl {
    private final geu a;
    private final ggf b;

    public gfk(geu geuVar, ggf ggfVar) {
        geuVar.getClass();
        this.a = geuVar;
        this.b = ggfVar;
    }

    @Override // defpackage.gfi
    public final gfl a(String str) {
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

    @Override // defpackage.gfi
    public final gfl b() {
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

    @Override // defpackage.gfl
    public final void c() {
        abxd abxdVarV = this.b.v();
        abxdVarV.getClass();
        this.a.a((ggi) abxdVarV);
    }

    @Override // defpackage.gfl
    public final void d(abqb abqbVar) {
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

    @Override // defpackage.gfl
    public final void e(int i) {
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

    @Override // defpackage.gfl
    public final void f(Duration duration) {
        if (duration != null) {
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
    }

    @Override // defpackage.gfl
    public final void g(ahrs ahrsVar) {
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

    @Override // defpackage.gfl
    public final void h(String str) {
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

    @Override // defpackage.gfl
    public final void i(String str) {
        if (str != null) {
            this.b.a("APP_FLOW_TAG_FLOW_REQUEST_ID", str);
        }
    }
}
