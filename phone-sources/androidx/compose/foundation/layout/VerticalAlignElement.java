package androidx.compose.foundation.layout;

import defpackage.bkh;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yks;
import defpackage.zq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class VerticalAlignElement extends bzi<zq> {
    private final bkh a;

    public VerticalAlignElement(bkh bkhVar) {
        this.a = bkhVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new zq(this.a, 0);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((zq) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return yks.e(this.a, verticalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
