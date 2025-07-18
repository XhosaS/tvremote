package defpackage;

import android.view.View;
import androidx.leanback.widget.HorizontalGridView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uus extends azw {
    public final avs a;

    public uus(View view) {
        super(view);
        this.a = new avs();
        ((HorizontalGridView) view).ag(new ayq());
    }

    public final void d() {
        ((ayq) ((HorizontalGridView) this.g).getAdapter()).s(null);
    }

    public final void e(uur uurVar) {
        avs avsVar = this.a;
        yyk yykVarC = uurVar.c();
        awp awpVarA = uurVar.a();
        List list = avsVar.c;
        list.clear();
        List list2 = avsVar.b;
        list.addAll(list2);
        ib ibVarA = C0001if.a(new avq(avsVar, yykVarC, awpVarA), true);
        list2.clear();
        list2.addAll(yykVarC);
        if (avsVar.d == null) {
            avsVar.d = new avr(avsVar);
        }
        ibVarA.a(avsVar.d);
        list.clear();
    }
}
