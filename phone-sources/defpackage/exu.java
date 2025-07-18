package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exu extends exp {
    public byte[] a;
    public byte[] b;
    private volatile boolean c;

    public exu(ees eesVar, eey eeyVar, dze dzeVar, int i, byte[] bArr) {
        super(eesVar, eeyVar, 3, dzeVar, i, -9223372036854775807L, -9223372036854775807L);
        this.a = bArr == null ? edt.b : bArr;
    }

    @Override // defpackage.ezt
    public final void c() {
        this.c = true;
    }

    @Override // defpackage.ezt
    public final void e() {
        try {
            efw efwVar = this.x;
            efwVar.b(this.q);
            int iA = 0;
            int i = 0;
            while (iA != -1 && !this.c) {
                byte[] bArr = this.a;
                int length = bArr.length;
                if (length < i + 16384) {
                    this.a = Arrays.copyOf(bArr, length + 16384);
                }
                iA = efwVar.a(this.a, i, 16384);
                if (iA != -1) {
                    i += iA;
                }
            }
            if (!this.c) {
                this.b = Arrays.copyOf(this.a, i);
            }
            ecm.e(efwVar);
        } catch (Throwable th) {
            ecm.e(this.x);
            throw th;
        }
    }
}
