package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaev implements aafh, aaff {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public aaev(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    private static final int f(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int iMin = Math.min(charSequence.length() - i, i2); iMin > 0; iMin--) {
            char cCharAt = charSequence.charAt(i + i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // defpackage.aaff
    public final int a() {
        return b();
    }

    @Override // defpackage.aafh
    public final int b() {
        int i = true != this.c ? 6 : 7;
        String str = this.a;
        return (str == null || str.length() <= i) ? i : str.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    @Override // defpackage.aaff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.aafb r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaev.c(aafb, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) throws IOException {
        int i2;
        int i3;
        if (aabsVar == null) {
            return;
        }
        if (i == 0) {
            String str = this.a;
            if (str != null) {
                appendable.append(str);
                return;
            }
            i = 0;
        }
        if (i >= 0) {
            appendable.append('+');
        } else {
            appendable.append('-');
            i = -i;
        }
        int i4 = i / 3600000;
        aafd.b(appendable, i4, 2);
        int i5 = i - (i4 * 3600000);
        int i6 = i5 != 0 ? i5 : 0;
        boolean z = this.c;
        if (z) {
            appendable.append(':');
        }
        int i7 = i6 / 60000;
        aafd.b(appendable, i7, 2);
        int i8 = this.d;
        if (i8 == 2 || (i2 = i6 - (i7 * 60000)) == 0) {
            return;
        }
        int i9 = i2 / 1000;
        if (z) {
            appendable.append(':');
        }
        aafd.b(appendable, i9, 2);
        if (i8 == 3 || (i3 = i2 - (i9 * 1000)) == 0) {
            return;
        }
        if (z) {
            appendable.append('.');
        }
        aafd.b(appendable, i3, 3);
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) {
    }
}
