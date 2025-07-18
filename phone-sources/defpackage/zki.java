package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zki extends InputStream implements InputStreamRetargetInterface {
    private boolean a = true;
    private InputStream b;
    private final eph c;

    public zki(eph ephVar) {
        this.c = ephVar;
    }

    private final zje a() throws IOException {
        zih zihVarE = this.c.E();
        if (zihVarE == null) {
            return null;
        }
        if (zihVarE instanceof zje) {
            return (zje) zihVarE;
        }
        throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(zihVarE.getClass()))));
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        zje zjeVarA;
        if (this.b == null) {
            if (!this.a || (zjeVarA = a()) == null) {
                return -1;
            }
            this.a = false;
            this.b = zjeVarA.b();
        }
        while (true) {
            int i = this.b.read();
            if (i >= 0) {
                return i;
            }
            zje zjeVarA2 = a();
            if (zjeVarA2 == null) {
                this.b = null;
                return -1;
            }
            this.b = zjeVarA2.b();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        zje zjeVarA;
        int i3 = 0;
        if (this.b == null) {
            if (!this.a || (zjeVarA = a()) == null) {
                return -1;
            }
            this.a = false;
            this.b = zjeVarA.b();
        }
        while (true) {
            int i4 = this.b.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                zje zjeVarA2 = a();
                if (zjeVarA2 == null) {
                    this.b = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.b = zjeVarA2.b();
            }
        }
    }
}
