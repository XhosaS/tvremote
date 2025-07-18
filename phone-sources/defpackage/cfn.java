package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfn<T> implements Comparator {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Comparator b;

    public cfn(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.a.compare(t, t2);
        return iCompare != 0 ? iCompare : this.b.compare(((cff) t).b, ((cff) t2).b);
    }
}
