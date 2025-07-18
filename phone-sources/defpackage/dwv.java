package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwv implements yft {
    private final ymh a;
    private final yjk b;
    private final yjk c;
    private final yjk d;
    private dwt e;

    public dwv(ymh ymhVar, yjk yjkVar, yjk yjkVar2, yjk yjkVar3) {
        this.a = ymhVar;
        this.b = yjkVar;
        this.c = yjkVar2;
        this.d = yjkVar3;
    }

    @Override // defpackage.yft
    public final /* bridge */ /* synthetic */ Object a() {
        dwt dwtVar = this.e;
        if (dwtVar != null) {
            return dwtVar;
        }
        dwt dwtVarB = dvz.f((dxc) this.b.a(), (dwx) this.c.a(), (dxj) this.d.a()).b(this.a);
        this.e = dwtVarB;
        return dwtVarB;
    }

    @Override // defpackage.yft
    public final boolean b() {
        throw null;
    }
}
