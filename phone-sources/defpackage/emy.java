package defpackage;

import android.view.Surface;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class emy implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ emy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [ewz, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((enf) this.a).h(false);
                return;
            case 1:
                ((enf) this.a).m();
                return;
            case 2:
                Object obj = this.a;
                eot eotVar = (eot) obj;
                if (eotVar.b) {
                    return;
                }
                eox eoxVar = eotVar.a;
                if (eoxVar != null) {
                    eoxVar.p(eotVar.d);
                }
                eotVar.c.c.remove(obj);
                eotVar.b = true;
                return;
            case 3:
                ((eoo) this.a).p(null);
                return;
            case 4:
                ((eqt) this.a).k();
                return;
            case 5:
                eqt eqtVar = (eqt) this.a;
                eqtVar.l = true;
                eqtVar.k();
                return;
            case 6:
                ((eqn) this.a).c();
                return;
            case 7:
                Object obj2 = this.a;
                Object obj3 = ((esj) obj2).a;
                synchronized (obj3) {
                    if (((esj) obj2).h) {
                        return;
                    }
                    long j = ((esj) obj2).g - 1;
                    ((esj) obj2).g = j;
                    if (j > 0) {
                        return;
                    }
                    if (j >= 0) {
                        ((esj) obj2).a();
                        return;
                    }
                    IllegalStateException illegalStateException = new IllegalStateException();
                    synchronized (obj3) {
                        ((esj) obj2).i = illegalStateException;
                    }
                    return;
                }
            case 8:
                ((euj) this.a).d();
                return;
            case 9:
                euu euuVar = ((eut) this.a).a;
                if (euuVar.f != null) {
                    euuVar.b();
                    return;
                }
                return;
            case 10:
                euu euuVar2 = ((eut) this.a).a;
                if (euuVar2.f == null || (euuVar2.e & 3) == 0) {
                    return;
                }
                euuVar2.b();
                return;
            case 11:
                ((ewp) this.a).l = true;
                return;
            case 12:
                ((ewp) this.a).s();
                return;
            case 13:
                ?? r0 = this.a;
                ewp ewpVar = (ewp) r0;
                if (ewpVar.n) {
                    return;
                }
                evw evwVar = ewpVar.g;
                evwVar.getClass();
                evwVar.b(r0);
                return;
            case 14:
                ((fbd) this.a).c.b();
                return;
            case 15:
                ((fbd) ((fbc) this.a).b).c.a();
                return;
            case 16:
                ((fbd) ((fbc) this.a).b).c.c();
                return;
            case 17:
                ((fbd) ((fbc) this.a).b).c.d();
                return;
            case 18:
                fbr fbrVar = (fbr) this.a;
                fbrVar.m--;
                return;
            case 19:
                fcs fcsVar = (fcs) this.a;
                Surface surface = fcsVar.e;
                if (surface != null) {
                    Iterator it = fcsVar.a.iterator();
                    while (it.hasNext()) {
                        ((eiw) it.next()).a.aC(null);
                    }
                }
                fcs.a(fcsVar.d, surface);
                fcsVar.d = null;
                fcsVar.e = null;
                return;
            default:
                foo fooVar = (foo) this.a;
                fom fomVar = fooVar.r;
                if (fomVar != null) {
                    fqt fqtVar = fooVar.q;
                    fqtVar.aC();
                    fqtVar.a.X(new dzf(fqtVar, fomVar));
                    return;
                }
                return;
        }
    }
}
