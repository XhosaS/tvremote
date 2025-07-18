package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdj implements zcf {
    private final zbw a;

    public zdj(zbw zbwVar) {
        this.a = zbwVar;
    }

    @Override // defpackage.zcf
    public final zcl a(zdp zdpVar) {
        zcn zcnVar;
        zcj zcjVar = zdpVar.b;
        zxk zxkVar = new zxk(zcjVar);
        boolean z = false;
        if (zcjVar.a("Host") == null) {
            zxkVar.c("Host", zcr.k(zcjVar.a, false));
        }
        if (zcjVar.a("Connection") == null) {
            zxkVar.c("Connection", "Keep-Alive");
        }
        if (zcjVar.a("Accept-Encoding") == null && zcjVar.a("Range") == null) {
            zxkVar.c("Accept-Encoding", "gzip");
            z = true;
        }
        zbw zbwVar = this.a;
        zce zceVar = zcjVar.a;
        if (zcjVar.a("User-Agent") == null) {
            zxkVar.c("User-Agent", "okhttp/4.12.0");
        }
        zcl zclVarA = zdpVar.a(zxkVar.a());
        zcc zccVar = zclVarA.f;
        zdo.a(zbwVar, zceVar, zccVar);
        zck zckVar = new zck(zclVarA);
        zckVar.a = zcjVar;
        if (z && ylh.y("gzip", zcl.a(zclVarA, "Content-Encoding"), true) && zdo.b(zclVarA) && (zcnVar = zclVarA.g) != null) {
            zgw zgwVar = new zgw(zcnVar.c());
            upq upqVarF = zccVar.f();
            upqVarF.x("Content-Encoding");
            upqVarF.x("Content-Length");
            zckVar.c(upqVarF.t());
            zckVar.e = new zdq(zcl.a(zclVarA, "Content-Type"), -1L, new zhi(zgwVar));
        }
        return zckVar.a();
    }
}
