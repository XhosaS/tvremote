package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmn implements RecyclerView.OnChildAttachStateChangeListener {
    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (layoutParams.width != -1 || layoutParams.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
    }
}
