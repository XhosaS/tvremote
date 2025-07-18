package androidx.compose.foundation.lazy.layout;

import defpackage.adm;
import defpackage.ady;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TraversablePrefetchStateModifierElement extends bzi<ady> {
    private final adm a;

    public TraversablePrefetchStateModifierElement(adm admVar) {
        this.a = admVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ady(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((ady) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && yks.e(this.a, ((TraversablePrefetchStateModifierElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
