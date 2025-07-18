package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aade extends aaeb {
    private final aacw b;

    public aade(aacw aacwVar, aabu aabuVar) {
        super(aabo.m, aabuVar);
        this.b = aacwVar;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        return this.b.Q(j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int b(Locale locale) {
        return aadg.a(locale).k;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return 7;
    }

    @Override // defpackage.aaeb, defpackage.aabm
    public final int d() {
        return 1;
    }

    @Override // defpackage.aadr
    protected final int eX(String str, Locale locale) {
        Integer num = (Integer) aadg.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new aabx(aabo.m, str);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String k(int i, Locale locale) {
        return aadg.a(locale).c[i];
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String n(int i, Locale locale) {
        return aadg.a(locale).b[i];
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return this.b.d;
    }
}
