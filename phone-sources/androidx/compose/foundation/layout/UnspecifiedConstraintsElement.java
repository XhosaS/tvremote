package androidx.compose.foundation.layout;

import defpackage.bko;
import defpackage.bzi;
import defpackage.cma;
import defpackage.zo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsElement extends bzi<zo> {
    private final float a;
    private final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new zo(this.a, this.b);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        zo zoVar = (zo) bkoVar;
        zoVar.a = this.a;
        zoVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return cma.b(this.a, unspecifiedConstraintsElement.a) && cma.b(this.b, unspecifiedConstraintsElement.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
