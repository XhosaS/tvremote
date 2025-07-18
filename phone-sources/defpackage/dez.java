package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dez implements dff {
    private final dff[] a;

    public dez(dff... dffVarArr) {
        this.a = dffVarArr;
    }

    @Override // defpackage.dff
    public final dfe a(Class cls) {
        for (int i = 0; i < 2; i++) {
            dff dffVar = this.a[i];
            if (dffVar.b(cls)) {
                return dffVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.dff
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
