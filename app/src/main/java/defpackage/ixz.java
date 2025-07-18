package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixz implements ixt {
    public final bmn a;
    public final bku b = new ixy();

    public ixz(bmn bmnVar) {
        this.a = bmnVar;
    }

    @Override // defpackage.ixt
    public final Object a(agsw agswVar) {
        return bpr.d(this.a, false, true, new agux() { // from class: ixu
            @Override // defpackage.agux
            public final Object a(Object obj) {
                brj brjVarA = ((bsk) obj).a("DELETE FROM fallback_suggestion_table");
                try {
                    brjVarA.l();
                    return agpu.a;
                } finally {
                    brjVarA.close();
                }
            }
        }, agswVar);
    }

    @Override // defpackage.ixt
    public final Object b(final String str, agsw agswVar) {
        return bpr.d(this.a, true, false, new agux() { // from class: ixv
            @Override // defpackage.agux
            public final Object a(Object obj) {
                brj brjVarA = ((bsk) obj).a("SELECT * FROM fallback_suggestion_table WHERE foreground_app = ?");
                try {
                    brjVarA.i(1, str);
                    int iB = bpw.b(brjVarA, "display_text");
                    int iB2 = bpw.b(brjVarA, "foreground_app");
                    int iB3 = bpw.b(brjVarA, "server_log");
                    ArrayList arrayList = new ArrayList();
                    while (brjVarA.l()) {
                        arrayList.add(new ixq(brjVarA.d(iB), brjVarA.d(iB2), brjVarA.d(iB3)));
                    }
                    return arrayList;
                } finally {
                    brjVarA.close();
                }
            }
        }, agswVar);
    }
}
