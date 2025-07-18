package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class dw extends dy {
    private static boolean A(Transition transition) {
        return (y(transition.getTargetIds()) && y(transition.getTargetNames()) && y(transition.getTargetTypes())) ? false : true;
    }

    @Override // defpackage.dy
    public final Object a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.dy
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // defpackage.dy
    public final void c(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    @Override // defpackage.dy
    public final void d(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                d(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (A(transition) || !y(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.dy
    public final void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public final void f(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                f(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.dy
    public final void g(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new ds(view, arrayList));
    }

    @Override // defpackage.dy
    public final void h(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new dv(rect));
    }

    @Override // defpackage.dy
    public final void i(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            w(view, rect);
            ((Transition) obj).setEpicenterCallback(new dr(rect));
        }
    }

    @Override // defpackage.dy
    public final void j(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        d(transitionSet, arrayList);
    }

    @Override // defpackage.dy
    public final void k(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            f(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.dy
    public final boolean l(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.dy
    public final boolean m() {
        if (!de.S(4)) {
            return false;
        }
        Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // defpackage.dy
    public final boolean n(Object obj) {
        if (!de.S(2)) {
            return false;
        }
        Log.v("FragmentManager", a.c(obj, "Predictive back not available for framework transition ", ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking."));
        return false;
    }

    @Override // defpackage.dy
    public final Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.dy
    public final void p(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new dt(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.dy
    public final void q(Object obj, adp adpVar, Runnable runnable) {
        ((Transition) obj).addListener(new du(runnable));
    }

    @Override // defpackage.dy
    public final Object r(Object obj, Object obj2) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        if (transition == null) {
            transition = null;
        }
        if (transition2 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }
}
