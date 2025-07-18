package androidx.compose.foundation;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.si;
import defpackage.sj;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends bzi<si> {
    private final sj a;
    private final boolean b = false;
    private final boolean c = true;

    public ScrollingLayoutElement(sj sjVar) {
        this.a = sjVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new si(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        si siVar = (si) bkoVar;
        siVar.a = this.a;
        siVar.b = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!yks.e(this.a, scrollingLayoutElement.a)) {
            return false;
        }
        boolean z = scrollingLayoutElement.b;
        boolean z2 = scrollingLayoutElement.c;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.q(false)) * 31) + a.q(true);
    }
}
