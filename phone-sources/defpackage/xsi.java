package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsi<T> implements Iterable<T> {
    public final xsj a;
    public final int b;
    final /* synthetic */ xsm c;

    public xsi(xsm xsmVar, xsj xsjVar, int i) {
        this.c = xsmVar;
        this.a = xsjVar;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new xsh(this);
    }
}
