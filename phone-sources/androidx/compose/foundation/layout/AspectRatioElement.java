package androidx.compose.foundation.layout;

import defpackage.bko;
import defpackage.bzi;
import defpackage.xl;
import defpackage.zy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AspectRatioElement extends bzi<xl> {
    private final float a;
    private final boolean b = false;

    public AspectRatioElement(float f) {
        this.a = f;
        if (f > 0.0f) {
            return;
        }
        zy.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new xl(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((xl) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null || this.a != aspectRatioElement.a) {
            return false;
        }
        boolean z = ((AspectRatioElement) obj).b;
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + 1237;
    }
}
