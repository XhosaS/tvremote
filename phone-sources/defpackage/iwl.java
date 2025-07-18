package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwl extends ylp {
    final /* synthetic */ iwr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwl(iwr iwrVar) {
        super(null);
        this.a = iwrVar;
    }

    @Override // defpackage.ylp
    protected final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj;
        iwr iwrVar = this.a;
        if (!iwrVar.f || yks.e(bool2, bool)) {
            return;
        }
        iwrVar.g.l();
    }
}
