package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtb extends vto {
    public Class a;
    public caq b;
    public vtq c;
    public yqt d;
    public caz e;
    public yqt f;
    public yqt g;
    public yzq h;
    public yqt i;
    public yqt j;
    public yqt k;
    private yqt l;

    public vtb() {
        ypv ypvVar = ypv.a;
        this.l = ypvVar;
        this.d = ypvVar;
        this.f = ypvVar;
        this.g = ypvVar;
        this.i = ypvVar;
        this.j = ypvVar;
        this.k = ypvVar;
    }

    @Override // defpackage.vto
    public final vts a() {
        caq caqVar;
        vtq vtqVar;
        caz cazVar;
        yzq yzqVar;
        Class cls = this.a;
        if (cls != null && (caqVar = this.b) != null && (vtqVar = this.c) != null && (cazVar = this.e) != null && (yzqVar = this.h) != null) {
            return new vtc(cls, caqVar, this.l, vtqVar, this.d, cazVar, this.f, this.g, yzqVar, this.i, this.j, this.k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" workerClass");
        }
        if (this.b == null) {
            sb.append(" constraints");
        }
        if (this.c == null) {
            sb.append(" initialDelay");
        }
        if (this.e == null) {
            sb.append(" inputData");
        }
        if (this.h == null) {
            sb.append(" tags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public vtb(vts vtsVar) {
        ypv ypvVar = ypv.a;
        this.l = ypvVar;
        this.d = ypvVar;
        this.f = ypvVar;
        this.g = ypvVar;
        this.i = ypvVar;
        this.j = ypvVar;
        this.k = ypvVar;
        vtc vtcVar = (vtc) vtsVar;
        this.a = vtcVar.a;
        this.b = vtcVar.b;
        this.l = vtcVar.c;
        this.c = vtcVar.d;
        this.d = vtcVar.e;
        this.e = vtcVar.f;
        this.f = vtcVar.g;
        this.g = vtcVar.h;
        this.h = vtcVar.i;
        this.i = vtcVar.j;
        this.j = vtcVar.k;
        this.k = vtcVar.l;
    }
}
