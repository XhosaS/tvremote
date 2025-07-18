package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gie extends agtu implements agvb {
    public gie(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        new gie((agsw) obj2);
        agpu agpuVar = agpu.a;
        agpl.b(agpuVar);
        return agpuVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gie(agswVar);
    }
}
