package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class afe extends air {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public afe(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] b();

    @Override // defpackage.air
    public final byte[] x() {
        byte[] bArrB;
        synchronized (this) {
            bArrB = (byte[]) this.b.get();
            if (bArrB == null) {
                bArrB = b();
                this.b = new WeakReference(bArrB);
            }
        }
        return bArrB;
    }
}
