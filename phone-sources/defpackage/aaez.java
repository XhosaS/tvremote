package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaez implements Comparable {
    aabm a;
    int b;
    String c;
    Locale d;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aaez aaezVar) {
        aabm aabmVar = aaezVar.a;
        int iA = aafb.a(this.a.u(), aabmVar.u());
        return iA != 0 ? iA : aafb.a(this.a.s(), aabmVar.s());
    }

    final long b(long j, boolean z) {
        String str = this.c;
        long j2 = str == null ? this.a.j(j, this.b) : this.a.i(j, str, this.d);
        return z ? this.a.g(j2) : j2;
    }

    final void c(aabm aabmVar, int i) {
        this.a = aabmVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }
}
