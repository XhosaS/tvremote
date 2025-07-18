package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byk implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ byl b;

    public byk(byl bylVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = bylVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.c(this.a);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        bdq.u(sb, iterator(), ", ");
        sb.append(']');
        return sb.toString();
    }
}
