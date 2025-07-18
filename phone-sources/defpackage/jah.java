package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jah implements iej {
    public final Context a;
    public final yow b;
    public final lfn c;
    public final String d;
    public final kw h;
    private final yow i;
    private final iea j;
    private final ConcurrentHashMap k = new ConcurrentHashMap();
    public yol g = new yol();
    public final idr e = new idz(yhb.a);
    public Map f = yhc.a;

    public jah(Context context, kw kwVar, yow yowVar, yow yowVar2, iea ieaVar, lfn lfnVar, String str) {
        this.a = context;
        this.h = kwVar;
        this.i = yowVar;
        this.b = yowVar2;
        this.j = ieaVar;
        this.c = lfnVar;
        this.d = str;
        ieaVar.ea(this);
        dM();
    }

    public final dbd a() {
        Object objPutIfAbsent;
        ieg iegVarA = ((ldy) this.j).a();
        iegVarA.getClass();
        String str = iegVarA.m() ? ((ksn) iegVarA.g()).a : "";
        ConcurrentHashMap concurrentHashMap = this.k;
        Object objD = concurrentHashMap.get(str);
        if (objD == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (objD = cwo.d(jaj.a, new dcw(new iwg(9)), this.i, new isg(this, iegVarA, 5, null), 4)))) != null) {
            objD = objPutIfAbsent;
        }
        return (dbd) objD;
    }

    public final synchronized void b(wnf wnfVar) {
        this.e.c(wnfVar.b);
        vun<wnc> vunVar = wnfVar.b;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
        for (wnc wncVar : vunVar) {
            arrayList.add(new yfw(wncVar.f, wncVar));
        }
        Map mapK = yfm.k(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapK.entrySet()) {
            if (((String) entry.getKey()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f = linkedHashMap;
    }

    @Override // defpackage.iej
    public final void dM() {
        this.g.S(ygi.a);
        this.g = new yol();
        if (((ldy) this.j).a().m()) {
            ykr.q(this.i, null, 0, new gow(this, (yih) null, 20, (byte[]) null), 3);
        }
    }
}
