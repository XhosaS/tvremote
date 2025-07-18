package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class owi extends nez {
    public static final /* synthetic */ int a = 0;
    private final owe c;
    private final nfc d;

    public owi(owe oweVar, nfc nfcVar) {
        this.c = oweVar;
        this.d = nfcVar;
    }

    @Override // defpackage.nez
    public final void f(ekl eklVar, evv evvVar, boolean z) {
        ead eadVar;
        if (evvVar.b != 2) {
            return;
        }
        nfa nfaVar = this.b;
        List list = ouu.a;
        Iterator it = yfm.ag(list, "stmp").iterator();
        while (it.hasNext()) {
            nfaVar.g((String) it.next());
        }
        dze dzeVar = evvVar.c;
        if (dzeVar == null || (eadVar = dzeVar.V) == null) {
            return;
        }
        int iA = eadVar.a();
        for (int i = 0; i < iA; i++) {
            eac eacVarB = eadVar.b(i);
            eacVarB.getClass();
            if (eacVarB instanceof ouu) {
                ouu ouuVar = (ouu) eacVarB;
                String str = ouuVar.b;
                if (!list.contains(str)) {
                    nfaVar.g(str);
                }
                nfaVar.f(str, ouuVar.c);
                if (yks.e(str, "fexp")) {
                    for (Object obj : this.d.d()) {
                        obj.getClass();
                        this.b.f("fexp", String.valueOf(((Number) obj).longValue()));
                    }
                }
                if (this.c.b == owl.c && yks.e(ouuVar.b, "cat")) {
                    nfaVar.f("cat", "trailer");
                }
            } else if (eacVarB instanceof ouv) {
                ouv ouvVar = (ouv) eacVarB;
                nfaVar.f("stmp", ouvVar.a + ":" + ouvVar.b);
            }
        }
    }

    @Override // defpackage.nez
    protected final void i() {
        nfa nfaVar = this.b;
        owe oweVar = this.c;
        nfaVar.f("vod_tp", oweVar.b.d);
        ovy ovyVar = oweVar.a;
        ovz ovzVar = ovyVar.a;
        if (ovzVar != null) {
            nfaVar.f("clnt", ovzVar.f);
        }
        String str = ovyVar.b;
        if (str != null) {
            nfaVar.f("pkg_nm", str);
        }
    }

    @Override // defpackage.nez
    public final void b() {
    }
}
