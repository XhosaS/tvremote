package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wza {
    wwq a;

    public wza(boolean z) {
        this.a = z ? wum.e() : null;
    }

    public static void a(wwq wwqVar) {
        Trace.beginSection(wum.k(wwqVar.d()));
    }

    final void b(wwq wwqVar) {
        if (d(wwqVar) || wwqVar.a() == null) {
            Trace.beginSection(wwqVar.e());
            a(wwqVar);
        } else {
            b(wwqVar.a());
            a(wwqVar);
        }
    }

    final void c(wwq wwqVar) {
        if (d(wwqVar) || wwqVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            c(wwqVar.a());
        }
    }

    public final boolean d(wwq wwqVar) {
        return wwqVar.b() != this;
    }
}
