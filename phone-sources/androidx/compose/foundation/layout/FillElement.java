package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FillElement extends bzi<yg> {
    private final float a;
    private final int b;

    public FillElement(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new yg(this.b, this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        yg ygVar = (yg) bkoVar;
        ygVar.b = this.b;
        ygVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.a == fillElement.a;
    }

    public final int hashCode() {
        int i = this.b;
        a.bw(i);
        return (i * 31) + Float.floatToIntBits(this.a);
    }
}
