package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PlaybackTransportRowView extends LinearLayout {
    public PlaybackTransportRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r4, int r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L5c
            r0 = 33
            if (r5 != r0) goto L1d
            android.view.View r0 = r3.getFocusedChild()
            int r0 = r3.indexOfChild(r0)
        Le:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L5c
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1.hasFocusable()
            if (r2 == 0) goto Le
            return r1
        L1d:
            r0 = 130(0x82, float:1.82E-43)
            if (r5 != r0) goto L3c
            android.view.View r0 = r3.getFocusedChild()
            int r0 = r3.indexOfChild(r0)
        L29:
            int r0 = r0 + 1
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L5c
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1.hasFocusable()
            if (r2 == 0) goto L29
            return r1
        L3c:
            r0 = 17
            if (r5 == r0) goto L45
            r0 = 66
            if (r5 != r0) goto L5c
            r5 = r0
        L45:
            android.view.View r0 = r3.getFocusedChild()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5c
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r3.getFocusedChild()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r4 = r0.findNextFocus(r1, r4, r5)
            return r4
        L5c:
            android.view.View r4 = super.focusSearch(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.PlaybackTransportRowView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindFocus = findFocus();
        if (viewFindFocus != null && viewFindFocus.requestFocus(i, rect)) {
            return true;
        }
        View viewFindViewById = findViewById(R.id.playback_progress);
        if (viewFindViewById != null && viewFindViewById.isFocusable() && viewFindViewById.requestFocus(i, rect)) {
            return true;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
