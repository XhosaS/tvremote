package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exc implements ezt {
    public final long a = evq.a();
    public final eey b;
    public final efw c;
    public byte[] d;

    public exc(eey eeyVar, ees eesVar) {
        this.b = eeyVar;
        this.c = new efw(eesVar);
    }

    @Override // defpackage.ezt
    public final void e() {
        int i;
        byte[] bArr;
        efw efwVar = this.c;
        efwVar.g();
        try {
            efwVar.b(this.b);
            do {
                i = (int) efwVar.a;
                byte[] bArr2 = this.d;
                if (bArr2 == null) {
                    this.d = new byte[1024];
                } else {
                    int length = bArr2.length;
                    if (i == length) {
                        this.d = Arrays.copyOf(bArr2, length + length);
                    }
                }
                bArr = this.d;
            } while (efwVar.a(bArr, i, bArr.length - i) != -1);
        } finally {
            ecm.e(this.c);
        }
    }

    @Override // defpackage.ezt
    public final void c() {
    }
}
