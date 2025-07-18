package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vcu implements AdapterView.OnItemClickListener {
    final /* synthetic */ vcw a;

    public vcu(vcw vcwVar) {
        this.a = vcwVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        View view2;
        long selectedItemId;
        int i2;
        if (i < 0) {
            oz ozVar = this.a.a;
            item = !ozVar.q.isShowing() ? null : ozVar.e.getSelectedItem();
        } else {
            item = this.a.getAdapter().getItem(i);
        }
        vcw vcwVar = this.a;
        vcwVar.setText(vcwVar.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = vcwVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                oz ozVar2 = vcwVar.a;
                PopupWindow popupWindow = ozVar2.q;
                View selectedView = popupWindow.isShowing() ? ozVar2.e.getSelectedView() : null;
                int iO = ozVar2.o();
                view2 = selectedView;
                selectedItemId = !popupWindow.isShowing() ? Long.MIN_VALUE : ozVar2.e.getSelectedItemId();
                i2 = iO;
            } else {
                view2 = view;
                i2 = i;
                selectedItemId = j;
            }
            onItemClickListener.onItemClick(vcwVar.a.e, view2, i2, selectedItemId);
        }
        vcwVar.a.f();
    }
}
