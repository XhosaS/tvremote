package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhb implements fgx {
    private final ujk a;

    public fhb(Context context, ujq ujqVar) {
        context.getClass();
        ujqVar.getClass();
        ujl ujlVarH = ujm.h();
        int i = uem.b;
        uel uelVar = new uel(context);
        uem.b("stickyapp");
        uelVar.c = "stickyapp";
        uelVar.b("media_sticky_app.pb");
        ujlVarH.e(uelVar.a());
        ((uia) ujlVarH).c = ukk.a;
        ujlVarH.d(xbg.a);
        ujk ujkVarA = ujqVar.a(ujlVarH.a());
        ujkVarA.getClass();
        this.a = ujkVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fha
            if (r0 == 0) goto L13
            r0 = r5
            fha r0 = (defpackage.fha) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fha r0 = new fha
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
            ujk r5 = r4.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhb.a(agsw):java.lang.Object");
    }

    @Override // defpackage.fgx
    public final Object b(xbg xbgVar, agsw agswVar) throws Throwable {
        int i = xbgVar.b;
        if (i != 2) {
            if (i == 1) {
                xbf xbfVar = new xbf();
                xaq xaqVar = xaq.a;
                xap xapVar = new xap();
                String str = (xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).c;
                str.getClass();
                xah.c(str, xapVar);
                xaq xaqVarA = xah.a(xapVar);
                if ((xbfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xbfVar.y();
                }
                xbg xbgVar2 = (xbg) xbfVar.b;
                xbgVar2.c = xaqVarA;
                xbgVar2.b = 1;
                xbgVar = xao.a(xbfVar);
            } else {
                xbgVar = null;
            }
        }
        if (xbgVar != null) {
            ujk ujkVar = this.a;
            final fgy fgyVar = new fgy(xbgVar);
            Object objB = ahkr.b(ujkVar.a(new yqi() { // from class: fgz
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return ((fgy) fgyVar).a;
                }
            }, zwk.a), agswVar);
            if (objB == agtg.a) {
                return objB;
            }
        }
        return agpu.a;
    }
}
