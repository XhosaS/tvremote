package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxl {
    public final Resources.Theme a;
    private final Resources b;
    private final Context c;

    public dxl(Context context) {
        this.c = context;
        this.b = context.getResources();
        this.a = context.getTheme();
    }

    public final int a(float f) {
        return duc.a(f * this.b.getDisplayMetrics().density);
    }

    public final int b(float f) {
        return duc.a(TypedValue.applyDimension(2, f, this.b.getDisplayMetrics()));
    }
}
