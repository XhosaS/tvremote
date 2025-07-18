package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.tv.remote.service.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pe {
    private static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate b;
    public final View.AccessibilityDelegate c;

    public pe() {
        this(a);
    }

    static List k(View view) {
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, sm smVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, smVar.b);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, int i) {
        this.b.sendAccessibilityEvent(view, i);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean f(View view, AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean h(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listK = k(view);
        int i2 = 0;
        while (true) {
            if (i2 >= listK.size()) {
                break;
            }
            sl slVar = (sl) listK.get(i2);
            if (slVar.a() != i) {
                i2++;
            } else if (slVar.o != null) {
                Class cls = slVar.n;
                if (cls != null) {
                    try {
                    } catch (Exception e) {
                        Class cls2 = slVar.n;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(cls2 == null ? "null" : cls2.getName())), e);
                    }
                }
                zPerformAccessibilityAction = slVar.o.a(view);
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.b.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        ClickableSpan[] clickableSpanArrK = sm.k(view.createAccessibilityNodeInfo().getText());
        for (int i4 = 0; clickableSpanArrK != null && i4 < clickableSpanArrK.length; i4++) {
            if (clickableSpan.equals(clickableSpanArrK[i4])) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public asv i(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new asv(accessibilityNodeProvider, (byte[]) null);
        }
        return null;
    }

    public pe(View.AccessibilityDelegate accessibilityDelegate) {
        this.b = accessibilityDelegate;
        this.c = new pd(this);
    }
}
