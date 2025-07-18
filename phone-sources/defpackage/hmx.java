package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmx {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public hjv c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public hll h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public hlg m;
    public hjw n;
    public hng o;
    public boolean p;
    public boolean q;
    public hni r;

    final hlp a(Class cls) {
        hlp hlpVar = (hlp) this.i.get(cls);
        if (hlpVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    hlpVar = (hlp) entry.getValue();
                    break;
                }
            }
        }
        if (hlpVar != null) {
            return hlpVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new IllegalArgumentException(a.cw(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return hra.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [cuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [cuj, java.lang.Object] */
    final hnt b(Class cls) {
        hnt hntVar;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        mta mtaVarB = this.c.b();
        hut hutVar = (hut) mtaVarB.e;
        AtomicReference atomicReference = hutVar.c;
        Class cls6 = this.g;
        Class cls7 = this.j;
        hnt hntVar2 = null;
        hwn hwnVar = (hwn) atomicReference.getAndSet(null);
        if (hwnVar == null) {
            hwnVar = new hwn();
        }
        hwnVar.a(cls5, cls6, cls7);
        ir irVar = hutVar.b;
        synchronized (irVar) {
            hntVar = (hnt) irVar.get(hwnVar);
        }
        hutVar.c.set(hwnVar);
        Object obj = mtaVarB.e;
        hnt hntVar3 = hut.a;
        if (hntVar3.equals(hntVar)) {
            return null;
        }
        if (hntVar != null) {
            return hntVar;
        }
        ArrayList arrayList = new ArrayList();
        fse fseVar = (fse) mtaVarB.g;
        for (Class cls8 : fseVar.y(cls5, cls6)) {
            hfw hfwVar = (hfw) mtaVarB.b;
            for (Class cls9 : hfwVar.m(cls8, cls7)) {
                arrayList.add(new hna(cls5, cls8, cls9, fseVar.x(cls5, cls8), hfwVar.l(cls8, cls9), mtaVarB.j));
                cls5 = cls;
                hfwVar = hfwVar;
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
            hntVar2 = new hnt(cls2, cls3, cls4, arrayList, mtaVarB.j);
        }
        ir irVar2 = ((hut) obj).b;
        synchronized (irVar2) {
            hwn hwnVar2 = new hwn(cls2, cls3, cls4);
            if (hntVar2 != null) {
                hntVar3 = hntVar2;
            }
            irVar2.put(hwnVar2, hntVar3);
        }
        return hntVar2;
    }

    final hos c() {
        return this.r.a();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final List d() {
        if (!this.l) {
            this.l = true;
            List list = this.b;
            list.clear();
            List listE = e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                cvi cviVar = (cvi) listE.get(i);
                Object obj = cviVar.c;
                if (!list.contains(obj)) {
                    list.add(obj);
                }
                int i2 = 0;
                while (true) {
                    ?? r7 = cviVar.b;
                    if (i2 < r7.size()) {
                        if (!list.contains(r7.get(i2))) {
                            list.add((hlg) r7.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return this.b;
    }

    final List e() {
        if (!this.k) {
            this.k = true;
            List list = this.a;
            list.clear();
            List listS = this.c.b().s(this.d);
            int size = listS.size();
            for (int i = 0; i < size; i++) {
                cvi cviVarE = ((hqf) listS.get(i)).e(this.d, this.e, this.f, this.h);
                if (cviVarE != null) {
                    list.add(cviVarE);
                }
            }
        }
        return this.a;
    }

    final List f(File file) {
        return this.c.b().s(file);
    }

    final boolean g(Class cls) {
        return b(cls) != null;
    }

    final hok h() {
        return this.c.e;
    }
}
