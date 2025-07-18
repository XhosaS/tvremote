package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avq {
    public final awc a;
    public final yoe b;

    public avq(awc awcVar, yoe yoeVar) {
        this.a = awcVar;
        this.b = yoeVar;
    }

    public final void a() {
        yoe yoeVar = this.b;
        if (yoeVar.f()) {
            yoeVar.resumeWith(awb.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        avq avqVar = (avq) obj;
        return yks.e(this.a, avqVar.a) && yks.e(this.b, avqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
