package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class ddq implements dce, dav {
    private final dcd a;
    private final dcf b;
    private int c;
    private int d = -1;
    private daj e;
    private List f;
    private int g;
    private volatile dhd h;
    private File i;
    private ddr j;

    public ddq(dcf dcfVar, dcd dcdVar) {
        this.b = dcfVar;
        this.a = dcdVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    @Override // defpackage.dce
    public final void a() {
        dhd dhdVar = this.h;
        if (dhdVar != null) {
            dhdVar.c.cz();
        }
    }

    @Override // defpackage.dav
    public final void b(Object obj) {
        this.a.e(this.e, obj, this.h.c, 4, this.j);
    }

    @Override // defpackage.dce
    public final boolean c() {
        List arrayList;
        dcf dcfVar = this.b;
        List listC = dcfVar.c();
        boolean z = false;
        if (listC.isEmpty()) {
            return false;
        }
        cyt cytVarA = dcfVar.c.a();
        Class<?> cls = dcfVar.d.getClass();
        Class cls2 = dcfVar.g;
        Class cls3 = dcfVar.j;
        dof dofVar = cytVarA.h;
        dqj dqjVar = (dqj) dofVar.a.getAndSet(null);
        if (dqjVar == null) {
            dqjVar = new dqj(cls, cls2, cls3);
        } else {
            dqjVar.a(cls, cls2, cls3);
        }
        we weVar = dofVar.b;
        synchronized (weVar) {
            arrayList = (List) weVar.get(dqjVar);
        }
        dofVar.a.set(dqjVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            Iterator it = cytVarA.a.a(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : cytVarA.c.b((Class) it.next(), cls2)) {
                    if (!cytVarA.f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            dof dofVar2 = cytVarA.h;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            we weVar2 = dofVar2.b;
            synchronized (weVar2) {
                weVar2.put(new dqj(cls, cls2, cls3), listUnmodifiableList);
            }
        }
        if (arrayList.isEmpty()) {
            dcf dcfVar2 = this.b;
            if (File.class.equals(dcfVar2.j)) {
                return false;
            }
            throw new IllegalStateException(a.r(dcfVar2.j, String.valueOf(dcfVar2.d.getClass()), "Failed to find any load path from ", " to "));
        }
        while (true) {
            if (this.f != null && d()) {
                this.h = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    dhe dheVar = (dhe) list.get(i);
                    File file = this.i;
                    dcf dcfVar3 = this.b;
                    this.h = dheVar.a(file, dcfVar3.e, dcfVar3.f, dcfVar3.h);
                    if (this.h != null && dcfVar3.f(this.h.c.a())) {
                        this.h.c.f(dcfVar3.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= arrayList.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= listC.size()) {
                    return false;
                }
                this.d = 0;
            }
            daj dajVar = (daj) listC.get(this.c);
            Class cls5 = (Class) arrayList.get(this.d);
            dcf dcfVar4 = this.b;
            this.j = new ddr(dcfVar4.c.b, dajVar, dcfVar4.m, dcfVar4.e, dcfVar4.f, dcfVar4.a(cls5), cls5, dcfVar4.h);
            File fileA = dcfVar4.r.a().a(this.j);
            this.i = fileA;
            if (fileA != null) {
                this.e = dajVar;
                this.f = dcfVar4.e(fileA);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.dav
    public final void e(Exception exc) {
        this.a.d(this.j, exc, this.h.c, 4);
    }
}
