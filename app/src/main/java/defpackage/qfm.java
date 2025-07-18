package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfm implements phe {
    private final String a = "com.google.android.googlequicksearchbox";
    private final String b = "8498";

    @Deprecated
    public qfm() {
    }

    @Override // defpackage.phe
    public final zyd a(final pjn pjnVar) {
        int i = qce.a;
        rgg rggVar = new rgg(rff.a(this.a));
        pgx pgxVar = pgx.a;
        rgf rgfVar = new rgf() { // from class: qfh
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r2 != false) goto L17;
             */
            @Override // defpackage.rgf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(byte[] r5) throws defpackage.abxv {
                /*
                    r4 = this;
                    pgx r0 = defpackage.pgx.a
                    int r1 = r5.length
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    abza r2 = defpackage.abza.a
                    com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                    r3 = 0
                    abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                    if (r5 == 0) goto L44
                    r0 = 1
                    r1 = 0
                    java.lang.Object r2 = r5.cM(r0, r1)
                    java.lang.Byte r2 = (java.lang.Byte) r2
                    byte r2 = r2.byteValue()
                    if (r2 != r0) goto L1f
                    goto L44
                L1f:
                    if (r2 == 0) goto L3a
                    abza r2 = defpackage.abza.a
                    java.lang.Class r3 = r5.getClass()
                    abzj r2 = r2.a(r3)
                    boolean r2 = r2.l(r5)
                    if (r0 == r2) goto L32
                    goto L33
                L32:
                    r1 = r5
                L33:
                    r0 = 2
                    r5.cM(r0, r1)
                    if (r2 == 0) goto L3a
                    goto L44
                L3a:
                    abzz r5 = new abzz
                    r5.<init>()
                    abxv r5 = r5.a()
                    throw r5
                L44:
                    pgx r5 = (defpackage.pgx) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qfh.a(byte[]):java.lang.Object");
            }
        };
        AtomicInteger atomicInteger = rgi.b;
        pgx pgxVar2 = (pgx) new rgd(rggVar, this.b, pgxVar, rgfVar).b();
        ArrayList arrayList = new ArrayList();
        for (final pgv pgvVar : pgxVar2.b) {
            rgd rgdVar = new rgd(rggVar, pgvVar.b, null, new rgf() { // from class: qfi
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
                
                    if (r2 != false) goto L17;
                 */
                @Override // defpackage.rgf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(byte[] r5) throws defpackage.abxv {
                    /*
                        r4 = this;
                        pgr r0 = defpackage.pgr.a
                        int r1 = r5.length
                        com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                        abza r2 = defpackage.abza.a
                        com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                        r3 = 0
                        abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                        if (r5 == 0) goto L44
                        r0 = 1
                        r1 = 0
                        java.lang.Object r2 = r5.cM(r0, r1)
                        java.lang.Byte r2 = (java.lang.Byte) r2
                        byte r2 = r2.byteValue()
                        if (r2 != r0) goto L1f
                        goto L44
                    L1f:
                        if (r2 == 0) goto L3a
                        abza r2 = defpackage.abza.a
                        java.lang.Class r3 = r5.getClass()
                        abzj r2 = r2.a(r3)
                        boolean r2 = r2.l(r5)
                        if (r0 == r2) goto L32
                        goto L33
                    L32:
                        r1 = r5
                    L33:
                        r0 = 2
                        r5.cM(r0, r1)
                        if (r2 == 0) goto L3a
                        goto L44
                    L3a:
                        abzz r5 = new abzz
                        r5.<init>()
                        abxv r5 = r5.a()
                        throw r5
                    L44:
                        pgr r5 = (defpackage.pgr) r5
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.qfi.a(byte[]):java.lang.Object");
                }
            });
            zyd zydVarH = zxn.h(ypv.a);
            if (rgdVar.b() != null && !((pgr) rgdVar.b()).c.isEmpty()) {
                zydVarH = zxn.h(yqt.i((pgr) rgdVar.b()));
            }
            zvi zviVar = new zvi() { // from class: qfj
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    yqt yqtVar = (yqt) obj;
                    if (!yqtVar.g() || ((pgr) yqtVar.c()).c.isEmpty()) {
                        String str = pgvVar.b;
                        int i2 = qce.a;
                        return zxn.h(false);
                    }
                    ypv ypvVar = ypv.a;
                    return pjnVar.a(new pgd((pgr) yqtVar.c(), ypvVar, ypvVar));
                }
            };
            zwk zwkVar = zwk.a;
            zyd zydVarH2 = zuz.h(zydVarH, wyo.c(zviVar), zwkVar);
            zxn.p(zydVarH2, wyo.f(new qfl(rgdVar)), zwkVar);
            arrayList.add(zydVarH2);
        }
        return qft.a(arrayList).a(new Callable() { // from class: qfk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zwk.a);
    }
}
