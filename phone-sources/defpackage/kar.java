package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kar extends xch {
    private SparseArray a;

    public abstract boolean dS();

    @Override // defpackage.bv
    public final void onResume() {
        SparseArray<Parcelable> sparseArray;
        View view;
        super.onResume();
        if (!dS() || (sparseArray = this.a) == null || (view = getView()) == null) {
            return;
        }
        view.restoreHierarchyState(sparseArray);
    }

    @Override // defpackage.bv
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        View view = getView();
        if (view != null) {
            view.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("view_state_key", sparseArray);
    }

    @Override // defpackage.bv
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.a = bundle != null ? bundle.getSparseParcelableArray("view_state_key") : null;
    }
}
