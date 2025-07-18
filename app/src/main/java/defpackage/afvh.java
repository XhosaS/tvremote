package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afvh extends OutputStream {
    public final List a = new ArrayList();
    final /* synthetic */ afvk b;
    private agaf c;

    public afvh(afvk afvkVar) {
        this.b = afvkVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        agaf agafVar = this.c;
        if (agafVar == null || agafVar.b() <= 0) {
            write(new byte[]{b}, 0, 1);
        } else {
            this.c.c(b);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            afvk afvkVar = this.b;
            agaf agafVarA = afvkVar.g.a(Math.max(4096, i2));
            this.c = agafVarA;
            this.a.add(agafVarA);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.c.b());
            if (iMin == 0) {
                int iA = this.c.a();
                agaf agafVarA2 = this.b.g.a(Math.max(i2, iA + iA));
                this.c = agafVarA2;
                this.a.add(agafVarA2);
            } else {
                this.c.d(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}
