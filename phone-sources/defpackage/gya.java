package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gya extends zgs {
    public gya(zgr zgrVar) {
        super(zgrVar);
    }

    @Override // defpackage.zgs, defpackage.zgr
    public final zhm a(zhe zheVar) {
        zhe zheVarF = zheVar.f();
        if (zheVarF != null) {
            ygx ygxVar = new ygx();
            while (zheVarF != null && !i(zheVarF)) {
                ygxVar.addFirst(zheVarF);
                zheVarF = zheVarF.f();
            }
            Iterator it = ygxVar.iterator();
            while (it.hasNext()) {
                zhe zheVar2 = (zhe) it.next();
                zheVar2.getClass();
                this.b.k(zheVar2);
            }
        }
        return this.b.a(zheVar);
    }
}
