package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abyh implements abyp {
    private final abyp[] a;

    public abyh(abyp... abypVarArr) {
        this.a = abypVarArr;
    }

    @Override // defpackage.abyp
    public final abyo a(Class cls) {
        for (int i = 0; i < 2; i++) {
            abyp abypVar = this.a[i];
            if (abypVar.b(cls)) {
                return abypVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.abyp
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
