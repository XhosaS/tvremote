package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahco implements ahao {
    private final ahcn a;

    public ahco(ahcn ahcnVar) {
        this.a = ahcnVar;
    }

    @Override // defpackage.ahao
    public final void b(Throwable th) {
        this.a.fn();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.a + "]";
    }
}
