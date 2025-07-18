package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zgs extends zgr {
    public final zgr b;

    public zgs(zgr zgrVar) {
        this.b = zgrVar;
    }

    @Override // defpackage.zgr
    public zhm a(zhe zheVar) {
        throw null;
    }

    @Override // defpackage.zgr
    public final List b(zhe zheVar) {
        throw null;
    }

    @Override // defpackage.zgr
    public final zgp c(zhe zheVar) {
        throw null;
    }

    @Override // defpackage.zgr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.zgr
    public final zgq e(zhe zheVar) {
        zgq zgqVarE = this.b.e(zheVar);
        if (zgqVarE == null) {
            return null;
        }
        zhe zheVar2 = zgqVarE.c;
        return zheVar2 == null ? zgqVarE : new zgq(zgqVarE.a, zgqVarE.b, zheVar2, zgqVarE.d, zgqVarE.e, zgqVarE.f, zgqVarE.g);
    }

    @Override // defpackage.zgr
    public final zho f(zhe zheVar) {
        throw null;
    }

    @Override // defpackage.zgr
    public final void g(zhe zheVar, zhe zheVar2) {
        this.b.g(zheVar, zheVar2);
    }

    @Override // defpackage.zgr
    public final zhm j(zhe zheVar) {
        throw null;
    }

    @Override // defpackage.zgr
    public final void k(zhe zheVar) {
        throw null;
    }

    @Override // defpackage.zgr
    public final void l(zhe zheVar) {
        this.b.l(zheVar);
    }

    public final String toString() {
        int i = ylg.a;
        return new ykl(getClass()).c() + "(" + this.b + ")";
    }
}
