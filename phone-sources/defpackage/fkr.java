package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkr implements fji {
    private final edi a = new edi();
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public fkr(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = true == "Serif".equals(edt.T(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = edt.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // defpackage.fji
    public final int a() {
        return 2;
    }

    @Override // defpackage.fji
    public final /* synthetic */ fix b(byte[] bArr, int i, int i2) {
        return fki.a(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fji
    public final void c(byte[] bArr, int i, int i2, fjh fjhVar, ecq ecqVar) {
        String strZ;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        edi ediVar = this.a;
        ediVar.I(bArr, i + i2);
        ediVar.K(i);
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        a.H(ediVar.a() >= 2);
        int iN = ediVar.n();
        if (iN == 0) {
            strZ = "";
        } else {
            int i15 = ediVar.b;
            Charset charsetA = ediVar.A();
            int i16 = ediVar.b - i15;
            if (charsetA == null) {
                charsetA = StandardCharsets.UTF_8;
            }
            strZ = ediVar.z(iN - i16, charsetA);
        }
        if (strZ.isEmpty()) {
            ecqVar.a(new fit(ImmutableList.of(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZ);
        int i17 = this.c;
        f(spannableStringBuilder, i17, 0, 0, spannableStringBuilder.length(), 16711680);
        int i18 = i17;
        int i19 = this.d;
        e(spannableStringBuilder, i19, -1, 0, spannableStringBuilder.length(), 16711680);
        int i20 = i19;
        String str = this.e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fA = this.f;
        while (ediVar.a() >= 8) {
            int i21 = ediVar.b;
            int iE = ediVar.e();
            int iE2 = ediVar.e();
            if (iE2 == 1937013100) {
                a.H(ediVar.a() >= i14 ? i12 : i13);
                int iN2 = ediVar.n();
                int i22 = i13;
                while (i22 < iN2) {
                    a.H(ediVar.a() >= 12 ? i12 : i13);
                    int iN3 = ediVar.n();
                    int iN4 = ediVar.n();
                    ediVar.L(i14);
                    int i23 = iN2;
                    int iJ = ediVar.j();
                    ediVar.L(i12);
                    int iE3 = ediVar.e();
                    if (iN4 > spannableStringBuilder.length()) {
                        i6 = i18;
                        i7 = i20;
                        edb.e("Tx3gParser", "Truncating styl end (" + iN4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iN4 = spannableStringBuilder.length();
                    } else {
                        i6 = i18;
                        i7 = i20;
                    }
                    if (iN3 >= iN4) {
                        edb.e("Tx3gParser", a.cn(iN4, iN3, "Ignoring styl with start (", ") >= end (", ")."));
                        i10 = i6;
                        i9 = i22;
                        i8 = i23;
                        i11 = i7;
                    } else {
                        i8 = i23;
                        i9 = i22;
                        int i24 = i6;
                        f(spannableStringBuilder, iJ, i24, iN3, iN4, 0);
                        i10 = i24;
                        i11 = i7;
                        e(spannableStringBuilder, iE3, i11, iN3, iN4, 0);
                    }
                    iN2 = i8;
                    i18 = i10;
                    i20 = i11;
                    i12 = 1;
                    i14 = 2;
                    i22 = i9 + 1;
                    i13 = 0;
                }
                i3 = i18;
                i4 = i20;
                i5 = i14;
            } else {
                i3 = i18;
                i4 = i20;
                if (iE2 == 1952608120 && this.b) {
                    i5 = 2;
                    a.H(ediVar.a() >= 2);
                    fA = edt.a(ediVar.n() / this.g, 0.0f, 0.95f);
                } else {
                    i5 = 2;
                }
            }
            ediVar.K(i21 + iE);
            i18 = i3;
            i14 = i5;
            i20 = i4;
            i12 = 1;
            i13 = 0;
        }
        ebz ebzVar = new ebz();
        ebzVar.e(spannableStringBuilder);
        ebzVar.d(fA, 0);
        ebzVar.d = 0;
        ecqVar.a(new fit(ImmutableList.of(ebzVar.a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.fji
    public final /* synthetic */ void d() {
    }
}
