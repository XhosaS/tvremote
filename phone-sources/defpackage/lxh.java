package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxh implements lxj {
    public static final /* synthetic */ int p = 0;
    public final Executor a;
    public final Executor b;
    public final ids c;
    public final iea d;
    public final iea e;
    public final ids f;
    public final lge g;
    public final iea h;
    public final lyz i;
    public final lxm j;
    public final lxp k;
    public final lrc l;
    public final lfz m;
    public final ltt n;
    public final mdw o;
    private final lzz q;

    static {
        kuc.a("topselling_paid");
        kuc.a("topselling_paid_show");
    }

    public lxh(lyz lyzVar, lzz lzzVar, ExecutorService executorService, Executor executor, ids idsVar, ids idsVar2, iea ieaVar, SharedPreferences sharedPreferences, iea ieaVar2, kuw kuwVar, lfz lfzVar, mdw mdwVar, lfn lfnVar, ids idsVar3, iea ieaVar3, iea ieaVar4, lxp lxpVar, lrc lrcVar, ltt lttVar, lxm lxmVar, lge lgeVar) {
        new idz("");
        new idz("");
        new HashMap();
        new HashMap();
        this.i = lyzVar;
        this.q = lzzVar;
        this.a = executorService;
        this.b = executor;
        this.c = idsVar;
        this.e = ieaVar;
        this.d = ieaVar2;
        this.m = lfzVar;
        this.o = mdwVar;
        this.h = ieaVar4;
        this.k = lxpVar;
        this.n = lttVar;
        this.j = lxmVar;
        this.g = lgeVar;
        this.l = lrcVar;
        kuwVar.c(4);
        this.f = kuwVar.c(2);
        lfnVar.cW();
        meb mebVar = meb.a;
        new mcl(sharedPreferences, ieaVar4);
        lyzVar.c(1);
        mev.a(43200000L, ieaVar4, idsVar3, idsVar2, ieaVar, ieaVar3);
    }

    private final iea i(iea ieaVar, idf idfVar) {
        idf idfVarE = this.k.e(kvf.class);
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{this.e, ((maa) this.q).d.c(maa.a), ieaVar, this.m.c(), this.d};
        krzVar.b = this.a;
        krzVar.d(new lxf(this, (Object) ieaVar, idfVar, (Object) idfVarE, 2));
        return krzVar.a();
    }

    private final iea j(lre lreVar) {
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{this.h, this.c, this.f, this.e};
        krzVar.b = this.b;
        krzVar.d(new ldj(this, lreVar, 8));
        return krzVar.a();
    }

    @Override // defpackage.lxj
    public final iea a() {
        return i(this.h, new ljt(this.g, 11));
    }

    @Override // defpackage.lxj
    public final iea b() {
        return i(this.h, new ljt(this.g, 15));
    }

    @Override // defpackage.lxj
    public final iea c() {
        ljt ljtVar = new ljt(this.g, 13);
        idf idfVarE = this.k.e(kwn.class);
        krz krzVar = new krz(ieg.a);
        maa maaVar = (maa) this.q;
        iea ieaVar = this.h;
        krzVar.a = new ids[]{this.e, maaVar.d.c(maa.b), ieaVar, this.m.c(), this.d};
        krzVar.b = maaVar.c;
        krzVar.d(new lxf(this, (Object) ieaVar, (idf) ljtVar, (Object) idfVarE, 4));
        return krzVar.a();
    }

    @Override // defpackage.lxj
    public final iea d(kvf kvfVar) {
        idf idfVarC = this.k.c(kvf.class);
        krz krzVar = new krz(ieg.f(kvfVar));
        krzVar.a = new ids[]{this.h, this.c, this.f, this.e, this.i.c(2)};
        krzVar.b = this.b;
        krzVar.d(new lxg(this, kvfVar, idfVarC, 3));
        return krzVar.a();
    }

    @Override // defpackage.lxj
    public final iea e(kvj kvjVar) {
        idf idfVarC = this.k.c(kvj.class);
        krz krzVar = new krz(ieg.f(kvjVar));
        krzVar.a = new ids[]{this.h, this.c, this.f, this.e, this.i.c(2)};
        krzVar.b = this.b;
        krzVar.d(new ldj(kvjVar, idfVarC, 9));
        return krzVar.a();
    }

    @Override // defpackage.lxj
    public final iea f(ksy ksyVar) {
        return j(new lre(ieg.a, 1, ksyVar));
    }

    @Override // defpackage.lxj
    public final iea g(ksy ksyVar) {
        return j(new lre(ieg.a, 2, ksyVar));
    }

    @Override // defpackage.lxj
    public final iea h(kwn kwnVar) {
        idf idfVarC = this.k.c(kwn.class);
        krz krzVar = new krz(ieg.f(kwnVar));
        krzVar.a = new ids[]{this.h, this.c, this.f, this.e, this.i.c(4)};
        krzVar.b = this.b;
        krzVar.d(new ldj(kwnVar, idfVarC, 7));
        return krzVar.a();
    }
}
