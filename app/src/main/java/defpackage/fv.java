package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
class fv implements AdapterView.OnItemClickListener {
    final /* synthetic */ ga a;
    final /* synthetic */ fx b;

    public fv(fx fxVar, ga gaVar) {
        this.b = fxVar;
        this.a = gaVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ga gaVar = this.a;
        fx fxVar = this.b;
        DialogInterface.OnClickListener onClickListener = fxVar.n;
        hh hhVar = gaVar.b;
        onClickListener.onClick(hhVar, i);
        if (fxVar.r) {
            return;
        }
        hhVar.dismiss();
    }
}
