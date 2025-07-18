package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swl extends gju {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.gju
    public final Animator a(ViewGroup viewGroup, gke gkeVar, gke gkeVar2) {
        if (gkeVar == null || gkeVar2 == null) {
            return null;
        }
        Map map = gkeVar.a;
        if (map.get("NavigationRailLabelVisibility") == null) {
            return null;
        }
        Map map2 = gkeVar2.a;
        if (map2.get("NavigationRailLabelVisibility") == null || ((Integer) map.get("NavigationRailLabelVisibility")).intValue() != 8 || ((Integer) map2.get("NavigationRailLabelVisibility")).intValue() != 0) {
            return null;
        }
        View view = gkeVar2.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new fsz(view, 10));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.gju
    public final void b(gke gkeVar) {
        gkeVar.a.put("NavigationRailLabelVisibility", Integer.valueOf(gkeVar.b.getVisibility()));
    }

    @Override // defpackage.gju
    public final void c(gke gkeVar) {
        gkeVar.a.put("NavigationRailLabelVisibility", Integer.valueOf(gkeVar.b.getVisibility()));
    }
}
