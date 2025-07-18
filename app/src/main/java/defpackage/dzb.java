package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzb {
    final /* synthetic */ dzc a;

    public dzb(dzc dzcVar) {
        this.a = dzcVar;
    }

    public final float a(eao eaoVar) {
        dyx dyxVar = (dyx) this.a.b.a(eaoVar.a);
        Map map = dyxVar.a;
        eaf eafVar = eaoVar.b;
        dyy dyyVar = (dyy) map.get(eafVar);
        if (dyyVar != null) {
            return dyyVar.a.c;
        }
        dxa dxaVar = dyxVar.c == 0 ? dyxVar.e : dyxVar.d;
        if (dxaVar != null) {
            return eafVar.e((dvi) dxaVar.b());
        }
        throw new RuntimeException("Both LayoutOutputs were null!");
    }

    public final eag b(eao eaoVar) {
        return ((dyy) ((dyx) this.a.b.a(eaoVar.a)).a.get(eaoVar.b)).a;
    }
}
