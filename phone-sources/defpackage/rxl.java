package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxl extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ rxm a;

    public rxl(rxm rxmVar) {
        this.a = rxmVar;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
        try {
            Inflater inflater = this.a.a;
            int iInflate = inflater.inflate(bArr, i, i2);
            if (iInflate > 0) {
                return iInflate;
            }
            if (i2 == 0) {
                return 0;
            }
            if (inflater.getRemaining() == 0) {
                return -1;
            }
            throw new IOException("Read no bytes (requested up to " + i2 + ") but did not reach end of stream, had " + this.a.a.getRemaining());
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }
}
