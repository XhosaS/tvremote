package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnm implements Iterable {
    public final List a;

    public hnm(List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final hnm b() {
        return new hnm(new ArrayList(this.a));
    }

    final boolean c() {
        return this.a.isEmpty();
    }

    final boolean d(hvd hvdVar) {
        return this.a.contains(new hnl(hvdVar, hwh.b));
    }

    @Override // java.lang.Iterable
    public final Iterator<hnl> iterator() {
        return this.a.iterator();
    }

    public hnm() {
        this(new ArrayList(2));
    }
}
