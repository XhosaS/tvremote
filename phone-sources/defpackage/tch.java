package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tch implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tch(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.b != 0) {
            cbi cbiVar = (cbi) this.a;
            cbiVar.g = cbiVar.d.getEnabledAccessibilityServiceList(-1);
            return;
        }
        tck tckVar = (tck) this.a;
        AutoCompleteTextView autoCompleteTextView = tckVar.a;
        if (autoCompleteTextView == null || szg.g(autoCompleteTextView)) {
            return;
        }
        tckVar.h.setImportantForAccessibility(true == z ? 2 : 1);
    }
}
