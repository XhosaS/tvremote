package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fik implements fdp {
    private fdr a;
    private fiq b;
    private boolean c;

    private final boolean h(fdq fdqVar) {
        fim fimVar = new fim();
        if (fimVar.b(fdqVar, true) && (fimVar.a & 2) == 2) {
            int iMin = Math.min(fimVar.e, 8);
            edi ediVar = new edi(iMin);
            fdqVar.i(ediVar.a, 0, iMin);
            i(ediVar);
            if (ediVar.a() >= 5 && ediVar.j() == 127 && ediVar.r() == 1179402563) {
                this.b = new fij();
            } else {
                i(ediVar);
                if (fki.J(1, ediVar, true)) {
                    this.b = new fir();
                } else {
                    i(ediVar);
                    if (fio.d(ediVar, fio.a)) {
                        this.b = new fio();
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static void i(edi ediVar) {
        ediVar.K(0);
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        fiq fiqVar = this.b;
        if (fiqVar != null) {
            fil filVar = fiqVar.b;
            filVar.a.a();
            filVar.b.G(0);
            filVar.c = -1;
            filVar.d = false;
            if (j == 0) {
                fiqVar.b(!fiqVar.l);
                return;
            }
            if (fiqVar.i != 0) {
                fiqVar.f = fiqVar.f(j2);
                fin finVar = fiqVar.e;
                String str = edt.a;
                finVar.c(fiqVar.f);
                fiqVar.i = 2;
            }
        }
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        try {
            return h(fdqVar);
        } catch (eaf unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Type inference failed for: r1v5, types: [fin, java.lang.Object] */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.fdq r19, defpackage.rsj r20) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fik.g(fdq, rsj):int");
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.a = fdrVar;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
