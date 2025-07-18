package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wei {
    public final rgy a;
    private final aehf b;
    private final aehf c;
    private final Executor d;
    private final wbt e;

    public wei(rgy rgyVar, wbt wbtVar, aehf aehfVar, aehf aehfVar2, Executor executor) {
        rgyVar.getClass();
        wbtVar.getClass();
        aehfVar.getClass();
        aehfVar2.getClass();
        executor.getClass();
        this.a = rgyVar;
        this.e = wbtVar;
        this.b = aehfVar;
        this.c = aehfVar2;
        this.d = executor;
    }

    public final zyd a(String str) {
        final zyd zydVarL;
        aehf aehfVar = this.b;
        final String strA = this.e.a(str);
        zvh zvhVar = (zvh) ((Map) aehfVar.a()).get(strA);
        gsy gsyVar = (gsy) ((Map) this.c.a()).get(strA);
        final zyd zydVarG = null;
        if (zvhVar != null) {
            zydVarL = zxn.l(wyo.b(zvhVar), this.d);
        } else if (gsyVar != null) {
            zydVarL = zxn.l(wyo.b(new gsv(gsyVar)), this.d);
        } else {
            zydVarL = null;
        }
        if (gsyVar != null) {
            zyd zydVarL2 = zxn.l(wyo.b(new gsu(gsyVar)), this.d);
            final weh wehVar = weh.a;
            zydVarG = zuz.g(zydVarL2, wyo.a(new yqi() { // from class: wef
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return wehVar.a(obj);
                }
            }), zwk.a);
        }
        if (zydVarL == null) {
            return zxy.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        agqj.r(new zyd[]{zydVarL, zydVarG}, linkedHashSet);
        return xab.a(linkedHashSet).b(new zvh() { // from class: weg
            @Override // defpackage.zvh
            public final zyd a() {
                aagu aaguVar = (aagu) zxn.o(zydVarL);
                zyd zydVar = zydVarG;
                byte[] bArr = zydVar != null ? (byte[]) zxn.o(zydVar) : null;
                if (aaguVar == null) {
                    return zxy.a;
                }
                String str2 = strA;
                wei weiVar = this.a;
                return bArr == null ? weiVar.a.g(str2, aaguVar) : weiVar.a.h(str2, aaguVar, bArr);
            }
        }, zwk.a);
    }
}
