package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbo extends agtu implements agvb {
    int a;
    final /* synthetic */ agvb b;
    final /* synthetic */ xo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbo(agvb agvbVar, xo xoVar, agsw agswVar) {
        super(2, agswVar);
        this.b = agvbVar;
        this.c = xoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                ahbt ahbtVar = (ahbt) this.d;
                agvb agvbVar = this.b;
                this.a = 1;
                obj = agvbVar.a(ahbtVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            this.c.b(obj);
        } catch (CancellationException unused) {
            this.c.c();
        } catch (Throwable th) {
            this.c.d(th);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        cbo cboVar = new cbo(this.b, this.c, agswVar);
        cboVar.d = obj;
        return cboVar;
    }
}
