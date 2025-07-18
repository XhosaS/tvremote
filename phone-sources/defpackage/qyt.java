package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qyt implements yjk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ qyt(ofj ofjVar, String str, int i, Context context, int i2) {
        this.e = i2;
        this.b = ofjVar;
        this.c = str;
        this.a = i;
        this.d = context;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjk
    public final Object a() {
        if (this.e != 0) {
            Object obj = this.b;
            Object obj2 = this.d;
            if (obj2 == null) {
                ((pju) obj).c.h();
            } else {
                Object objD = ((pju) obj).c.d();
                if (objD != null) {
                    int i = this.a;
                    ?? r3 = this.c;
                    if (yks.e(objD, obj2)) {
                        r3.a(Integer.valueOf(i), "CVE is already linked to the same parent");
                    } else {
                        r3.a(Integer.valueOf(i), "CVE is already linked to a different parent");
                    }
                } else {
                    ((pju) obj2).c.e(obj);
                }
            }
            return ygi.a;
        }
        vtw vtwVarM = ofm.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((ofm) vtwVarM.b).c = (String) this.c;
        vtw vtwVarM2 = uzq.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        int i2 = this.a;
        uzq uzqVar = (uzq) vtwVarM2.b;
        uzqVar.c = i2 - 1;
        uzqVar.b |= 1;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        Object obj3 = this.d;
        ofm ofmVar = (ofm) vtwVarM.b;
        uzq uzqVar2 = (uzq) vtwVarM2.r();
        uzqVar2.getClass();
        ofmVar.d = uzqVar2;
        ofmVar.b |= 1;
        String packageName = ((Context) obj3).getPackageName();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        Object obj4 = this.b;
        ofm ofmVar2 = (ofm) vtwVarM.b;
        packageName.getClass();
        ofmVar2.b |= 2;
        ofmVar2.e = packageName;
        ofy.a((ofm) vtwVarM.r(), (ogd) obj4);
        return ygi.a;
    }

    public /* synthetic */ qyt(pju pjuVar, pju pjuVar2, yjz yjzVar, int i, int i2) {
        this.e = i2;
        this.d = pjuVar;
        this.b = pjuVar2;
        this.c = yjzVar;
        this.a = i;
    }
}
