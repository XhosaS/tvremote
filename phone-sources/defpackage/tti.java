package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tti implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ uof b;

    public tti(uof uofVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = uofVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.b.c(this.a);
    }

    public final String toString() throws IOException {
        tsp tspVar = new tsp(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        tspVar.e(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
