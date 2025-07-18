package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyd implements Iterable {
    final /* synthetic */ agxs a;

    public agyd(agxs agxsVar) {
        this.a = agxsVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new agyp((agyq) this.a);
    }
}
