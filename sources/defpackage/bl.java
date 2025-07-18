package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bl implements AdapterView.OnItemClickListener {
    final /* synthetic */ bp a;
    final /* synthetic */ bm b;

    public bl(bm bmVar, bp bpVar) {
        this.b = bmVar;
        this.a = bpVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        bp bpVar = this.a;
        bm bmVar = this.b;
        DialogInterface.OnClickListener onClickListener = bmVar.h;
        cl clVar = bpVar.b;
        onClickListener.onClick(clVar, i);
        if (bmVar.i) {
            return;
        }
        clVar.dismiss();
    }
}
