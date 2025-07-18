package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gio implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gio(AppBarLayout appBarLayout, szk szkVar, int i) {
        this.c = i;
        this.a = appBarLayout;
        this.b = szkVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cxh, java.lang.Object] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.c;
        if (i == 0) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            giq giqVar = (giq) this.a;
            gir.e(fFloatValue, giqVar);
            gir girVar = (gir) this.b;
            girVar.a(fFloatValue, giqVar, false);
            girVar.invalidateSelf();
            return;
        }
        if (i == 1) {
            this.b.onAnimationUpdate((View) this.a);
            return;
        }
        if (i == 2) {
            int iIntValue = ((Integer) ((ValueAnimator) this.a).getAnimatedValue()).intValue();
            nby nbyVar = (nby) this.b;
            nbyVar.b = iIntValue;
            nbyVar.invalidate();
            return;
        }
        if (i == 3) {
            int iIntValue2 = ((Integer) ((ValueAnimator) this.a).getAnimatedValue()).intValue();
            nby nbyVar2 = (nby) this.b;
            nbyVar2.c = iIntValue2;
            nbyVar2.invalidate();
            return;
        }
        if (i == 4) {
            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((szk) this.b).M(fFloatValue2);
            AppBarLayout appBarLayout = (AppBarLayout) this.a;
            Drawable drawable = appBarLayout.j;
            if (drawable instanceof szk) {
                ((szk) drawable).M(fFloatValue2);
            }
            Iterator it = appBarLayout.g.iterator();
            while (it.hasNext()) {
                ((sod) it.next()).a();
            }
            Iterator it2 = appBarLayout.h.iterator();
            while (it2.hasNext()) {
                ((zft) it2.next()).o(fFloatValue2 / appBarLayout.l);
            }
            return;
        }
        if (i != 5) {
            int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            Rect rect = (Rect) this.a;
            rect.right = iIntValue3;
            ((syz) this.b).d.setClipBounds(rect);
            return;
        }
        swu swuVar = (swu) this.a;
        if (!swuVar.c(true) || swuVar.m == 0) {
            return;
        }
        sxi sxiVar = (sxi) this.b;
        if (sxiVar.isVisible()) {
            sxiVar.invalidateSelf();
        }
    }

    public gio(gir girVar, giq giqVar, int i) {
        this.c = i;
        this.b = girVar;
        this.a = giqVar;
    }

    public /* synthetic */ gio(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public gio(nby nbyVar, ValueAnimator valueAnimator, int i) {
        this.c = i;
        this.a = valueAnimator;
        this.b = nbyVar;
    }
}
