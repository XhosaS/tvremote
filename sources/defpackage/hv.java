package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hv implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ hz a;

    public hv(hz hzVar) {
        this.a = hzVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        hf hfVar;
        if (i == -1 || (hfVar = this.a.e) == null) {
            return;
        }
        hfVar.a = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
