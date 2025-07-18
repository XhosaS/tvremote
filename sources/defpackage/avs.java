package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class avs implements cht {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ avs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [byb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v24, types: [bfo, java.lang.Object] */
    @Override // defpackage.cht
    public final cja a(Object obj) throws Throwable {
        cja cjaVar;
        switch (this.b) {
            case 0:
                bzs bzsVar = (bzs) obj;
                if (bzsVar.isEmpty()) {
                    return ciw.a;
                }
                Object obj2 = this.a;
                avu avuVar = (avu) obj2;
                cwi cwiVar = (cwi) avuVar.g.a();
                clo cloVarO = cwh.a.o();
                int size = bzsVar.size();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                clt cltVar = cloVarO.b;
                cwh cwhVar = (cwh) cltVar;
                cwhVar.b |= 2;
                cwhVar.e = size;
                if (!cltVar.A()) {
                    cloVarO.l();
                }
                cwh cwhVar2 = (cwh) cloVarO.b;
                cwiVar.getClass();
                cwhVar2.d = cwiVar;
                int i = 1;
                cwhVar2.b |= 1;
                HashSet hashSet = new HashSet();
                for (int i2 = 0; i2 < cwiVar.b.size(); i2++) {
                    int iAo = dnx.ao(cwiVar.b.e(i2));
                    if (iAo == 0) {
                        iAo = 1;
                    }
                    hashSet.add(Integer.valueOf(iAo - 1));
                }
                int size2 = bzsVar.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    cwg cwgVar = (cwg) bzsVar.get(i3);
                    int iAo2 = dnx.ao(cwgVar.d);
                    if (iAo2 == 0) {
                        iAo2 = 1;
                    }
                    if (hashSet.contains(Integer.valueOf(iAo2 - 1))) {
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        cwh cwhVar3 = (cwh) cloVarO.b;
                        cwgVar.getClass();
                        cme cmeVar = cwhVar3.c;
                        if (!cmeVar.c()) {
                            cwhVar3.c = clt.t(cmeVar);
                        }
                        cwhVar3.c.add(cwgVar);
                    }
                }
                cwh cwhVar4 = (cwh) cloVarO.i();
                aue aueVar = avuVar.a;
                aua auaVarA = aub.a();
                clo cloVarO2 = cym.a.o();
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                cym cymVar = (cym) cloVarO2.b;
                cwhVar4.getClass();
                cymVar.m = cwhVar4;
                cymVar.b |= 131072;
                auaVarA.f((cym) cloVarO2.i());
                return chk.h(aueVar.a(auaVarA.a()), new bab(obj2, bzsVar, i), avuVar.c);
            case 1:
                return ((are) this.a).a((arc) obj);
            case 2:
                int i4 = ((bbh) obj).a;
                if (i4 == 29501 || i4 == 29537 || i4 == 29538 || i4 == 29539 || i4 == 29540 || i4 == 29541 || i4 == 29542 || i4 == 29543 || i4 == 29544) {
                    bcn bcnVar = (bcn) this.a;
                    if (!bcnVar.g.c()) {
                        bcnVar.a();
                    }
                }
                return ciw.a;
            case 3:
                return ((bdl) this.a).b((bdm) obj);
            case 4:
                return ((bdl) this.a).b((bdm) obj);
            case 5:
                return qm.L((cja) ((bdp) this.a).g.aL());
            case 6:
                return this.a.c();
            case 7:
                bfz bfzVar = (bfz) this.a;
                bfzVar.c((Uri) qm.P(bfzVar.b), obj);
                return ciw.a;
            case 8:
                bfz bfzVar2 = (bfz) this.a;
                return qm.K(bfzVar2.b((Uri) qm.P(bfzVar2.b)));
            case 9:
                Uri uri = (Uri) obj;
                Uri uriF = bit.f(uri, ".bak");
                try {
                    bzt bztVar = ((bfz) this.a).g;
                    if (bztVar.i(uriF)) {
                        bztVar.h(uriF, uri);
                    }
                    return ciw.a;
                } catch (IOException e) {
                    return new civ(e);
                }
            case 10:
                Object obj3 = this.a;
                synchronized (((bfz) obj3).e) {
                    cjaVar = ((bfz) obj3).f;
                }
                return cjaVar;
            case 11:
                return qm.K(this.a.a(obj));
            case 12:
                return ((bgc) this.a).b.c();
            case 13:
                return ((bgc) this.a).e.a();
            default:
                Object obj4 = this.a;
                ((IOException) obj4).addSuppressed((IOException) obj);
                throw ((Throwable) obj4);
        }
    }
}
