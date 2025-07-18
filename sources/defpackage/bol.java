package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bol implements boa {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boq c;
    final clo d = buk.a.o();

    public bol(boq boqVar, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = boqVar;
    }

    @Override // defpackage.boa
    public final void a() {
        clo cloVar = this.d;
        if (((buk) cloVar.b).b.size() != 0) {
            boq boqVar = this.c;
            final int i = this.a;
            final int i2 = this.b;
            boqVar.e(new bop() { // from class: bok
                @Override // defpackage.bop
                public final void a() {
                    bol bolVar = this.a;
                    bun bunVar = new bun((buk) bolVar.d.i());
                    bum bumVar = bolVar.c.e;
                    Parcel parcelC = bumVar.c();
                    parcelC.writeInt(i);
                    parcelC.writeInt(i2);
                    acl.c(parcelC, bunVar);
                    bumVar.f(5, parcelC);
                }
            });
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            ((buk) cloVar.b).b = cnj.a;
        }
    }

    @Override // defpackage.boa
    public final void b(int i) {
        clo cloVarO = buo.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clo cloVar = this.d;
        buo buoVar = (buo) cloVarO.b;
        buoVar.b |= 8;
        buoVar.f = i;
        cloVar.V(cloVarO);
    }

    @Override // defpackage.boa
    public final void c(int i, int i2, String str) {
        clo cloVarO = buo.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        buo buoVar = (buo) cltVar;
        buoVar.b |= 1;
        buoVar.c = i;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        clt cltVar2 = cloVarO.b;
        buo buoVar2 = (buo) cltVar2;
        buoVar2.b |= 2;
        buoVar2.d = i2;
        if (!cltVar2.A()) {
            cloVarO.l();
        }
        clo cloVar = this.d;
        buo buoVar3 = (buo) cloVarO.b;
        str.getClass();
        buoVar3.b |= 4;
        buoVar3.e = str;
        cloVar.V(cloVarO);
    }

    @Override // defpackage.boa
    public final void d(int i, int i2) {
        clo cloVarO = buo.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        buo buoVar = (buo) cltVar;
        buoVar.b |= 1;
        buoVar.c = i;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        clo cloVar = this.d;
        buo buoVar2 = (buo) cloVarO.b;
        buoVar2.b |= 2;
        buoVar2.d = i2;
        cloVar.V(cloVarO);
    }
}
