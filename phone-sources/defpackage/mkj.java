package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mkj implements mkh {
    public final String a;
    private final Context b;
    private final String c;
    private final String d;
    private final idf e;
    private final fur f;
    private final SharedPreferences g;
    private final boolean h;
    private final ldv i;
    private final Executor j;

    public mkj(Context context, lfn lfnVar, idf idfVar, SharedPreferences sharedPreferences, ldv ldvVar, Executor executor) {
        this.b = context;
        this.e = idfVar;
        this.g = sharedPreferences;
        this.i = ldvVar;
        this.j = executor;
        String strBg = lfnVar.bg();
        this.c = strBg;
        String strC = jys.C(strBg);
        this.d = strC;
        nxb nxbVar = new nxb();
        nxbVar.i(strC);
        this.f = nxbVar.g();
        fuy.b(context);
        this.h = lfnVar.bW();
        this.a = Build.MODEL;
    }

    @Override // defpackage.mkh
    public final fur a() {
        return this.f;
    }

    @Override // defpackage.mkh
    public final void b(fux fuxVar, mjm mjmVar) {
        mjmVar.getClass();
        idf idfVar = this.e;
        SharedPreferences sharedPreferences = this.g;
        boolean z = this.h;
        ldv ldvVar = this.i;
        Executor executor = this.j;
        Context context = this.b;
        mkr mkrVar = new mkr(context, this.c, fuxVar, this, idfVar, sharedPreferences, z, ldvVar, executor, context.getResources());
        mkrVar.i(new mki(mkrVar));
        a.H(mkrVar.n == 0);
        mkrVar.F(1);
        mkrVar.h.d();
        mjmVar.a(mkrVar);
    }

    @Override // defpackage.mkh
    public final void c() {
        krf.b();
    }

    @Override // defpackage.mkh
    public final boolean d(fux fuxVar) {
        return fuxVar.v(this.d);
    }
}
