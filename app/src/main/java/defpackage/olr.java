package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olr {
    public final Geller a;
    public yqt b;
    public final ont c;
    public yqi d;
    public final ExecutorService e;
    public final ExecutorService f;
    public final ExecutorService g;
    public final Set h;
    public yqi i;
    public abwf j;
    public final Boolean k;
    public final String l;
    public Map m;
    public oln n;
    public final yqt o;
    public final yqt p;
    public final yqt q;
    public omi r;

    public olr(Geller geller, ont ontVar, Set set, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        ypv ypvVar = ypv.a;
        this.b = ypvVar;
        this.i = new yqi() { // from class: olq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new oiq();
            }
        };
        this.j = acbg.d(60L, 0);
        this.k = true;
        this.l = "geller-pa.googleapis.com";
        this.m = zcl.a;
        this.n = oln.i().a();
        this.o = ypvVar;
        this.p = ypvVar;
        this.q = ypvVar;
        this.a = geller;
        this.b = ypvVar;
        this.c = ontVar;
        this.h = set;
        this.e = executorService;
        this.f = executorService2;
        this.g = executorService3;
    }

    public final ols a() {
        yqw.M(this.d != null, "A SyncContextGenerator must be set for Geller");
        return new ols(this);
    }
}
