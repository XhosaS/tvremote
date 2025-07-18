package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdf implements cdv {
    public bcb a;
    private yjk b;
    private final bcb c = new bci(false, bcz.c);

    public static final void e(int i) {
        cdw.a.b(new btg(i));
    }

    @Override // defpackage.cdv
    public final long a() {
        if (this.a == null) {
            yjk yjkVar = this.b;
            this.a = new bci(new cmh(yjkVar != null ? ((cmh) yjkVar.a()).a : 0L), bcz.c);
            this.b = null;
        }
        bcb bcbVar = this.a;
        bcbVar.getClass();
        return ((cmh) bcbVar.a()).a;
    }

    public final void b(yjk yjkVar) {
        if (this.a == null) {
            this.b = yjkVar;
        }
    }

    public final void c(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    @Override // defpackage.cdv
    public final boolean d() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
