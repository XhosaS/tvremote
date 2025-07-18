package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agqn implements Iterable {
    public final /* synthetic */ Object[] a;

    public agqn(Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return agvm.a(this.a);
    }
}
