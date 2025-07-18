package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amn extends agtu implements agvb {
    /* synthetic */ Object a;
    final /* synthetic */ apk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amn(apk apkVar, agsw agswVar) {
        super(2, agswVar);
        this.b = apkVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amn) c((apk) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        apk apkVar = (apk) this.a;
        boolean z = false;
        if ((apkVar instanceof alt) && ((alt) apkVar).c <= ((alt) this.b).c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        amn amnVar = new amn(this.b, agswVar);
        amnVar.a = obj;
        return amnVar;
    }
}
