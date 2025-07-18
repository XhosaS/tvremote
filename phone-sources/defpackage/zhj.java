package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhj {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public zhj f;
    public zhj g;

    public zhj() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final zhj a() {
        zhj zhjVar = this.f;
        zhj zhjVar2 = zhjVar != this ? zhjVar : null;
        zhj zhjVar3 = this.g;
        zhjVar3.getClass();
        zhjVar3.f = zhjVar;
        zhj zhjVar4 = this.f;
        zhjVar4.getClass();
        zhjVar4.g = zhjVar3;
        this.f = null;
        this.g = null;
        return zhjVar2;
    }

    public final zhj b() {
        this.d = true;
        return new zhj(this.a, this.b, this.c, true);
    }

    public final void c(zhj zhjVar, int i) {
        if (!zhjVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = zhjVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (zhjVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = zhjVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = zhjVar.a;
            yfm.be(bArr, bArr, 0, i4, i2);
            i2 = zhjVar.c - zhjVar.b;
            zhjVar.c = i2;
            zhjVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = zhjVar.a;
        int i5 = this.b;
        yfm.be(bArr2, bArr3, i2, i5, i5 + i);
        zhjVar.c += i;
        this.b += i;
    }

    public final void d(zhj zhjVar) {
        zhjVar.g = this;
        zhjVar.f = this.f;
        zhj zhjVar2 = this.f;
        zhjVar2.getClass();
        zhjVar2.g = zhjVar;
        this.f = zhjVar;
    }

    public zhj(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
