package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpb {
    public final Context a;
    public boolean b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;
    public final int g;
    public final int h;
    public final Handler i;
    public float j;
    public float k;
    public int l = 0;
    public GestureDetector m;
    public boolean n;
    public final mom o;

    public mpb(Context context, mom momVar, Handler handler) {
        this.a = context;
        this.o = momVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.h = ViewConfiguration.get(context).getScaledMinimumScalingSpan() / 2;
        } else {
            this.h = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        }
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = (scaledTouchSlop + scaledTouchSlop) / 2;
        this.i = handler;
    }

    public final boolean a() {
        return this.l != 0;
    }
}
