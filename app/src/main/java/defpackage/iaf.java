package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaf extends afn {
    final iag a;

    public iaf(iag iagVar) {
        super(afn.c);
        this.a = iagVar;
    }

    @Override // defpackage.afn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
        int childCount = ((ViewGroup) view).getChildCount();
        accessibilityEvent.setScrollable(childCount > 0);
        accessibilityEvent.setItemCount(childCount);
        zdy zdyVar = SuggestionsScrollView.a;
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        super.c(view, ajrVar);
        int childCount = ((ViewGroup) view).getChildCount();
        if (childCount > 0) {
            int iG = SuggestionsScrollView.g(this.a.getBestChip());
            if (iG > 0) {
                ajrVar.a.addAction(8192);
            }
            if (iG >= 0 && iG < childCount - 1) {
                ajrVar.a.addAction(4096);
            }
            ajrVar.j();
            ajrVar.d(new ajp(AccessibilityNodeInfo.CollectionInfo.obtain(1, childCount, false)));
        }
    }
}
