package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdy extends InputStream implements InputStreamRetargetInterface, affx, afgy {
    public MessageLite a;
    public final abyy b;
    private ByteArrayInputStream c;

    public agdy(MessageLite messageLite, abyy abyyVar) {
        this.a = messageLite;
        this.b = abyyVar;
    }

    @Override // defpackage.affx
    public final int a(OutputStream outputStream) throws IOException {
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            int iG = messageLite.g();
            this.a.e(outputStream);
            this.a = null;
            return iG;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = agea.a;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += i;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            return messageLite.g();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            this.c = new ByteArrayInputStream(messageLite.toByteArray());
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
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            int iG = messageLite.g();
            if (iG == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= iG) {
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, i, iG);
                this.a.f(abvwVar);
                abvwVar.K();
                this.a = null;
                this.c = null;
                return iG;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
