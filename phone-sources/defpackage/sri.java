package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sri implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    final /* synthetic */ ChipGroup b;

    public sri(ChipGroup chipGroup) {
        this.b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            stx stxVar = chipGroup.a;
            Chip chip = (Chip) view2;
            stxVar.a.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                stxVar.e(chip);
            }
            chip.n(new zft(stxVar, null));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            stx stxVar = chipGroup.a;
            Chip chip = (Chip) view2;
            chip.n(null);
            stxVar.a.remove(Integer.valueOf(chip.getId()));
            stxVar.b.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
