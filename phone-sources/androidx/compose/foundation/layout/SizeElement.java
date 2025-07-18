package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cma;
import defpackage.zj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeElement extends bzi<zj> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean e;

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new zj(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        zj zjVar = (zj) bkoVar;
        zjVar.a = this.a;
        zjVar.b = this.b;
        zjVar.c = this.c;
        zjVar.d = this.d;
        zjVar.e = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return cma.b(this.a, sizeElement.a) && cma.b(this.b, sizeElement.b) && cma.b(this.c, sizeElement.c) && cma.b(this.d, sizeElement.d) && this.e == sizeElement.e;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + a.q(this.e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, int i) {
        float f5 = (i & 8) != 0 ? Float.NaN : f4;
        float f6 = (i & 4) != 0 ? Float.NaN : f3;
        this(1 == (i & 1) ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, f6, f5, true);
    }
}
