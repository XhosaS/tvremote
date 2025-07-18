package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itx implements itf {
    private boolean a;
    private itg b;
    private tad c;

    public itx() {
        this(false, (itg) null, 7);
    }

    @Override // defpackage.itf
    public final itg a() {
        return this.b;
    }

    @Override // defpackage.itf
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.itf
    public final tad c() {
        return this.c;
    }

    public itx(tad tadVar, boolean z, itg itgVar) {
        this.c = tadVar;
        this.a = z;
        this.b = itgVar;
    }

    public /* synthetic */ itx(boolean z, itg itgVar, int i) {
        this((tad) null, z & ((i & 2) == 0), (i & 4) != 0 ? null : itgVar);
    }
}
