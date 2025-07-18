package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pkw implements pkr {
    final /* synthetic */ pkx a;
    private int b = -1;

    public pkw(pkx pkxVar) {
        this.a = pkxVar;
    }

    @Override // defpackage.pkr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(pju pjuVar) {
        a.ab(pjuVar.c());
        vty vtyVar = pjuVar.e;
        ucy ucyVar = ((pka) vtyVar.b).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        a.ab((ucyVar.b & RecyclerView.ItemAnimator.FLAG_MOVED) != 0);
        int iAL = a.aL(((pka) vtyVar.b).e);
        if (iAL == 0 || iAL == 1) {
            pkx pkxVar = this.a;
            List list = pkxVar.e;
            int size = list.size();
            list.add(pjuVar.a());
            pkxVar.f.put(size, this.b);
            int i = this.b;
            this.b = size;
            pjuVar.c.m(this);
            this.b = i;
        }
    }
}
