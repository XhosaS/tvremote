package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkk implements rjq {
    public final rjq a;
    final /* synthetic */ rkl b;
    private final rjq c;
    private tvn d;

    public rkk(rkl rklVar, rjq rjqVar, rjq rjqVar2) {
        this.b = rklVar;
        this.c = rjqVar;
        this.a = rjqVar2;
    }

    private final uhp h(tsl tslVar) {
        return szg.j((uhp) tslVar.apply(this.c), rkd.class, new pap(this, tslVar, 9, null), ugk.a);
    }

    private final uhp i(rkh rkhVar, String str, int i) {
        return szg.j(rkhVar.a(this.c, str, i), rkd.class, new rkj(this, rkhVar, str, i, 0), ugk.a);
    }

    @Override // defpackage.rjq
    public final uhp a() {
        return h(new rke(3));
    }

    @Override // defpackage.rjq
    public final uhp b() {
        return h(new rke(4));
    }

    @Override // defpackage.rjq
    public final void c(rjp rjpVar) {
        List list = this.b.b;
        synchronized (list) {
            list.add(rjpVar);
            this.c.c(rjpVar);
        }
    }

    @Override // defpackage.rjq
    public final void d(rjp rjpVar) {
        List list = this.b.b;
        synchronized (list) {
            list.remove(rjpVar);
            this.c.d(rjpVar);
        }
    }

    @Override // defpackage.rjq
    public final uhp e(String str, int i) {
        return i(new rki(1), str, i);
    }

    @Override // defpackage.rjq
    public final uhp f(String str, int i) {
        return i(new rki(0), str, i);
    }

    public final void g(Exception exc) {
        rkl rklVar = this.b;
        List list = rklVar.b;
        synchronized (list) {
            if (this.d == null) {
                this.d = tvn.n("OneGoogle");
            }
            ((tvk) ((tvk) this.d.g()).j("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", 190, "SafeMdiOwnersProvider.java")).v("MDI Profile Sync not available on device. Reverting to backup implementation. Exception: %s", rrx.aq(exc));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.c((rjp) it.next());
            }
            rklVar.a = this.a;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.c.d((rjp) it2.next());
            }
            list.clear();
        }
    }
}
