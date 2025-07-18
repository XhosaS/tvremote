package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajb implements CharSequence {
    private CharSequence a;
    private aiw b;
    private int c = -1;
    private int d = -1;

    public ajb(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final char a(int i) {
        aiw aiwVar = this.b;
        if (aiwVar == null) {
            return this.a.charAt(i);
        }
        int i2 = this.c;
        if (i < i2) {
            return this.a.charAt(i);
        }
        int iB = aiwVar.b();
        if (i >= iB + i2) {
            return this.a.charAt(i - ((iB - this.d) + i2));
        }
        int i3 = i - i2;
        int i4 = aiwVar.c;
        if (i3 < i4) {
            return aiwVar.b[i3];
        }
        return aiwVar.b[(i3 - i4) + aiwVar.d];
    }

    public final int b() {
        aiw aiwVar = this.b;
        return aiwVar == null ? this.a.length() : (this.a.length() - (this.d - this.c)) + aiwVar.b();
    }

    public final void c(int i, int i2, CharSequence charSequence, int i3) {
        if (i > i2) {
            wv.c(a.ce(i2, i, "start=", " > end="));
        }
        if (i3 < 0) {
            wv.c(a.cf(i3, "textStart=0 > textEnd="));
        }
        if (i < 0) {
            wv.c(a.cf(i, "start must be non-negative, but was "));
        }
        aiw aiwVar = this.b;
        if (aiwVar == null) {
            int iMax = Math.max(255, i3 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            int i4 = i - iMin;
            hv.k(this.a, cArr, 0, i4, i);
            int i5 = iMax - iMin2;
            int i6 = iMin2 + i2;
            hv.k(this.a, cArr, i5, i2, i6);
            hv.k(charSequence, cArr, iMin, 0, i3);
            this.b = new aiw(cArr, iMin + i3, i5);
            this.c = i4;
            this.d = i6;
            return;
        }
        int i7 = this.c;
        int i8 = i - i7;
        int i9 = i2 - i7;
        if (i8 < 0 || i9 > aiwVar.b()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            c(i, i2, charSequence, i3);
            return;
        }
        int i10 = i3 - (i9 - i8);
        if (i10 > aiwVar.a()) {
            int iA = i10 - aiwVar.a();
            int i11 = aiwVar.a;
            do {
                i11 += i11;
            } while (i11 - aiwVar.a < iA);
            char[] cArr2 = new char[i11];
            yfm.bf(aiwVar.b, cArr2, 0, 0, aiwVar.c);
            int i12 = aiwVar.a;
            int i13 = aiwVar.d;
            int i14 = i12 - i13;
            int i15 = i11 - i14;
            yfm.bf(aiwVar.b, cArr2, i15, i13, i14 + i13);
            aiwVar.b = cArr2;
            aiwVar.a = i11;
            aiwVar.d = i15;
        }
        int i16 = aiwVar.c;
        if (i8 < i16 && i9 <= i16) {
            char[] cArr3 = aiwVar.b;
            int i17 = i16 - i9;
            yfm.bf(cArr3, cArr3, aiwVar.d - i17, i9, i16);
            aiwVar.c = i8;
            aiwVar.d -= i17;
        } else if (i8 >= i16 || i9 < i16) {
            int iA2 = i8 + aiwVar.a();
            int iA3 = i9 + aiwVar.a();
            int i18 = aiwVar.d;
            char[] cArr4 = aiwVar.b;
            yfm.bf(cArr4, cArr4, i16, i18, iA2);
            i8 = aiwVar.c + (iA2 - i18);
            aiwVar.c = i8;
            aiwVar.d = iA3;
        } else {
            aiwVar.d = i9 + aiwVar.a();
            aiwVar.c = i8;
        }
        hv.k(charSequence, aiwVar.b, i8, 0, i3);
        aiwVar.c += i3;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return a(i);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return b();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        aiw aiwVar = this.b;
        if (aiwVar == null) {
            return this.a.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a, 0, this.c);
        sb.append(aiwVar.b, 0, aiwVar.c);
        char[] cArr = aiwVar.b;
        int i = aiwVar.d;
        sb.append(cArr, i, aiwVar.a - i);
        CharSequence charSequence = this.a;
        sb.append(charSequence, this.d, charSequence.length());
        return sb.toString();
    }
}
