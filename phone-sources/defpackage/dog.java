package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dog extends doj {
    private static final long serialVersionUID = 1;
    private final int d;

    public dog(byte[] bArr, int i) {
        super(bArr);
        a.J(0, i, bArr.length);
        this.d = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.doj, defpackage.dol
    public final byte a(int i) {
        a.K(i, this.d);
        return this.a[i];
    }

    @Override // defpackage.doj, defpackage.dol
    public final byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.doj, defpackage.dol
    public final int c() {
        return this.d;
    }

    Object writeReplace() {
        byte[] bArr;
        int i = this.d;
        if (i == 0) {
            bArr = dpk.b;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(this.a, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        return new doj(bArr);
    }

    @Override // defpackage.doj
    protected final void d() {
    }
}
