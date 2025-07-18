package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnb implements idf {
    private final lio a;
    private final Context b;
    private final ieh c;
    private final idb d;
    private final int e;
    private final pkg f;
    private final pjx g;
    private final lxm h;

    public mnb(lio lioVar, Context context, lxm lxmVar, ieh iehVar, idb idbVar, int i, pkg pkgVar, pjx pjxVar) {
        this.a = lioVar;
        this.b = context;
        this.h = lxmVar;
        this.c = iehVar;
        this.d = idbVar;
        this.e = i;
        this.f = pkgVar;
        this.g = pjxVar;
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        ksw kswVar = (ksw) obj;
        ImmutableList immutableList = kswVar.e;
        if (immutableList.isEmpty()) {
            return ieg.a;
        }
        String str = kswVar.a;
        idh idhVarD = idh.d();
        kuc kucVarA = kuc.a(str);
        kys kysVar = kswVar.d;
        vtw vtwVarM = wji.a.m();
        if (kucVarA.b) {
            vtw vtwVarM2 = wjg.a.m();
            String str2 = kucVarA.a;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            wjg wjgVar = (wjg) vucVar;
            wjgVar.b |= 1;
            wjgVar.c = str2;
            int i = xbv.COLLECTION_ID.k;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            wjg wjgVar2 = (wjg) vtwVarM2.b;
            wjgVar2.b |= 2;
            wjgVar2.d = i;
            wjg wjgVar3 = (wjg) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wji wjiVar = (wji) vtwVarM.b;
            wjgVar3.getClass();
            wjiVar.e = wjgVar3;
            wjiVar.b |= 4;
        } else {
            vtw vtwVarM3 = wik.a.m();
            String str3 = kucVarA.a;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vuc vucVar2 = vtwVarM3.b;
            wik wikVar = (wik) vucVar2;
            wikVar.b |= 4;
            wikVar.e = str3;
            wij wijVar = wij.CONTAINER;
            if (!vucVar2.A()) {
                vtwVarM3.u();
            }
            vuc vucVar3 = vtwVarM3.b;
            wik wikVar2 = (wik) vucVar3;
            wikVar2.c = wijVar.q;
            wikVar2.b |= 1;
            wii wiiVar = wii.YOUTUBE_ID;
            if (!vucVar3.A()) {
                vtwVarM3.u();
            }
            wik wikVar3 = (wik) vtwVarM3.b;
            wikVar3.d = wiiVar.h;
            wikVar3.b |= 2;
            wik wikVar4 = (wik) vtwVarM3.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wji wjiVar2 = (wji) vtwVarM.b;
            wikVar4.getClass();
            wjiVar2.c = wikVar4;
            wjiVar2.b |= 1;
        }
        lif lifVar = new lif(liq.j(400, (wji) vtwVarM.r(), kysVar), this.a);
        Context context = this.b;
        lxm lxmVar = this.h;
        ieh iehVar = this.c;
        kvp kvpVar = kvp.a;
        lxmVar.getClass();
        mmm mmmVar = new mmm(lxmVar, 12);
        idb idbVar = this.d;
        final int i2 = this.e;
        pkg pkgVar = this.f;
        pjx pjxVar = this.g;
        boolean zA = idbVar.a();
        kvpVar.getClass();
        return ieg.f((List) idhVarD.c(new min(lifVar, context, lxmVar, kvpVar, iehVar, mmmVar, zA ? 1 : 0, new ieh() { // from class: mim
            @Override // defpackage.ieh
            public final Object a() {
                return Integer.valueOf(i2);
            }
        }, pkgVar, pjxVar)).b(immutableList));
    }
}
