package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ot implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ oz a;

    public ot(oz ozVar) {
        this.a = ozVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        nu nuVar;
        if (i == -1 || (nuVar = this.a.e) == null) {
            return;
        }
        nuVar.a = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
