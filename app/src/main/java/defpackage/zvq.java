package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zvq implements zvh {
    final /* synthetic */ zvw a;
    final /* synthetic */ txl b;

    public zvq(txl txlVar, zvw zvwVar) {
        this.b = txlVar;
        this.a = zvwVar;
    }

    @Override // defpackage.zvh
    public final zyd a() {
        zvw zvwVar = new zvw();
        try {
            zwc zwcVar = new zwc(zxn.h(this.b.a.a()));
            zwcVar.h(this.a);
            return zwcVar.d;
        } finally {
            this.a.b(zvwVar, zwk.a);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
