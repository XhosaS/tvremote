package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jra extends iym implements ixh {
    public final String d;
    private final ihi e;
    private final izo f;
    private final wkw g;
    private final wtc h;
    private final wmc i;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    public jra(lkt lktVar, wkx wkxVar, ihi ihiVar, izo izoVar) {
        jzs jzsVar = (jzs) lktVar.b.b();
        jzsVar.getClass();
        irc ircVar = (irc) lktVar.f.b();
        ircVar.getClass();
        kw kwVar = (kw) lktVar.e.b();
        kwVar.getClass();
        isf isfVar = (isf) lktVar.c.b();
        isfVar.getClass();
        ino inoVar = (ino) lktVar.d.b();
        inoVar.getClass();
        ((ihj) lktVar.a).b();
        super(jbr.ad(new jrk(jzsVar, ircVar, kwVar, isfVar, inoVar)), 0, 6);
        this.e = ihiVar;
        this.f = izoVar;
        this.g = wkw.LIBRARY_PAGE;
        String str = wkxVar.c;
        str.getClass();
        this.d = str;
        vvd vvdVar = wtc.b;
        wkxVar.i(vvdVar);
        Object objK = wkxVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        objK.getClass();
        this.h = (wtc) objK;
        wmc wmcVar = wkxVar.e;
        wmcVar = wmcVar == null ? wmc.a : wmcVar;
        wmcVar.getClass();
        this.i = wmcVar;
    }

    @Override // defpackage.ixh
    public final wmc b() {
        return this.i;
    }

    @Override // defpackage.ixh
    public final /* synthetic */ Object c() {
        return this.h;
    }

    @Override // defpackage.ixh
    public final String d() {
        return this.d;
    }

    @Override // defpackage.ixh
    public final wkw dQ() {
        return this.g;
    }

    @Override // defpackage.iym, defpackage.sbt
    protected final void e() {
        super.e();
        if (((Boolean) xmq.a.e(13, "UmpLibraryV2Feature__schedule_sync_on_library_tab_open", true).et(((xmq) this.e.a).b)).booleanValue()) {
            this.f.a(false);
        }
        y(iya.class, new ale(this, (yih) null, 13));
    }
}
