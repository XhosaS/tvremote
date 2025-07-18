package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsb {
    public final guw a;
    public final Context b;
    public final String c;
    public final WorkDatabase d;
    public final gux e;
    public final gub f;
    public final String g;
    public final yqg h;
    public final tae i;
    public final isy j;
    private final gty k;
    private final List l;

    /* JADX WARN: Type inference failed for: r1v6, types: [gty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public gsb(lhr lhrVar) {
        guw guwVar = (guw) lhrVar.f;
        this.a = guwVar;
        this.b = (Context) lhrVar.b;
        String str = guwVar.b;
        this.c = str;
        this.j = (isy) lhrVar.g;
        this.i = (tae) lhrVar.c;
        this.k = lhrVar.d;
        WorkDatabase workDatabase = (WorkDatabase) lhrVar.e;
        this.d = workDatabase;
        this.e = workDatabase.D();
        this.f = workDatabase.y();
        ?? r2 = lhrVar.a;
        this.l = r2;
        this.g = "Work [ id=" + str + ", tags={ " + yfm.ax(r2, ",", null, null, null, 62) + " } ]";
        this.h = new yqg(null);
    }

    public final gun a() {
        return fki.aM(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, yil] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsb.b(yih):java.lang.Object");
    }

    public final void c(int i) {
        gux guxVar = this.e;
        gpx gpxVar = gpx.a;
        String str = this.c;
        guxVar.B(gpxVar, str);
        guxVar.r(str, System.currentTimeMillis());
        guxVar.q(str, this.a.u);
        guxVar.x(str, -1L);
        guxVar.t(str, i);
    }

    public final void d() {
        gux guxVar = this.e;
        String str = this.c;
        guxVar.r(str, System.currentTimeMillis());
        guxVar.B(gpx.a, str);
        guxVar.z(str);
        guxVar.q(str, this.a.u);
        guxVar.o(str);
        guxVar.x(str, -1L);
    }

    public final void e(gli gliVar) {
        String str = this.c;
        List listT = yfm.t(str);
        while (!listT.isEmpty()) {
            String str2 = (String) yfm.E(listT);
            gux guxVar = this.e;
            if (guxVar.b(str2) != gpx.f) {
                guxVar.B(gpx.d, str2);
            }
            listT.addAll(this.f.a(str2));
        }
        gox goxVar = ((gpj) gliVar).a;
        goxVar.getClass();
        gux guxVar2 = this.e;
        guxVar2.q(str, this.a.u);
        guxVar2.s(str, goxVar);
    }
}
