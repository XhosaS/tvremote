package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzh implements hxz {
    public final List a;
    private float b;
    private float c;
    private hzi d;
    private boolean e;
    private boolean f;
    private int g;
    private boolean h;

    public hzh(hxy hxyVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (hxyVar == null) {
            return;
        }
        hxyVar.d(this);
        if (this.h) {
            this.d.a((hzi) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        hzi hziVar = this.d;
        if (hziVar != null) {
            arrayList.add(hziVar);
        }
    }

    @Override // defpackage.hxz
    public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        hzi hziVar = this.d;
        hzr.c(hziVar.a, hziVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // defpackage.hxz
    public final void b() {
        this.a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    @Override // defpackage.hxz
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.b(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new hzi(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // defpackage.hxz
    public final void e(float f, float f2) {
        this.d.b(f, f2);
        this.a.add(this.d);
        hzi hziVar = this.d;
        this.d = new hzi(f, f2, f - hziVar.a, f2 - hziVar.b);
        this.h = false;
    }

    @Override // defpackage.hxz
    public final void f(float f, float f2) {
        if (this.h) {
            hzi hziVar = this.d;
            List list = this.a;
            hziVar.a((hzi) list.get(this.g));
            list.set(this.g, this.d);
            this.h = false;
        }
        hzi hziVar2 = this.d;
        if (hziVar2 != null) {
            this.a.add(hziVar2);
        }
        this.b = f;
        this.c = f2;
        this.d = new hzi(f, f2, 0.0f, 0.0f);
        this.g = this.a.size();
    }

    @Override // defpackage.hxz
    public final void g(float f, float f2, float f3, float f4) {
        this.d.b(f, f2);
        this.a.add(this.d);
        this.d = new hzi(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }
}
