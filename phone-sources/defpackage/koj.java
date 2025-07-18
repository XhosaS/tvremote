package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class koj implements PointerInputEventHandler {
    final /* synthetic */ int a;
    final /* synthetic */ yjk b;
    final /* synthetic */ yjk c;
    final /* synthetic */ yjk d;
    final /* synthetic */ yjk e;
    final /* synthetic */ yjk f;

    public koj(int i, yjk yjkVar, yjk yjkVar2, yjk yjkVar3, yjk yjkVar4, yjk yjkVar5) {
        this.a = i;
        this.b = yjkVar;
        this.c = yjkVar2;
        this.d = yjkVar3;
        this.e = yjkVar4;
        this.f = yjkVar5;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bte bteVar, yih<? super ygi> yihVar) {
        int i = this.a;
        Object objG = wf.g(bteVar, new koi(i, this.b, this.c, this.d, null), new aiy(i, this.e, this.f, 11), yihVar, 3);
        return objG == yio.a ? objG : ygi.a;
    }
}
