package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddc implements Iterable {
    public final List a;

    public ddc(List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final ddc b() {
        return new ddc(new ArrayList(this.a));
    }

    final boolean c(dos dosVar) {
        return this.a.contains(new ddb(dosVar, dqc.b));
    }

    final boolean d() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public ddc() {
        this.a = new ArrayList(2);
    }
}
