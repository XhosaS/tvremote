package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableSet;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbd implements rzu {
    public final String c;
    public final saw e;
    private final long g;
    public static final ulp f = new ulp((char[]) null);
    public static final sbc a = new sbc(0);
    public final Set b = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));
    public final Handler d = new Handler(Looper.getMainLooper(), new etv(this, 7));

    public sbd(saw sawVar, String str, long j) {
        this.e = sawVar;
        this.c = str;
        this.g = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sbe e(sew sewVar, rzy rzyVar) {
        while (true) {
            rzy rzyVar2 = rzyVar;
            Object obj = rzyVar2.a;
            if (obj == 0) {
                return (sbe) sewVar.a(rzyVar2);
            }
            rzyVar = obj;
        }
    }

    public final void a(sbe sbeVar) {
        Handler handler = this.d;
        handler.removeMessages(0, sbeVar);
        this.b.add(sbeVar);
        handler.sendMessageDelayed(handler.obtainMessage(0, sbeVar), this.g);
    }

    public final void b(sbe sbeVar) {
        long jAA = f.aA();
        rzy rzyVarK = sbeVar.k(jAA);
        vtw vtwVarM = wgv.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wgv wgvVar = (wgv) vucVar;
        wgvVar.b |= 1;
        wgvVar.e = jAA;
        long j = sbeVar.a;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wgv wgvVar2 = (wgv) vtwVarM.b;
        wgvVar2.b |= 2;
        wgvVar2.f = j;
        vtw vtwVarM2 = wgs.a.m();
        long j2 = sbeVar.c;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar2 = vtwVarM2.b;
        wgs wgsVar = (wgs) vucVar2;
        wgsVar.b |= 2;
        wgsVar.d = j2;
        Object obj = rzyVarK.b;
        if (!vucVar2.A()) {
            vtwVarM2.u();
        }
        wgs wgsVar2 = (wgs) vtwVarM2.b;
        obj.getClass();
        wgsVar2.c = (wgy) obj;
        wgsVar2.b |= 1;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wgv wgvVar3 = (wgv) vtwVarM.b;
        wgs wgsVar3 = (wgs) vtwVarM2.r();
        wgsVar3.getClass();
        wgvVar3.d = wgsVar3;
        wgvVar3.c = 3;
        d(vtwVarM, sbeVar.b, (ImmutableSet) rzyVarK.a);
    }

    public final void c(sbe sbeVar) {
        b(sbeVar);
        this.b.remove(sbeVar);
    }

    public final void d(vtw vtwVar, sbb sbbVar, ImmutableSet immutableSet) {
        vtw vtwVarM = wgr.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        udj udjVar = sbbVar.c;
        wgr wgrVar = (wgr) vtwVarM.b;
        udjVar.getClass();
        wgrVar.c = udjVar;
        wgrVar.b |= 1;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wgv wgvVar = (wgv) vtwVar.b;
        wgr wgrVar2 = (wgr) vtwVarM.r();
        wgv wgvVar2 = wgv.a;
        wgrVar2.getClass();
        wgvVar.g = wgrVar2;
        wgvVar.b |= 4;
        byte[] bArrH = ((wgv) vtwVar.r()).h();
        vtw vtwVarM2 = whi.a.m();
        whh whhVar = sbbVar.b;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        whi whiVar = (whi) vucVar;
        whhVar.getClass();
        whiVar.f = whhVar;
        whiVar.b |= 64;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        whi whiVar2 = (whi) vtwVarM2.b;
        vuj vujVar = whiVar2.d;
        if (!vujVar.c()) {
            whiVar2.d = vuc.q(vujVar);
        }
        saw sawVar = this.e;
        vsf.h(immutableSet, whiVar2.d);
        sawVar.c(bArrH, (whi) vtwVarM2.r());
    }
}
