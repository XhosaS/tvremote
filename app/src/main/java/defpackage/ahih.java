package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahih implements ahgs {
    final /* synthetic */ agwh a;

    public ahih(agwh agwhVar) {
        this.a = agwhVar;
    }

    @Override // defpackage.ahgs
    public final Object a(Object obj, agsw agswVar) {
        agwh agwhVar = this.a;
        if (agwhVar.a != ahkc.a) {
            throw new IllegalArgumentException("Flow has more than one element");
        }
        agwhVar.a = obj;
        return agpu.a;
    }
}
