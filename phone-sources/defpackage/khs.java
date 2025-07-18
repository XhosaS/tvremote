package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class khs implements PointerInputEventHandler {
    final /* synthetic */ yjk a;
    final /* synthetic */ bdy b;
    final /* synthetic */ iom c;

    public khs(yjk yjkVar, iom iomVar, bdy bdyVar) {
        this.a = yjkVar;
        this.c = iomVar;
        this.b = bdyVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bte bteVar, yih<? super ygi> yihVar) {
        iom iomVar = this.c;
        kij kijVar = new kij(iomVar, 1);
        aaw aawVar = new aaw(iomVar, this.b, 9);
        yjk yjkVar = this.a;
        Object objO = kv.o(bteVar, kijVar, yjkVar, yjkVar, aawVar, yihVar);
        return objO == yio.a ? objO : ygi.a;
    }
}
