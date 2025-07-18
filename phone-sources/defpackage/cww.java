package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.videos.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cww {
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final cvr e = new cvr() { // from class: cwd
        @Override // defpackage.cvr
        public final cuy onReceiveContent(cuy cuyVar) {
            int[] iArr = cww.a;
            return cuyVar;
        }
    };
    private static final cwi f = new cwi();

    private static void A(int i, View view) {
        List listI = i(view);
        for (int i2 = 0; i2 < listI.size(); i2++) {
            if (((cyp) listI.get(i2)).a() == i) {
                listI.remove(i2);
                return;
            }
        }
    }

    private static void B(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return cwr.a(view);
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

    public static cuo b(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof cun ? ((cun) accessibilityDelegateA).a : new cuo(accessibilityDelegateA);
    }

    public static cuy c(View view, cuy cuyVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return cwt.a(view, cuyVar);
        }
        if (((dad) view.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return z(view).onReceiveContent(cuyVar);
        }
        cuy cuyVarA = dad.a(view, cuyVar);
        if (cuyVarA == null) {
            return null;
        }
        return z(view).onReceiveContent(cuyVarA);
    }

    @Deprecated
    public static cxe d(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        cxe cxeVar = (cxe) b.get(view);
        if (cxeVar != null) {
            return cxeVar;
        }
        cxe cxeVar2 = new cxe(view);
        b.put(view, cxeVar2);
        return cxeVar2;
    }

    public static cyh e(View view, cyh cyhVar) {
        WindowInsets windowInsetsE = cyhVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? cws.a(view, windowInsetsE) : cwk.c(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return cyh.p(windowInsetsA, view);
            }
        }
        return cyhVar;
    }

    public static cyh f(View view, cyh cyhVar) {
        WindowInsets windowInsetsE = cyhVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsD = cwk.d(view, windowInsetsE);
            if (!windowInsetsD.equals(windowInsetsE)) {
                return cyh.p(windowInsetsD, view);
            }
        }
        return cyhVar;
    }

    public static CharSequence g(View view) {
        return (CharSequence) new cwf(CharSequence.class).d(view);
    }

    public static CharSequence h(View view) {
        return (CharSequence) new cwg(CharSequence.class).d(view);
    }

    public static List i(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void j(View view, cyp cypVar) {
        l(view);
        A(cypVar.a(), view);
        i(view).add(cypVar);
        m(view, 0);
    }

    public static void k(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void l(View view) {
        cuo cuoVarB = b(view);
        if (cuoVarB == null) {
            cuoVarB = new cuo();
        }
        p(view, cuoVarB);
    }

    static void m(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (g(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? RecyclerView.ItemAnimator.FLAG_MOVED : 32;
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(i2);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(g(view));
                    B(view);
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
            accessibilityEventObtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void n(View view, int i) {
        A(i, view);
        m(view, 0);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            cwr.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void p(View view, cuo cuoVar) {
        if (cuoVar == null && (a(view) instanceof cun)) {
            cuoVar = new cuo();
        }
        B(view);
        view.setAccessibilityDelegate(cuoVar == null ? null : cuoVar.getBridge());
    }

    public static void q(View view, boolean z) {
        new cwh(Boolean.class).e(view, Boolean.valueOf(z));
    }

    public static void r(View view, CharSequence charSequence) {
        new cwf(CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            cwi cwiVar = f;
            cwiVar.a.remove(view);
            view.removeOnAttachStateChangeListener(cwiVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(cwiVar);
            return;
        }
        cwi cwiVar2 = f;
        WeakHashMap weakHashMap = cwiVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(cwiVar2);
        if (view.isAttachedToWindow()) {
            cwiVar2.a(view);
        }
    }

    public static void s(View view, CharSequence charSequence) {
        new cwg(CharSequence.class).e(view, charSequence);
    }

    public static void t(View view, List list) {
        if (Build.VERSION.SDK_INT >= 29) {
            cwr.c(view, list);
        }
    }

    static boolean u(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        cwv cwvVarC = cwv.c(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = cwvVarC.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = cwv.a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (cwvVarC.b == null) {
                        cwvVarC.b = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            cwvVarC.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                cwvVarC.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewB = cwvVarC.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewB != null && !KeyEvent.isModifierKey(keyCode)) {
                cwvVarC.a().put(keyCode, new WeakReference(viewB));
            }
        }
        return viewB != null;
    }

    public static boolean v(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        cwv cwvVarC = cwv.c(view);
        WeakReference weakReference = cwvVarC.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        cwvVarC.c = new WeakReference(keyEvent);
        SparseArray sparseArrayA = cwvVarC.a();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayA.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) sparseArrayA.valueAt(iIndexOfKey);
            sparseArrayA.removeAt(iIndexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) sparseArrayA.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 == null || !view2.isAttachedToWindow()) {
            return true;
        }
        cwv.d(view2);
        return true;
    }

    public static String[] w(View view) {
        return Build.VERSION.SDK_INT >= 31 ? cwt.b(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void x(View view, cyp cypVar, czc czcVar) {
        if (czcVar == null) {
            n(view, cypVar.a());
        } else {
            j(view, new cyp(null, cypVar.o, null, czcVar, cypVar.p));
        }
    }

    @Deprecated
    public static void y(View view) {
        view.setAccessibilityLiveRegion(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static cvr z(View view) {
        return view instanceof cvr ? (cvr) view : e;
    }
}
