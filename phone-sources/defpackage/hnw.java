package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnw implements hmw, hlt {
    private final hmv a;
    private final hmx b;
    private int c;
    private int d = -1;
    private hlg e;
    private List f;
    private int g;
    private File h;
    private hnx i;
    private volatile cvi j;

    public hnw(hmx hmxVar, hmv hmvVar) {
        this.b = hmxVar;
        this.a = hmvVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hlu, java.lang.Object] */
    @Override // defpackage.hmw
    public final void a() {
        cvi cviVar = this.j;
        if (cviVar != null) {
            cviVar.a.dL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hlu, java.lang.Object] */
    @Override // defpackage.hlt
    public final void b(Object obj) {
        this.a.d(this.e, obj, this.j.a, 4, this.i);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [hlu, java.lang.Object] */
    @Override // defpackage.hmw
    public final boolean c() {
        List arrayList;
        hmx hmxVar = this.b;
        List listD = hmxVar.d();
        boolean z = false;
        if (listD.isEmpty()) {
            return false;
        }
        mta mtaVarB = hmxVar.c.b();
        Class<?> cls = hmxVar.d.getClass();
        Class cls2 = hmxVar.g;
        Class cls3 = hmxVar.j;
        Object obj = mtaVarB.a;
        hwn hwnVar = (hwn) ((AtomicReference) ((fse) obj).b).getAndSet(null);
        if (hwnVar == null) {
            hwnVar = new hwn(cls, cls2, cls3);
        } else {
            hwnVar.a(cls, cls2, cls3);
        }
        Object obj2 = ((fse) obj).a;
        synchronized (obj2) {
            arrayList = (List) ((ko) obj2).get(hwnVar);
        }
        ((AtomicReference) ((fse) obj).b).set(hwnVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            Iterator it = ((fse) mtaVarB.f).G(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : ((fse) mtaVarB.g).y((Class) it.next(), cls2)) {
                    if (!((hfw) mtaVarB.b).m(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            Object obj3 = mtaVarB.a;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            Object obj4 = ((fse) obj3).a;
            synchronized (obj4) {
                ((ko) obj4).put(new hwn(cls, cls2, cls3), listUnmodifiableList);
            }
        }
        if (arrayList.isEmpty()) {
            hmx hmxVar2 = this.b;
            if (File.class.equals(hmxVar2.j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(hmxVar2.d.getClass()) + " to " + String.valueOf(hmxVar2.j));
        }
        while (true) {
            if (this.f != null && d()) {
                this.j = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    hqf hqfVar = (hqf) list.get(i);
                    File file = this.h;
                    hmx hmxVar3 = this.b;
                    this.j = hqfVar.e(file, hmxVar3.e, hmxVar3.f, hmxVar3.h);
                    if (this.j != null && hmxVar3.g(this.j.a.a())) {
                        this.j.a.f(hmxVar3.n, this);
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
                if (i3 >= listD.size()) {
                    return false;
                }
                this.d = 0;
            }
            hlg hlgVar = (hlg) listD.get(this.c);
            Class cls5 = (Class) arrayList.get(this.d);
            hmx hmxVar4 = this.b;
            this.i = new hnx(hmxVar4.h(), hlgVar, hmxVar4.m, hmxVar4.e, hmxVar4.f, hmxVar4.a(cls5), cls5, hmxVar4.h);
            File fileA = hmxVar4.c().a(this.i);
            this.h = fileA;
            if (fileA != null) {
                this.e = hlgVar;
                this.f = hmxVar4.f(fileA);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [hlu, java.lang.Object] */
    @Override // defpackage.hlt
    public final void e(Exception exc) {
        this.a.b(this.i, exc, this.j.a, 4);
    }
}
