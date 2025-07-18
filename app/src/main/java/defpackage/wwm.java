package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wwm {
    public static void a(wwq wwqVar) {
        Trace.beginSection(wum.k(wwqVar.d()));
    }

    static void b(wwq wwqVar) {
        if (d(wwqVar) || wwqVar.a() == null) {
            Trace.beginSection(wwqVar.e());
            a(wwqVar);
        } else {
            b(wwqVar.a());
            a(wwqVar);
        }
    }

    static void c(wwq wwqVar) {
        if (d(wwqVar) || wwqVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            c(wwqVar.a());
        }
    }

    public static boolean d(wwq wwqVar) {
        return wwqVar.f() != Thread.currentThread();
    }
}
