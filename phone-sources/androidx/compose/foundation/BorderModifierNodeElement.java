package androidx.compose.foundation;

import defpackage.bko;
import defpackage.bnn;
import defpackage.bol;
import defpackage.bzi;
import defpackage.cma;
import defpackage.qr;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends bzi<qr> {
    private final float a;
    private final bnn b;
    private final bol c;

    public BorderModifierNodeElement(float f, bnn bnnVar, bol bolVar) {
        this.a = f;
        this.b = bnnVar;
        this.c = bolVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new qr(this.a, this.b, this.c);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        qr qrVar = (qr) bkoVar;
        float f = qrVar.b;
        float f2 = this.a;
        if (!cma.b(f, f2)) {
            qrVar.b = f2;
            qrVar.e.e();
        }
        bnn bnnVar = this.b;
        if (!yks.e(qrVar.c, bnnVar)) {
            qrVar.c = bnnVar;
            qrVar.e.e();
        }
        bol bolVar = this.c;
        if (yks.e(qrVar.d, bolVar)) {
            return;
        }
        qrVar.d = bolVar;
        qrVar.e.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return cma.b(this.a, borderModifierNodeElement.a) && yks.e(this.b, borderModifierNodeElement.b) && yks.e(this.c, borderModifierNodeElement.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) cma.a(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
