package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class em {
    public static final el a = new el();

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static void b(int i, View view, ViewGroup viewGroup) {
        if (de.S(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i2 = i - 1;
        if (i2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (de.S(2)) {
                    Log.v("FragmentManager", a.d(viewGroup2, view, "SpecialEffectsController: Removing view ", " from container "));
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (de.S(2)) {
                    Log.v("FragmentManager", a.c(view, "SpecialEffectsController: Setting view ", " to INVISIBLE"));
                }
                view.setVisibility(4);
                return;
            } else {
                if (de.S(2)) {
                    Log.v("FragmentManager", a.c(view, "SpecialEffectsController: Setting view ", " to GONE"));
                }
                view.setVisibility(8);
                return;
            }
        }
        if (de.S(2)) {
            Log.v("FragmentManager", a.c(view, "SpecialEffectsController: Setting view ", " to VISIBLE"));
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
            if (de.S(2)) {
                Log.v("FragmentManager", a.d(viewGroup, view, "SpecialEffectsController: Adding view ", " to Container "));
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }
}
