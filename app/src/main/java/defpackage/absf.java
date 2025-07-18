package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class absf {
    public static final /* synthetic */ int b = 0;
    private static final yzq c = yzq.u(abrd.TRUST_SAFETY_ANTI_FRAUD, abrd.TRUST_SAFETY_SECURITY, abrd.COMPLIANCE_LEGAL_SUPPORT, abrd.USER_SUPPORT, abrd.VERIFICATION_TESTING_VALIDATION, abrd.INFRASTRUCTURE_METRICS, abrd.PROVISION_OF_SERVICE_INFRASTRUCTURE, abrd.LIMITED_MANUAL_ACCESS, abrd.TRUST_SAFETY_ANTI_ABUSE, abrd.COMPLIANCE_LEGAL_SUPPORT_TAKEOUT, abrd.CLOUD_PROCESSING_INFRASTRUCTURE);
    private static final yzq d = yzq.s(abrd.DATA_RECOVERY, abrd.COMPLIANCE_LEGAL_SUPPORT_ELI, abrd.COMPLIANCE_LEGAL_SUPPORT_TAKEOUT_LEGAL, abrd.COMPLIANCE_LEGAL_SUPPORT_TAKEOUT_CONSUMER);
    private static final yzq e = yzq.s(abqn.DATA_USAGE_ADSPAM, abqn.DATA_USAGE_PRIVACY_CONTROL_NEEDS_PRIVACY_APPROVAL, abqn.DATA_USAGE_A1_INFRA_DMA52_POLICY_CONTROL_CARVE_OUT_NEEDS_PRIVACY_APPROVAL, abqn.DATA_USAGE_POLICY_CONTROL_NEEDS_PRIVACY_APPROVAL);
    private static final yzq f = yzq.r(abqn.DATA_USAGE_INFRASTRUCTURE_METRICS_NEEDS_PRIVACY_APPROVAL, abqn.DATA_USAGE_PROVISION_OF_SERVICE_INFRASTRUCTURE_NEEDS_PRIVACY_APPROVAL, abqn.DATA_USAGE_VERIFICATION_TESTING_VALIDATION_NEEDS_PRIVACY_APPROVAL);
    public final abss a;
    private final abun g;

    public absf(abss abssVar, abun abunVar) {
        this.a = abssVar;
        this.g = abunVar;
    }

    static /* synthetic */ abuf d(zyd zydVar) {
        try {
            boolean zBooleanValue = ((Boolean) zxn.o(zydVar)).booleanValue();
            int i = zBooleanValue ? 2 : 3;
            int i2 = true != zBooleanValue ? 29 : 26;
            abuf abufVar = abuf.a;
            abue abueVar = new abue();
            if ((abueVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abueVar.y();
            }
            abuf abufVar2 = (abuf) abueVar.b;
            abufVar2.c = i - 1;
            abufVar2.b |= 1;
            int i3 = i2 - 2;
            if ((abueVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abueVar.y();
            }
            abuf abufVar3 = (abuf) abueVar.b;
            abufVar3.b |= 2;
            abufVar3.d = i3;
            return (abuf) abueVar.v();
        } catch (CancellationException | ExecutionException unused) {
            abuf abufVar4 = abuf.a;
            abue abueVar2 = new abue();
            if ((Integer.MIN_VALUE & abueVar2.b.memoizedSerializedSize) == 0) {
                abueVar2.y();
            }
            abuf abufVar5 = (abuf) abueVar2.b;
            abufVar5.c = 2;
            abufVar5.b = 1 | abufVar5.b;
            return (abuf) abueVar2.v();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.zyd e(final java.util.List r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            abun r1 = r9.g
            java.lang.String r1 = r1.c
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 4
            switch(r2) {
                case 739513805: goto L1d;
                case 739513806: goto L13;
                default: goto L12;
            }
        L12:
            goto L27
        L13:
            java.lang.String r2 = "dma52_data_sharing_v6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L27
            r1 = r4
            goto L28
        L1d:
            java.lang.String r2 = "dma52_data_sharing_v5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L27
            r1 = r3
            goto L28
        L27:
            r1 = 2
        L28:
            yyn r2 = new yyn
            r2.<init>(r4)
            java.util.Iterator r5 = r10.iterator()
        L31:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L31
            int r7 = r6.intValue()
            abqp r7 = defpackage.abtk.a(r7)
            if (r1 != r3) goto L52
            yyr r8 = defpackage.abtk.a
            java.lang.Object r7 = r8.getOrDefault(r6, r7)
            abqp r7 = (defpackage.abqp) r7
            goto L5c
        L52:
            if (r1 != r4) goto L5c
            yyr r8 = defpackage.abtk.b
            java.lang.Object r7 = r8.getOrDefault(r6, r7)
            abqp r7 = (defpackage.abqp) r7
        L5c:
            if (r7 == 0) goto L31
            int r7 = r7.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.c(r6, r7)
            goto L31
        L6a:
            r1 = 0
            yyr r1 = r2.a(r1)
            zyd r1 = defpackage.zxn.h(r1)
            abse r2 = new abse
            r2.<init>()
            zwk r10 = defpackage.zwk.a
            zyd r10 = defpackage.zuz.g(r1, r2, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absf.e(java.util.List):zyd");
    }

    public final zyd a(acqg acqgVar, abtx abtxVar) {
        return zuz.g(e(abrx.a(acqgVar, abtxVar)), new absa(), zwk.a);
    }

    public final zyd b(abtx abtxVar) {
        abub abubVar = abtxVar.c;
        if (abubVar == null) {
            abubVar = abub.a;
        }
        return zuz.g(e(abubVar.d), new absa(), zwk.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0147 A[Catch: RuntimeException -> 0x0276, TryCatch #0 {RuntimeException -> 0x0276, blocks: (B:3:0x0004, B:7:0x0014, B:9:0x002b, B:11:0x0032, B:13:0x0036, B:14:0x0038, B:16:0x003c, B:17:0x003e, B:19:0x0043, B:21:0x0047, B:22:0x0049, B:24:0x004d, B:25:0x004f, B:27:0x0054, B:29:0x005b, B:30:0x0061, B:32:0x0067, B:33:0x006f, B:70:0x00e4, B:71:0x00e6, B:82:0x00fb, B:84:0x0103, B:100:0x0147, B:102:0x014f, B:103:0x015c, B:105:0x0162, B:107:0x0170, B:115:0x0191, B:111:0x0177, B:113:0x0181, B:93:0x0127, B:96:0x012d, B:98:0x0137, B:89:0x010d, B:91:0x0117, B:117:0x0199, B:119:0x01a7, B:120:0x01aa, B:122:0x01bc, B:123:0x01bf, B:35:0x0075, B:36:0x0079, B:37:0x007d, B:38:0x0081, B:39:0x0085, B:40:0x0089, B:41:0x008d, B:42:0x0091, B:43:0x0095, B:44:0x0098, B:45:0x009b, B:46:0x009e, B:47:0x00a1, B:48:0x00a4, B:49:0x00a7, B:50:0x00aa, B:51:0x00ad, B:52:0x00b0, B:53:0x00b3, B:54:0x00b6, B:55:0x00b9, B:56:0x00bc, B:57:0x00bf, B:58:0x00c2, B:59:0x00c5, B:60:0x00c8, B:61:0x00cb, B:62:0x00ce, B:63:0x00d1, B:64:0x00d4, B:65:0x00d7, B:66:0x00da, B:67:0x00dd, B:68:0x00e0, B:125:0x01d5, B:127:0x01d9, B:129:0x01fa, B:131:0x0208, B:132:0x020b, B:134:0x021d, B:135:0x0220, B:28:0x0059, B:137:0x0238, B:139:0x0246, B:140:0x0249, B:142:0x025b, B:143:0x025e, B:10:0x0030), top: B:150:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014f A[Catch: RuntimeException -> 0x0276, TryCatch #0 {RuntimeException -> 0x0276, blocks: (B:3:0x0004, B:7:0x0014, B:9:0x002b, B:11:0x0032, B:13:0x0036, B:14:0x0038, B:16:0x003c, B:17:0x003e, B:19:0x0043, B:21:0x0047, B:22:0x0049, B:24:0x004d, B:25:0x004f, B:27:0x0054, B:29:0x005b, B:30:0x0061, B:32:0x0067, B:33:0x006f, B:70:0x00e4, B:71:0x00e6, B:82:0x00fb, B:84:0x0103, B:100:0x0147, B:102:0x014f, B:103:0x015c, B:105:0x0162, B:107:0x0170, B:115:0x0191, B:111:0x0177, B:113:0x0181, B:93:0x0127, B:96:0x012d, B:98:0x0137, B:89:0x010d, B:91:0x0117, B:117:0x0199, B:119:0x01a7, B:120:0x01aa, B:122:0x01bc, B:123:0x01bf, B:35:0x0075, B:36:0x0079, B:37:0x007d, B:38:0x0081, B:39:0x0085, B:40:0x0089, B:41:0x008d, B:42:0x0091, B:43:0x0095, B:44:0x0098, B:45:0x009b, B:46:0x009e, B:47:0x00a1, B:48:0x00a4, B:49:0x00a7, B:50:0x00aa, B:51:0x00ad, B:52:0x00b0, B:53:0x00b3, B:54:0x00b6, B:55:0x00b9, B:56:0x00bc, B:57:0x00bf, B:58:0x00c2, B:59:0x00c5, B:60:0x00c8, B:61:0x00cb, B:62:0x00ce, B:63:0x00d1, B:64:0x00d4, B:65:0x00d7, B:66:0x00da, B:67:0x00dd, B:68:0x00e0, B:125:0x01d5, B:127:0x01d9, B:129:0x01fa, B:131:0x0208, B:132:0x020b, B:134:0x021d, B:135:0x0220, B:28:0x0059, B:137:0x0238, B:139:0x0246, B:140:0x0249, B:142:0x025b, B:143:0x025e, B:10:0x0030), top: B:150:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd c(defpackage.abtq r13, final defpackage.abud r14, final defpackage.abtx r15) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absf.c(abtq, abud, abtx):zyd");
    }
}
