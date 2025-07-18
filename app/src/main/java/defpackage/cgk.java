package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgk {
    public final cld a;
    public final Context b;
    public final String c;
    public final cak d;
    public final WorkDatabase e;
    public final cle f;
    public final cjo g;
    public final String h;
    public final coe i;
    public final ahdn j;
    private final cji k;
    private final List l;

    public cgk(cga cgaVar) {
        cld cldVar = cgaVar.d;
        this.a = cldVar;
        this.b = cgaVar.f;
        String str = cldVar.c;
        this.c = str;
        this.i = cgaVar.g;
        this.d = cgaVar.a;
        this.k = cgaVar.b;
        WorkDatabase workDatabase = cgaVar.c;
        this.e = workDatabase;
        this.f = workDatabase.D();
        this.g = workDatabase.x();
        List list = cgaVar.e;
        this.l = list;
        this.h = "Work [ id=" + str + ", tags={ " + agqq.G(list, ",", null, null, null, 62) + " } ]";
        this.j = new ahdn(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgk.a(agsw):java.lang.Object");
    }

    public final void b(int i) {
        cle cleVar = this.f;
        ccq ccqVar = ccq.a;
        String str = this.c;
        cleVar.B(ccqVar, str);
        cleVar.r(str, System.currentTimeMillis());
        cleVar.q(str, this.a.w);
        cleVar.x(str, -1L);
        cleVar.t(str, i);
    }

    public final void c() {
        cle cleVar = this.f;
        String str = this.c;
        cleVar.r(str, System.currentTimeMillis());
        cleVar.B(ccq.a, str);
        cleVar.z(str);
        cleVar.q(str, this.a.w);
        cleVar.n(str);
        cleVar.x(str, -1L);
    }

    public final void d(cbu cbuVar) {
        String str = this.c;
        List listE = agqq.e(str);
        while (!listE.isEmpty()) {
            String str2 = (String) agqq.j(listE);
            cle cleVar = this.f;
            if (cleVar.b(str2) != ccq.f) {
                cleVar.B(ccq.d, str2);
            }
            listE.addAll(this.g.a(str2));
        }
        caz cazVar = ((cbr) cbuVar).a;
        cazVar.getClass();
        cle cleVar2 = this.f;
        cleVar2.q(str, this.a.w);
        cleVar2.s(str, cazVar);
    }
}
