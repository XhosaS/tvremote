package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcf {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public cyk c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public dan h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public daj m;
    public cyn n;
    public dcr o;
    public boolean p;
    public boolean q;
    public dcw r;

    final dar a(Class cls) {
        dar darVar = (dar) this.i.get(cls);
        if (darVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    darVar = (dar) entry.getValue();
                    break;
                }
            }
        }
        if (darVar != null) {
            return darVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new IllegalArgumentException(a.o(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return dja.b;
    }

    final ddm b(Class cls) {
        ddm ddmVar;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        cyt cytVarA = this.c.a();
        Class cls6 = this.g;
        Class cls7 = this.j;
        doe doeVar = cytVarA.i;
        ddm ddmVar2 = null;
        dqj dqjVar = (dqj) doeVar.c.getAndSet(null);
        if (dqjVar == null) {
            dqjVar = new dqj();
        }
        dqjVar.a(cls5, cls6, cls7);
        we weVar = doeVar.b;
        synchronized (weVar) {
            ddmVar = (ddm) weVar.get(dqjVar);
        }
        doeVar.c.set(dqjVar);
        doe doeVar2 = cytVarA.i;
        ddm ddmVar3 = doe.a;
        if (ddmVar3.equals(ddmVar)) {
            return null;
        }
        if (ddmVar != null) {
            return ddmVar;
        }
        ArrayList arrayList = new ArrayList();
        doh dohVar = cytVarA.c;
        for (Class cls8 : dohVar.b(cls5, cls6)) {
            dmq dmqVar = cytVarA.f;
            for (Class cls9 : dmqVar.b(cls8, cls7)) {
                arrayList.add(new dcl(cls5, cls8, cls9, dohVar.a(cls5, cls8), dmqVar.a(cls8, cls9), cytVarA.j));
                cls5 = cls;
                dmqVar = dmqVar;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            ddmVar2 = new ddm(cls2, cls3, cls4, arrayList, cytVarA.j);
        }
        we weVar2 = doeVar2.b;
        synchronized (weVar2) {
            dqj dqjVar2 = new dqj(cls2, cls3, cls4);
            if (ddmVar2 != null) {
                ddmVar3 = ddmVar2;
            }
            weVar2.put(dqjVar2, ddmVar3);
        }
        return ddmVar2;
    }

    final List c() {
        if (!this.l) {
            this.l = true;
            List list = this.b;
            list.clear();
            List listD = d();
            int size = listD.size();
            for (int i = 0; i < size; i++) {
                dhd dhdVar = (dhd) listD.get(i);
                daj dajVar = dhdVar.a;
                if (!list.contains(dajVar)) {
                    list.add(dajVar);
                }
                int i2 = 0;
                while (true) {
                    List list2 = dhdVar.b;
                    if (i2 < list2.size()) {
                        if (!list.contains(list2.get(i2))) {
                            list.add((daj) list2.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return this.b;
    }

    final List d() {
        if (!this.k) {
            this.k = true;
            List list = this.a;
            list.clear();
            cyt cytVarA = this.c.a();
            List listB = cytVarA.a.b(this.d);
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                dhd dhdVarA = ((dhe) listB.get(i)).a(this.d, this.e, this.f, this.h);
                if (dhdVarA != null) {
                    list.add(dhdVarA);
                }
            }
        }
        return this.a;
    }

    final List e(File file) {
        return this.c.a().a.b(file);
    }

    final boolean f(Class cls) {
        return b(cls) != null;
    }
}
