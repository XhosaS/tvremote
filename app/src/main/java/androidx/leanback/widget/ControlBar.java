package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class ControlBar extends LinearLayout {
    int a;
    final boolean b;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = true;
    }

    final int a() {
        if (this.b) {
            return getChildCount() / 2;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (i != 33 && i != 130) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        int i3 = this.a;
        if (i3 >= 0 && i3 < getChildCount()) {
            arrayList.add(getChildAt(this.a));
        } else if (getChildCount() > 0) {
            arrayList.add(getChildAt(a()));
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (getChildCount() > 0) {
            int i2 = this.a;
            if (getChildAt((i2 < 0 || i2 >= getChildCount()) ? a() : this.a).requestFocus(i, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.a = indexOfChild(view);
    }

    public ControlBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        this.b = true;
    }
}
