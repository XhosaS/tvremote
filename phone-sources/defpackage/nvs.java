package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class nvs extends obp {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public nvs(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.obp
    public final byte[] aA() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = (byte[]) this.b.get();
            if (bArrA == null) {
                bArrA = a();
                this.b = new WeakReference(bArrA);
            }
        }
        return bArrA;
    }
}
