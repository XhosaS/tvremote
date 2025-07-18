package defpackage;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsp {
    public static final fsp a = new fsp(-1, -16777216, 0, 0, -1, null);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Typeface g;

    public fsp(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = typeface;
    }

    public static fsp a(CaptioningManager.CaptionStyle captionStyle) {
        return new fsp(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : a.b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : a.c, captionStyle.hasWindowColor() ? captionStyle.windowColor : a.d, captionStyle.hasEdgeType() ? captionStyle.edgeType : a.e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : a.f, captionStyle.getTypeface());
    }
}
