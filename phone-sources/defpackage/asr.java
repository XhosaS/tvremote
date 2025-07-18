package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asr extends bko implements bxu, byl {
    private Map a;

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        float fG = ykn.g(((cma) fh.P(this, ask.c)).a, 0.0f);
        bwj bwjVarU = bvsVar.u(j);
        boolean z = this.A && !Float.isNaN(fG) && Float.compare(fG, 0.0f) > 0;
        int iCu = !Float.isNaN(fG) ? bvvVar.cu(fG) : 0;
        int iMax = z ? Math.max(bwjVarU.a, iCu) : bwjVarU.a;
        int iMax2 = z ? Math.max(bwjVarU.b, iCu) : bwjVarU.b;
        if (z) {
            Map linkedHashMap = this.a;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.a = linkedHashMap;
            }
            linkedHashMap.put(ask.b, Integer.valueOf(ykn.j(Math.round((iCu - bwjVarU.a) / 2.0f), 0)));
            linkedHashMap.put(ask.a, Integer.valueOf(ykn.j(Math.round((iCu - bwjVarU.b) / 2.0f), 0)));
        }
        Map map = this.a;
        if (map == null) {
            map = yhc.a;
        }
        return bvvVar.cz(iMax, iMax2, map, new ym(iMax, bwjVarU, iMax2, 5));
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }
}
