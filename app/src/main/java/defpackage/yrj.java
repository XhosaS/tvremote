package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class yrj extends ypw {
    final CharSequence c;
    final yqd d;
    final boolean e;
    int f = 0;
    int g = Integer.MAX_VALUE;

    protected yrj(yrl yrlVar, CharSequence charSequence) {
        this.d = yrlVar.a;
        this.e = yrlVar.b;
        this.c = charSequence;
    }

    @Override // defpackage.ypw
    protected final /* bridge */ /* synthetic */ Object a() {
        int iC;
        int iB;
        int i = this.f;
        while (true) {
            int i2 = this.f;
            if (i2 == -1) {
                this.a = 3;
                return null;
            }
            iC = c(i2);
            if (iC == -1) {
                iC = this.c.length();
                this.f = -1;
                iB = -1;
            } else {
                iB = b(iC);
                this.f = iB;
            }
            if (iB == i) {
                int i3 = iB + 1;
                this.f = i3;
                if (i3 > this.c.length()) {
                    this.f = -1;
                }
            } else {
                while (i < iC && this.d.b(this.c.charAt(i))) {
                    i++;
                }
                while (iC > i) {
                    int i4 = iC - 1;
                    if (!this.d.b(this.c.charAt(i4))) {
                        break;
                    }
                    iC = i4;
                }
                if (!this.e || i != iC) {
                    break;
                }
                i = this.f;
            }
        }
        int i5 = this.g;
        if (i5 == 1) {
            CharSequence charSequence = this.c;
            int length = charSequence.length();
            this.f = -1;
            while (length > i) {
                int i6 = length - 1;
                if (!this.d.b(charSequence.charAt(i6))) {
                    break;
                }
                length = i6;
            }
            iC = length;
        } else {
            this.g = i5 - 1;
        }
        return this.c.subSequence(i, iC).toString();
    }

    public abstract int b(int i);

    public abstract int c(int i);
}
