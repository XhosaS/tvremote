package defpackage;

import java.io.Serializable;
import java.io.StreamCorruptedException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwv implements Serializable {
    private static final long serialVersionUID = 1;
    public String a;
    public byte[] b;
    public int c;

    public Object readResolve() throws StreamCorruptedException {
        try {
            byte[] bArr = this.b;
            vuc vucVarP = vuc.p(xbe.a, bArr, 0, bArr.length, vtp.a());
            vuc.B(vucVarP);
            return kwx.subtitleTrack(this.a, (xbe) vucVarP, this.c);
        } catch (vuq unused) {
            throw new StreamCorruptedException();
        }
    }
}
