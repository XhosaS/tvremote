package defpackage;

import android.app.Service;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etn extends evp {
    public final Service a;
    public final eup b;
    public final aejl c;
    public final aejl d;
    public final aejl e;
    public final aejl f;
    public final aejl g;
    public final aejl h;
    public final aejl i;
    public final aejl j;
    public final aejl k;
    public final aejl l;
    public final aejl m;
    public final aejl n;
    public final aejl o;
    private final etn p = this;

    public etn(eup eupVar, Service service) {
        this.b = eupVar;
        this.a = service;
        this.c = aejf.c(new etm(eupVar, this, 0));
        this.d = aejf.c(new etm(eupVar, this, 1));
        this.e = aejf.c(new etm(eupVar, this, 2));
        this.f = aejf.c(new etm(eupVar, this, 3));
        this.g = aejf.c(new etm(eupVar, this, 4));
        this.h = aejf.c(new etm(eupVar, this, 5));
        this.i = aejf.c(new etm(eupVar, this, 6));
        this.j = aejf.c(new etm(eupVar, this, 7));
        this.k = aejf.c(new etm(eupVar, this, 8));
        this.l = aejf.c(new etm(eupVar, this, 9));
        this.m = aejf.c(new etm(eupVar, this, 10));
        this.n = aejo.b(new etm(eupVar, this, 11));
        this.o = new etm(eupVar, this, 12);
    }

    public final wmw a() {
        return new wmw(aejf.b(aejn.a));
    }

    @Override // defpackage.wxi
    public final wxc l() {
        return (wxc) this.b.ii.a();
    }

    @Override // defpackage.wxi
    public final Set n() {
        return zcp.b;
    }
}
