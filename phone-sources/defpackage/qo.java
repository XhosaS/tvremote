package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qo {
    public bnp a;
    public bpo b;
    public bng c;
    private bni d;

    public qo() {
        this(null);
    }

    public final bni a() {
        bni bniVar = this.d;
        if (bniVar != null) {
            return bniVar;
        }
        bni bniVar2 = new bni((byte[]) null);
        this.d = bniVar2;
        return bniVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo)) {
            return false;
        }
        qo qoVar = (qo) obj;
        return yks.e(this.c, qoVar.c) && yks.e(this.a, qoVar.a) && yks.e(this.b, qoVar.b) && yks.e(this.d, qoVar.d);
    }

    public final int hashCode() {
        bng bngVar = this.c;
        int iHashCode = bngVar == null ? 0 : bngVar.hashCode();
        bnp bnpVar = this.a;
        int iHashCode2 = bnpVar == null ? 0 : bnpVar.hashCode();
        int i = iHashCode * 31;
        bpo bpoVar = this.b;
        int iHashCode3 = (((i + iHashCode2) * 31) + (bpoVar == null ? 0 : bpoVar.hashCode())) * 31;
        bni bniVar = this.d;
        return iHashCode3 + (bniVar != null ? bniVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.c + ", canvas=" + this.a + ", canvasDrawScope=" + this.b + ", borderPath=" + this.d + ')';
    }

    public /* synthetic */ qo(byte[] bArr) {
        this.c = null;
        this.a = null;
        this.b = null;
        this.d = null;
    }
}
