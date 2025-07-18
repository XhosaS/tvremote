package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnc implements idf {
    public final kva a;
    public final mmd b;
    public final boolean c;
    private final boolean d;
    private final idf e = new mmm(this, 13);

    public mnc(kva kvaVar, mmd mmdVar, boolean z, boolean z2) {
        this.a = kvaVar;
        this.b = mmdVar;
        this.c = z;
        this.d = z2;
    }

    private final ieg c(kvf kvfVar) {
        ieg iegVarF;
        ieg iegVar = this.b.d;
        if (iegVar.l()) {
            return (ieg) this.e.b(kvfVar);
        }
        if (!kuf.a((kuf) iegVar.g())) {
            Iterator it = kvfVar.dY().iterator();
            while (it.hasNext()) {
                if (((kxg) it.next()).c.equals(iegVar.g())) {
                    return iegVar;
                }
            }
            return (ieg) this.e.b(kvfVar);
        }
        Iterator it2 = kvfVar.dY().iterator();
        while (true) {
            if (!it2.hasNext()) {
                iegVarF = ieg.a;
                break;
            }
            kuf kufVar = ((kxg) it2.next()).c;
            if (!kuf.b(kufVar)) {
                iegVarF = ieg.f(kufVar);
                break;
            }
        }
        return iegVarF.m() ? iegVarF : (ieg) this.e.b(kvfVar);
    }

    @Override // defpackage.idf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ieg b(kvf kvfVar) {
        ieg iegVarF;
        mmd mmdVar = this.b;
        ieg iegVar = mmdVar.d;
        if (iegVar.m()) {
            return mmdVar.h ? iegVar : c(kvfVar);
        }
        if (mmdVar.a().l() || !this.d) {
            return (ieg) this.e.b(kvfVar);
        }
        int iOrdinal = ((xbm) mmdVar.a().g()).ordinal();
        if (iOrdinal == 1) {
            return ieg.f(kuf.a);
        }
        if (iOrdinal == 2) {
            return c(kvfVar);
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                return (ieg) this.e.b(kvfVar);
            }
            kvc kvcVarA = this.a.a(kvfVar);
            if (kvcVarA.b || kvcVarA.f) {
                return ieg.f(kuf.a);
            }
        }
        Iterator it = ((List) kvfVar.n().h(Collections.EMPTY_LIST)).iterator();
        while (true) {
            if (!it.hasNext()) {
                iegVarF = ieg.a;
                break;
            }
            kxg kxgVar = (kxg) it.next();
            kuf kufVar = kxgVar.c;
            if (kxgVar.h) {
                iegVarF = ieg.f(kufVar);
                break;
            }
        }
        return iegVarF.m() ? iegVarF : (ieg) this.e.b(kvfVar);
    }
}
