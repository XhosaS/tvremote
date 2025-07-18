package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yri implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ yrl b;

    public yri(yrl yrlVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = yrlVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.f(this.a);
    }

    public final String toString() throws IOException {
        yqn yqnVar = new yqn(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        yqnVar.e(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
