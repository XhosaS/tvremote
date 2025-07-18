package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sst {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public sst(boolean z, int i, int i2, int i3, float f) {
        this.a = z;
        this.d = i;
        this.e = i2;
        this.b = i3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        float fMin = (this.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iF = sip.f(csq.g(i, 255), this.d, fMin);
        if (fMin > 0.0f && (i2 = this.e) != 0) {
            iF = csq.f(csq.g(i2, c), iF);
        }
        return csq.g(iF, iAlpha);
    }

    public final int b(int i, float f) {
        return (this.a && csq.g(i, 255) == this.b) ? a(i, f) : i;
    }

    public sst(Context context) {
        this(sim.g(context, R.attr.elevationOverlayEnabled, false), sip.d(context, R.attr.elevationOverlayColor, 0), sip.d(context, R.attr.elevationOverlayAccentColor, 0), sip.d(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }
}
