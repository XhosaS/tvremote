package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hmt implements hmw, hlt {
    private final List a;
    private final hmx b;
    private final hmv c;
    private int d = -1;
    private hlg e;
    private List f;
    private int g;
    private File h;
    private volatile cvi i;

    public hmt(List list, hmx hmxVar, hmv hmvVar) {
        this.a = list;
        this.b = hmxVar;
        this.c = hmvVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hlu, java.lang.Object] */
    @Override // defpackage.hmw
    public final void a() {
        cvi cviVar = this.i;
        if (cviVar != null) {
            cviVar.a.dL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hlu, java.lang.Object] */
    @Override // defpackage.hlt
    public final void b(Object obj) {
        this.c.d(this.e, obj, this.i.a, 3, this.e);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [hlu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [hlu, java.lang.Object] */
    @Override // defpackage.hmw
    public final boolean c() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.i = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    hqf hqfVar = (hqf) list.get(i);
                    File file = this.h;
                    hmx hmxVar = this.b;
                    this.i = hqfVar.e(file, hmxVar.e, hmxVar.f, hmxVar.h);
                    if (this.i != null && hmxVar.g(this.i.a.a())) {
                        this.i.a.f(hmxVar.n, this);
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
            hlg hlgVar = (hlg) list2.get(this.d);
            hmx hmxVar2 = this.b;
            File fileA = hmxVar2.c().a(new hmu(hlgVar, hmxVar2.m));
            this.h = fileA;
            if (fileA != null) {
                this.e = hlgVar;
                this.f = hmxVar2.f(fileA);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [hlu, java.lang.Object] */
    @Override // defpackage.hlt
    public final void e(Exception exc) {
        this.c.b(this.e, exc, this.i.a, 3);
    }
}
