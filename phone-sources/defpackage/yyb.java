package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyb extends yyc {
    public static final yyb a = new yyb();

    private yyb() {
        super(yyf.c, yyf.d, yyf.e, yyf.a);
    }

    @Override // defpackage.yyc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.yot
    public final yot g(int i) {
        wae.S(1);
        return yyf.c <= 1 ? this : super.g(1);
    }

    @Override // defpackage.yot
    public final String toString() {
        return "Dispatchers.Default";
    }
}
