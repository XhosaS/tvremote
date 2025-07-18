package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqs extends eww {
    private final Map g;
    private dza h;

    public eqs(ezp ezpVar, epd epdVar, eph ephVar, Map map) {
        super(ezpVar, epdVar, ephVar);
        this.g = map;
    }

    @Override // defpackage.eww
    public final dze h(dze dzeVar) {
        dza dzaVar;
        dza dzaVar2 = this.h;
        if (dzaVar2 == null) {
            dzaVar2 = dzeVar.ac;
        }
        if (dzaVar2 != null && (dzaVar = (dza) this.g.get(dzaVar2.b)) != null) {
            dzaVar2 = dzaVar;
        }
        ead eadVar = dzeVar.V;
        ead eadVar2 = null;
        if (eadVar != null) {
            int iA = eadVar.a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iA) {
                    i2 = -1;
                    break;
                }
                eac eacVarB = eadVar.b(i2);
                if ((eacVarB instanceof fgm) && "com.apple.streaming.transportStreamTimestamp".equals(((fgm) eacVarB).a)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                eadVar2 = eadVar;
            } else if (iA != 1) {
                eac[] eacVarArr = new eac[iA - 1];
                while (i < iA) {
                    if (i != i2) {
                        eacVarArr[i < i2 ? i : i - 1] = eadVar.b(i);
                    }
                    i++;
                }
                eadVar2 = new ead(eacVarArr);
            }
        }
        if (dzaVar2 != dzeVar.ac || eadVar2 != eadVar) {
            dzd dzdVar = new dzd(dzeVar);
            dzdVar.q = dzaVar2;
            dzdVar.k = eadVar2;
            dzeVar = new dze(dzdVar);
        }
        return super.h(dzeVar);
    }

    public final void i(dza dzaVar) {
        this.h = dzaVar;
        w();
    }

    public final void j(eqm eqmVar) {
        this.e = eqmVar.a;
    }
}
