package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvl extends dve {
    public dvd b;
    private hg c = new hg();
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    private final ArrayList h;
    private final yvc i;

    public dvl(dvk dvkVar) {
        dvd dvdVar = dvd.b;
        this.b = dvdVar;
        this.h = new ArrayList();
        this.d = new WeakReference(dvkVar);
        this.i = yvd.a(dvdVar);
    }

    private final dvd g(dvj dvjVar) {
        hg hgVar = this.c;
        hj hjVar = hgVar.c(dvjVar) ? ((hj) hgVar.a.get(dvjVar)).d : null;
        Object obj = hjVar != null ? ((hig) hjVar.b).a : null;
        ArrayList arrayList = this.h;
        return dvz.b(dvz.b(this.b, (dvd) obj), arrayList.isEmpty() ? null : (dvd) arrayList.get(arrayList.size() - 1));
    }

    private final void h(dvd dvdVar) {
        if (this.b == dvdVar) {
            return;
        }
        dvk dvkVar = (dvk) this.d.get();
        dvd dvdVar2 = this.b;
        dvdVar2.getClass();
        dvdVar.getClass();
        if (dvdVar2 == dvd.b && dvdVar == dvd.a) {
            throw new IllegalStateException("State must be at least '" + dvd.c + "' to be moved to '" + dvdVar + "' in component " + dvkVar);
        }
        dvd dvdVar3 = dvd.a;
        if (dvdVar2 == dvdVar3 && dvdVar2 != dvdVar) {
            throw new IllegalStateException("State is '" + dvdVar3 + "' and cannot be moved to `" + dvdVar + "` in component " + dvkVar);
        }
        this.b = dvdVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        k();
        this.f = false;
        if (this.b == dvdVar3) {
            this.c = new hg();
        }
    }

    private final void i() {
        this.h.remove(r0.size() - 1);
    }

    private final void j(dvd dvdVar) {
        this.h.add(dvdVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r6.g = false;
        r6.i.e(r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvl.k():void");
    }

    private static final void l(String str) {
        if (!hd.a().c()) {
            throw new IllegalStateException(a.cg(str, "Method ", " must be called on the main thread"));
        }
    }

    @Override // defpackage.dve
    public final dvd a() {
        return this.b;
    }

    @Override // defpackage.dve
    public final yva b() {
        return new yul(this.i);
    }

    @Override // defpackage.dve
    public final void c(dvj dvjVar) {
        Object obj;
        dvk dvkVar;
        dvjVar.getClass();
        l("addObserver");
        dvd dvdVar = this.b;
        dvd dvdVar2 = dvd.a;
        if (dvdVar != dvdVar2) {
            dvdVar2 = dvd.b;
        }
        hig higVar = new hig(dvjVar, dvdVar2);
        hg hgVar = this.c;
        hj hjVarA = hgVar.a(dvjVar);
        if (hjVarA != null) {
            obj = hjVarA.b;
        } else {
            hgVar.a.put(dvjVar, hgVar.d(dvjVar, higVar));
            obj = null;
        }
        if (((hig) obj) == null && (dvkVar = (dvk) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            dvd dvdVarG = g(dvjVar);
            this.e++;
            while (((dvd) higVar.a).compareTo(dvdVarG) < 0 && this.c.c(dvjVar)) {
                j((dvd) higVar.a);
                dvb dvbVar = dvc.Companion;
                dvc dvcVarB = dvb.b((dvd) higVar.a);
                if (dvcVarB == null) {
                    Object obj2 = higVar.a;
                    Objects.toString(obj2);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(obj2)));
                }
                higVar.b(dvkVar, dvcVarB);
                i();
                dvdVarG = g(dvjVar);
            }
            if (!z) {
                k();
            }
            this.e--;
        }
    }

    @Override // defpackage.dve
    public final void d(dvj dvjVar) {
        dvjVar.getClass();
        l("removeObserver");
        this.c.b(dvjVar);
    }

    public final void e(dvc dvcVar) {
        dvcVar.getClass();
        l("handleLifecycleEvent");
        h(dvcVar.a());
    }

    public final void f(dvd dvdVar) {
        dvdVar.getClass();
        l("setCurrentState");
        h(dvdVar);
    }
}
