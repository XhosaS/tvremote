package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfj extends OutputStream {
    private final Signature a;

    public dfj(Signature signature) {
        this.a = signature;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws SignatureException, IOException {
        try {
            this.a.update((byte) i);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws SignatureException, IOException {
        try {
            this.a.update(bArr);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws SignatureException, IOException {
        try {
            this.a.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
