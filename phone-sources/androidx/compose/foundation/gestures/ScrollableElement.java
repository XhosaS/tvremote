package androidx.compose.foundation.gestures;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.kw;
import defpackage.qj;
import defpackage.tb;
import defpackage.uv;
import defpackage.vr;
import defpackage.vs;
import defpackage.ybo;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollableElement extends bzi<vr> {
    private final vs a;
    private final uv b;
    private final boolean c;
    private final boolean d;
    private final kw h;
    private final qj f = null;
    private final ybo i = null;
    private final tb e = null;

    public ScrollableElement(vs vsVar, uv uvVar, boolean z, boolean z2, kw kwVar) {
        this.a = vsVar;
        this.b = uvVar;
        this.c = z;
        this.d = z2;
        this.h = kwVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new vr(this.a, null, null, this.b, this.c, this.d, this.h);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        kw kwVar = this.h;
        ((vr) bkoVar).A(this.a, this.b, null, this.c, this.d, null, kwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (!yks.e(this.a, scrollableElement.a) || this.b != scrollableElement.b) {
            return false;
        }
        qj qjVar = scrollableElement.f;
        if (!yks.e(null, null) || this.c != scrollableElement.c || this.d != scrollableElement.d) {
            return false;
        }
        ybo yboVar = scrollableElement.i;
        if (!yks.e(null, null) || !yks.e(this.h, scrollableElement.h)) {
            return false;
        }
        tb tbVar = scrollableElement.e;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        kw kwVar = this.h;
        return ((((((iHashCode * 961) + a.q(this.c)) * 31) + a.q(this.d)) * 961) + (kwVar != null ? kwVar.hashCode() : 0)) * 31;
    }
}
