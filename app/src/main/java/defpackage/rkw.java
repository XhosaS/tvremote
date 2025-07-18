package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkw {
    public final yqi a;
    public yzq b = zcp.b;
    public boolean c = false;
    public boolean d = false;

    public rkw(yqi yqiVar) {
        this.a = yqiVar;
    }

    public final /* synthetic */ rkp a(rfr rfrVar, String str) {
        return rkp.a.d(rfrVar, (String) this.a.apply(rfrVar.d), str, false, true, this.b);
    }

    public final rkq b() {
        return this.d ? new rkt(new rkr(this)) : new rkv(new rkq() { // from class: rks
            @Override // defpackage.rkq
            public final rkp a(rfr rfrVar, String str) {
                rkw rkwVar = this.a;
                return rkp.a.d(rfrVar, (String) rkwVar.a.apply(rfrVar.d), "", rkwVar.c, false, rkwVar.b);
            }
        });
    }
}
