package androidx.compose.ui.graphics;

import defpackage.a;
import defpackage.bko;
import defpackage.bnk;
import defpackage.bnq;
import defpackage.bnr;
import defpackage.bnu;
import defpackage.bol;
import defpackage.bom;
import defpackage.bop;
import defpackage.brx;
import defpackage.bzi;
import defpackage.bzq;
import defpackage.fh;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends bzi<bom> {
    private final float a;
    private final float b;
    private final float c;
    private final float f;
    private final float k;
    private final long l;
    private final bol m;
    private final boolean n;
    private final long o;
    private final long p;
    private final int q;
    private final float d = 0.0f;
    private final float e = 0.0f;
    private final float h = 0.0f;
    private final float i = 0.0f;
    private final float j = 0.0f;
    private final brx t = null;
    private final int r = 3;
    private final bnr s = null;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, long j, bol bolVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.f = f4;
        this.k = f5;
        this.l = j;
        this.m = bolVar;
        this.n = z;
        this.o = j2;
        this.p = j3;
        this.q = i;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bom(this.a, this.b, this.c, this.f, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        bom bomVar = (bom) bkoVar;
        bomVar.a = this.a;
        bomVar.b = this.b;
        bomVar.c = this.c;
        bomVar.d = this.f;
        bomVar.e = this.k;
        bomVar.f = this.l;
        bomVar.g = this.m;
        bomVar.h = this.n;
        bomVar.i = this.o;
        bomVar.j = this.p;
        bomVar.k = this.q;
        bomVar.l = 3;
        bzq bzqVar = fh.J(bomVar, 2).v;
        if (bzqVar != null) {
            bzqVar.aq(bomVar.m, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.a, graphicsLayerElement.a) != 0 || Float.compare(this.b, graphicsLayerElement.b) != 0 || Float.compare(this.c, graphicsLayerElement.c) != 0) {
            return false;
        }
        float f = graphicsLayerElement.d;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f2 = graphicsLayerElement.e;
        if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.f, graphicsLayerElement.f) != 0) {
            return false;
        }
        float f3 = graphicsLayerElement.h;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f4 = graphicsLayerElement.i;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f5 = graphicsLayerElement.j;
        if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.k, graphicsLayerElement.k) != 0) {
            return false;
        }
        long j = this.l;
        long j2 = graphicsLayerElement.l;
        long j3 = bop.a;
        if (!a.s(j, j2) || !yks.e(this.m, graphicsLayerElement.m) || this.n != graphicsLayerElement.n) {
            return false;
        }
        brx brxVar = graphicsLayerElement.t;
        if (!yks.e(null, null)) {
            return false;
        }
        long j4 = this.o;
        long j5 = graphicsLayerElement.o;
        long j6 = bnq.a;
        if (!a.s(j4, j5) || !a.s(this.p, graphicsLayerElement.p) || !a.r(this.q, graphicsLayerElement.q)) {
            return false;
        }
        int i = graphicsLayerElement.r;
        if (!a.r(3, 3)) {
            return false;
        }
        bnr bnrVar = graphicsLayerElement.s;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.k);
        long j = bop.a;
        int iK = (((iFloatToIntBits * 31) + a.k(this.l)) * 31) + this.m.hashCode();
        long j2 = bnq.a;
        return ((((((((((iK * 31) + a.q(this.n)) * 961) + a.k(this.o)) * 31) + a.k(this.p)) * 31) + this.q) * 31) + 3) * 31;
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.f + ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=" + this.k + ", transformOrigin=" + ((Object) bop.c(this.l)) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + ((Object) bnq.g(this.o)) + ", spotShadowColor=" + ((Object) bnq.g(this.p)) + ", compositingStrategy=" + ((Object) bnu.a(this.q)) + ", blendMode=" + ((Object) bnk.a(3)) + ", colorFilter=null)";
    }
}
