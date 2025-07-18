package defpackage;

import android.content.Context;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biv {
    public static final int a = (int) Math.round(5.1000000000000005d);
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;

    public biv(Context context) {
        boolean zI = xo.i(context, R.attr.elevationOverlayEnabled, false);
        int iE = bit.e(context, R.attr.elevationOverlayColor);
        int iE2 = bit.e(context, R.attr.elevationOverlayAccentColor);
        int iE3 = bit.e(context, R.attr.colorSurface);
        float f = context.getResources().getDisplayMetrics().density;
        this.b = zI;
        this.c = iE;
        this.d = iE2;
        this.e = iE3;
        this.f = f;
    }
}
