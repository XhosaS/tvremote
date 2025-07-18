package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mb extends ykt implements yjv {
    final /* synthetic */ boolean a;
    final /* synthetic */ yjk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(boolean z, yjk yjkVar) {
        super(1);
        this.a = z;
        this.b = yjkVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boi boiVar = (boi) obj;
        boolean z = false;
        if (!this.a && ((Boolean) this.b.a()).booleanValue()) {
            z = true;
        }
        boiVar.q(z);
        return ygi.a;
    }
}
