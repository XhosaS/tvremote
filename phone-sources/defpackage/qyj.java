package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyj {
    public final yfo a;
    public final rax b;
    public final xwk c;
    public final xzg d;
    public final vvd e;

    public qyj(xwk xwkVar, yfo yfoVar, rax raxVar, vvd vvdVar, xzg xzgVar) {
        yfoVar.getClass();
        this.c = xwkVar;
        this.a = yfoVar;
        this.b = raxVar;
        this.e = vvdVar;
        this.d = xzgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyj)) {
            return false;
        }
        qyj qyjVar = (qyj) obj;
        return yks.e(this.c, qyjVar.c) && yks.e(this.a, qyjVar.a) && yks.e(this.b, qyjVar.b) && yks.e(this.e, qyjVar.e) && yks.e(this.d, qyjVar.d);
    }

    public final int hashCode() {
        return (((((((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RenderingObjects(appStatelessRenderingObjectsInterface=" + this.c + ", viewBindingFactory=" + this.a + ", viewBindingUpdater=" + this.b + ", visualElementHelper=" + this.e + ", colorResolver=" + this.d + ")";
    }
}
