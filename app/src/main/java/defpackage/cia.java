package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cia extends agtu implements agvc {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public cia(agsw agswVar) {
        super(3, agswVar);
    }

    @Override // defpackage.agvc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cia ciaVar = new cia((agsw) obj3);
        ciaVar.c = (ahgs) obj;
        ciaVar.b = (Object[]) obj2;
        return ciaVar.b(agpu.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [ahgs, java.lang.Object] */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        chl chlVar;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ?? r7 = this.c;
            chl[] chlVarArr = (chl[]) this.b;
            int length = chlVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    chlVar = null;
                    break;
                }
                chlVar = chlVarArr[i2];
                if (!agvy.c(chlVar, chj.a)) {
                    break;
                }
                i2++;
            }
            if (chlVar == null) {
                chlVar = chj.a;
            }
            this.a = 1;
            if (r7.a(chlVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }
}
