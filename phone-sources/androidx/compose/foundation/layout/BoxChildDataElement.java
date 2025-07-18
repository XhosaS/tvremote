package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.bkd;
import defpackage.bko;
import defpackage.bzi;
import defpackage.xm;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BoxChildDataElement extends bzi<xm> {
    private final bkd a;
    private final boolean b;

    public BoxChildDataElement(bkd bkdVar, boolean z) {
        this.a = bkdVar;
        this.b = z;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new xm(this.a, this.b);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        xm xmVar = (xm) bkoVar;
        xmVar.a = this.a;
        xmVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && yks.e(this.a, boxChildDataElement.a) && this.b == boxChildDataElement.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.q(this.b);
    }
}
