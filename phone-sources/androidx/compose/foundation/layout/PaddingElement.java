package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cma;
import defpackage.yx;
import defpackage.zy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingElement extends bzi<yx> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3))) || !(f4 >= 0.0f || Float.isNaN(f4))) {
            zy.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new yx(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        yx yxVar = (yx) bkoVar;
        yxVar.a = this.a;
        yxVar.b = this.b;
        yxVar.c = this.c;
        yxVar.d = this.d;
        yxVar.e = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && cma.b(this.a, paddingElement.a) && cma.b(this.b, paddingElement.b) && cma.b(this.c, paddingElement.c) && cma.b(this.d, paddingElement.d);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + a.q(true);
    }
}
