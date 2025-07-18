package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.ComponentHost;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjs implements nzy {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/elements/focus/FocusCommandHandler");
    public hjr b;

    @Override // defpackage.nzz
    public final abwk a() {
        return adeo.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final adeo adeoVar = (adeo) obj;
        agff agffVarG = agff.g(new aggv() { // from class: hjp
            @Override // defpackage.aggv
            public final void a() {
                mwe mweVar;
                TransitionDrawable transitionDrawable;
                hjs hjsVar = this.a;
                hjr hjrVar = hjsVar.b;
                CharSequence charSequence = null;
                if (hjrVar != null) {
                    adeo adeoVar2 = hjrVar.b;
                    if ((adeoVar2.c & 2) != 0) {
                        hjrVar.c.reverse();
                    }
                    TransitionDrawable transitionDrawable2 = hjrVar.e;
                    if (transitionDrawable2 != null) {
                        transitionDrawable2.reverseTransition((int) adeoVar2.i);
                    }
                    hjsVar.b = null;
                }
                adeo adeoVar3 = adeoVar;
                if (adeoVar3.j) {
                    return;
                }
                View viewN = nzxVar.n();
                if (viewN == null) {
                    ((zdv) ((zdv) hjs.a.d()).q("com/google/android/apps/tvsearch/results/elements/focus/FocusCommandHandler", "onCommand", 162, "FocusCommandHandler.java")).u("Focus Command's target view is null.");
                    return;
                }
                if (adeoVar3.h) {
                    NestedScrollView nestedScrollView = null;
                    HorizontalScrollView horizontalScrollView = null;
                    for (View view = viewN; view != null; view = (View) view.getParent()) {
                        if (nestedScrollView == null && (view instanceof NestedScrollView)) {
                            nestedScrollView = (NestedScrollView) view;
                        }
                        if (horizontalScrollView == null && (view instanceof HorizontalScrollView)) {
                            horizontalScrollView = (HorizontalScrollView) view;
                        }
                        if (!(view.getParent() instanceof View)) {
                            break;
                        }
                    }
                    if (nestedScrollView != null) {
                        nestedScrollView.r(adeoVar3.f, adeoVar3.g, false);
                    }
                    if (horizontalScrollView != null) {
                        horizontalScrollView.smoothScrollTo(adeoVar3.f, adeoVar3.g);
                    }
                }
                hjsVar.b = new hjr((ComponentHost) viewN, adeoVar3);
                hjr hjrVar2 = hjsVar.b;
                ComponentHost componentHost = hjrVar2.d;
                if (componentHost.getBackground() instanceof TransitionDrawable) {
                    hjrVar2.e = (TransitionDrawable) hjrVar2.d.getBackground();
                } else {
                    try {
                        mweVar = (mwe) componentHost.getBackground();
                    } catch (RuntimeException e) {
                        ((zdv) ((zdv) ((zdv) hjr.a.d()).p(e)).q("com/google/android/apps/tvsearch/results/elements/focus/FocusCommandHandler$FocusAnimation", "setupAndStartAnimation", '@', "FocusCommandHandler.java")).u("Focus Command's target view has an unknown configuration. The animation may look incorrect.");
                        mweVar = null;
                    }
                    adeo adeoVar4 = hjrVar2.b;
                    if ((adeoVar4.c & 128) != 0) {
                        Drawable[] drawableArrA = hjrVar2.a(mweVar);
                        ComponentHost componentHost2 = hjrVar2.d;
                        Iterator it = componentHost2.getDrawables().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Drawable drawable = (Drawable) it.next();
                            if (drawable instanceof eko) {
                                eko ekoVar = (eko) drawable;
                                charSequence = ekoVar.f;
                                ekoVar.b();
                                break;
                            }
                        }
                        if (charSequence == null) {
                            ((zdv) ((zdv) hjr.a.d()).q("com/google/android/apps/tvsearch/results/elements/focus/FocusCommandHandler$FocusAnimation", "getBackgroundDrawableWithText", 121, "FocusCommandHandler.java")).u("Could not find TextDrawable in Focus Command - ignoring text color change.");
                            transitionDrawable = new TransitionDrawable(drawableArrA);
                        } else {
                            Context context = componentHost2.getContext();
                            adeq adeqVar = adeoVar4.k;
                            if (adeqVar == null) {
                                adeqVar = adeq.a;
                            }
                            transitionDrawable = new hjt(drawableArrA, charSequence, context, adeqVar);
                        }
                    } else {
                        transitionDrawable = new TransitionDrawable(hjrVar2.a(mweVar));
                    }
                    hjrVar2.e = transitionDrawable;
                    hjrVar2.d.setBackground(hjrVar2.e);
                }
                TransitionDrawable transitionDrawable3 = hjrVar2.e;
                adeo adeoVar5 = hjrVar2.b;
                transitionDrawable3.startTransition((int) adeoVar5.i);
                if ((adeoVar5.c & 2) != 0) {
                    hjrVar2.c.start();
                }
            }
        });
        agfx agfxVar = aggd.a;
        aggb.a(agfxVar);
        return agffVarG.j(agfxVar);
    }
}
