package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sho {
    public static final sho a = new sho(null);
    public final ImageView.ScaleType b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final Integer h;
    private final Integer i;

    public sho() {
        this(null);
    }

    public static final boolean b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((float) displayMetrics.widthPixels) / displayMetrics.density < 600.0f;
    }

    public final void a(Context context) {
        context.getClass();
        b(context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sho)) {
            return false;
        }
        sho shoVar = (sho) obj;
        int i = shoVar.c;
        int i2 = shoVar.d;
        int i3 = shoVar.e;
        int i4 = shoVar.f;
        boolean z = shoVar.g;
        if (this.b != shoVar.b) {
            return false;
        }
        Integer num = shoVar.h;
        if (!yks.e(null, null)) {
            return false;
        }
        Integer num2 = shoVar.i;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return (this.b.hashCode() + 32398100) * 961;
    }

    public final String toString() {
        return "AppTargetConfig(numRowsOnSmallScreen=1, targetsPerRowOnSmallScreen=4, numRowsOnLargeScreen=1, targetsPerRowOnLargeScreen=7, enableDynamicSpacing=false, iconScaleType=" + this.b + ", targetWidthOverride=null, appsTrayHorizontalMargin=null)";
    }

    public /* synthetic */ sho(byte[] bArr) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        scaleType.getClass();
        this.c = 1;
        this.d = 4;
        this.e = 1;
        this.f = 7;
        this.g = false;
        this.b = scaleType;
        this.h = null;
        this.i = null;
    }
}
