package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends bzi<yt> {
    private final float a;
    private final boolean b;

    public LayoutWeightElement(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new yt(this.a, this.b);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        yt ytVar = (yt) bkoVar;
        ytVar.a = this.a;
        ytVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.a == layoutWeightElement.a && this.b == layoutWeightElement.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + a.q(this.b);
    }
}
