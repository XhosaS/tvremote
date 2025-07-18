package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class oil {
    private final ohr b;
    private final Object a = new Object();
    private volatile long c = 0;
    private volatile boolean d = false;
    private final List e = new ArrayList(15);
    private final List f = new ArrayList(5);

    public oil(ohr ohrVar) {
        this.b = ohrVar;
    }

    final List a(String str, oih oihVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this.a) {
            List list = this.e;
            arrayList = new ArrayList(list);
            List list2 = this.f;
            arrayList2 = new ArrayList(list2);
            list.clear();
            list2.clear();
        }
        ohl ohlVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                ohlVar = new ohl();
                oihVar.b(((Long) arrayList.get(i)).intValue());
            } else if (i2 == 1) {
                ohlVar.a = (Long) arrayList.get(i);
            } else {
                ohlVar.b(str);
                ohlVar.b = (Long) arrayList.get(i);
                ((ohn) oihVar).b = (oif) arrayList2.get(i / 3);
                ohlVar.d = oihVar.a();
                arrayList3.add(ohlVar);
            }
        }
        return arrayList3;
    }

    final void b() {
        if (this.d) {
            return;
        }
        synchronized (this.a) {
            this.e.clear();
            this.f.clear();
            this.d = true;
        }
    }

    final void c() {
        List list;
        int size;
        if (this.d) {
            return;
        }
        synchronized (this.a) {
            if (!this.d && (size = (list = this.e).size()) < 15 && size % 3 == 2) {
                list.add(Long.valueOf(((tmt) this.b).a.a() / 1000));
            }
        }
    }

    final void d() {
        List list;
        int size;
        if (this.d) {
            return;
        }
        synchronized (this.a) {
            if (!this.d && (size = (list = this.e).size()) < 15 && size % 3 == 0) {
                this.c++;
                list.add(Long.valueOf(this.c));
                list.add(Long.valueOf(((tmt) this.b).a.a() / 1000));
                this.f.add(oie.a());
            }
        }
    }
}
