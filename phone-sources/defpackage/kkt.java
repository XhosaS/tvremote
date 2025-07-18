package defpackage;

import android.support.v7.util.DiffUtil;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkt extends DiffUtil.Callback {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public kkt(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i2) {
        klb klbVar = (klb) this.a.get(i);
        klb klbVar2 = (klb) this.b.get(i2);
        klb klbVar3 = klc.a;
        return klbVar == klbVar3 ? klbVar2 == klbVar3 : yks.e(klbVar, klbVar2);
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i2) {
        klb klbVar = (klb) this.a.get(i);
        klb klbVar2 = (klb) this.b.get(i2);
        klb klbVar3 = klc.a;
        return klbVar == klbVar3 ? klbVar2 == klbVar3 : yks.e(klbVar.a, klbVar2.a);
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final int getNewListSize() {
        return this.b.size();
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final int getOldListSize() {
        return this.a.size();
    }
}
