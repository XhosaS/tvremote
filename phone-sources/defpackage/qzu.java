package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzu {
    public final vrs a;
    public final xwk b;
    public final rdd c;
    public final xzg d;
    public final xzg e;
    public final xzg f;
    public final vxr g;

    public qzu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzu)) {
            return false;
        }
        qzu qzuVar = (qzu) obj;
        return yks.e(this.b, qzuVar.b) && yks.e(this.d, qzuVar.d);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DiscScopeData(appStatelessRenderingObjects=" + this.b + ", colorResolver=" + this.d + ")";
    }

    public /* synthetic */ qzu(byte[] bArr) {
        xwk xwkVar = new xwk();
        xzg xzgVar = new xzg();
        this.b = xwkVar;
        this.d = xzgVar;
        this.e = new xzg(null, null, null);
        this.a = new vrs();
        this.f = new xzg();
        this.g = new vxr(null, null);
        this.c = new rdd();
    }
}
