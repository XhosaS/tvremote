package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class xr extends xn {
    final /* synthetic */ xs d;

    public xr(xs xsVar) {
        this.d = xsVar;
    }

    @Override // defpackage.xn
    protected final String c() {
        xo xoVar = (xo) this.d.a.get();
        if (xoVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + xoVar.a + "]";
    }
}
