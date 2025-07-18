package defpackage;

import android.view.View;
import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ayv implements View.OnClickListener {
    final /* synthetic */ ayo a;
    final /* synthetic */ ayw b;

    public ayv(ayw aywVar, ayo ayoVar) {
        this.b = aywVar;
        this.a = ayoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ayx ayxVar = this.b.i;
        HorizontalGridView horizontalGridView = ayxVar.a;
        ayo ayoVar = this.a;
        ayo ayoVar2 = (ayo) horizontalGridView.l(ayoVar.a);
        awk awkVar = ayxVar.s;
        if (awkVar != null) {
            awkVar.ew(ayoVar.t, ayoVar2.u, ayxVar, (ays) ayxVar.j);
        }
    }
}
