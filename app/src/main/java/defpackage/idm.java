package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idm extends agtu implements agvb {
    int a;
    final /* synthetic */ idt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idm(idt idtVar, agsw agswVar) {
        super(2, agswVar);
        this.b = idtVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((idm) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            idt idtVar = this.b;
            gyx[] gyxVarArr = {gyx.r};
            this.a = 1;
            if (idtVar.d.g(gyxVarArr, this) == agtgVar) {
                return agtgVar;
            }
        }
        idt idtVar2 = this.b;
        idtVar2.M();
        synchronized (idtVar2.g) {
            idu iduVar = idtVar2.e;
            Iterator it = iduVar.j().iterator();
            while (it.hasNext()) {
                idtVar2.h.put((String) it.next(), idh.b);
            }
            Iterator it2 = iduVar.h().iterator();
            while (it2.hasNext()) {
                idtVar2.h.put((String) it2.next(), idh.c);
            }
            Iterator it3 = iduVar.h().iterator();
            while (it3.hasNext()) {
                idtVar2.h.put((String) it3.next(), idh.d);
            }
            idtVar2.ah();
            ido idoVar = idt.a;
            SharedPreferences sharedPreferences = idtVar2.f;
            Iterator it4 = idoVar.b(sharedPreferences, "udc_permission_granted_accounts").iterator();
            while (it4.hasNext()) {
                idtVar2.i.put((String) it4.next(), idj.b);
            }
            Iterator it5 = idoVar.b(sharedPreferences, "udc_permission_denied_accounts").iterator();
            while (it5.hasNext()) {
                idtVar2.i.put((String) it5.next(), idj.c);
            }
            Iterator it6 = idoVar.b(sharedPreferences, "udc_permission_unknown_accounts").iterator();
            while (it6.hasNext()) {
                idtVar2.i.put((String) it6.next(), idj.a);
            }
            idtVar2.ai();
            Iterator it7 = iduVar.e().iterator();
            while (it7.hasNext()) {
                idtVar2.j.put((String) it7.next(), idi.b);
            }
            Iterator it8 = iduVar.d().iterator();
            while (it8.hasNext()) {
                idtVar2.j.put((String) it8.next(), idi.a);
            }
            Iterator it9 = iduVar.l().iterator();
            while (it9.hasNext()) {
                idtVar2.k.put((String) it9.next(), idk.b);
            }
            Iterator it10 = iduVar.k().iterator();
            while (it10.hasNext()) {
                idtVar2.k.put((String) it10.next(), idk.a);
            }
            iduVar.q();
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new idm(this.b, agswVar);
    }
}
