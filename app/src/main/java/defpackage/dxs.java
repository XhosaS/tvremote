package defpackage;

import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxs implements dvn, dvl {
    private final dvo a = new dvo();

    public dxs(ComponentTree componentTree) {
        dvn dvnVar = componentTree.c;
        if (dvnVar != null) {
            dvnVar.b(this);
        }
    }

    @Override // defpackage.dvn
    public final dvm a() {
        return this.a.a;
    }

    @Override // defpackage.dvn
    public final void b(dvl dvlVar) {
        this.a.b(dvlVar);
    }

    @Override // defpackage.dvn
    public final void c(dvl dvlVar) {
        this.a.c(dvlVar);
    }

    @Override // defpackage.dvl
    public final void q(dvm dvmVar) {
        dvm dvmVar2 = dvm.HINT_VISIBLE;
        int iOrdinal = dvmVar.ordinal();
        if (iOrdinal == 0) {
            this.a.d(dvm.HINT_VISIBLE);
        } else if (iOrdinal == 1) {
            this.a.d(dvm.HINT_INVISIBLE);
        } else if (iOrdinal != 2) {
            throw new IllegalStateException("Illegal state: ".concat(String.valueOf(String.valueOf(dvmVar))));
        }
    }
}
