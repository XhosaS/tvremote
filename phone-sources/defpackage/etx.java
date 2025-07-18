package defpackage;

import android.os.Handler;
import android.util.SparseIntArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etx {
    public static final eyv a;
    public final dzt b;
    public final ewb c;
    public final int d;
    public final ezd e;
    public final Handler f;
    public boolean g;
    public boolean h;
    public etw i;
    public exi[] j;
    public List[][] k;
    public List[][] l;
    public jdq m;
    public qza[] n;
    public final dhq o;
    private final SparseIntArray p;

    static {
        eyu eyuVar = new eyu(eyv.ao);
        eyuVar.t();
        eyuVar.K = false;
        a = new eyv(eyuVar);
    }

    public etx(dzy dzyVar, ewb ewbVar, ebf ebfVar, dhq dhqVar) {
        dzt dztVar = dzyVar.c;
        dztVar.getClass();
        this.b = dztVar;
        this.c = ewbVar;
        this.d = true != (ewbVar instanceof ews) ? 2 : 1;
        ezd ezdVar = new ezd(ebfVar, new etr(), null);
        this.e = ezdVar;
        this.o = dhqVar;
        this.p = new SparseIntArray();
        ezdVar.p(new ezj() { // from class: etq
            @Override // defpackage.ezj
            public final void e() {
                eyv eyvVar = etx.a;
            }
        }, new ett());
        this.f = edt.L();
        Object obj = eax.a;
    }

    public final void a() {
        a.ab(this.d == 2);
        a.ab(this.g);
        a.ab(this.h);
    }

    public final void b() {
        etw etwVar = this.i;
        if (etwVar != null) {
            etwVar.c();
        }
        this.e.i();
        for (ekc ekcVar : (ekc[]) this.o.a) {
            ekcVar.E();
        }
    }

    public final sro c(int i) {
        eke[] ekeVarArrS = this.o.s();
        exi exiVar = this.j[i];
        this.i.c.f(i);
        eay eayVar = this.i.c;
        sro sroVarR = this.e.r(ekeVarArrS, exiVar);
        for (int i2 = 0; i2 < sroVarR.a; i2++) {
            ezf ezfVar = ((ezf[]) sroVarR.e)[i2];
            if (ezfVar != null) {
                List list = this.k[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        list.add(ezfVar);
                        break;
                    }
                    ezf ezfVar2 = (ezf) list.get(i3);
                    if (ezfVar2.h().equals(ezfVar.h())) {
                        SparseIntArray sparseIntArray = this.p;
                        sparseIntArray.clear();
                        for (int i4 = 0; i4 < ezfVar2.t(); i4++) {
                            sparseIntArray.put(ezfVar2.q(i4), 0);
                        }
                        for (int i5 = 0; i5 < ezfVar.t(); i5++) {
                            sparseIntArray.put(ezfVar.q(i5), 0);
                        }
                        int[] iArr = new int[sparseIntArray.size()];
                        for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                            iArr[i6] = sparseIntArray.keyAt(i6);
                        }
                        list.set(i3, new ets(ezfVar2.h(), iArr));
                    } else {
                        i3++;
                    }
                }
            }
        }
        return sroVarR;
    }
}
