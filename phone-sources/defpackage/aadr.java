package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aadr extends aabm {
    public final aabo g;

    protected aadr(aabo aaboVar) {
        if (aaboVar == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.g = aaboVar;
    }

    @Override // defpackage.aabm
    public abstract int a(long j);

    @Override // defpackage.aabm
    public int b(Locale locale) {
        int iC = c();
        if (iC >= 0) {
            if (iC < 10) {
                return 1;
            }
            if (iC < 100) {
                return 2;
            }
            if (iC < 1000) {
                return 3;
            }
        }
        return Integer.toString(iC).length();
    }

    @Override // defpackage.aabm
    public abstract int c();

    @Override // defpackage.aabm
    public long e(long j, int i) {
        return s().b(j, i);
    }

    protected int eX(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new aabx(this.g, str);
        }
    }

    @Override // defpackage.aabm
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.aabm
    public abstract long g(long j);

    @Override // defpackage.aabm
    public abstract long h(long j, int i);

    @Override // defpackage.aabm
    public long i(long j, String str, Locale locale) {
        return h(j, eX(str, locale));
    }

    @Override // defpackage.aabm
    public String k(int i, Locale locale) {
        return n(i, locale);
    }

    @Override // defpackage.aabm
    public String l(long j, Locale locale) {
        return k(a(j), locale);
    }

    @Override // defpackage.aabm
    public final String m(aach aachVar, Locale locale) {
        return k(aachVar.b(this.g), locale);
    }

    @Override // defpackage.aabm
    public String n(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.aabm
    public String o(long j, Locale locale) {
        return n(a(j), locale);
    }

    @Override // defpackage.aabm
    public final String p(aach aachVar, Locale locale) {
        return n(aachVar.b(this.g), locale);
    }

    @Override // defpackage.aabm
    public final String q() {
        return this.g.y;
    }

    @Override // defpackage.aabm
    public final aabo r() {
        return this.g;
    }

    @Override // defpackage.aabm
    public abstract aabu s();

    @Override // defpackage.aabm
    public aabu t() {
        return null;
    }

    public final String toString() {
        return "DateTimeField[" + q() + "]";
    }

    @Override // defpackage.aabm
    public boolean v(long j) {
        return false;
    }

    @Override // defpackage.aabm
    public final boolean w() {
        return true;
    }

    public int y(long j) {
        return c();
    }
}
