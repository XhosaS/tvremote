package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suw extends gju {
    private static final void f(gke gkeVar) {
        View view = gkeVar.b;
        if (view instanceof TextView) {
            gkeVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.gju
    public final Animator a(ViewGroup viewGroup, gke gkeVar, gke gkeVar2) {
        if (gkeVar == null || gkeVar2 == null || !(gkeVar.b instanceof TextView)) {
            return null;
        }
        View view = gkeVar2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = gkeVar.a;
        Map map2 = gkeVar2.a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new spv(textView, 2));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.gju
    public final void b(gke gkeVar) {
        f(gkeVar);
    }

    @Override // defpackage.gju
    public final void c(gke gkeVar) {
        f(gkeVar);
    }
}
