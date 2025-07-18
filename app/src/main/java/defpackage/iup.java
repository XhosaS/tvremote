package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iup implements ite {
    public static final /* synthetic */ int e = 0;
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/statesync/monitors/volume/VolumeMonitor");
    private static final Duration g;
    public final ahbt a;
    public final agow b;
    public ahdl c;
    public agux d;
    private final Context h;
    private final agow i;
    private final ztw j;
    private final gxt k;
    private final boolean l;
    private final iuo m;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(-1L);
        durationOfSeconds.getClass();
        g = durationOfSeconds;
    }

    public iup(ahbt ahbtVar, Context context, agow agowVar, ztw ztwVar, agow agowVar2, gxt gxtVar) {
        ahbtVar.getClass();
        context.getClass();
        agowVar.getClass();
        ztwVar.getClass();
        this.a = ahbtVar;
        this.h = context;
        this.i = agowVar;
        this.j = ztwVar;
        this.b = agowVar2;
        this.k = gxtVar;
        Object objA = agowVar.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.l = !r1.isNegative();
        this.m = new iuo(this);
        this.d = new agux() { // from class: ium
            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i = iup.e;
                ((ite) obj).getClass();
                return agpu.a;
            }
        };
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        gxt gxtVar = this.k;
        AudioManager audioManager = ((gxu) gxtVar).a;
        int iD = gxtVar.d();
        boolean zIsStreamMute = audioManager.isStreamMute(3);
        fnj fnjVarF = gxtVar.f();
        Object objA = this.i.a();
        objA.getClass();
        Duration durationB = acbh.b((abwf) objA);
        durationB.getClass();
        boolean zC = agvy.c(durationB, g);
        if (gxv.a(fnjVarF, zC)) {
            ((zdv) f.b().q("com/google/android/apps/tvsearch/statesync/monitors/volume/VolumeMonitor", "getEvents$suspendImpl", 67, "VolumeMonitor.kt")).G("Skipping volume level update. type=%s, syncDisabled=%b", fnjVarF.name(), zC);
            return agrd.a;
        }
        ((zdv) f.b().q("com/google/android/apps/tvsearch/statesync/monitors/volume/VolumeMonitor", "getEvents$suspendImpl", 75, "VolumeMonitor.kt")).O(iD, zIsStreamMute);
        iuw iuwVar = iuw.a;
        iuu iuuVar = new iuu();
        ivr ivrVar = ivr.a;
        ivq ivqVar = new ivq();
        Instant instantA = this.j.a();
        instantA.getClass();
        abzy abzyVarB = acbk.b(instantA);
        if ((ivqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ivqVar.y();
        }
        ivr ivrVar2 = (ivr) ivqVar.b;
        ivrVar2.c = abzyVarB;
        ivrVar2.b |= 1;
        if ((ivqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ivqVar.y();
        }
        ivr ivrVar3 = (ivr) ivqVar.b;
        ivrVar3.b |= 4;
        ivrVar3.e = iD;
        if ((ivqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ivqVar.y();
        }
        ivr ivrVar4 = (ivr) ivqVar.b;
        ivrVar4.b |= 2;
        ivrVar4.d = zIsStreamMute;
        ivr ivrVar5 = (ivr) ivqVar.v();
        if ((iuuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iuuVar.y();
        }
        iuw iuwVar2 = (iuw) iuuVar.b;
        ivrVar5.getClass();
        iuwVar2.c = ivrVar5;
        iuwVar2.b = 9;
        List listSingletonList = Collections.singletonList(iuuVar.v());
        listSingletonList.getClass();
        return listSingletonList;
    }

    @Override // defpackage.ite
    public final /* synthetic */ Object f(agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.ite
    public final void h() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        intentFilter.addAction("android.media.MASTER_MUTE_CHANGED_ACTION");
        abs.c(this.h, this.m, intentFilter, null, 2);
    }

    @Override // defpackage.ite
    public final void i() {
        this.h.unregisterReceiver(this.m);
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.d = aguxVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.l;
    }

    @Override // defpackage.ite
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
    }
}
