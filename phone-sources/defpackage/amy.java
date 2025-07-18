package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amy implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public amy(amf amfVar, agb agbVar, int i) {
        this.c = i;
        this.a = amfVar;
        this.b = agbVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [amf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [agb, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bte bteVar, yih yihVar) {
        if (this.c != 0) {
            Object objG = wf.g(bteVar, null, new afk(this.b, this.a, 2), yihVar, 7);
            return objG == yio.a ? objG : ygi.a;
        }
        Object objK = kv.k(bteVar, new amz((amf) this.a, new ybo(bteVar.o()), (agb) this.b, (yih) null, 1), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    public amy(bcb bcbVar, yjv yjvVar, int i) {
        this.c = i;
        this.b = bcbVar;
        this.a = yjvVar;
    }
}
