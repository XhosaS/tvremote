package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ped implements smx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ped(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, smy] */
    @Override // defpackage.smx
    public final Object a(rzy rzyVar) {
        int i = this.b;
        if (i == 0) {
            pei peiVar = (pei) this.a;
            return Integer.valueOf(rzyVar.x(peiVar.b, "account = ?", peiVar.c));
        }
        if (i == 1) {
            tvn tvnVar = pec.a;
            return Integer.valueOf(rzyVar.F((aafi) this.a));
        }
        if (i != 2) {
            this.a.a(rzyVar);
            return null;
        }
        tvn tvnVar2 = pel.a;
        return Integer.valueOf(rzyVar.F((aafi) this.a));
    }
}
