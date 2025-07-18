package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwh extends ylp {
    final /* synthetic */ iwr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwh(Object obj, iwr iwrVar) {
        super(obj);
        this.a = iwrVar;
    }

    @Override // defpackage.ylp
    protected final void a(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj).intValue();
        iwr iwrVar = this.a;
        if (!iwrVar.f || iIntValue2 == iIntValue) {
            return;
        }
        iwrVar.g.l();
    }
}
