package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evs extends evo {
    public static final Object f = new Object();
    public final Object g;
    private final Object h;

    public evs(eay eayVar, Object obj, Object obj2) {
        super(eayVar);
        this.h = obj;
        this.g = obj2;
    }

    public static evs s(dzy dzyVar) {
        return new evs(new evt(dzyVar), eax.a, f);
    }

    @Override // defpackage.evo, defpackage.eay
    public final int a(Object obj) {
        Object obj2;
        if (f.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.a(obj);
    }

    @Override // defpackage.evo, defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        this.e.d(i, eavVar, z);
        if (Objects.equals(eavVar.g, this.g) && z) {
            eavVar.g = f;
        }
        return eavVar;
    }

    @Override // defpackage.evo, defpackage.eay
    public final eax e(int i, eax eaxVar, long j) {
        this.e.e(i, eaxVar, j);
        if (Objects.equals(eaxVar.o, this.h)) {
            eaxVar.o = eax.a;
        }
        return eaxVar;
    }

    @Override // defpackage.evo, defpackage.eay
    public final Object f(int i) {
        Object objF = this.e.f(i);
        return Objects.equals(objF, this.g) ? f : objF;
    }

    public final evs r(eay eayVar) {
        return new evs(eayVar, this.h, this.g);
    }
}
