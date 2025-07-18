package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
class mg implements AdapterView.OnItemClickListener {
    final /* synthetic */ mj a;

    public mg(mj mjVar) {
        this.a = mjVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mj mjVar = this.a;
        mm mmVar = mjVar.d;
        mmVar.setSelection(i);
        if (mmVar.getOnItemClickListener() != null) {
            mmVar.performItemClick(view, i, mjVar.b.getItemId(i));
        }
        mjVar.f();
    }
}
