package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slv implements skz {
    private final /* synthetic */ int a;
    private final Object b;

    public slv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.skz
    public final uhp a(uhp uhpVar) {
        int i = this.a;
        if (i == 0) {
            return ((slw) this.b).e(uhpVar);
        }
        if (i == 1) {
            return sil.c(((slk) this.b).d(uhpVar));
        }
        Object obj = this.b;
        return ufn.j(uhpVar, trc.c(new sls(obj, 2)), ((slz) obj).b);
    }
}
