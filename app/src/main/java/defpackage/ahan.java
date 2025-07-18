package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahan implements ahao {
    private final agux a;

    public ahan(agux aguxVar) {
        this.a = aguxVar;
    }

    @Override // defpackage.ahao
    public final void b(Throwable th) {
        this.a.a(th);
    }

    public final String toString() {
        return "CancelHandler.UserSupplied[" + this.a.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(this)) + "]";
    }
}
