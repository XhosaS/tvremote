package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class kdi extends kdg {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public kdi(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] c();

    @Override // defpackage.kdg
    public final byte[] g() {
        byte[] bArrC;
        synchronized (this) {
            bArrC = (byte[]) this.b.get();
            if (bArrC == null) {
                bArrC = c();
                this.b = new WeakReference(bArrC);
            }
        }
        return bArrC;
    }
}
