package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class hqp implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;

    public hqp(View view) {
        this.a = view;
    }

    final View a() {
        ViewGroup viewGroup = (ViewGroup) ((hle) this.a).getFragmentView();
        if (viewGroup != null) {
            return viewGroup.getChildAt(0);
        }
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View viewA = a();
        if (viewA == null) {
            return true;
        }
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        if (viewA.getTop() >= 0) {
            return true;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: hqo
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                View viewA2 = this.a.a();
                if (viewA2 == null || viewA2.getTop() >= 0) {
                    return true;
                }
                viewA2.setTop(0);
                return true;
            }
        };
        onPreDrawListener.onPreDraw();
        view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        return true;
    }
}
