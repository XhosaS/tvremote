package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iuf implements ite {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/statesync/monitors/livetvchannels/LiveTvChannelsMonitor");
    public agux b;
    private final fiu c;
    private final vrs d;
    private final gzu e;
    private final gpd f;
    private final agow g;
    private final agow h;
    private final ztw i;
    private iuw j;
    private final boolean k;
    private final iuc l;

    public iuf(fiu fiuVar, vrs vrsVar, gzu gzuVar, gpd gpdVar, agow agowVar, agow agowVar2, ztw ztwVar) {
        fiuVar.getClass();
        gzuVar.getClass();
        gpdVar.getClass();
        ztwVar.getClass();
        this.c = fiuVar;
        this.d = vrsVar;
        this.e = gzuVar;
        this.f = gpdVar;
        this.g = agowVar;
        this.h = agowVar2;
        this.i = ztwVar;
        iuw iuwVar = iuw.a;
        iuwVar.getClass();
        this.j = iuwVar;
        this.l = new iuc(this);
        Object objA = agowVar2.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.k = !r1.isNegative();
        this.b = new agux() { // from class: iud
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((ite) obj).getClass();
                return agpu.a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object a(defpackage.iuf r10, defpackage.agsw r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuf.a(iuf, agsw):java.lang.Object");
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        return a(this, agswVar);
    }

    @Override // defpackage.ite
    public final /* synthetic */ Object f(agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.ite
    public final void h() {
        iuc iucVar = this.l;
        iucVar.getClass();
        this.f.a.add(iucVar);
    }

    @Override // defpackage.ite
    public final void i() {
        iuc iucVar = this.l;
        iucVar.getClass();
        this.f.a.remove(iucVar);
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.b = aguxVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.k;
    }

    @Override // defpackage.ite
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
    }
}
