package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class prm implements ufw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ prm(pro proVar, prk prkVar, int i, int i2) {
        this.d = i2;
        this.b = proVar;
        this.c = prkVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ufw
    public final uhp a(Object obj) {
        int i = this.d;
        int i2 = 6;
        int i3 = 1;
        if (i == 0) {
            prt prtVar = (prt) obj;
            boolean zI = pro.i(prtVar);
            Object obj2 = this.b;
            if (!zI || !pro.h(prtVar)) {
                return sfy.C(((pro) obj2).a());
            }
            nsf nsfVar = ((pro) obj2).e;
            prs prsVar = prtVar.c;
            if (prsVar == null) {
                prsVar = prs.a;
            }
            int i4 = this.a;
            Object obj3 = this.c;
            trf trfVarD = trf.d(nsfVar.q(prsVar, i4));
            prn prnVar = new prn(i2);
            ugk ugkVar = ugk.a;
            return trfVarD.e(prnVar, ugkVar).a(Exception.class, new prn(i3), ugkVar).f(new oyy(obj2, prtVar, obj3, 5, (char[]) null), ugkVar);
        }
        if (i == 1) {
            prt prtVar2 = (prt) obj;
            if (!pro.j(prtVar2, (prk) this.c)) {
                return sfy.B(new prl());
            }
            Object obj4 = this.b;
            prs prsVar2 = prtVar2.c;
            if (prsVar2 == null) {
                prsVar2 = prs.a;
            }
            return ((pro) obj4).e.q(prsVar2, this.a);
        }
        int i5 = 7;
        if (i != 2) {
            if (i == 3) {
                vvj vvjVar = (vvj) obj;
                ?? r4 = this.b;
                int i6 = this.a;
                slm slmVar = (slm) this.c;
                return sfy.M(r4).b(trc.b(new sll(slmVar, vvjVar, i6, (List) r4, 0)), slmVar.b);
            }
            int i7 = this.a;
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                if (((Boolean) sfy.J((Future) this.b.get(i8))).booleanValue()) {
                    slq slqVar = (slq) ((slm) this.c).a.get(i8);
                    a.p().booleanValue();
                    arrayList.add(sfy.F(new rjs(slqVar, i5), slqVar.b));
                }
            }
            return sfy.O(arrayList).a(new oym(6), ugk.a);
        }
        prt prtVar3 = (prt) obj;
        boolean zI2 = pro.i(prtVar3);
        int i9 = this.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        if (!zI2 || !pro.h(prtVar3)) {
            return ((pro) obj6).b((prk) obj5, i9);
        }
        pro proVar = (pro) obj6;
        nsf nsfVar2 = proVar.e;
        prs prsVar3 = prtVar3.c;
        if (prsVar3 == null) {
            prsVar3 = prs.a;
        }
        trf trfVarD2 = trf.d(nsfVar2.q(prsVar3, i9));
        prn prnVar2 = new prn(i2);
        ugk ugkVar2 = ugk.a;
        return trfVarD2.e(prnVar2, ugkVar2).a(Exception.class, new prn(i5), ugkVar2).f(new rkj(proVar, prtVar3, (prk) obj5, i9, 1), ugkVar2);
    }

    public /* synthetic */ prm(slm slmVar, int i, List list, int i2) {
        this.d = i2;
        this.c = slmVar;
        this.a = i;
        this.b = list;
    }

    public /* synthetic */ prm(slm slmVar, List list, int i, int i2) {
        this.d = i2;
        this.c = slmVar;
        this.b = list;
        this.a = i;
    }
}
