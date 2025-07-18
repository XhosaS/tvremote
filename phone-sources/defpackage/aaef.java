package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaef extends aabm implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final aabo b;
    private final aabu c;

    private aaef(aabo aaboVar, aabu aabuVar) {
        if (aabuVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = aaboVar;
        this.c = aabuVar;
    }

    private Object readResolve() {
        return y(this.b, this.c);
    }

    public static synchronized aaef y(aabo aaboVar, aabu aabuVar) {
        HashMap map = a;
        aaef aaefVar = null;
        if (map == null) {
            a = new HashMap(7);
        } else {
            aaef aaefVar2 = (aaef) map.get(aaboVar);
            if (aaefVar2 == null || aaefVar2.c == aabuVar) {
                aaefVar = aaefVar2;
            }
        }
        if (aaefVar != null) {
            return aaefVar;
        }
        aaef aaefVar3 = new aaef(aaboVar, aabuVar);
        a.put(aaboVar, aaefVar3);
        return aaefVar3;
    }

    private final UnsupportedOperationException z() {
        return new UnsupportedOperationException(this.b.y.concat(" field is unsupported"));
    }

    @Override // defpackage.aabm
    public final int a(long j) {
        throw z();
    }

    @Override // defpackage.aabm
    public final int b(Locale locale) {
        throw z();
    }

    @Override // defpackage.aabm
    public final int c() {
        throw z();
    }

    @Override // defpackage.aabm
    public final int d() {
        throw z();
    }

    @Override // defpackage.aabm
    public final long e(long j, int i) {
        return this.c.b(j, i);
    }

    @Override // defpackage.aabm
    public final long f(long j) {
        throw z();
    }

    @Override // defpackage.aabm
    public final long g(long j) {
        throw z();
    }

    @Override // defpackage.aabm
    public final long h(long j, int i) {
        throw z();
    }

    @Override // defpackage.aabm
    public final long i(long j, String str, Locale locale) {
        throw z();
    }

    @Override // defpackage.aabm
    public final String k(int i, Locale locale) {
        throw z();
    }

    @Override // defpackage.aabm
    public final String l(long j, Locale locale) {
        throw z();
    }

    @Override // defpackage.aabm
    public final String m(aach aachVar, Locale locale) {
        throw z();
    }

    @Override // defpackage.aabm
    public final String n(int i, Locale locale) {
        throw z();
    }

    @Override // defpackage.aabm
    public final String o(long j, Locale locale) {
        throw z();
    }

    @Override // defpackage.aabm
    public final String p(aach aachVar, Locale locale) {
        throw z();
    }

    @Override // defpackage.aabm
    public final String q() {
        return this.b.y;
    }

    @Override // defpackage.aabm
    public final aabo r() {
        return this.b;
    }

    @Override // defpackage.aabm
    public final aabu s() {
        return this.c;
    }

    @Override // defpackage.aabm
    public final aabu t() {
        return null;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return null;
    }

    @Override // defpackage.aabm
    public final boolean v(long j) {
        throw z();
    }

    @Override // defpackage.aabm
    public final boolean w() {
        return false;
    }

    @Override // defpackage.aabm
    public final void x() {
    }
}
