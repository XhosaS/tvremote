package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cho {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final Layout d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final Paint.FontMetricsInt i;
    public final Rect j = new Rect();
    private final chl k;
    private chw l;
    private final int m;
    private final boolean n;
    private final int o;
    private final cie[] p;
    private chk q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122 A[PHI: r8
  0x0122: PHI (r8v4 int) = (r8v3 int), (r8v7 int) binds: [B:56:0x0139, B:49:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cho(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, defpackage.chl r34) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cho.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, int, int, int, int, int, int, chl):void");
    }

    public final float a(int i) {
        if (i == this.e - 1) {
            return this.g + this.h;
        }
        return 0.0f;
    }

    public final float b(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.e - 1;
        if (i == i2 && (fontMetricsInt = this.i) != null) {
            return this.d.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        return this.f + this.d.getLineBottom(i) + (i == i2 ? this.m : 0);
    }

    public final float c(int i) {
        return b(i) - d(i);
    }

    public final float d(int i) {
        return this.d.getLineTop(i) + (i == 0 ? 0 : this.f);
    }

    public final float e(int i, boolean z) {
        return o().a(i, true, z) + a(k(i));
    }

    public final float f(int i, boolean z) {
        return o().a(i, false, z) + a(k(i));
    }

    public final int g() {
        return (this.c ? this.d.getLineBottom(this.e - 1) : this.d.getHeight()) + this.f + this.m + this.o;
    }

    public final int h(int i) {
        return this.d.getEllipsisCount(i);
    }

    public final int i(int i) {
        return this.d.getEllipsisStart(i);
    }

    public final int j(int i) {
        Layout layout = this.d;
        return (chp.c(layout, i) && this.b == TextUtils.TruncateAt.END) ? layout.getText().length() : layout.getLineEnd(i);
    }

    public final int k(int i) {
        return this.d.getLineForOffset(i);
    }

    public final int l(int i) {
        return this.d.getLineForVertical(i - this.f);
    }

    public final int m(int i) {
        return this.d.getLineStart(i);
    }

    public final int n(int i) {
        return this.d.getParagraphDirection(i);
    }

    public final chk o() {
        chk chkVar = this.q;
        if (chkVar != null) {
            return chkVar;
        }
        chk chkVar2 = new chk(this.d);
        this.q = chkVar2;
        return chkVar2;
    }

    public final chw p() {
        chw chwVar = this.l;
        if (chwVar != null) {
            return chwVar;
        }
        Layout layout = this.d;
        chw chwVar2 = new chw(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.l = chwVar2;
        return chwVar2;
    }

    public final CharSequence q() {
        return this.d.getText();
    }

    public final boolean r(int i) {
        return this.d.isRtlCharAt(i);
    }
}
