package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bef implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bef(beg begVar, int i) {
        this.b = i;
        this.a = begVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        View view2;
        int i2 = this.b;
        if (i2 == 0) {
            bed bedVar = (bed) adapterView.getItemAtPosition(i);
            LicenseMenuActivity licenseMenuActivity = ((beg) this.a).aa;
            if (licenseMenuActivity != null) {
                Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                intent.putExtra("license", bedVar);
                licenseMenuActivity.startActivity(intent);
                return;
            }
            return;
        }
        if (i2 == 1) {
            Object obj = this.a;
            gb gbVar = (gb) obj;
            ge geVar = gbVar.d;
            geVar.setSelection(i);
            if (geVar.getOnItemClickListener() != null) {
                geVar.performItemClick(view, i, gbVar.b.getItemId(i));
            }
            ((hz) obj).k();
            return;
        }
        if (i < 0) {
            hz hzVar = ((blc) this.a).a;
            item = !hzVar.u() ? null : hzVar.e.getSelectedItem();
        } else {
            item = ((blc) this.a).getAdapter().getItem(i);
        }
        blc blcVar = (blc) this.a;
        blcVar.setText(blcVar.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = blcVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                hz hzVar2 = blcVar.a;
                View selectedView = hzVar2.u() ? hzVar2.e.getSelectedView() : null;
                i = hzVar2.o();
                j = !hzVar2.u() ? Long.MIN_VALUE : hzVar2.e.getSelectedItemId();
                view2 = selectedView;
            } else {
                view2 = view;
            }
            onItemClickListener.onItemClick(blcVar.a.e, view2, i, j);
        }
        blcVar.a.k();
    }

    public bef(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
