package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckn implements ckg {
    public final bmn a;
    public final bku b = new ckm();

    public ckn(bmn bmnVar) {
        this.a = bmnVar;
    }

    @Override // defpackage.ckg
    public final /* synthetic */ ckf a(ckp ckpVar) {
        final String str = ckpVar.a;
        final int i = ckpVar.b;
        return (ckf) bpr.b(this.a, true, false, new agux() { // from class: ckk
            public final /* synthetic */ String a = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                String str2 = str;
                int i2 = i;
                try {
                    brjVarA.i(1, str2);
                    brjVarA.g(2, i2);
                    return brjVarA.l() ? new ckf(brjVarA.d(bpw.b(brjVarA, "work_spec_id")), (int) brjVarA.b(bpw.b(brjVarA, "generation")), (int) brjVarA.b(bpw.b(brjVarA, "system_id"))) : null;
                } finally {
                    brjVarA.close();
                }
            }
        });
    }

    @Override // defpackage.ckg
    public final List b() {
        return (List) bpr.b(this.a, true, false, new agux() { // from class: cki
            public final /* synthetic */ String a = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
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

    @Override // defpackage.ckg
    public final void c(final ckf ckfVar) {
        bpr.b(this.a, false, true, new agux() { // from class: ckh
            @Override // defpackage.agux
            public final Object a(Object obj) throws Exception {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                this.a.b.c(bskVar, ckfVar);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ckg
    public final /* synthetic */ void d(ckp ckpVar) {
        final String str = ckpVar.a;
        final int i = ckpVar.b;
        bpr.b(this.a, false, true, new agux() { // from class: ckj
            public final /* synthetic */ String a = "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                String str2 = str;
                int i2 = i;
                try {
                    brjVarA.i(1, str2);
                    brjVarA.g(2, i2);
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

    @Override // defpackage.ckg
    public final void e(final String str) {
        str.getClass();
        bpr.b(this.a, false, true, new agux() { // from class: ckl
            public final /* synthetic */ String a = "DELETE FROM SystemIdInfo where work_spec_id=?";

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
}
