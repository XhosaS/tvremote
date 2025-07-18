package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwm extends ylp {
    final /* synthetic */ iwr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwm(Object obj, iwr iwrVar) {
        super(obj);
        this.a = iwrVar;
    }

    @Override // defpackage.ylp
    protected final void a(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        iwr iwrVar = this.a;
        if (!iwrVar.f || zBooleanValue2 == zBooleanValue) {
            return;
        }
        iwrVar.g.l();
    }
}
