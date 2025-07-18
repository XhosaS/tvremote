package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmr implements cmm {
    public final bmn a;
    public final bku b = new cmq();

    public cmr(bmn bmnVar) {
        this.a = bmnVar;
    }

    @Override // defpackage.cmm
    public final List a(final String str) {
        return (List) bpr.b(this.a, true, false, new agux() { // from class: cmo
            public final /* synthetic */ String a = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";

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

    @Override // defpackage.cmm
    public final void b(final String str) {
        bpr.b(this.a, false, true, new agux() { // from class: cmn
            public final /* synthetic */ String a = "DELETE FROM worktag WHERE work_spec_id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cmm
    public final /* synthetic */ void c(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final cml cmlVar = new cml((String) it.next(), str);
            bpr.b(this.a, false, true, new agux() { // from class: cmp
                @Override // defpackage.agux
                public final Object a(Object obj) throws Exception {
                    bsk bskVar = (bsk) obj;
                    bskVar.getClass();
                    this.a.b.c(bskVar, cmlVar);
                    return agpu.a;
                }
            });
        }
    }
}
