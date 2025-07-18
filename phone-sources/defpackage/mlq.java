package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlq implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mlq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        int i = this.b;
        if (i == 0) {
            ((DetailsActivity) ((mlq) ((mlq) this.a).a).a).b();
            return;
        }
        if (i == 1) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.a).g;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
                return;
            }
            return;
        }
        if (i == 2) {
            ((ViewGroup) view2).setOnHierarchyChangeListener(new mlq(this, 0));
        } else if (view2.getId() == R.id.content_container) {
            ((DetailsActivity) this.a).b.setOnHierarchyChangeListener(null);
            ((ViewGroup) view2).setOnHierarchyChangeListener(new mlq(this, 2));
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (this.b != 1) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
        coordinatorLayout.e(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.g;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
