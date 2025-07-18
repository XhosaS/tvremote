package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgh extends agtu implements agvb {
    int a;
    final /* synthetic */ cgk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgh(cgk cgkVar, agsw agswVar) {
        super(2, agswVar);
        this.b = cgkVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        final cge cgbVar;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                cgk cgkVar = this.b;
                ahdn ahdnVar = cgkVar.j;
                cgg cggVar = new cgg(cgkVar, null);
                this.a = 1;
                obj = ahal.a(ahdnVar, cggVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            cgbVar = (cge) obj;
        } catch (cfs e) {
            cgbVar = new cgd(e.a);
        } catch (CancellationException unused) {
            cgbVar = new cgb(null);
        } catch (Throwable th) {
            String str = cgm.a;
            cbx.c();
            Log.e(str, "Unexpected error in WorkerWrapper", th);
            cgbVar = new cgb(null);
        }
        final cgk cgkVar2 = this.b;
        Object objE = cgkVar2.e.e(new Callable() { // from class: cgf
            /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 405
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cgf.call():java.lang.Object");
            }
        });
        objE.getClass();
        return objE;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new cgh(this.b, agswVar);
    }
}
