package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fil {
    public final fim a = new fim();
    public final edi b = new edi(new byte[65025], 0);
    public int c = -1;
    public boolean d;
    private int e;

    private final int b(int i) {
        int i2;
        int i3 = 0;
        this.e = 0;
        do {
            int i4 = this.e;
            int i5 = i + i4;
            fim fimVar = this.a;
            if (i5 >= fimVar.c) {
                break;
            }
            this.e = i4 + 1;
            i2 = fimVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(fdq fdqVar) {
        a.ab(true);
        if (this.d) {
            this.d = false;
            this.b.G(0);
        }
        while (!this.d) {
            int i = this.c;
            if (i < 0) {
                fim fimVar = this.a;
                if (!fimVar.c(fdqVar) || !fimVar.b(fdqVar, true)) {
                    return false;
                }
                int iB = fimVar.d;
                if ((fimVar.a & 1) == 1 && this.b.c == 0) {
                    iB += b(0);
                    i = this.e;
                } else {
                    i = 0;
                }
                if (!fki.Y(fdqVar, iB)) {
                    return false;
                }
                this.c = i;
            }
            int iB2 = b(i);
            int i2 = this.c + this.e;
            if (iB2 > 0) {
                edi ediVar = this.b;
                ediVar.D(ediVar.c + iB2);
                if (!fki.X(fdqVar, ediVar.a, ediVar.c, iB2)) {
                    return false;
                }
                ediVar.J(ediVar.c + iB2);
                this.d = this.a.f[i2 + (-1)] != 255;
            }
            if (i2 == this.a.c) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }
}
