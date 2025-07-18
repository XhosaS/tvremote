package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vsb extends agtu implements agvb {
    final /* synthetic */ agux a;
    final /* synthetic */ CancellationSignal b;
    final /* synthetic */ ahdn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb(agsw agswVar, agux aguxVar, CancellationSignal cancellationSignal, ahdn ahdnVar) {
        super(2, agswVar);
        this.a = aguxVar;
        this.b = cancellationSignal;
        this.c = ahdnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vsb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        yyk yykVar = (yyk) this.a.a(this.b);
        this.c.s(null);
        return yykVar;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        vsb vsbVar = new vsb(agswVar, this.a, this.b, this.c);
        vsbVar.d = obj;
        return vsbVar;
    }
}
