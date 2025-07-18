package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gos extends agtu implements agvb {
    final /* synthetic */ String a = "assistant_android";

    public gos(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return new gos((agsw) obj2).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        System.loadLibrary(this.a);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gos(agswVar);
    }
}
