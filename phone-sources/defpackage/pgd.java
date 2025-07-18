package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgd implements Serializable {
    public static final /* synthetic */ int a = 0;
    private static final tvn b = tvn.n("GnpSdk");
    private final Set c;

    public pgd(Set set) {
        this.c = set;
        ((tvk) ((tvk) b.e()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "<init>", 28, "TargetElementFinder.java")).v("set is %s.", set);
    }

    public static View b(Activity activity, View view, tsl tslVar) {
        View viewZ;
        View viewE = e(view, tslVar);
        return (viewE != null || (viewZ = qtl.z(activity)) == null) ? viewE : e(viewZ, tslVar);
    }

    public static final View c(Activity activity, View view, String str) {
        View viewZ;
        if (activity == null) {
            ((tvk) ((tvk) b.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 40, "TargetElementFinder.java")).s("activity is null, can't find view.");
            return null;
        }
        Resources resources = activity.getResources();
        if (resources == null) {
            return null;
        }
        int identifier = resources.getIdentifier(str, "id", activity.getPackageName());
        if (identifier == 0) {
            ((tvk) ((tvk) b.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 51, "TargetElementFinder.java")).v("Did not find resource with id %s", str);
            return null;
        }
        if (view == null) {
            view = activity.findViewById(R.id.content);
        }
        View viewFindViewById = view.findViewById(identifier);
        if (viewFindViewById == null && (viewZ = qtl.z(activity)) != null) {
            viewFindViewById = viewZ.findViewById(identifier);
        }
        View rootView = view.getRootView();
        if (viewFindViewById == null && rootView != null) {
            viewFindViewById = rootView.findViewById(identifier);
        }
        if (viewFindViewById == null) {
            ((tvk) ((tvk) b.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 73, "TargetElementFinder.java")).v("Did not find a view with id %s", str);
        }
        return viewFindViewById;
    }

    public static final View d(Activity activity, View view, String str) {
        if (activity == null) {
            ((tvk) ((tvk) b.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 88, "TargetElementFinder.java")).s("activity is null, can't find view.");
            return null;
        }
        if (str == null) {
            ((tvk) ((tvk) b.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 93, "TargetElementFinder.java")).s("Received null tag, can't find a view with tag.");
            return null;
        }
        if (view == null) {
            view = activity.findViewById(R.id.content);
        }
        View viewB = b(activity, view, new pgc(str, 1));
        View rootView = view.getRootView();
        if (viewB == null && rootView != null) {
            viewB = b(activity, rootView, new pgc(str, 0));
        }
        if (viewB == null) {
            ((tvk) ((tvk) b.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, "TargetElementFinder.java")).v("Did not find a view with tag %s", str);
        }
        return viewB;
    }

    private static View e(View view, tsl tslVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.poll();
            if (((Boolean) tslVar.apply(view2)).booleanValue()) {
                return view2;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayDeque.offer(viewGroup.getChildAt(i));
                }
            }
        }
        return null;
    }

    public final View a(Activity activity, View view, int i) {
        View view2;
        if (activity == null) {
            ((tvk) ((tvk) b.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByVeId", android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, "TargetElementFinder.java")).s("activity is null, can't find view.");
            return null;
        }
        Set<kww> set = this.c;
        if (set.isEmpty()) {
            ((tvk) ((tvk) b.f()).j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByVeId", 127, "TargetElementFinder.java")).s("No Visual Element View Finder was bound, can't find View");
            return null;
        }
        for (kww kwwVar : set) {
            View viewFindViewById = view != null ? view : activity.findViewById(R.id.content);
            AtomicReference atomicReference = new AtomicReference();
            plv plvVar = new plv(i, atomicReference);
            pju pjuVarC = pkd.c(viewFindViewById);
            if (pjuVarC == null) {
                view2 = null;
            } else {
                plvVar.b(pjuVarC);
                view2 = (View) atomicReference.get();
            }
            if (view2 != null) {
                return view2;
            }
        }
        return null;
    }
}
