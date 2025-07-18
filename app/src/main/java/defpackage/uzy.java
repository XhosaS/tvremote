package defpackage;

import android.content.Context;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uzy {
    public static final int a = (int) Math.round(5.1000000000000005d);
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;

    public uzy(Context context) {
        boolean zC = vaz.c(context, R.attr.elevationOverlayEnabled, false);
        int iC = uzt.c(context, R.attr.elevationOverlayColor);
        int iC2 = uzt.c(context, R.attr.elevationOverlayAccentColor);
        int iC3 = uzt.c(context, R.attr.colorSurface);
        float f = context.getResources().getDisplayMetrics().density;
        this.b = zC;
        this.c = iC;
        this.d = iC2;
        this.e = iC3;
        this.f = f;
    }
}
