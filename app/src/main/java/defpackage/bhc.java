package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhc {
    public final List a;
    public final agqi b;
    public final agqi c;
    public boolean d;
    public agum e;
    private final agum f;
    private final agux g;

    public bhc() {
        this(null, null);
    }

    public final List a() {
        List listT = agqq.t(this.b, this.c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listT) {
            if (((bha) obj).a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b() {
        List list = this.a;
        List listX = agqq.x(list);
        if (listX.isEmpty()) {
            listX = a();
        }
        list.clear();
        Iterator it = listX.iterator();
        if (it.hasNext()) {
            ((bha) it.next()).a();
        }
    }

    public final void c() {
        List list = this.a;
        List listX = agqq.x(list);
        if (listX.isEmpty()) {
            listX = a();
        }
        list.clear();
        if (listX.isEmpty()) {
            agum agumVar = this.f;
            if (agumVar != null) {
                ui.a(((uf) agumVar).a);
                return;
            }
            return;
        }
        Iterator it = listX.iterator();
        if (it.hasNext()) {
            ((bha) it.next()).b();
        }
    }

    public final void d() {
        List listT = agqq.t(this.b, this.c);
        boolean z = false;
        if (!listT.isEmpty()) {
            Iterator it = listT.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((bha) it.next()).a) {
                    z = true;
                    break;
                }
            }
        }
        if (z != this.d) {
            this.d = z;
            agux aguxVar = this.g;
            if (aguxVar != null) {
                aguxVar.a(Boolean.valueOf(z));
            }
            this.e.a();
        }
    }

    public bhc(agum agumVar, agux aguxVar) {
        this.f = agumVar;
        this.g = aguxVar;
        this.a = new ArrayList();
        this.b = new agqi();
        this.c = new agqi();
        this.e = new agum() { // from class: bhb
            @Override // defpackage.agum
            public final Object a() {
                return agpu.a;
            }
        };
    }
}
