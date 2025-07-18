package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yeo extends InputStream implements InputStreamRetargetInterface, xrj {
    public vvj a;
    public final vvq b;
    public ByteArrayInputStream c;

    public yeo(vvj vvjVar, vvq vvqVar) {
        this.a = vvjVar;
        this.b = vvqVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        vvj vvjVar = this.a;
        if (vvjVar != null) {
            return vvjVar.l();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        vvj vvjVar = this.a;
        if (vvjVar != null) {
            this.c = new ByteArrayInputStream(vvjVar.h());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        vvj vvjVar = this.a;
        if (vvjVar != null) {
            int iL = vvjVar.l();
            if (iL == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= iL) {
                boolean z = vtj.e;
                vth vthVar = new vth(bArr, i, iL);
                this.a.dO(vthVar);
                vthVar.ai();
                this.a = null;
                this.c = null;
                return iL;
            }
            this.c = new ByteArrayInputStream(this.a.h());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
