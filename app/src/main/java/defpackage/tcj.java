package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tcj implements wnu {
    public final ont a;
    private final yzq b;
    private final ExecutorService c;
    private final tcg d;

    public tcj(yzq yzqVar, tcg tcgVar, ExecutorService executorService, ont ontVar) {
        this.b = yzqVar;
        this.d = tcgVar;
        this.c = executorService;
        this.a = ontVar;
    }

    @Override // defpackage.wnu
    public final zyd a() {
        oth othVar = (oth) ((ono) this.a).a;
        ((uqo) othVar.a.B.eV()).a(100L, othVar.b, othVar.c, "internal");
        final tcg tcgVar = this.d;
        vhb vhbVar = tcgVar.b;
        final yzq yzqVar = this.b;
        final achm achmVar = achm.PERIODIC;
        zwx zwxVarU = zwx.u(zuz.h(vhbVar.c(), wyo.c(new zvi() { // from class: tcf
            public final /* synthetic */ String b = "internal";

            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                List<vha> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (vha vhaVar : list) {
                    if (!tej.a(vhaVar)) {
                        achm achmVar2 = achmVar;
                        yzq yzqVar2 = yzqVar;
                        String str = this.b;
                        tcg tcgVar2 = tcgVar;
                        arrayList.add(tcgVar2.a.a(vhaVar.a(), str, yzqVar2, achmVar2));
                    }
                }
                return zxn.m(arrayList);
            }
        }), tcgVar.c));
        zvi zviVar = new zvi() { // from class: tch
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                this.a.a.f(true);
                return zxy.a;
            }
        };
        ExecutorService executorService = this.c;
        return zud.h(zuz.h(zwxVarU, zviVar, executorService), Exception.class, new zvi() { // from class: tci
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                this.a.a.f(false);
                return zxn.g((Exception) obj);
            }
        }, executorService);
    }
}
