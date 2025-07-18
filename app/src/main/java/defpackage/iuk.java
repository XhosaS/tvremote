package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iuk implements ite, ewb {
    public static final /* synthetic */ int a = 0;
    private static final Duration b;
    private final PowerManager c;
    private final ewc d;
    private final agow e;
    private final ztw f;
    private ivn g;
    private boolean h;
    private final boolean i;
    private agux j;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        durationOfMinutes.getClass();
        b = durationOfMinutes;
    }

    public iuk(PowerManager powerManager, ewc ewcVar, agow agowVar, ztw ztwVar) {
        powerManager.getClass();
        ewcVar.getClass();
        ztwVar.getClass();
        this.c = powerManager;
        this.d = ewcVar;
        this.e = agowVar;
        this.f = ztwVar;
        ivn ivnVar = ivn.a;
        ivnVar.getClass();
        this.g = ivnVar;
        Object objA = agowVar.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.i = !r1.isNegative();
        this.j = new agux() { // from class: iuj
            @Override // defpackage.agux
            public final Object a(Object obj) {
                int i = iuk.a;
                ((ite) obj).getClass();
                return agpu.a;
            }
        };
    }

    private final ivn b(int i) {
        ivn ivnVar = ivn.a;
        ivl ivlVar = new ivl();
        Instant instantA = this.f.a();
        instantA.getClass();
        abzy abzyVarB = acbk.b(instantA);
        if ((ivlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ivlVar.y();
        }
        ivn ivnVar2 = (ivn) ivlVar.b;
        ivnVar2.c = abzyVarB;
        ivnVar2.b |= 1;
        if ((ivlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ivlVar.y();
        }
        ivn ivnVar3 = (ivn) ivlVar.b;
        ivnVar3.d = i - 2;
        ivnVar3.b |= 2;
        abxd abxdVarV = ivlVar.v();
        abxdVarV.getClass();
        return (ivn) abxdVarV;
    }

    @Override // defpackage.ewb
    public final void a(Intent intent) {
        String action = intent.getAction();
        int i = 0;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -2128145023) {
                if (iHashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                    i = 3;
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                i = 4;
            }
        }
        if (i != 0) {
            this.g = b(i);
        } else {
            this.h = true;
        }
        this.j.a(this);
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        iuw iuwVar = iuw.a;
        iuu iuuVar = new iuu();
        ivn ivnVar = this.g;
        if ((iuuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iuuVar.y();
        }
        iuw iuwVar2 = (iuw) iuuVar.b;
        ivnVar.getClass();
        iuwVar2.c = ivnVar;
        iuwVar2.b = 4;
        List listSingletonList = Collections.singletonList(iuuVar.v());
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // defpackage.ite
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r4) {
        /*
            r3 = this;
            boolean r4 = r3.h
            r0 = 1
            if (r4 != 0) goto L3f
            ivn r4 = r3.g
            int r1 = r4.b
            r1 = r1 & r0
            if (r1 == 0) goto L3f
            abzy r4 = r4.c
            if (r4 != 0) goto L12
            abzy r4 = defpackage.abzy.a
        L12:
            r4.getClass()
            j$.time.Instant r4 = defpackage.acbh.c(r4)
            r4.getClass()
            ztw r1 = r3.f
            j$.time.Instant r1 = r1.a()
            r1.getClass()
            boolean r2 = r4.isAfter(r1)
            if (r2 == 0) goto L2c
            goto L3f
        L2c:
            j$.time.Duration r2 = defpackage.iuk.b
            j$.time.Instant r4 = r4.minus(r2)
            r4.getClass()
            j$.time.Duration r4 = defpackage.fep.a(r1, r4)
            boolean r4 = r4.isNegative()
            if (r4 != 0) goto L50
        L3f:
            android.os.PowerManager r4 = r3.c
            boolean r4 = r4.isInteractive()
            if (r0 == r4) goto L49
            r4 = 4
            goto L4a
        L49:
            r4 = 3
        L4a:
            ivn r4 = r3.b(r4)
            r3.g = r4
        L50:
            agpu r4 = defpackage.agpu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuk.f(agsw):java.lang.Object");
    }

    @Override // defpackage.ite
    public final void g() {
        this.h = false;
    }

    @Override // defpackage.ite
    public final void h() {
        this.d.b(this);
    }

    @Override // defpackage.ite
    public final void i() {
        this.d.a(this);
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.j = aguxVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.i;
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
    }
}
