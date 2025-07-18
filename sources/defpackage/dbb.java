package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbb extends InputStream implements InputStreamRetargetInterface {
    private cyx c;
    private InputStream d;
    private final bda e;
    private boolean b = true;
    public int a = 0;

    public dbb(bda bdaVar) {
        this.e = bdaVar;
    }

    private final cyx a() throws IOException {
        czb czbVarD = this.e.d();
        if (czbVarD == null) {
            return null;
        }
        if (!(czbVarD instanceof cyx)) {
            throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(czbVarD.getClass()))));
        }
        if (this.a == 0) {
            return (cyx) czbVarD;
        }
        throw new IOException("only the last nested bitstring can have padding");
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.d == null) {
            if (this.b) {
                cyx cyxVarA = a();
                this.c = cyxVarA;
                if (cyxVarA != null) {
                    this.b = false;
                    this.d = cyxVarA.g();
                }
            }
            return -1;
        }
        while (true) {
            int i = this.d.read();
            if (i >= 0) {
                return i;
            }
            this.a = this.c.f();
            cyx cyxVarA2 = a();
            this.c = cyxVarA2;
            if (cyxVarA2 == null) {
                this.d = null;
                return -1;
            }
            this.d = cyxVarA2.g();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.d == null) {
            if (!this.b) {
                return -1;
            }
            cyx cyxVarA = a();
            this.c = cyxVarA;
            if (cyxVarA == null) {
                return -1;
            }
            this.b = false;
            this.d = cyxVarA.g();
        }
        while (true) {
            int i4 = this.d.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.a = this.c.f();
                cyx cyxVarA2 = a();
                this.c = cyxVarA2;
                if (cyxVarA2 == null) {
                    this.d = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.d = cyxVarA2.g();
            }
        }
    }
}
