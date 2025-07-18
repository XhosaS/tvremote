package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaz {
    public final List a;
    public final csl b;
    public final csl c;
    public boolean d;
    public ctj e;
    private final ctj f;
    private final ctu g;

    public aaz() {
        this(null, null);
    }

    public final List a() {
        List listAL = dnx.aL(this.b, this.c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAL) {
            if (((aav) obj).b) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b() {
        List list = this.a;
        List listAM = dnx.aM(list);
        if (listAM.isEmpty()) {
            listAM = a();
        }
        list.clear();
        Iterator it = listAM.iterator();
        if (it.hasNext()) {
            ((aav) it.next()).a();
        }
    }

    public final void c() {
        List list = this.a;
        List listAM = dnx.aM(list);
        if (listAM.isEmpty()) {
            listAM = a();
        }
        list.clear();
        if (listAM.isEmpty()) {
            ctj ctjVar = this.f;
            if (ctjVar != null) {
                ctjVar.a();
                return;
            }
            return;
        }
        Iterator it = listAM.iterator();
        if (it.hasNext()) {
            ((aav) it.next()).b();
        }
    }

    public final void d() {
        csl cslVar = this.b;
        boolean z = this.d;
        List listAL = dnx.aL(cslVar, this.c);
        boolean z2 = false;
        if (!listAL.isEmpty()) {
            Iterator it = listAL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((aav) it.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        this.d = z2;
        if (z2 != z) {
            ctu ctuVar = this.g;
            if (ctuVar != null) {
                ctuVar.a(Boolean.valueOf(z2));
            }
            this.e.a();
        }
    }

    public aaz(ctj ctjVar, ctu ctuVar) {
        this.f = ctjVar;
        this.g = ctuVar;
        this.a = new ArrayList();
        this.b = new csl();
        this.c = new csl();
        this.e = new ctj() { // from class: aax
            @Override // defpackage.ctj
            public final Object a() {
                return cse.a;
            }
        };
    }
}
