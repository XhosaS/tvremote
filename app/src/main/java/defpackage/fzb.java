package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzb implements owy {
    private final ozj a;
    private final Context b;
    private final Executor c;
    private final zyg d;
    private final Map e;

    public fzb(ozj ozjVar, Context context, ozx ozxVar, Executor executor, zyg zygVar) {
        context.getClass();
        ozxVar.getClass();
        executor.getClass();
        zygVar.getClass();
        this.a = ozjVar;
        this.b = context;
        this.c = executor;
        this.d = zygVar;
        this.e = new LinkedHashMap();
    }

    @Override // defpackage.owy
    public final synchronized owx a(String str) {
        str.getClass();
        Map map = this.e;
        owx owxVar = (owx) map.get(str);
        if (owxVar != null) {
            return owxVar;
        }
        ozj ozjVar = this.a;
        pad padVar = new pad(this.b, str, this.c, this.d);
        oym oymVar = (oym) ozjVar.a.a();
        oymVar.getClass();
        Context context = (Context) ozjVar.b.a();
        context.getClass();
        ((oty) ozjVar.c.a()).getClass();
        ozx ozxVar = (ozx) ozjVar.d.a();
        ozxVar.getClass();
        ozr ozrVar = (ozr) ozjVar.e.a();
        ozrVar.getClass();
        Executor executor = (Executor) ozjVar.f.a();
        executor.getClass();
        ((mcw) ozjVar.g.a()).getClass();
        oxs oxsVar = (oxs) ozjVar.h.a();
        oxsVar.getClass();
        ((ozt) ozjVar.i.a()).getClass();
        Optional optional = (Optional) ozjVar.j.a();
        optional.getClass();
        Optional optional2 = (Optional) ((aejh) ozjVar.k).b;
        optional2.getClass();
        agte agteVar = (agte) ozjVar.l.a();
        agteVar.getClass();
        ozi oziVar = new ozi(oymVar, context, ozxVar, ozrVar, executor, oxsVar, optional, optional2, agteVar, padVar, str);
        map.put(str, oziVar);
        return oziVar;
    }
}
