package defpackage;

import android.content.Context;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcr implements qbv {
    public final phg a;
    public yqt b = ypv.a;
    private final Context c;
    private final String d;
    private final qcc e;
    private final qfa f;

    public qcr(Context context, qfa qfaVar, qcc qccVar, phg phgVar) {
        this.c = context;
        this.f = qfaVar;
        this.d = context.getPackageName();
        this.e = qccVar;
        this.a = phgVar;
    }

    private final zyd s(final int i, final zvh zvhVar, final int i2) {
        return zuz.h(this.e.a(i2, this.b), wyo.c(new zvi() { // from class: qcm
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final yqt yqtVar = (yqt) obj;
                if (!yqtVar.g()) {
                    return zxy.a;
                }
                final int i3 = i2;
                final int i4 = i;
                zvh zvhVar2 = zvhVar;
                final qcr qcrVar = this.a;
                return qfr.c(zvhVar2.a()).e(new yqi() { // from class: qcg
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        List<zqj> list = (List) obj2;
                        if (list == null) {
                            return null;
                        }
                        for (zqj zqjVar : list) {
                            yqt yqtVar2 = yqtVar;
                            int i5 = i3;
                            int i6 = i4;
                            qcr qcrVar2 = qcrVar;
                            zqi zqiVar = new zqi();
                            zqiVar.B(zqjVar);
                            qcrVar2.q(i6, zqiVar, i5, (zrv) yqtVar2.c());
                        }
                        return null;
                    }
                }, zwk.a);
            }
        }), zwk.a);
    }

    private final void t(int i, zqi zqiVar, long j) {
        zrv zrvVar = zrv.a;
        zru zruVar = new zru();
        if ((zruVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zruVar.y();
        }
        zrv zrvVar2 = (zrv) zruVar.b;
        zrvVar2.b |= 1;
        zrvVar2.c = false;
        q(i, zqiVar, j, (zrv) zruVar.v());
    }

    @Override // defpackage.qbv
    public final zyd a(final zvh zvhVar) {
        return s(1046, new zvh() { // from class: qcn
            @Override // defpackage.zvh
            public final zyd a() {
                zyd zydVarA = zvhVar.a();
                yqi yqiVar = new yqi() { // from class: qci
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        ArrayList arrayList = new ArrayList();
                        for (qbu qbuVar : (List) obj) {
                            zqj zqjVar = zqj.a;
                            zqi zqiVar = new zqi();
                            zqv zqvVarB = qbuVar.b();
                            if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqiVar.y();
                            }
                            zqj zqjVar2 = (zqj) zqiVar.b;
                            zqjVar2.h = zqvVarB;
                            zqjVar2.b |= Integer.MIN_VALUE;
                            zqf zqfVarA = qbuVar.a();
                            if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqiVar.y();
                            }
                            zqj zqjVar3 = (zqj) zqiVar.b;
                            zqjVar3.e = zqfVarA;
                            zqjVar3.b |= 256;
                            arrayList.add((zqj) zqiVar.v());
                        }
                        return arrayList;
                    }
                };
                return zuz.g(zydVarA, wyo.a(yqiVar), zwk.a);
            }
        }, this.a.i());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qcf] */
    @Override // defpackage.qbv
    public final zyd b(final String str, final yqt yqtVar, final yqt yqtVar2) {
        zyd zydVarH = zxn.h(ypv.a);
        if (this.b.g()) {
            zydVarH = this.b.c().c(str);
        }
        qfr qfrVarC = qfr.c(zydVarH);
        yqi yqiVar = new yqi() { // from class: qck
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int iB;
                yqt yqtVar3 = (yqt) obj;
                zqn zqnVar = zqn.a;
                zqm zqmVar = new zqm();
                if ((zqmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zqmVar.y();
                }
                yqt yqtVar4 = yqtVar2;
                String str2 = str;
                zqn zqnVar2 = (zqn) zqmVar.b;
                zqnVar2.b |= 1;
                zqnVar2.c = str2;
                if (yqtVar4.g()) {
                    zrn zrnVar = (zrn) yqtVar4.c();
                    if ((zqmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zqmVar.y();
                    }
                    zqn zqnVar3 = (zqn) zqmVar.b;
                    zqnVar3.g = zrnVar;
                    zqnVar3.b |= 32;
                }
                if (yqtVar3.g()) {
                    long jLongValue = ((Long) yqtVar3.c()).longValue();
                    if ((zqmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zqmVar.y();
                    }
                    zqn zqnVar4 = (zqn) zqmVar.b;
                    zqnVar4.b |= 2;
                    zqnVar4.d = jLongValue;
                }
                yqt yqtVar5 = yqtVar;
                if (yqtVar5.g()) {
                    String simpleName = yqtVar5.c().getClass().getSimpleName();
                    if ((zqmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zqmVar.y();
                    }
                    zqn zqnVar5 = (zqn) zqmVar.b;
                    simpleName.getClass();
                    zqnVar5.b |= 4;
                    zqnVar5.e = simpleName;
                    if (((Throwable) yqtVar5.c()).getCause() != null) {
                        String simpleName2 = ((Throwable) yqtVar5.c()).getCause().getClass().getSimpleName();
                        if ((zqmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqmVar.y();
                        }
                        zqn zqnVar6 = (zqn) zqmVar.b;
                        simpleName2.getClass();
                        zqnVar6.b |= 8;
                        zqnVar6.f = simpleName2;
                    }
                    if ((yqtVar5.c() instanceof phc) && (iB = zsb.b(((phc) yqtVar5.c()).a.aF)) != 0) {
                        if ((zqmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqmVar.y();
                        }
                        zqn zqnVar7 = (zqn) zqmVar.b;
                        zqnVar7.h = zsb.a(iB);
                        zqnVar7.b |= 64;
                    }
                }
                return (zqn) zqmVar.v();
            }
        };
        zwk zwkVar = zwk.a;
        return zuz.g(qfrVarC.e(yqiVar, zwkVar), wyo.a(new yqi() { // from class: qcl
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                zqn zqnVar = (zqn) obj;
                zqj zqjVar = zqj.a;
                zqi zqiVar = new zqi();
                if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zqiVar.y();
                }
                qcr qcrVar = this.a;
                zqj zqjVar2 = (zqj) zqiVar.b;
                zqnVar.getClass();
                zqjVar2.w = zqnVar;
                zqjVar2.d |= 32768;
                qcrVar.r(1120, zqiVar, qcrVar.a.k());
                return null;
            }
        }), zwkVar);
    }

    @Override // defpackage.qbv
    public final zyd c(final zvh zvhVar) {
        return s(1058, new zvh() { // from class: qco
            @Override // defpackage.zvh
            public final zyd a() {
                zyd zydVarA = zvhVar.a();
                yqi yqiVar = new yqi() { // from class: qcj
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        zrd zrdVar = (zrd) obj;
                        zqj[] zqjVarArr = new zqj[1];
                        zqj zqjVar = zqj.a;
                        zqi zqiVar = new zqi();
                        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqiVar.y();
                        }
                        zqj zqjVar2 = (zqj) zqiVar.b;
                        zrdVar.getClass();
                        zqjVar2.l = zrdVar;
                        zqjVar2.c |= 65536;
                        zqjVarArr[0] = (zqj) zqiVar.v();
                        return Arrays.asList(zqjVarArr);
                    }
                };
                return zuz.g(zydVarA, wyo.a(yqiVar), zwk.a);
            }
        }, this.a.m());
    }

    @Override // defpackage.qbv
    public final zyd d(final zvh zvhVar) {
        return s(1057, new zvh() { // from class: qcp
            @Override // defpackage.zvh
            public final zyd a() {
                zyd zydVarA = zvhVar.a();
                yqi yqiVar = new yqi() { // from class: qch
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        zrh zrhVar = (zrh) obj;
                        zqj[] zqjVarArr = new zqj[1];
                        zqj zqjVar = zqj.a;
                        zqi zqiVar = new zqi();
                        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqiVar.y();
                        }
                        zqj zqjVar2 = (zqj) zqiVar.b;
                        zrhVar.getClass();
                        zqjVar2.j = zrhVar;
                        zqjVar2.c |= 8192;
                        zqjVarArr[0] = (zqj) zqiVar.v();
                        return Arrays.asList(zqjVarArr);
                    }
                };
                return zuz.g(zydVarA, wyo.a(yqiVar), zwk.a);
            }
        }, this.a.o());
    }

    @Override // defpackage.qbv
    public final void e(zql zqlVar) {
        long j = this.a.j();
        if (qce.a(j)) {
            zqj zqjVar = zqj.a;
            zqi zqiVar = new zqi();
            if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zqiVar.y();
            }
            zqj zqjVar2 = (zqj) zqiVar.b;
            zqlVar.getClass();
            zqjVar2.q = zqlVar;
            zqjVar2.d |= 4;
            t(1075, zqiVar, j);
        }
    }

    @Override // defpackage.qbv
    public final void f(zqf zqfVar, zqp zqpVar) {
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zqpVar.getClass();
        zqjVar2.r = zqpVar;
        zqjVar2.d |= 8;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar3 = (zqj) zqiVar.b;
        zqfVar.getClass();
        zqjVar3.e = zqfVar;
        zqjVar3.b |= 256;
        r(1082, zqiVar, this.a.k());
    }

    @Override // defpackage.qbv
    public final void g(zqx zqxVar) {
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zqxVar.getClass();
        zqjVar2.s = zqxVar;
        zqjVar2.d |= 256;
        r(1110, zqiVar, this.a.e());
    }

    @Override // defpackage.qbv
    public final void h(zqf zqfVar, int i) {
        zrf zrfVar = zrf.a;
        zre zreVar = new zre();
        if ((zreVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zreVar.y();
        }
        zrf zrfVar2 = (zrf) zreVar.b;
        zrfVar2.b |= 1;
        zrfVar2.c = i;
        zrf zrfVar3 = (zrf) zreVar.v();
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zrfVar3.getClass();
        zqjVar2.u = zrfVar3;
        zqjVar2.d |= 2048;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar3 = (zqj) zqiVar.b;
        zqfVar.getClass();
        zqjVar3.e = zqfVar;
        zqjVar3.b |= 256;
        r(1117, zqiVar, this.a.k());
    }

    @Override // defpackage.qbv
    public final void i(zqf zqfVar, zrp zrpVar) {
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zrpVar.getClass();
        zqjVar2.t = zrpVar;
        zqjVar2.d |= 512;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar3 = (zqj) zqiVar.b;
        zqfVar.getClass();
        zqjVar3.e = zqfVar;
        zqjVar3.b |= 256;
        r(1018, zqiVar, this.a.k());
    }

    @Override // defpackage.qbv
    public final void j(int i, int i2) {
        zqj zqjVar = zqj.a;
        t(i, new zqi(), i2);
    }

    @Override // defpackage.qbv
    public final void k(int i) {
        zqj zqjVar = zqj.a;
        r(i, new zqi(), this.a.k());
    }

    @Override // defpackage.qbv
    public final void l(int i, String str, int i2, long j, String str2) {
        zqf zqfVar = zqf.a;
        zqe zqeVar = new zqe();
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar2 = (zqf) zqeVar.b;
        str.getClass();
        zqfVar2.b |= 1;
        zqfVar2.c = str;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar3 = (zqf) zqeVar.b;
        zqfVar3.b |= 2;
        zqfVar3.d = i2;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar4 = (zqf) zqeVar.b;
        zqfVar4.b |= 64;
        zqfVar4.i = j;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar5 = (zqf) zqeVar.b;
        str2.getClass();
        zqfVar5.b |= 128;
        zqfVar5.j = str2;
        zqf zqfVar6 = (zqf) zqeVar.v();
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zqfVar6.getClass();
        zqjVar2.e = zqfVar6;
        zqjVar2.b |= 256;
        r(i, zqiVar, this.a.k());
    }

    @Override // defpackage.qbv
    public final void m(int i, int i2) {
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        zqt zqtVar = zqt.a;
        zqs zqsVar = new zqs();
        if ((zqsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqsVar.y();
        }
        zqt zqtVar2 = (zqt) zqsVar.b;
        zqtVar2.b |= 2;
        zqtVar2.d = i2;
        if ((zqsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqsVar.y();
        }
        zqt zqtVar3 = (zqt) zqsVar.b;
        zqtVar3.c = i - 2;
        zqtVar3.b |= 1;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zqt zqtVar4 = (zqt) zqsVar.v();
        zqtVar4.getClass();
        zqjVar2.k = zqtVar4;
        zqjVar2.c |= 32768;
        r(1053, zqiVar, this.a.k());
    }

    @Override // defpackage.qbv
    public final void n(zqf zqfVar, int i, long j, long j2, String str, int i2) {
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        zqz zqzVar = zqz.a;
        zqy zqyVar = new zqy();
        if ((zqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqyVar.y();
        }
        zqz zqzVar2 = (zqz) zqyVar.b;
        zqfVar.getClass();
        zqzVar2.c = zqfVar;
        zqzVar2.b |= 1;
        if ((zqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqyVar.y();
        }
        zqz zqzVar3 = (zqz) zqyVar.b;
        zqzVar3.d = i - 2;
        zqzVar3.b |= 2;
        if ((zqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqyVar.y();
        }
        zqz zqzVar4 = (zqz) zqyVar.b;
        zqzVar4.b |= 4;
        zqzVar4.e = j;
        if ((zqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqyVar.y();
        }
        zqz zqzVar5 = (zqz) zqyVar.b;
        zqzVar5.b |= 8;
        zqzVar5.f = j2;
        if ((zqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqyVar.y();
        }
        zqz zqzVar6 = (zqz) zqyVar.b;
        str.getClass();
        zqzVar6.b |= 16;
        zqzVar6.g = str;
        if ((zqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqyVar.y();
        }
        zqz zqzVar7 = (zqz) zqyVar.b;
        zqzVar7.b |= 32;
        zqzVar7.h = i2;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zqz zqzVar8 = (zqz) zqyVar.v();
        zqzVar8.getClass();
        zqjVar2.o = zqzVar8;
        zqjVar2.c |= 4194304;
        r(1068, zqiVar, this.a.k());
    }

    @Override // defpackage.qbv
    public final void o(zqf zqfVar, int i) {
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        zrj zrjVar = zrj.a;
        zri zriVar = new zri();
        if ((zriVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zriVar.y();
        }
        zrj zrjVar2 = (zrj) zriVar.b;
        zrjVar2.c = i - 2;
        zrjVar2.b |= 1;
        zrj zrjVar3 = (zrj) zriVar.v();
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zrjVar3.getClass();
        zqjVar2.v = zrjVar3;
        zqjVar2.d |= 16384;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar3 = (zqj) zqiVar.b;
        zqfVar.getClass();
        zqjVar3.e = zqfVar;
        zqjVar3.b |= 256;
        r(1119, zqiVar, this.a.k());
    }

    @Override // defpackage.qbv
    public final void p(int i, zqf zqfVar, int i2) {
        zqj zqjVar = zqj.a;
        zqi zqiVar = new zqi();
        zqr zqrVar = zqr.a;
        zqq zqqVar = new zqq();
        if ((zqqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqqVar.y();
        }
        zqr zqrVar2 = (zqr) zqqVar.b;
        zqrVar2.c = zsb.a(i);
        zqrVar2.b |= 1;
        if ((zqqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqqVar.y();
        }
        zqr zqrVar3 = (zqr) zqqVar.b;
        zqfVar.getClass();
        zqrVar3.d = zqfVar;
        zqrVar3.b |= 2;
        if ((zqqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqqVar.y();
        }
        zqr zqrVar4 = (zqr) zqqVar.b;
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zqrVar4.e = i2 - 2;
        zqrVar4.b |= 4;
        if ((zqqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqqVar.y();
        }
        zqr zqrVar5 = (zqr) zqqVar.b;
        zqrVar5.b |= 8;
        zqrVar5.f = 0;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar2 = (zqj) zqiVar.b;
        zqr zqrVar6 = (zqr) zqqVar.v();
        zqrVar6.getClass();
        zqjVar2.p = zqrVar6;
        zqjVar2.c |= Integer.MIN_VALUE;
        r(1070, zqiVar, this.a.k());
    }

    public final void q(int i, zqi zqiVar, long j, zrv zrvVar) {
        zqd zqdVar = zqd.a;
        zqc zqcVar = new zqc();
        if ((zqcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqcVar.y();
        }
        String str = this.d;
        zqd zqdVar2 = (zqd) zqcVar.b;
        str.getClass();
        zqdVar2.b |= 2;
        zqdVar2.d = str;
        if ((zqcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqcVar.y();
        }
        zqd zqdVar3 = (zqd) zqcVar.b;
        zqdVar3.b |= 1;
        zqdVar3.c = 722788935;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar = (zqj) zqiVar.b;
        zqj zqjVar2 = zqj.a;
        zqjVar.b |= 524288;
        zqjVar.f = j;
        zqh zqhVar = zqh.a;
        zqg zqgVar = new zqg();
        StatFs statFs = new StatFs(this.c.getFilesDir().getAbsolutePath());
        boolean z = ((double) (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()))) < Math.min(5.24288E8d, ((double) (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()))) * 0.05d);
        if ((zqgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqgVar.y();
        }
        zqh zqhVar2 = (zqh) zqgVar.b;
        zqhVar2.b = 1 | zqhVar2.b;
        zqhVar2.c = z;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar3 = (zqj) zqiVar.b;
        zqh zqhVar3 = (zqh) zqgVar.v();
        zqhVar3.getClass();
        zqjVar3.i = zqhVar3;
        zqjVar3.c |= 128;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar4 = (zqj) zqiVar.b;
        zqd zqdVar4 = (zqd) zqcVar.v();
        zqdVar4.getClass();
        zqjVar4.m = zqdVar4;
        zqjVar4.c |= 524288;
        if ((zqiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqiVar.y();
        }
        zqj zqjVar5 = (zqj) zqiVar.b;
        zrvVar.getClass();
        zqjVar5.g = zrvVar;
        zqjVar5.b |= 1048576;
        int i2 = i - 2;
        jyv jyvVarH = this.f.a.h(zqiVar.v());
        aecc aeccVar = jyvVarH.b;
        if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeccVar.y();
        }
        aecd aecdVar = (aecd) aeccVar.b;
        aecd aecdVar2 = aecd.a;
        aecdVar.b |= 32;
        aecdVar.e = i2;
        jyvVarH.d();
    }

    public final void r(int i, zqi zqiVar, long j) {
        zyd zydVarA = this.e.a(j, this.b);
        qcq qcqVar = new qcq(this, i, zqiVar, j);
        zxn.p(zydVarA, wyo.f(qcqVar), zwk.a);
    }
}
