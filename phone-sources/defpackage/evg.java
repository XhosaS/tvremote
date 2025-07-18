package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class evg extends euv {
    private final HashMap a = new HashMap();
    private Handler b;
    private efy c;

    protected evg() {
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ewb, java.lang.Object] */
    @Override // defpackage.ewb
    public void c() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((cvi) it.next()).c.c();
        }
    }

    protected evz d(Object obj, evz evzVar) {
        throw null;
    }

    protected abstract void e(Object obj, ewb ewbVar, eay eayVar);

    protected final void f(final Object obj, ewb ewbVar) {
        HashMap map = this.a;
        a.H(!map.containsKey(obj));
        ewa ewaVar = new ewa() { // from class: eve
            @Override // defpackage.ewa
            public final void a(ewb ewbVar2, eay eayVar) {
                this.a.e(obj, ewbVar2, eayVar);
            }
        };
        evf evfVar = new evf(this, obj);
        map.put(obj, new cvi(ewbVar, ewaVar, evfVar, null));
        Handler handler = this.b;
        handler.getClass();
        ewbVar.s(handler, evfVar);
        Handler handler2 = this.b;
        handler2.getClass();
        ewbVar.r(handler2, evfVar);
        ewbVar.x(ewaVar, this.c, q());
        if (this.q.isEmpty()) {
            ewbVar.t(ewaVar);
        }
    }

    @Override // defpackage.euv
    protected void g(efy efyVar) {
        this.c = efyVar;
        this.b = edt.J();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [eoz, ewg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ewb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ewa, java.lang.Object] */
    @Override // defpackage.euv
    protected void j() {
        HashMap map = this.a;
        for (cvi cviVar : map.values()) {
            ?? r3 = cviVar.c;
            r3.z(cviVar.b);
            ?? r2 = cviVar.a;
            r3.B(r2);
            r3.A(r2);
        }
        map.clear();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ewa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ewb, java.lang.Object] */
    @Override // defpackage.euv
    protected final void u() {
        for (cvi cviVar : this.a.values()) {
            cviVar.c.t(cviVar.b);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ewa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ewb, java.lang.Object] */
    @Override // defpackage.euv
    protected final void w() {
        for (cvi cviVar : this.a.values()) {
            cviVar.c.v(cviVar.b);
        }
    }

    protected void h(Object obj) {
    }

    protected void k(Object obj) {
    }
}
