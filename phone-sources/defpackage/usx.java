package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class usx extends xtc {
    final /* synthetic */ usy a;
    private xsm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usx(usy usyVar, wbb wbbVar) {
        super(wbbVar);
        this.a = usyVar;
    }

    @Override // defpackage.wbb
    public final void a(xtk xtkVar, xsm xsmVar) {
        xth xthVar = xtkVar.n;
        if (!xthVar.equals(xth.UNAUTHENTICATED) && !xthVar.equals(xth.PERMISSION_DENIED)) {
            xsm xsmVar2 = this.b;
            if (xsmVar2 != null) {
                this.f.c(xsmVar2);
                this.b = null;
            }
            this.f.a(xtkVar, xsmVar);
            return;
        }
        usy usyVar = this.a;
        synchronized (usyVar.a) {
            usyVar.c = usyVar.d.a(usyVar.e, usyVar.f.f(uqz.a, true));
            Iterator it = usyVar.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.xtc, defpackage.wbb
    public final void c(xsm xsmVar) {
        this.b = xsmVar;
    }

    @Override // defpackage.xtc, defpackage.wbb
    public final void d(Object obj) {
        xsm xsmVar = this.b;
        if (xsmVar != null) {
            this.f.c(xsmVar);
            this.b = null;
        }
        this.f.d(obj);
    }
}
