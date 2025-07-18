package defpackage;

import android.accounts.Account;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tds {
    public Context a;
    public String b;
    public String c;
    public tdu d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public tdt j;
    public Account k;
    public boolean l;
    public boolean m;
    private yfo n = new pep(20);
    private boolean o;

    private static void d(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str.concat(" must be set when building a PlayEventLogger!"));
        }
    }

    public final tdv a() {
        d(this.a, "Context");
        d(this.d, "LogSource");
        d(this.j, "Configuration");
        return new tdv(this.a, this.b, this.c, this.d, this.e, this.f, this.n, this.g, this.h, this.i, this.j, this.k, this.l, this.o, this.m);
    }

    public final void b(final long j) {
        this.n = new yfo() { // from class: tdr
            @Override // defpackage.yfo, defpackage.yfn
            public final Object b() {
                return Long.valueOf(j);
            }
        };
    }

    public final void c() {
        this.o = true;
    }
}
