package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgj extends agtu implements agvb {
    int a;
    final /* synthetic */ cgk b;
    final /* synthetic */ cbv c;
    final /* synthetic */ cbg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgj(cgk cgkVar, cbv cbvVar, cbg cbgVar, agsw agswVar) {
        super(2, agswVar);
        this.b = cgkVar;
        this.c = cbvVar;
        this.d = cbgVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        Object objA;
        Object obj2 = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            cgk cgkVar = this.b;
            cbv cbvVar = this.c;
            cbg cbgVar = this.d;
            this.a = 1;
            String str = cnw.a;
            cld cldVar = cgkVar.a;
            if (!cldVar.s || Build.VERSION.SDK_INT >= 31) {
                objA = agpu.a;
            } else {
                coe coeVar = cgkVar.i;
                Context context = cgkVar.b;
                Executor executor = coeVar.d;
                executor.getClass();
                objA = ahal.a(ahdd.a(executor), new cnv(cbvVar, cldVar, cbgVar, context, null), this);
                if (objA != obj2) {
                    objA = agpu.a;
                }
            }
            if (objA != obj2) {
            }
        }
        if (i != 1) {
            return obj;
        }
        cbx.c().a(cgm.a, "Starting work for ".concat(String.valueOf(this.b.a.e)));
        cbv cbvVar2 = this.c;
        zyd zydVarB = cbvVar2.b();
        zydVarB.getClass();
        this.a = 2;
        Object objA2 = cgm.a(zydVarB, cbvVar2, this);
        return objA2 == obj2 ? obj2 : objA2;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new cgj(this.b, this.c, this.d, agswVar);
    }
}
