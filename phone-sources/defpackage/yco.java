package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yco implements xyt {
    final /* synthetic */ xqu a;
    private final /* synthetic */ int b;

    public yco(xqu xquVar, int i) {
        this.b = i;
        this.a = xquVar;
    }

    @Override // defpackage.xyt
    public final xvp a() {
        if (this.b != 0) {
            xty xtyVar = (xty) this.a;
            return new xtw(new xtx(xtyVar.a, xtyVar.d, xtyVar.e, xtyVar.f, xtyVar.g), ugk.a, xtyVar.c, xtyVar.h.b());
        }
        ycq ycqVar = (ycq) this.a;
        boolean z = ycqVar.g != Long.MAX_VALUE;
        return new ycp(ycqVar.d, ycqVar.e, ycqVar.ab(), ycqVar.f, z, ycqVar.g, ycqVar.h, ycqVar.i);
    }
}
