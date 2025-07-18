package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmz extends ahnb {
    public static final ahmz a = new ahmz();

    private ahmz() {
        super(ahne.c, ahne.d, ahne.e, ahne.a);
    }

    @Override // defpackage.ahnb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.ahbm
    public final String toString() {
        return "Dispatchers.Default";
    }
}
