package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadf extends aadr {
    private final aacw a;

    public aadf(aacw aacwVar) {
        super(aabo.b);
        this.a = aacwVar;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        return this.a.aa(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int b(Locale locale) {
        return aadg.a(locale).j;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return 1;
    }

    @Override // defpackage.aabm
    public final int d() {
        return 0;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        if (a(j) == 1) {
            return this.a.aj(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        vxr.ay(this, i, 0, 1);
        if (a(j) == i) {
            return j;
        }
        aacw aacwVar = this.a;
        return aacwVar.aj(j, -aacwVar.aa(j));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long i(long j, String str, Locale locale) {
        Integer num = (Integer) aadg.a(locale).g.get(str);
        if (num != null) {
            return h(j, num.intValue());
        }
        throw new aabx(aabo.b, str);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String n(int i, Locale locale) {
        return aadg.a(locale).a[i];
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu s() {
        return aaeg.j(aabw.a);
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return null;
    }

    @Override // defpackage.aabm
    public final void x() {
    }
}
