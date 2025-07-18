package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyx {
    public final List a;
    public final ygx b;
    public final ygx c;
    public boolean d;
    public yjk e;
    private final yjk f;
    private final yjv g;

    public fyx() {
        this(null, null);
    }

    public static /* synthetic */ void e(fyx fyxVar, fyw fywVar) {
        if (fywVar.b != null) {
            throw new IllegalStateException(a.cj(fywVar, "Callback '", "' is already registered with a dispatcher"));
        }
        if (a.r(1, 0)) {
            fyxVar.b.addFirst(fywVar);
        } else if (a.r(1, 1)) {
            fyxVar.c.addFirst(fywVar);
        }
        fyxVar.d();
        fywVar.b = fyxVar;
    }

    public final List a() {
        List listAf = yfm.af(this.b, this.c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAf) {
            if (((fyw) obj).a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b() {
        List list = this.a;
        List listAl = yfm.al(list);
        if (listAl.isEmpty()) {
            listAl = a();
        }
        list.clear();
        Iterator it = listAl.iterator();
        if (it.hasNext()) {
            ((fyw) it.next()).a();
        }
    }

    public final void c() {
        List list = this.a;
        List listAl = yfm.al(list);
        if (listAl.isEmpty()) {
            listAl = a();
        }
        list.clear();
        if (listAl.isEmpty()) {
            yjk yjkVar = this.f;
            if (yjkVar != null) {
                yjkVar.a();
                return;
            }
            return;
        }
        Iterator it = listAl.iterator();
        if (it.hasNext()) {
            ((fyw) it.next()).b();
        }
    }

    public final void d() {
        ygx ygxVar = this.b;
        boolean z = this.d;
        List listAf = yfm.af(ygxVar, this.c);
        boolean z2 = false;
        if (!listAf.isEmpty()) {
            Iterator it = listAf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((fyw) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.d = z2;
        if (z2 != z) {
            yjv yjvVar = this.g;
            if (yjvVar != null) {
                yjvVar.a(Boolean.valueOf(z2));
            }
            this.e.a();
        }
    }

    public fyx(yjk yjkVar, yjv yjvVar) {
        this.f = yjkVar;
        this.g = yjvVar;
        this.a = new ArrayList();
        this.b = new ygx();
        this.c = new ygx();
        this.e = new awl(20);
    }
}
