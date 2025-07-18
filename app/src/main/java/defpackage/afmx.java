package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afmx implements afwn {
    protected final void a(int i) {
        if (g() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // defpackage.afwn
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.afwn
    public boolean d() {
        return false;
    }

    @Override // defpackage.afwn
    public void b() {
    }

    @Override // defpackage.afwn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
