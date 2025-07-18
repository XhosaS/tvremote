package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ogc {
    public final PointF a;
    public final float b;
    public final float c;
    public final float d;
    public Boolean e;

    public ogc(Context context, float f, float f2) {
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = new PointF();
        this.e = null;
        this.b = scaledTouchSlop;
        this.c = f;
        this.d = f2;
    }
}
