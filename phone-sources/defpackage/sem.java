package defpackage;

import android.support.v7.util.DiffUtil;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sem extends DiffUtil.Callback {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public sem(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i2) {
        sfa sfaVar = (sfa) this.a.get(i);
        sfa sfaVar2 = (sfa) this.b.get(i2);
        sfa sfaVar3 = sfb.a;
        return sfaVar == sfaVar3 ? sfaVar2 == sfaVar3 : sfaVar.equals(sfaVar2);
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i2) {
        sfa sfaVar = (sfa) this.a.get(i);
        sfa sfaVar2 = (sfa) this.b.get(i2);
        sfa sfaVar3 = sfb.a;
        return sfaVar == sfaVar3 ? sfaVar2 == sfaVar3 : sfaVar.a.equals(sfaVar2.a);
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
