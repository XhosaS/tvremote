package androidx.compose.foundation.layout;

import defpackage.bko;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.yjv;
import defpackage.yw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetPxElement extends bzi<yw> {
    private final yjv a;

    public OffsetPxElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new yw(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        yw ywVar = (yw) bkoVar;
        yjv yjvVar = ywVar.a;
        yjv yjvVar2 = this.a;
        if (yjvVar != yjvVar2 || !ywVar.b) {
            cbp.Z(ywVar);
        }
        ywVar.a = yjvVar2;
        ywVar.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.a == offsetPxElement.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
