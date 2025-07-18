package androidx.compose.foundation;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.kw;
import defpackage.qj;
import defpackage.sk;
import defpackage.uv;
import defpackage.vs;
import defpackage.ybo;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollingContainerElement extends bzi<sk> {
    private final vs a;
    private final uv b;
    private final boolean c;
    private final boolean d;
    private final qj e;
    private final kw f;
    private final ybo h;

    public ScrollingContainerElement(vs vsVar, uv uvVar, boolean z, ybo yboVar, kw kwVar, boolean z2, qj qjVar) {
        this.a = vsVar;
        this.b = uvVar;
        this.c = z;
        this.h = yboVar;
        this.f = kwVar;
        this.d = z2;
        this.e = qjVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new sk(this.a, this.b, this.c, this.h, this.f, this.d, this.e);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((sk) bkoVar).f(this.a, this.b, this.d, this.e, this.c, this.h, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return yks.e(this.a, scrollingContainerElement.a) && this.b == scrollingContainerElement.b && this.c == scrollingContainerElement.c && yks.e(this.h, scrollingContainerElement.h) && yks.e(this.f, scrollingContainerElement.f) && yks.e(null, null) && this.d == scrollingContainerElement.d && yks.e(this.e, scrollingContainerElement.e);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ybo yboVar = this.h;
        int iHashCode2 = yboVar != null ? yboVar.hashCode() : 0;
        int iQ = ((((((((((iHashCode * 31) + a.q(this.c)) * 31) + a.q(false)) * 31) + iHashCode2) * 31) + this.f.hashCode()) * 961) + a.q(this.d)) * 31;
        qj qjVar = this.e;
        return iQ + (qjVar != null ? qjVar.hashCode() : 0);
    }
}
