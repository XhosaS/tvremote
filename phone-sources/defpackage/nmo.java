package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nmo extends jys {
    final /* synthetic */ nmq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmo(nmq nmqVar) {
        super((char[]) null);
        this.a = nmqVar;
    }

    @Override // defpackage.jys
    public final void H(int i) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((jys) it.next()).H(i);
        }
    }

    @Override // defpackage.jys
    public final void I(int i) {
        nmq nmqVar = this.a;
        nmqVar.e(i);
        nmqVar.r(i);
        Iterator it = new HashSet(nmqVar.a).iterator();
        while (it.hasNext()) {
            ((jys) it.next()).I(i);
        }
    }

    @Override // defpackage.jys
    public final void J(njz njzVar) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((jys) it.next()).J(njzVar);
        }
    }

    @Override // defpackage.jys
    public final void K() {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((jys) it.next()).K();
        }
    }

    @Override // defpackage.jys
    public final void L(int i) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((jys) it.next()).L(i);
        }
    }

    @Override // defpackage.jys
    public final void M() {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((jys) it.next()).M();
        }
    }
}
