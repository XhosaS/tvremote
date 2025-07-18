package androidx.compose.ui.draw;

import defpackage.bko;
import defpackage.blq;
import defpackage.blr;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawWithCacheElement extends bzi<blq> {
    private final yjv a;

    public DrawWithCacheElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new blq(new blr(), this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        blq blqVar = (blq) bkoVar;
        blqVar.a = this.a;
        blqVar.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && this.a == ((DrawWithCacheElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
