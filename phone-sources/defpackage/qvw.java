package defpackage;

import android.support.v7.util.DiffUtil;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qvw extends DiffUtil.Callback {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ qvx c;

    public qvw(qvx qvxVar, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = qvxVar;
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i2) {
        Object obj = this.a.get(i);
        Object obj2 = this.b.get(i2);
        qth qthVar = this.c.a;
        return qtn.a(obj, qthVar).equals(qtn.a(obj2, qthVar));
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i2) {
        qth qthVar = this.c.a;
        return qthVar.c(this.a.get(i)).equals(qthVar.c(this.b.get(i2)));
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
