package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import j$.time.Instant;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class itn implements ite {
    public agux a;
    private final Context b;
    private final agow c;
    private final ztw d;
    private final itm e;
    private final boolean f;

    public itn(Context context, agow agowVar, ztw ztwVar) {
        context.getClass();
        ztwVar.getClass();
        this.b = context;
        this.c = agowVar;
        this.d = ztwVar;
        this.e = new itm(this);
        Object objA = agowVar.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.f = !r1.isNegative();
        this.a = new agux() { // from class: itl
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((ite) obj).getClass();
                return agpu.a;
            }
        };
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        iuw iuwVar = iuw.a;
        iuu iuuVar = new iuu();
        iut iutVar = iut.a;
        ius iusVar = new ius();
        Instant instantA = this.d.a();
        instantA.getClass();
        abzy abzyVarB = acbk.b(instantA);
        if ((iusVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iusVar.y();
        }
        iut iutVar2 = (iut) iusVar.b;
        iutVar2.c = abzyVarB;
        iutVar2.b |= 1;
        if ((iusVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iusVar.y();
        }
        iut iutVar3 = (iut) iusVar.b;
        iutVar3.d = 1;
        iutVar3.b |= 2;
        iut iutVar4 = (iut) iusVar.v();
        if ((iuuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iuuVar.y();
        }
        iuw iuwVar2 = (iuw) iuuVar.b;
        iutVar4.getClass();
        iuwVar2.c = iutVar4;
        iuwVar2.b = 6;
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
        intentFilter.addAction("android.intent.action.BOOT_COMPLETED");
        abs.c(this.b, this.e, intentFilter, null, 2);
    }

    @Override // defpackage.ite
    public final void i() {
        this.b.unregisterReceiver(this.e);
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.a = aguxVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.f;
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
