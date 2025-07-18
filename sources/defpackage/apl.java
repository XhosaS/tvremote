package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apl {
    public Object a;

    public apl() {
    }

    public static void g(View view, rg rgVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new rm(rgVar));
            return;
        }
        Interpolator interpolator = rl.a;
        View.OnApplyWindowInsetsListener rkVar = new rk(view, rgVar);
        view.setTag(R.id.tag_window_insets_animation_callback, rkVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(rkVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final zp a() {
        if (this.a == null) {
            return zp.a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.a);
        return new zp(bundle, this.a);
    }

    public final void b(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((String) it.next());
        }
    }

    public final void c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("category must not be null");
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (((ArrayList) this.a).contains(str)) {
            return;
        }
        ((ArrayList) this.a).add(str);
    }

    public final void d(zp zpVar) {
        if (zpVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b(zpVar.a());
    }

    public final float e() {
        return ((ro) this.a).h();
    }

    public final int f() {
        return ((ro) this.a).i();
    }

    public final void h(float f) {
        ((ro) this.a).k(f);
    }

    public apl(agi agiVar) {
        this.a = agiVar;
    }

    public apl(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new rn(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new rl(i, interpolator, j);
        }
    }

    public apl(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new rn(windowInsetsAnimation);
        }
    }

    public apl(zp zpVar) {
        if (zpVar != null) {
            zpVar.b();
            if (zpVar.c.isEmpty()) {
                return;
            }
            this.a = new ArrayList(zpVar.c);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
