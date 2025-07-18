package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class jfn implements fxj, agvt {
    final /* synthetic */ jhh a;

    public jfn(jhh jhhVar) {
        this.a = jhhVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) {
        this.a.ay();
        return agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvj(this.a, jhh.class, "setAssistantLocation", "setAssistantLocation()V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fxj) && (obj instanceof agvt)) {
            return agvy.c(b(), ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
