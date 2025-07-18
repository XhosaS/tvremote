package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmr implements cmx {
    private final cmx[] a;

    public cmr(cmx... cmxVarArr) {
        this.a = cmxVarArr;
    }

    @Override // defpackage.cmx
    public final cmw a(Class cls) {
        for (int i = 0; i < 2; i++) {
            cmx cmxVar = this.a[i];
            if (cmxVar.b(cls)) {
                return cmxVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.cmx
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
