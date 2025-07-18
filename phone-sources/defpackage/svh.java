package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class svh {
    public final View a;
    public final int b;
    public final int c;
    protected final int d;
    public fd e;
    private final TimeInterpolator f = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    public svh(View view) {
        this.a = view;
        Context context = view.getContext();
        this.b = sim.b(context, R.attr.motionDurationMedium2, kwx.JSON3);
        this.c = sim.b(context, R.attr.motionDurationShort3, 150);
        this.d = sim.b(context, R.attr.motionDurationShort2, 100);
    }

    public final float a(float f) {
        return this.f.getInterpolation(f);
    }

    protected final fd b() {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        fd fdVar = this.e;
        this.e = null;
        return fdVar;
    }

    public final fd c() {
        fd fdVar = this.e;
        this.e = null;
        return fdVar;
    }

    protected final fd d(fd fdVar) {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        fd fdVar2 = this.e;
        this.e = fdVar;
        return fdVar2;
    }
}
