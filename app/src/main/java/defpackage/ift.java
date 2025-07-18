package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;
import j$.util.Optional;
import java.io.IOException;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ift {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/AssistantSetupFlow");
    static final yyr b;
    public irg c;
    irg d;
    public final AssistantSetupActivity e;
    public final gph f;
    public irf g;
    public int h = 1;
    public int i = 1;
    private final Supplier j;
    private final Supplier k;
    private final Supplier l;
    private final gtu m;
    private final idl n;
    private final idu o;
    private final ipe p;
    private final int q;

    static {
        yyn yynVar = new yyn(4);
        yynVar.c(ynh.INVALID_PARAM_ERROR, ipd.q);
        yynVar.c(ynh.UDC_SERVER_ERROR, ipd.r);
        yynVar.c(ynh.CONSENT_NOT_POSSIBLE, ipd.s);
        yynVar.c(ynh.SHOULD_NOT_TRIGGER_UDC_SETUP, ipd.t);
        b = yynVar.a(true);
    }

    public ift(Supplier supplier, AssistantSetupActivity assistantSetupActivity, Supplier supplier2, Supplier supplier3, int i, gph gphVar, gtu gtuVar, idl idlVar, idu iduVar, ipe ipeVar) {
        this.j = supplier;
        this.e = assistantSetupActivity;
        this.k = supplier2;
        this.l = supplier3;
        this.q = i;
        this.f = gphVar;
        this.m = gtuVar;
        this.n = idlVar;
        this.o = iduVar;
        this.p = ipeVar;
    }

    private final irg f() {
        AssistantSetupActivity assistantSetupActivity = this.e;
        yni yniVar = assistantSetupActivity.aD;
        if (yniVar == null) {
            ((zdv) ((zdv) ((zdv) a.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "continueToOptInState", 680, "AssistantSetupFlow.java")).u("Exiting activity. UDC status: null");
            this.p.e(ipd.p, null);
            assistantSetupActivity.S(false, adzk.SETUP_SKIP_NONE);
            return null;
        }
        ynh ynhVarB = ynh.b(yniVar.e);
        if (ynhVarB == null) {
            ynhVarB = ynh.UNSPECIFIED;
        }
        switch (ynhVarB) {
            case ALREADY_CONSENTED:
                assistantSetupActivity.aq(4);
                break;
            case CONSENT_NOT_POSSIBLE:
            case INVALID_PARAM_ERROR:
            case UDC_SERVER_ERROR:
            case SHOULD_NOT_TRIGGER_UDC_SETUP:
                ipe ipeVar = this.p;
                yyr yyrVar = b;
                ynh ynhVarB2 = ynh.b(yniVar.e);
                if (ynhVarB2 == null) {
                    ynhVarB2 = ynh.UNSPECIFIED;
                }
                ipeVar.e((ipd) yyrVar.get(ynhVarB2), null);
                if (this.q == 1) {
                    yni yniVar2 = assistantSetupActivity.aD;
                    if ((4 & yniVar2.b) != 0) {
                        ymq ymqVar = yniVar2.g;
                        if (ymqVar == null) {
                            ymqVar = ymq.a;
                        }
                        if ((ymqVar.b & 1) != 0) {
                            zdy zdyVar = a;
                            zdv zdvVar = (zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "continueToOptInState", 707, "AssistantSetupFlow.java");
                            ymq ymqVar2 = assistantSetupActivity.aD.g;
                            if (ymqVar2 == null) {
                                ymqVar2 = ymq.a;
                            }
                            zdvVar.x("Get UDC settings debug message: %s", ymqVar2.c);
                            zdv zdvVar2 = (zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "continueToOptInState", 710, "AssistantSetupFlow.java");
                            ynh ynhVarB3 = ynh.b(assistantSetupActivity.aD.e);
                            if (ynhVarB3 == null) {
                                ynhVarB3 = ynh.UNSPECIFIED;
                            }
                            zdvVar2.x("Pointed at test server, so UDC consent is failing! UDC Status: %s  Since this is a debug build, skipping ahead to personal results screen", ynhVarB3);
                            assistantSetupActivity.aq(1);
                            break;
                        }
                    }
                }
                zdv zdvVar3 = (zdv) ((zdv) a.d()).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "continueToOptInState", 718, "AssistantSetupFlow.java");
                ynh ynhVarB4 = ynh.b(assistantSetupActivity.aD.e);
                if (ynhVarB4 == null) {
                    ynhVarB4 = ynh.UNSPECIFIED;
                }
                zdvVar3.x("Exiting activity. UDC status: %s", ynhVarB4.name());
                assistantSetupActivity.S(true, adzk.SETUP_SKIP_NONE);
                break;
        }
        return null;
    }

    private final irg g() {
        return j() ? irg.j : k() ? irg.f : irg.g;
    }

    private final irg h(AssistantSetupActivity assistantSetupActivity, irg irgVar) {
        gph gphVar;
        if (assistantSetupActivity.aO != null || ((gphVar = this.f) != gph.b && gphVar != gph.c)) {
            yni yniVar = assistantSetupActivity.aD;
            if (yniVar == null) {
                ((zdv) ((zdv) ((zdv) a.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "goBackToEntryOrOptInScreen", 566, "AssistantSetupFlow.java")).u("Udc setting null when coming back, finishing setup.");
                assistantSetupActivity.U(false);
                return irgVar;
            }
            int i = yniVar.e;
            ynh ynhVarB = ynh.b(i);
            if (ynhVarB == null) {
                ynhVarB = ynh.UNSPECIFIED;
            }
            if (ynhVarB != ynh.ALREADY_CONSENTED) {
                ynh ynhVarB2 = ynh.b(i);
                if (ynhVarB2 == null) {
                    ynhVarB2 = ynh.UNSPECIFIED;
                }
                if (ynhVarB2 != ynh.ASK_FOR_CONSENT) {
                    ynh ynhVarB3 = ynh.b(i);
                    if (ynhVarB3 == null) {
                        ynhVarB3 = ynh.UNSPECIFIED;
                    }
                    if (ynhVarB3 != ynh.UNSPECIFIED) {
                        return irgVar;
                    }
                }
                return irg.d;
            }
            if (this.f == gph.a || assistantSetupActivity.aF) {
                assistantSetupActivity.O();
                return irgVar;
            }
        }
        return irg.a;
    }

    private final void i(ire ireVar) {
        ire ireVar2 = ire.d;
        if (ireVar == ireVar2) {
            b(ireVar2);
        } else {
            b(ire.a);
        }
    }

    private final boolean j() {
        if (!((Boolean) this.k.get()).booleanValue() || !((Boolean) this.l.get()).booleanValue()) {
            return false;
        }
        if (this.g == irf.b) {
            return true;
        }
        AssistantSetupActivity assistantSetupActivity = this.e;
        Account account = assistantSetupActivity.aO;
        if (account != null && this.n.e(account) == idj.b) {
            return true;
        }
        idl idlVar = this.n;
        return !idlVar.S(assistantSetupActivity.aO) || idlVar.d(assistantSetupActivity.aO) == idh.a;
    }

    private final boolean k() {
        gph gphVar = this.f;
        return (gphVar == gph.b || gphVar == gph.c) && !this.e.al();
    }

    final bq a(irg irgVar) {
        int iA;
        bq iimVar;
        zdy zdyVar = a;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "getFragment", 586, "AssistantSetupFlow.java")).x("Getting an OOBE Fragment with state %s.", irgVar);
        switch (irgVar.ordinal()) {
            case 0:
                AssistantSetupActivity assistantSetupActivity = this.e;
                bq iiqVar = assistantSetupActivity.aO == null ? new iiq() : new iip();
                Bundle bundle = new Bundle();
                bundle.putInt("setup_animation_res_id", assistantSetupActivity.C());
                iiqVar.ae(bundle);
                return iiqVar;
            case 1:
                return new iio();
            case 2:
            case 7:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new ikt();
            case 3:
                AssistantSetupActivity assistantSetupActivity2 = this.e;
                yni yniVar = assistantSetupActivity2.aD;
                ylx ylxVar = assistantSetupActivity2.aE;
                if (yniVar == null) {
                    ((zdv) ((zdv) ((zdv) zdyVar.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "getFragment", 603, "AssistantSetupFlow.java")).u("UDC setting is null at OPT_IN state. Finishing setup.");
                    this.p.e(ipd.p, null);
                    assistantSetupActivity2.S(false, adzk.SETUP_SKIP_NONE);
                    return null;
                }
                if (ylxVar == null) {
                    ((zdv) ((zdv) ((zdv) zdyVar.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "getFragment", 612, "AssistantSetupFlow.java")).u("Omniconsent is null at OPT_IN state. Finishing setup.");
                    assistantSetupActivity2.S(false, adzk.SETUP_SKIP_NONE);
                    return null;
                }
                ylw ylwVar = ylxVar.b;
                if (ylwVar == null) {
                    ylwVar = ylw.a;
                }
                if ((ylwVar.b & 1) == 0) {
                    ((zdv) ((zdv) ((zdv) zdyVar.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "getFragment", 618, "AssistantSetupFlow.java")).u("Omniconsent's UDC setting text is empty at OPT_IN state. Finishing setup.");
                    assistantSetupActivity2.S(false, adzk.SETUP_SKIP_NONE);
                    return null;
                }
                Bundle bundle2 = new Bundle();
                ynh ynhVarB = ynh.b(yniVar.e);
                if (ynhVarB == null) {
                    ynhVarB = ynh.UNSPECIFIED;
                }
                bundle2.putBoolean("ask_for_consent", ynhVarB == ynh.ASK_FOR_CONSENT);
                try {
                    int i = ylxVar.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(ylxVar.getClass()).a(ylxVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(ylxVar.getClass()).a(ylxVar);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            ylxVar.memoizedSerializedSize = (Integer.MIN_VALUE & ylxVar.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(ylxVar.getClass()).m(ylxVar, abwa.a(abvwVar));
                    abvwVar.K();
                    bundle2.putByteArray("omniconsent_text", bArr);
                    if (this.f == gph.a) {
                        iimVar = new iif();
                    } else {
                        iimVar = new iim();
                        bundle2.putInt("setup_animation_res_id", this.e.C());
                    }
                    iimVar.ae(bundle2);
                    return iimVar;
                } catch (IOException e) {
                    throw new RuntimeException(a.x(ylxVar, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
                }
            case 4:
                return new iin();
            case 5:
                return new ikd();
            case 6:
                ijy ijyVar = new ijy();
                Optional optional = this.e.aK;
                if (optional != null && optional.isPresent()) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("setup:voice_match_accepted", ycp.VOICE_MATCH_ACCEPTED == optional.get());
                    ijyVar.ae(bundle3);
                }
                return ijyVar;
            case 8:
                return new ikb();
            case 9:
            default:
                ((zdv) ((zdv) ((zdv) zdyVar.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "getFragment", 670, "AssistantSetupFlow.java")).x("State not handled: %s, returning null fragment.", irgVar);
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (this.f == gph.a) {
                    return new ikh();
                }
                throw new IllegalStateException("VM fragment shouldn't be created.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x0418  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.ire r13) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ift.b(ire):void");
    }

    public final boolean c() {
        return this.c != null;
    }

    final void d(bq bqVar) {
        if (bqVar != null) {
            AssistantSetupActivity assistantSetupActivity = this.e;
            if (assistantSetupActivity.aO != null) {
                Bundle bundle = bqVar.n;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("setup:key_account_name", assistantSetupActivity.aO.name);
                boolean z = true;
                if (!this.o.E() && (this.m.c() != null || !((Boolean) this.j.get()).booleanValue())) {
                    z = false;
                }
                bundle.putBoolean("setup:neutral_consent_button", z);
                gtu gtuVar = this.m;
                if (gtuVar.a() != null) {
                    bundle.putString("setup:key_account_gaia_id", gtuVar.m());
                }
                bqVar.ae(bundle);
            }
        }
    }

    final int e(bq bqVar) {
        if (bqVar == null) {
            return 1;
        }
        if (bqVar instanceof iiq) {
            return 2;
        }
        if (bqVar instanceof iip) {
            return 3;
        }
        if (bqVar instanceof iio) {
            return 4;
        }
        if (bqVar instanceof iim) {
            return 5;
        }
        if (bqVar instanceof iif) {
            return 6;
        }
        if (bqVar instanceof iin) {
            return 7;
        }
        if (bqVar instanceof ikd) {
            return 8;
        }
        if (bqVar instanceof ijy) {
            return 9;
        }
        if (bqVar instanceof ikb) {
            return 10;
        }
        return bqVar instanceof ikh ? 11 : 1;
    }
}
