package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apn extends agtu implements agvc {
    int a;
    private /* synthetic */ Object b;

    public apn(agsw agswVar) {
        super(3, agswVar);
    }

    @Override // defpackage.agvc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        apn apnVar = new apn((agsw) obj3);
        apnVar.b = (apb) obj;
        return apnVar.b(agpu.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [apb, java.lang.Object] */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        ?? r3 = this.b;
        this.a = 1;
        Object objB = r3.b(this);
        return objB == agtgVar ? agtgVar : objB;
    }
}
