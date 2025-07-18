package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccm extends ccp {
    final /* synthetic */ ccp a;
    final /* synthetic */ ccp b;

    public ccm(ccp ccpVar, ccp ccpVar2) {
        this.a = ccpVar;
        this.b = ccpVar2;
    }

    @Override // defpackage.ccp
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
