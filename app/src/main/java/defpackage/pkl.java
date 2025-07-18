package defpackage;

import android.content.Context;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pkl implements pjn {
    public final Context a;
    public final qbv b;
    public final yqt c;
    public final puy d;
    public final phg e;
    public final Executor f;
    public final pmq h;
    private final List i;
    private final qee j;
    private final qey l;
    private final qfq k = new qfq();
    public final zvi g = new zvi() { // from class: pkj
        @Override // defpackage.zvi
        public final zyd a(Object obj) {
            return zxn.h(pgn.SUCCESS);
        }
    };

    public pkl(Context context, qbv qbvVar, puy puyVar, Executor executor, List list, yqt yqtVar, yqt yqtVar2, phg phgVar, qey qeyVar, pmq pmqVar) {
        this.a = context;
        this.b = qbvVar;
        this.i = list;
        this.c = yqtVar;
        this.f = executor;
        this.d = puyVar;
        this.e = phgVar;
        this.l = qeyVar;
        qee.a(executor);
        this.j = new qee(executor, new pkk(yqtVar2, context));
        this.h = pmqVar;
    }

    private final zyd g(final boolean z) {
        qfr qfrVarC = qfr.c(f());
        zvi zviVar = new zvi() { // from class: pjt
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pkl pklVar = this.a;
                return pklVar.d.c(z, pklVar.g);
            }
        };
        Executor executor = this.f;
        return qfrVarC.g(zviVar, executor).g(new zvi() { // from class: pju
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return this.a.f();
            }
        }, executor).g(new zvi() { // from class: pjv
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pkl pklVar = this.a;
                return pklVar.d.c(z, pklVar.g);
            }
        }, executor);
    }

    @Override // defpackage.pjn
    public final zyd a(final pgb pgbVar) {
        final long jA = this.h.a.a();
        final zyd zydVarB = this.k.a.b(new zvh() { // from class: pkh
            @Override // defpackage.zvh
            public final zyd a() throws abxv {
                int iA;
                int i = qce.a;
                pkl pklVar = this.a;
                pklVar.e.S();
                pgr pgrVar = ((pgd) pgbVar).a;
                if ((pgrVar.b & 2) == 0) {
                    pgq pgqVar = new pgq();
                    pgqVar.B(pgrVar);
                    String packageName = pklVar.a.getPackageName();
                    if ((pgqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        pgqVar.y();
                    }
                    pgr pgrVar2 = (pgr) pgqVar.b;
                    packageName.getClass();
                    pgrVar2.b |= 2;
                    pgrVar2.d = packageName;
                    pgrVar = (pgr) pgqVar.v();
                } else if (!pklVar.a.getPackageName().equals(pgrVar.d)) {
                    qce.e("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", pgrVar.c, pklVar.a.getPackageName(), pgrVar.d);
                    return zxn.h(false);
                }
                piy piyVar = piy.a;
                pix pixVar = new pix();
                String str = pgrVar.c;
                if ((pixVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pixVar.y();
                }
                piy piyVar2 = (piy) pixVar.b;
                str.getClass();
                piyVar2.c |= 1;
                piyVar2.d = str;
                String str2 = pgrVar.d;
                if ((pixVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pixVar.y();
                }
                piy piyVar3 = (piy) pixVar.b;
                str2.getClass();
                piyVar3.c |= 2;
                piyVar3.e = str2;
                try {
                    try {
                        int i2 = pgrVar.memoizedSerializedSize;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            iA = abza.a.a(pgrVar.getClass()).a(pgrVar);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                        } else {
                            iA = i2 & Integer.MAX_VALUE;
                            if (iA == Integer.MAX_VALUE) {
                                iA = abza.a.a(pgrVar.getClass()).a(pgrVar);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                                pgrVar.memoizedSerializedSize = (pgrVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                            }
                        }
                        byte[] bArr = new byte[iA];
                        boolean z = abvz.e;
                        abvw abvwVar = new abvw(bArr, 0, iA);
                        abza.a.a(pgrVar.getClass()).m(pgrVar, abwa.a(abvwVar));
                        abvwVar.K();
                        abxd abxdVarH = abxd.h(pia.a, bArr, 0, iA, ExtensionRegistryLite.a);
                        if (abxdVarH != null) {
                            abxd abxdVar = null;
                            byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                            if (bByteValue != 1) {
                                if (bByteValue != 0) {
                                    boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                                    if (true == zL) {
                                        abxdVar = abxdVarH;
                                    }
                                    abxdVarH.cM(2, abxdVar);
                                    if (zL) {
                                    }
                                }
                                throw new abzz().a();
                            }
                        }
                        final pia piaVar = (pia) abxdVarH;
                        Stream map = Collection.EL.stream(pgrVar.f).map(new Function() { // from class: qej
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo116andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                pgp pgpVar = (pgp) obj;
                                for (phu phuVar : piaVar.o) {
                                    if (phuVar.c.equals(pgpVar.b)) {
                                        abxc abxcVar = pgz.b;
                                        MessageLite messageLite = abxcVar.a;
                                        pgp pgpVar2 = pgp.a;
                                        if (messageLite != pgpVar2) {
                                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                        }
                                        abwr abwrVar = pgpVar.n;
                                        abxb abxbVar = abxcVar.d;
                                        if (!abwrVar.n(abxbVar)) {
                                            return phuVar;
                                        }
                                        if (messageLite != pgpVar2) {
                                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                        }
                                        Object objK = pgpVar.n.k(abxbVar);
                                        pgz pgzVar = (pgz) (objK == null ? abxcVar.b : abxcVar.b(objK));
                                        phr phrVar = new phr();
                                        phrVar.B(phuVar);
                                        long j = pgzVar.d;
                                        if ((phrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            phrVar.y();
                                        }
                                        phu phuVar2 = (phu) phrVar.b;
                                        phuVar2.b |= 4;
                                        phuVar2.e = j;
                                        long j2 = pgzVar.e;
                                        if ((phrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            phrVar.y();
                                        }
                                        phu phuVar3 = (phu) phrVar.b;
                                        phuVar3.b |= 128;
                                        phuVar3.j = j2;
                                        return (phu) phrVar.v();
                                    }
                                }
                                throw new IllegalArgumentException("DataFileGroupInternal does not contain DataFile with fileId: ".concat(String.valueOf(pgpVar.b)));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i3 = yyk.e;
                        yyk yykVar = (yyk) map.collect(ywk.a);
                        phz phzVar = new phz();
                        phzVar.B(piaVar);
                        if ((Integer.MIN_VALUE & phzVar.b.memoizedSerializedSize) == 0) {
                            phzVar.y();
                        }
                        ((pia) phzVar.b).o = abzb.b;
                        phzVar.a(yykVar);
                        final pia piaVar2 = (pia) phzVar.v();
                        final puy puyVar = pklVar.d;
                        final piy piyVar4 = (piy) pixVar.v();
                        final zvi zviVar = pklVar.g;
                        String str3 = piyVar4.d;
                        return zud.h(zuz.h(puyVar.d(), wyo.c(new zvi() { // from class: puu
                            /* JADX WARN: Code restructure failed: missing block: B:141:0x020c, code lost:
                            
                                r2 = r10.c;
                                r3 = r13.c;
                                r4 = new java.lang.Object[4];
                                r4[r19 == true ? 1 : 0] = "DataFileGroupValidator";
                                r4[1] = r12;
                                r4[2] = r2;
                                r4[r23] = r3;
                                defpackage.qce.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", r4);
                                r19 = r19;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:148:0x0252, code lost:
                            
                                r19 = r8;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:149:0x0255, code lost:
                            
                                r19 = r8;
                                r23 = 3;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:150:0x0259, code lost:
                            
                                r2 = r0.e;
                                r3 = r10.c;
                                r4 = new java.lang.Object[r23];
                                r4[r19 == true ? 1 : 0] = "DataFileGroupValidator";
                                r4[1] = r2;
                                r4[2] = r3;
                                defpackage.qce.e("%s File details missing in added group = %s, file id = %s", r4);
                                r19 = r19;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:176:0x02eb  */
                            /* JADX WARN: Removed duplicated region for block: B:90:0x015c  */
                            /* JADX WARN: Removed duplicated region for block: B:99:0x017a  */
                            @Override // defpackage.zvi
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final defpackage.zyd a(java.lang.Object r23) throws java.security.NoSuchAlgorithmException, defpackage.pnk, defpackage.pyg {
                                /*
                                    Method dump skipped, instructions count: 1240
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.puu.a(java.lang.Object):zyd");
                            }
                        }), puyVar.n), IOException.class, wyo.c(new zvi() { // from class: pjz
                            @Override // defpackage.zvi
                            public final zyd a(Object obj) {
                                qce.g((IOException) obj, "%s: IOException while adding group for download", "MobileDataDownload");
                                return zxn.h(false);
                            }
                        }), pklVar.f);
                    } catch (IOException e) {
                        throw new RuntimeException(a.C(pgrVar, "byte array"), e);
                    }
                } catch (abxv e2) {
                    qce.g(e2, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
                    return zxn.h(false);
                }
            }
        }, this.f);
        zqf zqfVar = zqf.a;
        zqe zqeVar = new zqe();
        pgr pgrVar = ((pgd) pgbVar).a;
        String str = pgrVar.c;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar2 = (zqf) zqeVar.b;
        str.getClass();
        zqfVar2.b |= 1;
        zqfVar2.c = str;
        long j = pgrVar.g;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar3 = (zqf) zqeVar.b;
        zqfVar3.b |= 64;
        zqfVar3.i = j;
        String str2 = pgrVar.h;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar4 = (zqf) zqeVar.b;
        str2.getClass();
        zqfVar4.b |= 128;
        zqfVar4.j = str2;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar5 = (zqf) zqeVar.b;
        zqfVar5.b |= 32;
        zqfVar5.h = false;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar6 = (zqf) zqeVar.b;
        zqfVar6.b |= 256;
        zqfVar6.k = false;
        int i = pgrVar.e;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar7 = (zqf) zqeVar.b;
        zqfVar7.b |= 2;
        zqfVar7.d = i;
        String str3 = pgrVar.d;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar8 = (zqf) zqeVar.b;
        str3.getClass();
        zqfVar8.b |= 4;
        zqfVar8.e = str3;
        int size = pgrVar.f.size();
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar9 = (zqf) zqeVar.b;
        zqfVar9.b |= 8;
        zqfVar9.f = size;
        final zqf zqfVar10 = (zqf) zqeVar.v();
        final pki pkiVar = new pki(zqfVar10);
        zydVarB.d(wyo.h(new Runnable() { // from class: pjs
            @Override // java.lang.Runnable
            public final void run() {
                final pkl pklVar = this.a;
                final long jA2 = pklVar.h.a.a() - jA;
                final zqf zqfVar11 = zqfVar10;
                final zyd zydVar = zydVarB;
                final pki pkiVar2 = pkiVar;
                zxn.j(wyo.h(new Runnable() { // from class: pka
                    /* JADX WARN: Removed duplicated region for block: B:38:0x0052  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[PHI: r0
  0x0011: PHI (r0v11 java.lang.Object) = (r0v2 java.lang.Object), (r0v12 java.lang.Object) binds: [B:34:0x004a, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 238
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.pka.run():void");
                    }
                }), pklVar.f);
            }
        }), zwk.a);
        return zydVarB;
    }

    @Override // defpackage.pjn
    public final zyd b(final yqt yqtVar) {
        return this.k.a.a(new Callable() { // from class: pjy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pkl pklVar = this.a;
                yqt yqtVar2 = pklVar.c;
                if (!yqtVar2.g()) {
                    qce.c("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                    return null;
                }
                yqt yqtVar3 = yqtVar;
                pks pksVar = (pks) yqtVar2.c();
                yyn yynVar = new yyn(4);
                phg phgVar = pklVar.e;
                yynVar.c("MDD.CHARGING.PERIODIC.TASK", pkt.a(phgVar.w()));
                yynVar.c("MDD.MAINTENANCE.PERIODIC.GCM.TASK", pkt.a(phgVar.v()));
                yynVar.c("MDD.CELLULAR.CHARGING.PERIODIC.TASK", pkt.a(phgVar.u()));
                yynVar.c("MDD.WIFI.CHARGING.PERIODIC.TASK", pkt.a(phgVar.x()));
                yyr yyrVarA = yynVar.a(true);
                pksVar.a("MDD.CHARGING.PERIODIC.TASK", phgVar.r(), 3, pklVar.e(yqtVar3, yyrVarA, "MDD.CHARGING.PERIODIC.TASK"));
                pksVar.a("MDD.MAINTENANCE.PERIODIC.GCM.TASK", phgVar.s(), 3, pklVar.e(yqtVar3, yyrVarA, "MDD.MAINTENANCE.PERIODIC.GCM.TASK"));
                pksVar.a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", phgVar.q(), 1, pklVar.e(yqtVar3, yyrVarA, "MDD.CELLULAR.CHARGING.PERIODIC.TASK"));
                pksVar.a("MDD.WIFI.CHARGING.PERIODIC.TASK", phgVar.t(), 2, pklVar.e(yqtVar3, yyrVarA, "MDD.WIFI.CHARGING.PERIODIC.TASK"));
                return null;
            }
        }, this.f);
    }

    @Override // defpackage.pjn
    public final void c(final String str) {
        int i = qce.a;
        zuz.h(this.j.b(str), wyo.c(new zvi() { // from class: pkc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                yqt yqtVar = (yqt) obj;
                if (yqtVar.g()) {
                    int i2 = qce.a;
                    ((zyd) yqtVar.c()).cancel(false);
                }
                return zxy.a;
            }
        }), this.f);
        final qey qeyVar = this.l;
        final qee qeeVar = qeyVar.c;
        zyd zydVarA = qeeVar.a.a.a(new Callable() { // from class: qdy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(qeeVar.d.containsKey(str));
            }
        }, qeeVar.b);
        zvi zviVarC = wyo.c(new zvi() { // from class: qew
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qey qeyVar2 = qeyVar;
                return (zBooleanValue ? qeyVar2.c : qeyVar2.b).b(str);
            }
        });
        Executor executor = qeyVar.a;
        zuz.h(zuz.h(zydVarA, zviVarC, executor), wyo.c(new zvi() { // from class: qev
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                yqt yqtVar = (yqt) obj;
                if (yqtVar.g()) {
                    int i2 = qce.a;
                    ((zyd) yqtVar.c()).cancel(false);
                }
                return zxy.a;
            }
        }), executor);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    @Override // defpackage.pjn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd d(final java.lang.String r4, defpackage.yqt r5) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -2105562759: goto L44;
                case -1202768674: goto L36;
                case -69128772: goto L16;
                case 437964371: goto L8;
                default: goto L7;
            }
        L7:
            goto L5e
        L8:
            java.lang.String r0 = "MDD.WIFI.CHARGING.PERIODIC.TASK"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 1
            zyd r0 = r3.g(r0)
            goto L6f
        L16:
            java.lang.String r0 = "MDD.CHARGING.PERIODIC.TASK"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            zyd r0 = r3.f()
            pjx r1 = new pjx
            r1.<init>()
            zvi r1 = defpackage.wyo.c(r1)
            java.util.concurrent.Executor r2 = r3.f
            zvi r1 = defpackage.wyo.c(r1)
            zyd r0 = defpackage.zuz.h(r0, r1, r2)
            goto L6f
        L36:
            java.lang.String r0 = "MDD.CELLULAR.CHARGING.PERIODIC.TASK"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            r0 = 0
            zyd r0 = r3.g(r0)
            goto L6f
        L44:
            java.lang.String r0 = "MDD.MAINTENANCE.PERIODIC.GCM.TASK"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L5e
            qfq r0 = r3.k
            puy r1 = r3.d
            pjw r2 = new pjw
            r2.<init>()
            java.util.concurrent.Executor r1 = r3.f
            wzw r0 = r0.a
            zyd r0 = r0.b(r2, r1)
            goto L6f
        L5e:
            int r0 = defpackage.qce.a
            java.lang.String r0 = "Unknown task tag sent to MDD.handleTask() "
            java.lang.String r0 = r0.concat(r4)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            zyd r0 = defpackage.zxn.g(r1)
        L6f:
            pkd r1 = new pkd
            r1.<init>()
            yqt r5 = r5.b(r1)
            qfr r0 = defpackage.qfr.c(r0)
            pke r1 = new pke
            r1.<init>()
            java.util.concurrent.Executor r2 = r3.f
            qfr r0 = r0.g(r1, r2)
            pkf r1 = new pkf
            r1.<init>()
            java.lang.Class<java.lang.Exception> r4 = java.lang.Exception.class
            qfr r4 = r0.b(r4, r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkl.d(java.lang.String, yqt):zyd");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final yqt e(yqt yqtVar, Map map, String str) {
        ?? r2 = ((yqz) yqtVar).a;
        return r2.containsKey(str) ? yqt.h((pkq) r2.get(str)) : yqt.h((pkq) map.get(str));
    }

    public final zyd f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            arrayList.add(((phe) it.next()).a(this));
        }
        return qft.a(arrayList).a(new Callable() { // from class: pkg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, this.f);
    }
}
