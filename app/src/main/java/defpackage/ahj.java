package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.katniss.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahj {
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final agy e = new agy();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ahg.a(view);
        }
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        Object obj = c.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static afn b(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof afm ? ((afm) accessibilityDelegateA).a : new afn(accessibilityDelegateA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static afv c(View view, afv afvVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + afvVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ahi.a(view, afvVar);
        }
        ald aldVar = (ald) view.getTag(R.id.tag_on_receive_content_listener);
        if (aldVar == null) {
            return view.b(afvVar);
        }
        afv afvVarA = aldVar.a(view, afvVar);
        if (afvVarA == null) {
            return null;
        }
        return view.b(afvVarA);
    }

    @Deprecated
    public static ahw d(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        ahw ahwVar = (ahw) b.get(view);
        if (ahwVar != null) {
            return ahwVar;
        }
        ahw ahwVar2 = new ahw(view);
        b.put(view, ahwVar2);
        return ahwVar2;
    }

    public static ajc e(View view, ajc ajcVar) {
        WindowInsets windowInsetsE = ajcVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsB = aha.b(view, windowInsetsE);
            if (!windowInsetsB.equals(windowInsetsE)) {
                return ajc.g(windowInsetsB, view);
            }
        }
        return ajcVar;
    }

    public static CharSequence f(View view) {
        return (CharSequence) new agv(CharSequence.class).d(view);
    }

    public static List g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void h(View view, ajo ajoVar) {
        j(view);
        s(ajoVar.a(), view);
        g(view).add(ajoVar);
        k(view, 0);
    }

    public static void i(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    static void j(View view) {
        afn afnVarB = b(view);
        if (afnVarB == null) {
            afnVarB = new afn(afn.c);
        }
        n(view, afnVarB);
    }

    static void k(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (f(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? 2048 : 32;
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(i2);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(f(view));
                    t(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(32);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void l(View view, int i) {
        s(i, view);
        k(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            ahg.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void n(View view, afn afnVar) {
        if (afnVar == null && (a(view) instanceof afm)) {
            afnVar = new afn(afn.c);
        }
        t(view);
        view.setAccessibilityDelegate(afnVar == null ? null : afnVar.e);
    }

    public static void o(View view, CharSequence charSequence) {
        new agv(CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            agy agyVar = e;
            agyVar.a.remove(view);
            view.removeOnAttachStateChangeListener(agyVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(agyVar);
            return;
        }
        agy agyVar2 = e;
        WeakHashMap weakHashMap = agyVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(agyVar2);
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(agyVar2);
        }
    }

    public static void p(View view, boolean z) {
        new agu(Boolean.class).e(view, Boolean.valueOf(z));
    }

    public static String[] q(View view) {
        return Build.VERSION.SDK_INT >= 31 ? ahi.b(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void r(View view, ajc ajcVar) {
        WindowInsets windowInsetsE = ajcVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? ahh.a(view, windowInsetsE) : aha.a(view, windowInsetsE);
            if (windowInsetsA.equals(windowInsetsE)) {
                return;
            }
            ajc.g(windowInsetsA, view);
        }
    }

    private static void s(int i, View view) {
        List listG = g(view);
        for (int i2 = 0; i2 < listG.size(); i2++) {
            if (((ajo) listG.get(i2)).a() == i) {
                listG.remove(i2);
                return;
            }
        }
    }

    private static void t(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }
}
