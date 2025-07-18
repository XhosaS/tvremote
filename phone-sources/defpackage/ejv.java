package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejv {
    public final eju d;
    public final ecu g;
    public boolean h;
    public efy i;
    public final ele j;
    private final elk l;
    public cvi k = new cvi((byte[]) null);
    public final IdentityHashMap b = new IdentityHashMap();
    public final Map c = new HashMap();
    public final List a = new ArrayList();
    public final HashMap e = new HashMap();
    public final Set f = new HashSet();

    public ejv(eju ejuVar, ele eleVar, ecu ecuVar, elk elkVar) {
        this.l = elkVar;
        this.d = ejuVar;
        this.j = eleVar;
        this.g = ecuVar;
    }

    private final void h(int i, int i2) {
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((ejt) list.get(i)).d += i2;
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ewb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ewa, java.lang.Object] */
    private final void i(ejt ejtVar) {
        cvi cviVar = (cvi) this.e.get(ejtVar);
        if (cviVar != null) {
            cviVar.b.t(cviVar.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [eoz, ewg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ewa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ewb, java.lang.Object] */
    private final void j(ejt ejtVar) {
        if (ejtVar.e && ejtVar.c.isEmpty()) {
            cvi cviVar = (cvi) this.e.remove(ejtVar);
            cviVar.getClass();
            ?? r1 = cviVar.a;
            ?? r2 = cviVar.b;
            r2.z(r1);
            ?? r0 = cviVar.c;
            r2.B(r0);
            r2.A(r0);
            this.f.remove(ejtVar);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final eay b() {
        List list = this.a;
        if (list.isEmpty()) {
            return eay.a;
        }
        int iC = 0;
        for (int i = 0; i < list.size(); i++) {
            ejt ejtVar = (ejt) list.get(i);
            ejtVar.d = iC;
            iC += ejtVar.a.a.c();
        }
        return new ehp(list, this.k);
    }

    public final void c() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ejt ejtVar = (ejt) it.next();
            if (ejtVar.c.isEmpty()) {
                i(ejtVar);
                it.remove();
            }
        }
    }

    public final void d(ejt ejtVar) {
        evu evuVar = ejtVar.a;
        ewa ewaVar = new ewa() { // from class: ejp
            @Override // defpackage.ewa
            public final void a(ewb ewbVar, eay eayVar) {
                ecu ecuVar = ((eje) this.a.d).d;
                ecuVar.b(2);
                ecuVar.f(22);
            }
        };
        ejs ejsVar = new ejs(this, ejtVar);
        this.e.put(ejtVar, new cvi((ewb) evuVar, ewaVar, ejsVar));
        evuVar.s(edt.L(), ejsVar);
        evuVar.r(edt.L(), ejsVar);
        evuVar.x(ewaVar, this.i, this.l);
    }

    public final void e(evx evxVar) {
        IdentityHashMap identityHashMap = this.b;
        ejt ejtVar = (ejt) identityHashMap.remove(evxVar);
        ejtVar.getClass();
        ejtVar.a.i(evxVar);
        ejtVar.c.remove(((evr) evxVar).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        j(ejtVar);
    }

    public final void f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            ejt ejtVar = (ejt) this.a.remove(i2);
            this.c.remove(ejtVar.b);
            h(i2, -ejtVar.a.a.c());
            ejtVar.e = true;
            if (this.h) {
                j(ejtVar);
            }
        }
    }

    public final eay g(int i, List list, cvi cviVar) {
        if (!list.isEmpty()) {
            this.k = cviVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                ejt ejtVar = (ejt) list.get(i2 - i);
                if (i2 > 0) {
                    ejt ejtVar2 = (ejt) this.a.get(i2 - 1);
                    ejtVar.c(ejtVar2.d + ejtVar2.a.a.c());
                } else {
                    ejtVar.c(0);
                }
                h(i2, ejtVar.a.a.c());
                this.a.add(i2, ejtVar);
                this.c.put(ejtVar.b, ejtVar);
                if (this.h) {
                    d(ejtVar);
                    if (this.b.isEmpty()) {
                        this.f.add(ejtVar);
                    } else {
                        i(ejtVar);
                    }
                }
            }
        }
        return b();
    }
}
