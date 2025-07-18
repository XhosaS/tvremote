package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.videos.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cun extends View.AccessibilityDelegate {
    final cuo a;

    public cun(cuo cuoVar) {
        this.a = cuoVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        cyt accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int iKeyAt;
        cyq cyqVar = new cyq(accessibilityNodeInfo);
        int[] iArr = cww.a;
        Boolean bool = (Boolean) new cwe(Boolean.class).d(view);
        cyqVar.O(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new cwh(Boolean.class).d(view);
        cyqVar.D(bool2 != null && bool2.booleanValue());
        cyqVar.K(cww.g(view));
        cyqVar.S(cww.h(view));
        this.a.onInitializeAccessibilityNodeInfo(view, cyqVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = cyqVar.b;
            accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArrayAh = cyq.ah(view);
            if (sparseArrayAh != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < sparseArrayAh.size(); i++) {
                    if (((WeakReference) sparseArrayAh.valueAt(i)).get() == null) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    sparseArrayAh.remove(((Integer) arrayList.get(i2)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArrAg = cyq.ag(text);
            if (clickableSpanArrAg != null && clickableSpanArrAg.length > 0) {
                cyqVar.a().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArrayAh2 = cyq.ah(view);
                if (sparseArrayAh2 == null) {
                    sparseArrayAh2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArrayAh2);
                }
                for (int i3 = 0; i3 < clickableSpanArrAg.length; i3++) {
                    ClickableSpan clickableSpan = clickableSpanArrAg[i3];
                    int i4 = 0;
                    while (true) {
                        if (i4 >= sparseArrayAh2.size()) {
                            iKeyAt = cyq.a;
                            cyq.a = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArrayAh2.valueAt(i4)).get())) {
                                iKeyAt = sparseArrayAh2.keyAt(i4);
                                break;
                            }
                            i4++;
                        }
                    }
                    sparseArrayAh2.put(iKeyAt, new WeakReference(clickableSpanArrAg[i3]));
                    ClickableSpan clickableSpan2 = clickableSpanArrAg[i3];
                    Spanned spanned = (Spanned) text;
                    cyqVar.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    cyqVar.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    cyqVar.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    cyqVar.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                }
            }
        }
        List<cyp> actionList = cuo.getActionList(view);
        for (int i5 = 0; i5 < actionList.size(); i5++) {
            cyqVar.j(actionList.get(i5));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.performAccessibilityAction(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
