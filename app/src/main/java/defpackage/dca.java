package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class dca implements dce, dav {
    private final List a;
    private final dcf b;
    private final dcd c;
    private int d = -1;
    private daj e;
    private List f;
    private int g;
    private volatile dhd h;
    private File i;

    public dca(List list, dcf dcfVar, dcd dcdVar) {
        this.a = list;
        this.b = dcfVar;
        this.c = dcdVar;
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
        this.c.e(this.e, obj, this.h.c, 3, this.e);
    }

    @Override // defpackage.dce
    public final boolean c() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.h = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    dhe dheVar = (dhe) list.get(i);
                    File file = this.i;
                    dcf dcfVar = this.b;
                    this.h = dheVar.a(file, dcfVar.e, dcfVar.f, dcfVar.h);
                    if (this.h != null && dcfVar.f(this.h.c.a())) {
                        this.h.c.f(dcfVar.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return false;
            }
            daj dajVar = (daj) list2.get(this.d);
            dcf dcfVar2 = this.b;
            File fileA = dcfVar2.r.a().a(new dcb(dajVar, dcfVar2.m));
            this.i = fileA;
            if (fileA != null) {
                this.e = dajVar;
                this.f = dcfVar2.e(fileA);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.dav
    public final void e(Exception exc) {
        this.c.d(this.e, exc, this.h.c, 3);
    }
}
