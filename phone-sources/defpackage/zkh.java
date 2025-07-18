package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zkh extends InputStream implements InputStreamRetargetInterface {
    private zid c;
    private InputStream d;
    private final eph e;
    private boolean b = true;
    public int a = 0;

    public zkh(eph ephVar) {
        this.e = ephVar;
    }

    private final zid a() throws IOException {
        zih zihVarE = this.e.E();
        if (zihVarE == null) {
            return null;
        }
        if (!(zihVarE instanceof zid)) {
            throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(zihVarE.getClass()))));
        }
        if (this.a == 0) {
            return (zid) zihVarE;
        }
        throw new IOException("only the last nested bitstring can have padding");
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.d == null) {
            if (this.b) {
                zid zidVarA = a();
                this.c = zidVarA;
                if (zidVarA != null) {
                    this.b = false;
                    this.d = zidVarA.g();
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
            zid zidVarA2 = a();
            this.c = zidVarA2;
            if (zidVarA2 == null) {
                this.d = null;
                return -1;
            }
            this.d = zidVarA2.g();
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
            zid zidVarA = a();
            this.c = zidVarA;
            if (zidVarA == null) {
                return -1;
            }
            this.b = false;
            this.d = zidVarA.g();
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
                zid zidVarA2 = a();
                this.c = zidVarA2;
                if (zidVarA2 == null) {
                    this.d = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.d = zidVarA2.g();
            }
        }
    }
}
