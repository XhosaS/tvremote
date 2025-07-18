package androidx.compose.foundation.layout;

import defpackage.bkc;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yks;
import defpackage.zq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends bzi<zq> {
    private final bkc a;

    public HorizontalAlignElement(bkc bkcVar) {
        this.a = bkcVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new zq(this.a, 1);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((zq) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return yks.e(this.a, horizontalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
