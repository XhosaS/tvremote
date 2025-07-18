package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbc extends InputStream implements InputStreamRetargetInterface {
    private boolean a = true;
    private InputStream b;
    private final bda c;

    public dbc(bda bdaVar) {
        this.c = bdaVar;
    }

    private final czy a() throws IOException {
        czb czbVarD = this.c.d();
        if (czbVarD == null) {
            return null;
        }
        if (czbVarD instanceof czy) {
            return (czy) czbVarD;
        }
        throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(czbVarD.getClass()))));
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        czy czyVarA;
        if (this.b == null) {
            if (!this.a || (czyVarA = a()) == null) {
                return -1;
            }
            this.a = false;
            this.b = czyVarA.b();
        }
        while (true) {
            int i = this.b.read();
            if (i >= 0) {
                return i;
            }
            czy czyVarA2 = a();
            if (czyVarA2 == null) {
                this.b = null;
                return -1;
            }
            this.b = czyVarA2.b();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        czy czyVarA;
        int i3 = 0;
        if (this.b == null) {
            if (!this.a || (czyVarA = a()) == null) {
                return -1;
            }
            this.a = false;
            this.b = czyVarA.b();
        }
        while (true) {
            int i4 = this.b.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                czy czyVarA2 = a();
                if (czyVarA2 == null) {
                    this.b = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.b = czyVarA2.b();
            }
        }
    }
}
