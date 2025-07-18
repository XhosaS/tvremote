package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utk implements xqc {
    private final yfo a;
    private final Class b;
    private final Class c;

    public utk(yfo yfoVar, Class cls, Class cls2) {
        this.a = yfoVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.xqc
    public final xqb a(xsq xsqVar, xpy xpyVar, xpz xpzVar) {
        try {
            Object objB = this.a.b();
            sij.ae(xsqVar, this.b, true);
            sij.ae(xsqVar, this.c, false);
            return new utt(new utr(xpzVar, xsqVar, xpyVar, (ImmutableList) objB));
        } catch (xtl e) {
            return new uud(xtk.c(e));
        }
    }
}
