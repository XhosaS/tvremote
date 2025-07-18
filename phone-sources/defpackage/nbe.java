package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nbe implements tsl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nbe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, yjv] */
    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        int i = 4;
        byte[] bArr = null;
        final int i2 = 1;
        final int i3 = 0;
        switch (this.b) {
            case 3:
                ntf ntfVar = (ntf) obj;
                if (ntfVar != null) {
                    vty vtyVar = ((nsw) this.a).p;
                    who whoVar = ((whm) vtyVar.b).m;
                    if (whoVar == null) {
                        whoVar = who.a;
                    }
                    vtw vtwVar = (vtw) whoVar.a(5, null);
                    vtwVar.x(whoVar);
                    vty vtyVar2 = (vty) vtwVar;
                    who whoVar2 = ((whm) vtyVar.b).m;
                    if (whoVar2 == null) {
                        whoVar2 = who.a;
                    }
                    uzj uzjVar = whoVar2.e;
                    if (uzjVar == null) {
                        uzjVar = uzj.a;
                    }
                    vtw vtwVar2 = (vtw) uzjVar.a(5, null);
                    vtwVar2.x(uzjVar);
                    String strB = ntfVar.b();
                    if (!vtwVar2.b.A()) {
                        vtwVar2.u();
                    }
                    uzj uzjVar2 = (uzj) vtwVar2.b;
                    strB.getClass();
                    uzjVar2.c = strB;
                    uzi uziVarA = ntfVar.a();
                    if (!vtwVar2.b.A()) {
                        vtwVar2.u();
                    }
                    uzj uzjVar3 = (uzj) vtwVar2.b;
                    uziVarA.getClass();
                    uzjVar3.d = uziVarA;
                    uzjVar3.b |= 1;
                    if (!vtyVar2.b.A()) {
                        vtyVar2.u();
                    }
                    who whoVar3 = (who) vtyVar2.b;
                    uzj uzjVar4 = (uzj) vtwVar2.r();
                    uzjVar4.getClass();
                    whoVar3.e = uzjVar4;
                    whoVar3.b |= 4;
                    who whoVar4 = (who) vtyVar2.r();
                    if (!vtyVar.b.A()) {
                        vtyVar.u();
                    }
                    whm whmVar = (whm) vtyVar.b;
                    whoVar4.getClass();
                    whmVar.m = whoVar4;
                    whmVar.b |= 268435456;
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                final ofk ofkVar = (ofk) obj;
                Object obj2 = this.a;
                nwq nwqVar = (nwq) obj2;
                nzt nztVarO = nwqVar.o(ofr.a, "accountHealthListener");
                nkx nkxVar = new nkx(obj2, new nnh(nztVarO, 4), i, bArr);
                nig nigVar = new nig(obj2, 9);
                nzy nzyVar = new nzy();
                nzyVar.c = nztVarO;
                nzyVar.d = new nvg[]{oez.a};
                nzyVar.a = nkxVar;
                nzyVar.b = nigVar;
                nzyVar.f = 28001;
                onz onzVarY = nwqVar.y(nzyVar.a());
                onzVarY.p(new ofn(ofkVar, i3));
                onzVarY.o(new onr() { // from class: ofs
                    @Override // defpackage.onr
                    public final void c() {
                        if (i2 != 0) {
                            ofr.b.g(ofkVar, new lsq(17));
                        } else {
                            ofy.b.g(ofkVar, new lsq(20));
                        }
                    }
                });
                break;
            case 7:
                break;
            case 8:
                final ofl oflVar = (ofl) obj;
                Object obj3 = this.a;
                nwq nwqVar2 = (nwq) obj3;
                nzt nztVarO2 = nwqVar2.o(ofy.a, "accountMessagesListener");
                nkx nkxVar2 = new nkx(obj3, new nnh(nztVarO2, 5, (byte[]) null), 6, bArr);
                nig nigVar2 = new nig(obj3, 12);
                nzy nzyVar2 = new nzy();
                nzyVar2.c = nztVarO2;
                nzyVar2.d = new nvg[]{oez.b};
                nzyVar2.a = nkxVar2;
                nzyVar2.b = nigVar2;
                nzyVar2.f = 28007;
                onz onzVarY2 = nwqVar2.y(nzyVar2.a());
                onzVarY2.p(new ofn(oflVar, 2));
                onzVarY2.o(new onr() { // from class: ofs
                    @Override // defpackage.onr
                    public final void c() {
                        if (i3 != 0) {
                            ofr.b.g(oflVar, new lsq(17));
                        } else {
                            ofy.b.g(oflVar, new lsq(20));
                        }
                    }
                });
                break;
            case 10:
                break;
            case 12:
                break;
            case 13:
                ore oreVar = (ore) obj;
                vtw vtwVar3 = (vtw) oreVar.a(5, null);
                vtwVar3.x(oreVar);
                while (true) {
                    Object obj4 = this.a;
                    if (i3 >= ((ore) vtwVar3.b).b.size()) {
                        if (!vtwVar3.b.A()) {
                            vtwVar3.u();
                        }
                        ore oreVar2 = (ore) vtwVar3.b;
                        obj4.getClass();
                        oreVar2.b();
                        oreVar2.b.add(obj4);
                        break;
                    } else if (((orc) ((ore) vtwVar3.b).b.get(i3)).d.equals(((orc) obj4).d)) {
                        if (!vtwVar3.b.A()) {
                            vtwVar3.u();
                        }
                        ore oreVar3 = (ore) vtwVar3.b;
                        obj4.getClass();
                        oreVar3.b();
                        oreVar3.b.set(i3, obj4);
                        break;
                    } else {
                        i3++;
                    }
                }
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    Object obj5 = this.a;
                    if (((qit) ((TestingToolsBroadcastReceiver) obj5).n).a().booleanValue()) {
                        try {
                            Object obj6 = ((ttd) ((TestingToolsBroadcastReceiver) obj5).m).a;
                            vmd vmdVar = vmd.COLLABORATOR_API_CALL;
                            qel qelVar = qel.b;
                            vmdVar.getClass();
                            qelVar.getClass();
                            qdl qdlVar = (qdl) wae.W(((rbi) obj6).a, new pfo((rbi) obj6, vmdVar, qelVar, (yih) null, 16)).get();
                            if (!qdlVar.i()) {
                                ((tvk) ((tvk) ((tvk) TestingToolsBroadcastReceiver.a.g()).i(qdlVar.f())).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", 461, "TestingToolsBroadcastReceiver.java")).s("Failed to register");
                                break;
                            }
                        } catch (Exception e) {
                            ((tvk) ((tvk) ((tvk) TestingToolsBroadcastReceiver.a.g()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", (char) 465, "TestingToolsBroadcastReceiver.java")).s("Failed to register");
                            return false;
                        }
                    }
                }
                break;
            case 15:
                ((SharedPreferences) obj).edit().putString("SYNC_LANGUAGE", oyb.a(((TestingToolsBroadcastReceiver) this.a).i)).apply();
                break;
            case 16:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj7 = this.a;
                if (zBooleanValue) {
                    try {
                        break;
                    } catch (Exception e2) {
                        ((tvk) ((tvk) ((tvk) TestingToolsBroadcastReceiver.a.g()).i(e2)).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", (char) 485, "TestingToolsBroadcastReceiver.java")).s("Failed to sync");
                        return false;
                    }
                }
                break;
            case 17:
                rzy rzyVar = (rzy) obj;
                Object obj8 = this.a;
                tvn tvnVar = pec.a;
                rzyVar.A(" WHERE (account = ?");
                rzyVar.B(pec.f((String) obj8));
                rzyVar.A(")");
                break;
            case 18:
                rzy rzyVar2 = (rzy) obj;
                rzyVar2.A(" WHERE (account = ?");
                rzyVar2.B(pel.g((String) this.a));
                rzyVar2.A(")");
                break;
        }
        return this.a.a(obj);
    }
}
