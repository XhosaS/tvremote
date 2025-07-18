package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjt implements cjo {
    public final bku a = new cjs();
    private final bmn b;

    public cjt(bmn bmnVar) {
        this.b = bmnVar;
    }

    @Override // defpackage.cjo
    public final List a(final String str) {
        str.getClass();
        return (List) bpr.b(this.b, true, false, new agux() { // from class: cjp
            public final /* synthetic */ String a = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";

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

    @Override // defpackage.cjo
    public final void b(final cjn cjnVar) {
        bpr.b(this.b, false, true, new agux() { // from class: cjq
            @Override // defpackage.agux
            public final Object a(Object obj) throws Exception {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                this.a.a.c(bskVar, cjnVar);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.cjo
    public final boolean c(final String str) {
        str.getClass();
        return ((Boolean) bpr.b(this.b, true, false, new agux() { // from class: cjr
            public final /* synthetic */ String a = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";

            /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
            @Override // defpackage.agux
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r6) {
                /*
                    r5 = this;
                    bsk r6 = (defpackage.bsk) r6
                    r6.getClass()
                    java.lang.String r0 = r5.a
                    brj r6 = r6.a(r0)
                    java.lang.String r0 = r2
                    r1 = 1
                    r6.i(r1, r0)     // Catch: java.lang.Throwable -> L29
                    boolean r0 = r6.l()     // Catch: java.lang.Throwable -> L29
                    r2 = 0
                    if (r0 == 0) goto L20
                    long r3 = r6.b(r2)     // Catch: java.lang.Throwable -> L29
                    int r0 = (int) r3
                    if (r0 == 0) goto L20
                    goto L21
                L20:
                    r1 = r2
                L21:
                    r6.close()
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                    return r6
                L29:
                    r0 = move-exception
                    r6.close()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cjr.a(java.lang.Object):java.lang.Object");
            }
        })).booleanValue();
    }
}
