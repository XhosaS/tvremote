package defpackage;

import android.content.Intent;
import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iuj implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iuj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ith ithVar;
        int i2 = this.b;
        if (i2 == 0) {
            adapterView.getClass();
            view.getClass();
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            ithVar = itemAtPosition instanceof ith ? (ith) itemAtPosition : null;
            if (ithVar == null) {
                return;
            }
            ((iul) this.a).c.k(ithVar);
            return;
        }
        if (i2 == 1) {
            adapterView.getClass();
            view.getClass();
            Object itemAtPosition2 = adapterView.getItemAtPosition(i);
            ithVar = itemAtPosition2 instanceof ith ? (ith) itemAtPosition2 : null;
            if (ithVar == null) {
                return;
            }
            ((iui) this.a).c.k(ithVar);
            return;
        }
        if (i2 == 2) {
            sgu sguVar = (sgu) adapterView.getItemAtPosition(i);
            LicenseMenuActivity licenseMenuActivity = ((sgw) this.a).a;
            if (licenseMenuActivity != null) {
                Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                intent.putExtra("license", sguVar);
                licenseMenuActivity.startActivity(intent);
                return;
            }
            return;
        }
        Object selectedItem = i < 0 ? ((tct) this.a).a.getSelectedItem() : ((tct) this.a).getAdapter().getItem(i);
        tct tctVar = (tct) this.a;
        tctVar.setText(tctVar.convertSelectionToString(selectedItem), false);
        AdapterView.OnItemClickListener onItemClickListener = tctVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                ListPopupWindow listPopupWindow = tctVar.a;
                view = listPopupWindow.getSelectedView();
                i = listPopupWindow.getSelectedItemPosition();
                j = listPopupWindow.getSelectedItemId();
            }
            onItemClickListener.onItemClick(tctVar.a.getListView(), view, i, j);
        }
        tctVar.a.dismiss();
    }

    public iuj(tct tctVar, int i) {
        this.b = i;
        this.a = tctVar;
    }
}
