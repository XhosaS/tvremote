package defpackage;

import java.io.EOFException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqf implements eql {
    public static final int[] a = {8, 13, 11, 2, 0, 1, 7};
    public fjg b = new fjf(1);
    public boolean c;

    public static void b(int i, List list) {
        if (sfy.aa(a, i, 0, 7) != -1) {
            Integer numValueOf = Integer.valueOf(i);
            if (list.contains(numValueOf)) {
                return;
            }
            list.add(numValueOf);
        }
    }

    public static boolean c(fdp fdpVar, fdq fdqVar) {
        boolean zE;
        try {
            zE = fdpVar.e(fdqVar);
        } catch (EOFException unused) {
            zE = false;
        } catch (Throwable th) {
            fdqVar.k();
            throw th;
        }
        fdqVar.k();
        return zE;
    }

    @Override // defpackage.eql
    public final dze a(dze dzeVar) {
        if (!this.c || !this.b.c(dzeVar)) {
            return dzeVar;
        }
        dzd dzdVar = new dzd(dzeVar);
        dzdVar.d("application/x-media3-cues");
        dzdVar.K = this.b.a(dzeVar);
        String str = dzeVar.Y;
        String str2 = dzeVar.U;
        dzdVar.j = String.valueOf(str).concat(str2 != null ? " ".concat(str2) : "");
        dzdVar.r = Long.MAX_VALUE;
        return new dze(dzdVar);
    }
}
