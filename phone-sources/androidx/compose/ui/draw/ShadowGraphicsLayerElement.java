package androidx.compose.ui.draw;

import defpackage.a;
import defpackage.bko;
import defpackage.bnm;
import defpackage.bnq;
import defpackage.bol;
import defpackage.bzi;
import defpackage.cma;
import defpackage.lk;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends bzi<bnm> {
    public final float a;
    public final bol b;
    public final boolean c;
    public final long d;
    public final long e;

    public ShadowGraphicsLayerElement(float f, bol bolVar, boolean z, long j, long j2) {
        this.a = f;
        this.b = bolVar;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bnm(new lk(this, 15));
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        bnm bnmVar = (bnm) bkoVar;
        bnmVar.a = new lk(this, 15);
        bnmVar.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        if (!cma.b(this.a, shadowGraphicsLayerElement.a) || !yks.e(this.b, shadowGraphicsLayerElement.b) || this.c != shadowGraphicsLayerElement.c) {
            return false;
        }
        long j = this.d;
        long j2 = shadowGraphicsLayerElement.d;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.e, shadowGraphicsLayerElement.e);
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
        long j = bnq.a;
        long j2 = this.e;
        return (((((iFloatToIntBits * 31) + a.q(this.c)) * 31) + a.k(this.d)) * 31) + a.k(j2);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) cma.a(this.a)) + ", shape=" + this.b + ", clip=" + this.c + ", ambientColor=" + ((Object) bnq.g(this.d)) + ", spotColor=" + ((Object) bnq.g(this.e)) + ')';
    }
}
