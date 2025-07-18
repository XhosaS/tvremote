package androidx.compose.material3;

import defpackage.a;
import defpackage.axc;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.kw;
import defpackage.ms;
import defpackage.np;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ThumbElement extends bzi<axc> {
    private final boolean a;
    private final np b;
    private final kw c;

    public ThumbElement(kw kwVar, boolean z, np npVar) {
        this.c = kwVar;
        this.a = z;
        this.b = npVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new axc(this.c, this.a, this.b);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        axc axcVar = (axc) bkoVar;
        axcVar.h = this.c;
        boolean z = axcVar.a;
        boolean z2 = this.a;
        if (z != z2) {
            cbp.Y(axcVar);
        }
        axcVar.a = z2;
        axcVar.b = this.b;
        if (axcVar.e == null && !Float.isNaN(axcVar.g)) {
            axcVar.e = ms.a(axcVar.g);
        }
        if (axcVar.d != null || Float.isNaN(axcVar.f)) {
            return;
        }
        axcVar.d = ms.a(axcVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return yks.e(this.c, thumbElement.c) && this.a == thumbElement.a && yks.e(this.b, thumbElement.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + a.q(this.a)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.c + ", checked=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
