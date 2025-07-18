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
import com.google.android.tv.remote.service.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pd extends View.AccessibilityDelegate {
    final pe a;

    public pd(pe peVar) {
        this.a = peVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        asv asvVarI = this.a.i(view);
        if (asvVarI != null) {
            return (AccessibilityNodeProvider) asvVarI.a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int iKeyAt;
        sm smVar = new sm(accessibilityNodeInfo);
        int[] iArr = qv.a;
        Boolean bool = (Boolean) new qe(Boolean.class).d(view);
        boolean z = bool != null && bool.booleanValue();
        if (Build.VERSION.SDK_INT >= 28) {
            smVar.b.setScreenReaderFocusable(z);
        } else {
            smVar.f(1, z);
        }
        Boolean bool2 = (Boolean) new qh(Boolean.class).d(view);
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (Build.VERSION.SDK_INT >= 28) {
            smVar.b.setHeading(z2);
        } else {
            smVar.f(2, z2);
        }
        CharSequence charSequenceE = qv.e(view);
        if (Build.VERSION.SDK_INT >= 28) {
            smVar.b.setPaneTitle(charSequenceE);
        } else {
            smVar.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceE);
        }
        CharSequence charSequence = (CharSequence) new qg(CharSequence.class).d(view);
        if (Build.VERSION.SDK_INT >= 30) {
            smVar.b.setStateDescription(charSequence);
        } else {
            smVar.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.b(view, smVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = smVar.b;
            accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArrayL = sm.l(view);
            if (sparseArrayL != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < sparseArrayL.size(); i++) {
                    if (((WeakReference) sparseArrayL.valueAt(i)).get() == null) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    sparseArrayL.remove(((Integer) arrayList.get(i2)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArrK = sm.k(text);
            if (clickableSpanArrK != null && clickableSpanArrK.length > 0) {
                smVar.a().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArrayL2 = sm.l(view);
                if (sparseArrayL2 == null) {
                    sparseArrayL2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArrayL2);
                }
                for (int i3 = 0; i3 < clickableSpanArrK.length; i3++) {
                    ClickableSpan clickableSpan = clickableSpanArrK[i3];
                    int i4 = 0;
                    while (true) {
                        if (i4 >= sparseArrayL2.size()) {
                            iKeyAt = sm.a;
                            sm.a = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArrayL2.valueAt(i4)).get())) {
                                iKeyAt = sparseArrayL2.keyAt(i4);
                                break;
                            }
                            i4++;
                        }
                    }
                    sparseArrayL2.put(iKeyAt, new WeakReference(clickableSpanArrK[i3]));
                    ClickableSpan clickableSpan2 = clickableSpanArrK[i3];
                    Spanned spanned = (Spanned) text;
                    smVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    smVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    smVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    smVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                }
            }
        }
        List listK = pe.k(view);
        for (int i5 = 0; i5 < listK.size(); i5++) {
            smVar.e((sl) listK.get(i5));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.h(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.d(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }
}
