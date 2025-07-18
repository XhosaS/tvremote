package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhl implements fhi {
    private final Set a;
    private final ScheduledExecutorService b;
    private final ujk c;

    public fhl(Context context, Set set, ujq ujqVar, ScheduledExecutorService scheduledExecutorService) {
        context.getClass();
        set.getClass();
        ujqVar.getClass();
        scheduledExecutorService.getClass();
        this.a = set;
        this.b = scheduledExecutorService;
        ujl ujlVarH = ujm.h();
        int i = uem.b;
        uel uelVar = new uel(context);
        uem.b("device_data");
        uelVar.c = "device_data";
        uelVar.b("device_data.pb");
        ujlVarH.e(uelVar.a());
        fnp fnpVar = fnp.a;
        uia uiaVar = (uia) ujlVarH;
        uiaVar.a = fnq.c(new fno());
        uiaVar.c = ukk.a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ujlVarH.b().g((uje) it.next());
        }
        ujk ujkVarA = ujqVar.a(ujlVarH.a());
        ujkVarA.getClass();
        this.c = ujkVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fhi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fhk
            if (r0 == 0) goto L13
            r0 = r5
            fhk r0 = (defpackage.fhk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fhk r0 = new fhk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            ujk r5 = r4.c
            zyd r5 = r5.c()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.ahkr.b(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhl.a(agsw):java.lang.Object");
    }

    @Override // defpackage.fhi
    public final Object b(final agux aguxVar, agsw agswVar) throws Throwable {
        Object objB = ahkr.b(this.c.a(new yqi() { // from class: fhj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (fnp) aguxVar.a(obj);
            }
        }, this.b), agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }
}
