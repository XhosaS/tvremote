package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.katniss.R;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mjh implements nzy {
    public static View c(String str, View view) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.pollFirst();
            if (view2 != null) {
                if (str.equals(view2.getTag(R.id.elements_accessibility_view_tag_id))) {
                    return view2;
                }
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        arrayDeque.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return aczn.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, nzx nzxVar) {
        final aczn acznVar = (aczn) obj;
        final View viewO = nzxVar.o();
        if (viewO == null) {
            return agff.f(new IllegalStateException("Unable to locate the component's view."));
        }
        if ((acznVar.c & 1) == 0 || acznVar.d.isEmpty()) {
            return agff.f(new IllegalArgumentException("No accessibility identifier has been provided."));
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) viewO.getContext().getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return agff.g(new aggv() { // from class: mjg
                @Override // defpackage.aggv
                public final void a() {
                    View decorView;
                    View view = viewO;
                    String str = acznVar.d;
                    View rootView = view.getRootView();
                    if (rootView == null) {
                        throw new IllegalStateException("Unable to locate the root View.");
                    }
                    View viewC = mjh.c(str, rootView);
                    if (viewC == null) {
                        Context context = view.getContext();
                        while (true) {
                            if (!(context instanceof ContextWrapper)) {
                                decorView = null;
                                break;
                            } else {
                                if (context instanceof Activity) {
                                    decorView = ((Activity) context).getWindow().getDecorView();
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                        if (decorView != null) {
                            viewC = mjh.c(str, decorView);
                        }
                    }
                    if (viewC == null) {
                        throw new IllegalArgumentException("Unable to locate view with accessibility id: ".concat(String.valueOf(str)));
                    }
                    int[] iArr = ahj.a;
                    viewC.performAccessibilityAction(64, null);
                }
            });
        }
        agff agffVar = agij.a;
        aggz aggzVar = agoh.n;
        return agffVar;
    }
}
