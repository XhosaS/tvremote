package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.tv.remote.service.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qv {
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final qi e = new qi();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return qq.a(view);
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

    public static pe b(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof pd ? ((pd) accessibilityDelegateA).a : new pe(accessibilityDelegateA);
    }

    public static pl c(View view, pl plVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + plVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return qs.a(view, plVar);
        }
        if (((tj) view.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return tj.b(view, plVar);
        }
        pl plVarB = tj.b(view, plVar);
        if (plVarB == null) {
            return null;
        }
        return tj.b(view, plVarB);
    }

    public static sf d(View view, sf sfVar) {
        WindowInsets windowInsetsE = sfVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsI = qk.i(view, windowInsetsE);
            if (!windowInsetsI.equals(windowInsetsE)) {
                return sf.o(windowInsetsI, view);
            }
        }
        return sfVar;
    }

    public static CharSequence e(View view) {
        return (CharSequence) new qf(CharSequence.class).d(view);
    }

    public static List f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void g(View view, sl slVar) {
        h(view);
        t(slVar.a(), view);
        f(view).add(slVar);
        i(view, 0);
    }

    static void h(View view) {
        pe peVarB = b(view);
        if (peVarB == null) {
            peVarB = new pe();
        }
        l(view, peVarB);
    }

    static void i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? 2048 : 32;
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(i2);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(e(view));
                    u(view);
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
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void j(View view, int i) {
        t(i, view);
        i(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            qq.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void l(View view, pe peVar) {
        if (peVar == null && (a(view) instanceof pd)) {
            peVar = new pe();
        }
        u(view);
        view.setAccessibilityDelegate(peVar == null ? null : peVar.c);
    }

    public static void m(View view, CharSequence charSequence) {
        new qf(CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            qi qiVar = e;
            qiVar.a.remove(view);
            view.removeOnAttachStateChangeListener(qiVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(qiVar);
            return;
        }
        qi qiVar2 = e;
        WeakHashMap weakHashMap = qiVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(qiVar2);
        if (view.isAttachedToWindow()) {
            qiVar2.a(view);
        }
    }

    static boolean n(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        qu quVarC = qu.c(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = quVarC.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = qu.a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (quVarC.b == null) {
                        quVarC.b = new WeakHashMap();
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
                            quVarC.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                quVarC.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewB = quVarC.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewB != null && !KeyEvent.isModifierKey(keyCode)) {
                quVarC.a().put(keyCode, new WeakReference(viewB));
            }
        }
        return viewB != null;
    }

    public static boolean o(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        qu quVarC = qu.c(view);
        WeakReference weakReference = quVarC.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        quVarC.c = new WeakReference(keyEvent);
        SparseArray sparseArrayA = quVarC.a();
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
        qu.d(view2);
        return true;
    }

    public static String[] p(View view) {
        return Build.VERSION.SDK_INT >= 31 ? qs.b(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void q(View view, sf sfVar) {
        WindowInsets windowInsetsE = sfVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? qr.a(view, windowInsetsE) : qk.h(view, windowInsetsE);
            if (windowInsetsA.equals(windowInsetsE)) {
                return;
            }
            sf.o(windowInsetsA, view);
        }
    }

    public static void r(View view, sl slVar, su suVar) {
        g(view, new sl(null, slVar.m, null, suVar, slVar.n));
    }

    @Deprecated
    public static asv s(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        asv asvVar = (asv) b.get(view);
        if (asvVar != null) {
            return asvVar;
        }
        asv asvVar2 = new asv(view);
        b.put(view, asvVar2);
        return asvVar2;
    }

    private static void t(int i, View view) {
        List listF = f(view);
        for (int i2 = 0; i2 < listF.size(); i2++) {
            if (((sl) listF.get(i2)).a() == i) {
                listF.remove(i2);
                return;
            }
        }
    }

    private static void u(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }
}
