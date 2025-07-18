package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public auv(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.b = layoutParams;
        this.a = new Rect();
        this.g = new int[2];
        this.f = new int[2];
        this.e = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.c = viewInflate;
        this.d = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public final void a() {
        if (b()) {
            ((WindowManager) ((Context) this.e).getSystemService("window")).removeView((View) this.c);
        }
    }

    public final boolean b() {
        return ((View) this.c).getParent() != null;
    }

    public auv(avk avkVar, byo byoVar, byo byoVar2, Executor executor, cov covVar, auf aufVar, crv crvVar) {
        this.g = new AtomicBoolean(true);
        this.a = avkVar;
        this.b = byoVar;
        this.c = byoVar2;
        this.d = executor;
        this.e = aufVar.a(executor, covVar, null);
        this.f = crvVar;
    }
}
