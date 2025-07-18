package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpt implements dpy {
    private final dpy[] a;

    public dpt(dpy... dpyVarArr) {
        this.a = dpyVarArr;
    }

    @Override // defpackage.dpy
    public final dpx a(Class cls) {
        for (int i = 0; i < 2; i++) {
            dpy dpyVar = this.a[i];
            if (dpyVar.b(cls)) {
                return dpyVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.dpy
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
