package defpackage;

import android.support.v7.util.DiffUtil;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ifd extends DiffUtil.Callback {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ ife c;

    public ifd(ife ifeVar, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = ifeVar;
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i2) {
        return this.a.get(i).equals(this.b.get(i2));
    }

    @Override // android.support.v7.util.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i2) {
        idf idfVar = this.c.a;
        return idfVar.b(this.a.get(i)).equals(idfVar.b(this.b.get(i2)));
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
