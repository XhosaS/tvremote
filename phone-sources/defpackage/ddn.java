package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddn extends ddq {
    private static final long serialVersionUID = 1;
    private final int d;

    public ddn(byte[] bArr, int i) {
        super(bArr);
        a.J(0, i, bArr.length);
        this.d = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.ddq, defpackage.dds
    public final byte a(int i) {
        a.K(i, this.d);
        return this.a[i];
    }

    @Override // defpackage.ddq, defpackage.dds
    public final byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.ddq, defpackage.dds
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ddq, defpackage.dds
    protected final void d(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }

    Object writeReplace() {
        return new ddq(k());
    }

    @Override // defpackage.ddq
    protected final void e() {
    }
}
