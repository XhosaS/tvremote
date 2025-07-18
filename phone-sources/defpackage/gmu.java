package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmu extends RecyclerView {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmu(ViewPager2 viewPager2, Context context) {
        super(context);
        this.a = viewPager2;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.a;
        accessibilityEvent.setFromIndex(viewPager2.a);
        accessibilityEvent.setToIndex(viewPager2.a);
        accessibilityEvent.setSource(((gms) viewPager2.h).b);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.f && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.f && super.onTouchEvent(motionEvent);
    }
}
