package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uts {
    public final utt a;
    public Layout b;
    public ColorStateList c;
    public int d;
    public CharSequence e;
    public int[] f;
    public int g;
    Layout.Alignment h;
    public int i;
    float j;
    public float k;
    public final ViewGroup.MarginLayoutParams l;
    private final BoringLayout.Metrics m = new BoringLayout.Metrics();
    private final TextPaint n;
    private BoringLayout o;

    public uts(utt uttVar) {
        TextPaint textPaint = new TextPaint();
        this.n = textPaint;
        this.d = 0;
        this.f = new int[0];
        this.j = 1.0f;
        this.k = 0.0f;
        this.a = uttVar;
        this.h = uttVar.b;
        textPaint.set(uttVar.o);
        this.l = uttVar.r;
    }

    private final int g() {
        ColorStateList colorStateList = this.c;
        if (colorStateList == null) {
            colorStateList = this.a.a;
        }
        return colorStateList.getColorForState(this.f, this.a.a.getDefaultColor());
    }

    private final boolean h(CharSequence charSequence) {
        if (yqs.a(this.e, charSequence)) {
            return false;
        }
        this.e = charSequence;
        this.b = null;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.Layout a() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uts.a():android.text.Layout");
    }

    public final void b() {
        TextPaint textPaint = this.n;
        textPaint.drawableState = this.f;
        textPaint.setColor(uul.a(g(), this.i, this.j));
        textPaint.setLetterSpacing(this.k);
        textPaint.setTextSize(this.a.p);
        textPaint.setFlags(textPaint.getFlags() & (-193));
    }

    public final boolean c(float f) {
        if (this.j == f) {
            return false;
        }
        this.j = f;
        this.n.setColor(uul.a(g(), this.i, f));
        return true;
    }

    public final boolean d() {
        if (this.h == null) {
            return false;
        }
        this.h = null;
        this.b = null;
        return true;
    }

    public final boolean e() {
        if (yqs.a(null, null)) {
            return false;
        }
        b();
        return true;
    }

    public final boolean f(utx utxVar) {
        if (utxVar == null) {
            return h(null);
        }
        int i = this.a.m;
        Color.alpha(g());
        return h(utxVar.a(i));
    }
}
