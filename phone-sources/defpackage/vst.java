package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vst extends vsw {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    public vst(byte[] bArr, int i, int i2) {
        super(bArr);
        a.J(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.vsw, defpackage.vsz
    public final byte a(int i) {
        a.K(i, this.e);
        return this.a[this.d + i];
    }

    @Override // defpackage.vsw, defpackage.vsz
    public final byte b(int i) {
        return this.a[this.d + i];
    }

    @Override // defpackage.vsw
    protected final int c() {
        return this.d;
    }

    @Override // defpackage.vsw, defpackage.vsz
    public final int d() {
        return this.e;
    }

    @Override // defpackage.vsw, defpackage.vsz
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.d + i, bArr, i2, i3);
    }

    Object writeReplace() {
        return new vsw(w());
    }
}
