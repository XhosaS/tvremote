package androidx.compose.foundation;

import defpackage.a;
import defpackage.bko;
import defpackage.bnn;
import defpackage.bnq;
import defpackage.bol;
import defpackage.bzi;
import defpackage.fh;
import defpackage.qn;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BackgroundElement extends bzi<qn> {
    private final long a;
    private final bnn b;
    private final bol c;

    public /* synthetic */ BackgroundElement(long j, bnn bnnVar, bol bolVar, int i) {
        j = (i & 1) != 0 ? bnq.g : j;
        bnnVar = (i & 2) != 0 ? null : bnnVar;
        this.a = j;
        this.b = bnnVar;
        this.c = bolVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new qn(this.a, this.b, this.c);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        qn qnVar = (qn) bkoVar;
        qnVar.a = this.a;
        qnVar.b = this.b;
        qnVar.c = 1.0f;
        qnVar.d = this.c;
        fh.D(qnVar);
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        if (backgroundElement == null) {
            return false;
        }
        long j = this.a;
        long j2 = backgroundElement.a;
        long j3 = bnq.a;
        return a.s(j, j2) && yks.e(this.b, backgroundElement.b) && yks.e(this.c, backgroundElement.c);
    }

    public final int hashCode() {
        long j = bnq.a;
        bnn bnnVar = this.b;
        return (((((a.k(this.a) * 31) + (bnnVar != null ? bnnVar.hashCode() : 0)) * 31) + Float.floatToIntBits(1.0f)) * 31) + this.c.hashCode();
    }
}
