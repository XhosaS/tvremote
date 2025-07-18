package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfb {
    private final ros a;
    private final String b = "MobileDataDownloadKey";
    private final String c = "MDD_DOWNLOAD";

    public tfb(ros rosVar) {
        this.a = rosVar;
    }

    public final void a(rqs rqsVar, String str) {
        ((rqt) rqsVar).i(this.b, str);
        this.a.a(rqsVar);
    }

    public final void b(rqw rqwVar, String str, int i) {
        ((rqt) rqwVar.a).i(this.b, str);
        this.a.a(rqwVar.a(i, this.c));
    }

    public final void c(rqw rqwVar, String str) {
        b(rqwVar, str, zsb.a(3));
    }
}
