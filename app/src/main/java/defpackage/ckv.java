package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckv implements ckr {
    public final bku a = new cku();
    private final bmn b;

    public ckv(bmn bmnVar) {
        this.b = bmnVar;
    }

    @Override // defpackage.ckr
    public final List a(final String str) {
        return (List) bpr.b(this.b, true, false, new agux() { // from class: cks
            public final /* synthetic */ String a = "SELECT name FROM workname WHERE work_spec_id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        arrayList.add(brjVarA.d(0));
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.ckr
    public final void b(final ckq ckqVar) {
        bpr.b(this.b, false, true, new agux() { // from class: ckt
            @Override // defpackage.agux
            public final Object a(Object obj) throws Exception {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                this.a.a.c(bskVar, ckqVar);
                return agpu.a;
            }
        });
    }
}
