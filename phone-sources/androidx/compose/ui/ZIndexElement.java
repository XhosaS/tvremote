package androidx.compose.ui;

import defpackage.bko;
import defpackage.bkt;
import defpackage.bzi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ZIndexElement extends bzi<bkt> {
    private final float a;

    public ZIndexElement(float f) {
        this.a = f;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bkt(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((bkt) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.a, ((ZIndexElement) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=" + this.a + ')';
    }
}
