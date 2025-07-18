package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class utt {
    final ColorStateList a;
    final Layout.Alignment b;
    final float c;
    final float d;
    final boolean e;
    final TextUtils.TruncateAt f;
    final int g;
    final boolean h;
    final int i;
    final int j;
    final int k;
    final int l;
    final int m;
    final int n;
    final Paint o;
    final float p;
    final int q;
    final ViewGroup.MarginLayoutParams r;

    public utt(TextView textView) {
        Layout layout = textView.getLayout();
        this.a = textView.getTextColors();
        this.b = layout.getAlignment();
        this.c = layout.getSpacingMultiplier();
        this.d = layout.getSpacingAdd();
        this.e = textView.getIncludeFontPadding();
        this.f = textView.getEllipsize();
        this.g = textView.getTextDirection();
        int i = utu.a;
        this.h = textView.isFallbackLineSpacing();
        this.i = textView.getBreakStrategy();
        this.j = textView.getHyphenationFrequency();
        this.k = textView.getJustificationMode();
        this.l = textView.getMaxLines();
        this.m = textView.getLineHeight();
        this.n = textView.getMeasuredHeight();
        this.o = textView.getPaint();
        this.p = textView.getTextSize();
        this.q = textView.getId();
        this.r = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
    }
}
