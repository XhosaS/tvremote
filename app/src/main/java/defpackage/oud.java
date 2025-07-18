package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class oud implements bcy, agvt {
    private final /* synthetic */ agux a;

    public oud(agux aguxVar) {
        this.a = aguxVar;
    }

    @Override // defpackage.bcy
    public final /* synthetic */ void a(Object obj) {
        this.a.a(obj);
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bcy) && (obj instanceof agvt)) {
            return agvy.c(this.a, ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
