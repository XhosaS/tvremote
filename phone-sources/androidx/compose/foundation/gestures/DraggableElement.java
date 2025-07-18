package androidx.compose.foundation.gestures;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.kw;
import defpackage.pl;
import defpackage.ue;
import defpackage.uf;
import defpackage.uv;
import defpackage.yjv;
import defpackage.yka;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableElement extends bzi<ue> {
    private static final yjv a = new pl(9);
    private final uf b;
    private final uv c;
    private final boolean d;
    private final boolean e;
    private final yka f;
    private final yka h;
    private final boolean i;
    private final kw j;

    public DraggableElement(uf ufVar, uv uvVar, boolean z, kw kwVar, boolean z2, yka ykaVar, yka ykaVar2, boolean z3) {
        this.b = ufVar;
        this.c = uvVar;
        this.d = z;
        this.j = kwVar;
        this.e = z2;
        this.f = ykaVar;
        this.h = ykaVar2;
        this.i = z3;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ue(this.b, a, this.c, this.d, this.j, this.e, this.f, this.h, this.i);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        boolean z;
        boolean z2;
        ue ueVar = (ue) bkoVar;
        yjv yjvVar = a;
        uf ufVar = ueVar.h;
        uf ufVar2 = this.b;
        if (yks.e(ufVar, ufVar2)) {
            z = false;
        } else {
            ueVar.h = ufVar2;
            z = true;
        }
        uv uvVar = this.c;
        if (ueVar.i != uvVar) {
            ueVar.i = uvVar;
            z = true;
        }
        boolean z3 = this.i;
        if (ueVar.m != z3) {
            ueVar.m = z3;
            z2 = true;
        } else {
            z2 = z;
        }
        yka ykaVar = this.h;
        yka ykaVar2 = this.f;
        boolean z4 = this.e;
        kw kwVar = this.j;
        boolean z5 = this.d;
        ueVar.k = ykaVar2;
        ueVar.l = ykaVar;
        ueVar.j = z4;
        ueVar.w(yjvVar, z5, kwVar, uvVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return yks.e(this.b, draggableElement.b) && this.c == draggableElement.c && this.d == draggableElement.d && yks.e(this.j, draggableElement.j) && this.e == draggableElement.e && yks.e(this.f, draggableElement.f) && yks.e(this.h, draggableElement.h) && this.i == draggableElement.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        kw kwVar = this.j;
        return (((((((((((iHashCode * 31) + a.q(this.d)) * 31) + (kwVar != null ? kwVar.hashCode() : 0)) * 31) + a.q(this.e)) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + a.q(this.i);
    }
}
