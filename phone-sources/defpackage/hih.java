package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hih {
    public static final /* synthetic */ int a = 0;

    static {
        int i = hii.a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String strCq = a.cq(sij.E(exc.getMessage()), exc.getClass().getSimpleName(), ":");
            int i = hiy.a;
            return strCq.length() > 40 ? strCq.substring(0, 40) : strCq;
        } catch (Throwable th) {
            hiy.f("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static wcy b(int i, int i2, hij hijVar) {
        return e(i, i2, hijVar, null, wdc.BROADCAST_ACTION_UNSPECIFIED);
    }

    public static wcy c(int i, int i2, hij hijVar, wdc wdcVar) {
        return e(i, i2, hijVar, null, wdcVar);
    }

    public static wcy d(int i, int i2, hij hijVar, String str) {
        return e(i, i2, hijVar, str, wdc.BROADCAST_ACTION_UNSPECIFIED);
    }

    public static wcy e(int i, int i2, hij hijVar, String str, wdc wdcVar) {
        try {
            vtw vtwVarM = wda.a.m();
            int i3 = hijVar.a;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wda wdaVar = (wda) vucVar;
            wdaVar.b |= 1;
            wdaVar.c = i3;
            String str2 = hijVar.c;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wda wdaVar2 = (wda) vucVar2;
            str2.getClass();
            wdaVar2.b |= 2;
            wdaVar2.d = str2;
            int i4 = hijVar.b;
            if (i4 != 0) {
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                wda wdaVar3 = (wda) vtwVarM.b;
                wdaVar3.b |= 16;
                wdaVar3.g = i4;
            }
            if (i != 0) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wda wdaVar4 = (wda) vtwVarM.b;
                wdaVar4.e = i - 1;
                wdaVar4.b |= 4;
            }
            if (str != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wda wdaVar5 = (wda) vtwVarM.b;
                wdaVar5.b |= 8;
                wdaVar5.f = str;
            }
            vtw vtwVarM2 = wcy.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wcy wcyVar = (wcy) vtwVarM2.b;
            wda wdaVar6 = (wda) vtwVarM.r();
            wdaVar6.getClass();
            wcyVar.f = wdaVar6;
            wcyVar.b |= 2;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wcy wcyVar2 = (wcy) vtwVarM2.b;
            wcyVar2.e = i2 - 1;
            wcyVar2.b |= 1;
            if (!wdcVar.equals(wdc.BROADCAST_ACTION_UNSPECIFIED)) {
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wcy wcyVar3 = (wcy) vtwVarM2.b;
                wcyVar3.g = wdcVar.e;
                wcyVar3.b |= 4;
            }
            return (wcy) vtwVarM2.r();
        } catch (Throwable th) {
            hiy.f("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static wcz f(int i) {
        return g(i, wdc.BROADCAST_ACTION_UNSPECIFIED);
    }

    public static wcz g(int i, wdc wdcVar) {
        try {
            vtw vtwVarM = wcz.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wcz wczVar = (wcz) vtwVarM.b;
            wczVar.e = i - 1;
            wczVar.b |= 1;
            if (!wdcVar.equals(wdc.BROADCAST_ACTION_UNSPECIFIED)) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcz wczVar2 = (wcz) vtwVarM.b;
                wczVar2.f = wdcVar.e;
                wczVar2.b |= 2;
            }
            return (wcz) vtwVarM.r();
        } catch (Exception e) {
            hiy.f("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
