package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxl {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public ahxl f;
    public ahxl g;

    public ahxl() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final ahxl a() {
        ahxl ahxlVar = this.f;
        ahxl ahxlVar2 = ahxlVar != this ? ahxlVar : null;
        ahxl ahxlVar3 = this.g;
        ahxlVar3.getClass();
        ahxlVar3.f = ahxlVar;
        ahxl ahxlVar4 = this.f;
        ahxlVar4.getClass();
        ahxlVar4.g = ahxlVar3;
        this.f = null;
        this.g = null;
        return ahxlVar2;
    }

    public final ahxl b() {
        this.d = true;
        return new ahxl(this.a, this.b, this.c, true);
    }

    public final void c(ahxl ahxlVar, int i) {
        if (!ahxlVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = ahxlVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (ahxlVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = ahxlVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = ahxlVar.a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            i2 = ahxlVar.c - ahxlVar.b;
            ahxlVar.c = i2;
            ahxlVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = ahxlVar.a;
        int i5 = this.b;
        System.arraycopy(bArr2, i5, bArr3, i2, (i5 + i) - i5);
        ahxlVar.c += i;
        this.b += i;
    }

    public final void d(ahxl ahxlVar) {
        ahxlVar.g = this;
        ahxlVar.f = this.f;
        ahxl ahxlVar2 = this.f;
        ahxlVar2.getClass();
        ahxlVar2.g = ahxlVar;
        this.f = ahxlVar;
    }

    public ahxl(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
