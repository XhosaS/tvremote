package androidx.compose.foundation.layout;

import defpackage.bko;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.cma;
import defpackage.yv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetElement extends bzi<yv> {
    private final float a;
    private final float b;

    public OffsetElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new yv(this.a, this.b);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        yv yvVar = (yv) bkoVar;
        float f = yvVar.a;
        float f2 = this.a;
        boolean zB = cma.b(f, f2);
        float f3 = this.b;
        if (!zB || !cma.b(yvVar.b, f3) || !yvVar.c) {
            cbp.Z(yvVar);
        }
        yvVar.a = f2;
        yvVar.b = f3;
        yvVar.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && cma.b(this.a, offsetElement.a) && cma.b(this.b, offsetElement.b);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) cma.a(this.a)) + ", y=" + ((Object) cma.a(this.b)) + ", rtlAware=true)";
    }
}
