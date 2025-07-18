package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvb implements vvh {
    private final vvh[] a;

    public vvb(vvh... vvhVarArr) {
        this.a = vvhVarArr;
    }

    @Override // defpackage.vvh
    public final vvg a(Class cls) {
        for (int i = 0; i < 2; i++) {
            vvh vvhVar = this.a[i];
            if (vvhVar.b(cls)) {
                return vvhVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.vvh
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
