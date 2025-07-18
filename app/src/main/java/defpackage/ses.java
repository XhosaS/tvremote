package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ses implements sds {
    public final zyd b;
    private final zyd c;
    private final ahaz d;
    private final ahaz e;

    public ses() {
        ahaz ahazVar = new ahaz();
        this.d = ahazVar;
        this.b = ahkr.a(ahazVar);
        ahaz ahazVar2 = new ahaz();
        this.e = ahazVar2;
        this.c = ahkr.a(ahazVar2);
    }

    @Override // defpackage.sds
    public final zyd a() {
        return this.c;
    }

    @Override // defpackage.sds
    public final zyd b() {
        return this.b;
    }

    public final void c(int i) {
        zer zerVar = zfi.a;
        this.e.N(i > 0 ? yqt.h(Integer.valueOf(i)) : ypv.a);
    }

    public final void d() {
        this.e.N(ypv.a);
        e(sdw.SOURCE_EMPTY);
    }

    public final void e(sdw sdwVar) {
        sdwVar.getClass();
        zer zerVar = zfi.a;
        sdwVar.name();
        this.d.N(sdwVar);
    }

    public ses(sdw sdwVar) {
        this();
        this.d.N(sdwVar);
    }
}
