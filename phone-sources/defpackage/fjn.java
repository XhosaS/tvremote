package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjn {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final StringBuilder c = new StringBuilder();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public fjn(int i, int i2) {
        e(i);
        this.h = i2;
    }

    private static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    private static void i(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    private static void j(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.SpannableString a() {
        /*
            r16 = this;
            r0 = r16
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r2 = r0.c
            r1.<init>(r2)
            int r2 = r1.length()
            r4 = -1
            r6 = r4
            r7 = r6
            r9 = r7
            r11 = r9
            r5 = 0
            r8 = 0
            r10 = 0
        L15:
            java.util.List r12 = r0.a
            int r13 = r12.size()
            if (r5 >= r13) goto L74
            java.lang.Object r13 = r12.get(r5)
            fjm r13 = (defpackage.fjm) r13
            boolean r14 = r13.b
            int r15 = r13.a
            r3 = 8
            if (r15 == r3) goto L37
            r3 = 7
            if (r15 != r3) goto L30
            r10 = 1
            goto L31
        L30:
            r10 = 0
        L31:
            if (r15 == r3) goto L37
            int[] r3 = defpackage.fjo.a
            r11 = r3[r15]
        L37:
            int r3 = r13.c
            int r5 = r5 + 1
            int r13 = r12.size()
            if (r5 >= r13) goto L4a
            java.lang.Object r12 = r12.get(r5)
            fjm r12 = (defpackage.fjm) r12
            int r12 = r12.c
            goto L4b
        L4a:
            r12 = r2
        L4b:
            if (r3 != r12) goto L4e
            goto L15
        L4e:
            if (r6 == r4) goto L57
            if (r14 != 0) goto L58
            j(r1, r6, r3)
            r6 = r4
            goto L5d
        L57:
            r6 = r4
        L58:
            if (r6 != r4) goto L5d
            if (r14 == 0) goto L5d
            r6 = r3
        L5d:
            if (r7 == r4) goto L66
            if (r10 != 0) goto L67
            i(r1, r7, r3)
            r7 = r4
            goto L6c
        L66:
            r7 = r4
        L67:
            if (r7 != r4) goto L6c
            if (r10 == 0) goto L6c
            r7 = r3
        L6c:
            if (r11 == r9) goto L15
            h(r1, r8, r3, r9)
            r8 = r3
            r9 = r11
            goto L15
        L74:
            if (r6 == r4) goto L7b
            if (r6 == r2) goto L7b
            j(r1, r6, r2)
        L7b:
            if (r7 == r4) goto L82
            if (r7 == r2) goto L82
            i(r1, r7, r2)
        L82:
            if (r8 == r2) goto L87
            h(r1, r8, r2, r9)
        L87:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjn.a():android.text.SpannableString");
    }

    public final eca b(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            List list = this.b;
            if (i2 >= list.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) list.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) a());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.e + this.f;
        int length = (32 - i3) - spannableStringBuilder.length();
        if (i == Integer.MIN_VALUE) {
            int i4 = i3 - length;
            i = (this.g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.g != 2 || i4 <= 0) ? 0 : 2 : 1;
        }
        if (i != 1) {
            if (i == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i5 = this.d;
        if (i5 > 7) {
            i5 -= 17;
        } else if (this.g == 1) {
            i5 -= this.h - 1;
        }
        ebz ebzVar = new ebz();
        ebzVar.e(spannableStringBuilder);
        ebzVar.b = Layout.Alignment.ALIGN_NORMAL;
        ebzVar.d(i5, 1);
        ebzVar.e = f;
        ebzVar.f = i;
        return ebzVar.a();
    }

    public final void c(char c) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final void d() {
        fjm fjmVar;
        int i;
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length <= 0) {
            return;
        }
        sb.delete(length - 1, length);
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0 || (i = (fjmVar = (fjm) list.get(size)).c) != length) {
                return;
            } else {
                fjmVar.c = i - 1;
            }
        }
    }

    public final void e(int i) {
        this.g = i;
        this.a.clear();
        this.b.clear();
        this.c.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i, boolean z) {
        this.a.add(new fjm(i, z, this.c.length()));
    }

    public final boolean g() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
