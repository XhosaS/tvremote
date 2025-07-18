package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rlo {
    public static volatile rkm a;
    private static final unr b = new unr(riw.a);
    private static final Object c = new Object();
    private static volatile ujq d = null;

    private rlo() {
    }

    public static ujk a(rfr rfrVar) {
        ujl ujlVarH = ujm.h();
        int i = uem.b;
        uel uelVar = new uel(rfrVar.d);
        uem.b("phenotype");
        uelVar.c = "phenotype";
        uelVar.b("all_accounts.pb");
        ujlVarH.e(uelVar.a());
        ujlVarH.d(riw.a);
        ((uia) ujlVarH).b = yqt.i(b);
        ujlVarH.c();
        ujm ujmVarA = ujlVarH.a();
        ujq ujqVar = d;
        if (ujqVar == null) {
            synchronized (c) {
                ujqVar = d;
                if (ujqVar == null) {
                    uoe uoeVar = uoe.a;
                    HashMap map = new HashMap();
                    zyh zyhVarE = rfrVar.e();
                    ueg uegVarC = rfrVar.c();
                    ujr.a(umr.a, map);
                    ujq ujqVar2 = new ujq(zyhVarE, uegVarC, uoeVar, map, null);
                    d = ujqVar2;
                    ujqVar = ujqVar2;
                }
            }
        }
        return ujqVar.a(ujmVarA);
    }

    public static zyd b(rfr rfrVar, final String str, final String str2) {
        return a(rfrVar).a(new yqi() { // from class: rll
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                riw riwVar = (riw) obj;
                rkm rkmVar = rlo.a;
                String str3 = str;
                riq riqVar = riq.a;
                str3.getClass();
                abyl abylVar = riwVar.b;
                if (abylVar.containsKey(str3)) {
                    riqVar = (riq) abylVar.get(str3);
                }
                String str4 = str2;
                rip ripVar = new rip();
                ripVar.B(riqVar);
                if (!DesugarCollections.unmodifiableList(((riq) ripVar.b).c).contains(str4)) {
                    ripVar.a(str4);
                }
                riv rivVar = new riv();
                rivVar.B(riwVar);
                if ((ripVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ripVar.y();
                }
                riq riqVar2 = (riq) ripVar.b;
                str4.getClass();
                riqVar2.b |= 1;
                riqVar2.d = str4;
                rivVar.a(str3, (riq) ripVar.v());
                return (riw) rivVar.v();
            }
        }, rfrVar.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r4 = r1
            r3 = r2
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = c(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlo.c(java.io.File):boolean");
    }
}
