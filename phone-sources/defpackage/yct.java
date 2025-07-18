package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yct extends xuj {
    public static final zgk a = new zgk();
    public final xsq b;
    public final String c;
    public final ybs d;
    public final String e;
    public final ycs f;
    public final boolean g;
    private final ycr h;
    private final xpv i;

    public yct(xsq xsqVar, xsm xsmVar, ycj ycjVar, ycz yczVar, ydl ydlVar, Object obj, int i, int i2, String str, String str2, ybs ybsVar, ybx ybxVar, xpy xpyVar) {
        super(new ydg(0), ybsVar, ybxVar, xsmVar, xpyVar);
        this.h = new ycr(this);
        this.g = false;
        this.d = ybsVar;
        this.b = xsqVar;
        this.e = str;
        this.c = str2;
        this.i = yczVar.r;
        this.f = new ycs(this, i, ybsVar, obj, ycjVar, ydlVar, yczVar, i2);
    }

    @Override // defpackage.xvk
    public final xpv a() {
        return this.i;
    }

    @Override // defpackage.xuj
    protected final /* synthetic */ xui b() {
        return this.h;
    }

    @Override // defpackage.xuj, defpackage.xum
    protected final /* synthetic */ xul c() {
        return this.f;
    }

    public final xsp d() {
        return this.b.a;
    }

    @Override // defpackage.xuj
    protected final /* synthetic */ xul f() {
        return this.f;
    }
}
