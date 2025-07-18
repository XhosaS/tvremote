package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
class fw implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ ga b;
    final /* synthetic */ fx c;

    public fw(fx fxVar, AlertController$RecycleListView alertController$RecycleListView, ga gaVar) {
        this.c = fxVar;
        this.a = alertController$RecycleListView;
        this.b = gaVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        fx fxVar = this.c;
        boolean[] zArr = fxVar.p;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        fxVar.t.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
