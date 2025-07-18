package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqr implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;
    private final Object d;

    public kqr(Object obj, xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.d = obj;
        this.b = xcqVar;
        this.a = xcqVar2;
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, xcq] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.c) {
            case 0:
                xcq xcqVar = this.b;
                return ((kqf) this.d).t(((rgq) this.a).a(), (mef) xcqVar.b());
            case 1:
                return new lff((lfn) this.a.b(), new met(new mfv((mef) this.d.b(), krh.p((String) this.b.b())), lxq.c), 1, null);
            case 2:
                xcq xcqVar2 = this.b;
                return ((kqf) this.d).u(((rgq) this.a).a(), (mef) xcqVar2.b());
            case 3:
                xcq xcqVar3 = this.b;
                return ((kqf) this.d).v(((rgq) this.a).a(), (mef) xcqVar3.b());
            case 4:
                return ((kqf) this.d).j((idf) this.b.b(), ((rgq) this.a).a());
            case 5:
                xcq xcqVar4 = this.b;
                return ((kqf) this.d).w(((rgq) this.a).a(), (mef) xcqVar4.b());
            case 6:
                xcq xcqVar5 = this.b;
                return ((kqf) this.d).E(((mbt) this.a).b(), (mcw) xcqVar5.b());
            case 7:
                return new lcz((omi) this.a.b(), (SharedPreferences) this.b.b(), ((ldb) this.d).a());
            case 8:
                lyz lyzVar = (lyz) this.b.b();
                lfn lfnVar = (lfn) this.a.b();
                ((kpw) this.d).b();
                return new kuw(lyzVar, lfnVar, (byte[]) null);
            case 9:
                lyz lyzVar2 = (lyz) this.b.b();
                lfn lfnVar2 = (lfn) this.a.b();
                ((kpw) this.d).b();
                return new kuw(lyzVar2, lfnVar2, (byte[]) null);
            case 10:
                return new lhu(((lgg) this.b).b(), (lxp) this.a.b(), ((rgq) this.d).a());
            case 11:
                return new lnx((Executor) this.a.b(), (san) this.b.b(), (lie) this.d.b(), 1);
            case 12:
                return new kdj((SharedPreferences) this.b.b(), ((lmj) this.a).b(), ((lmn) this.d).b());
            case 13:
                ?? r0 = this.d;
                return new lnx(((lnv) this.a).b(), ((maf) this.b).b(), (Executor) r0.b(), 0);
            case 14:
                vas vasVarT = kgu.t(((rgq) this.a).a(), (lxc) this.b.b(), (lfn) this.d.b());
                vasVarT.getClass();
                return vasVarT;
            case 15:
                return new lpc(((rgq) this.a).a(), (lxc) this.b.b(), (lfn) this.d.b());
            case 16:
                ?? r02 = this.d;
                Context contextA = ((rgq) this.b).a();
                osk oskVar = (osk) r02.b();
                lfn lfnVar3 = (lfn) this.a.b();
                urv urvVarC = urv.c();
                urvVarC.b = oskVar;
                urvVarC.a = contextA;
                urvVarC.b(lfnVar3.K());
                return urvVarC.a();
            case 17:
                return new luq(((lgg) this.a).b(), (lql) this.d.b(), (moz) this.b.b(), 1);
            case 18:
                return new ltt((lql) this.a.b(), (moz) this.b.b(), (ksz) this.d.b(), 1);
            case 19:
                return new lrc(((lrz) this.a).b(), (lql) this.b.b(), (SharedPreferences) this.d.b(), 4, null);
            default:
                lrc lrcVar = (lrc) this.b.b();
                xcq xcqVar6 = this.a;
                moz mozVarB = ((lsz) this.d).b();
                ((kpw) xcqVar6).b();
                return new lsf(lrcVar, mozVarB);
        }
    }

    public kqr(kqf kqfVar, xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.d = kqfVar;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    public kqr(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, byte[] bArr) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
    }

    public kqr(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, char[] cArr) {
        this.c = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
    }

    public kqr(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, int[][] iArr) {
        this.c = i;
        this.b = xcqVar;
        this.d = xcqVar2;
        this.a = xcqVar3;
    }

    public kqr(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, boolean[][] zArr) {
        this.c = i;
        this.a = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
    }
}
