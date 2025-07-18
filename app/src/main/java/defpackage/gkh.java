package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkh implements ghr {
    public static final ght a = new ght();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/logging/clearcut/TvLoggerImpl");
    public static final Duration c;
    private final gns A;
    public final agow d;
    public final gfr e;
    public final fke f;
    public final agow g;
    private final Supplier h;
    private final AccessibilityManager i;
    private final ahbt j;
    private final Supplier k;
    private final gph l;
    private final fjn m;
    private final gtu n;
    private final icj o;
    private final fto p;
    private final fki q;
    private final fkt r;
    private final hag s;
    private final yrx t;
    private final ztw u;
    private final jyw v;
    private final yor w;
    private final kab x;
    private final Map y;
    private gkl z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(-1L);
        durationOfSeconds.getClass();
        c = durationOfSeconds;
    }

    public gkh(Supplier supplier, AccessibilityManager accessibilityManager, kak kakVar, mcw mcwVar, Context context, ahbt ahbtVar, Supplier supplier2, gph gphVar, fjn fjnVar, gtu gtuVar, agow agowVar, gfr gfrVar, icj icjVar, fke fkeVar, fto ftoVar, fki fkiVar, agow agowVar2, fkt fktVar, hag hagVar, yrx yrxVar, ztw ztwVar, gns gnsVar) {
        kakVar.getClass();
        mcwVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        fjnVar.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        fkiVar.getClass();
        agowVar2.getClass();
        hagVar.getClass();
        ztwVar.getClass();
        gnsVar.getClass();
        this.h = supplier;
        this.i = accessibilityManager;
        this.j = ahbtVar;
        this.k = supplier2;
        this.l = gphVar;
        this.m = fjnVar;
        this.n = gtuVar;
        this.d = agowVar;
        this.e = gfrVar;
        this.o = icjVar;
        this.f = fkeVar;
        this.p = ftoVar;
        this.q = fkiVar;
        this.g = agowVar2;
        this.r = fktVar;
        this.s = hagVar;
        this.t = yrxVar;
        this.u = ztwVar;
        this.A = gnsVar;
        this.v = kakVar.a(context, "OPA_TV", null);
        this.w = new yor();
        this.x = mhm.b(context, new cow());
        this.y = new LinkedHashMap();
        Object obj = new Object() { // from class: ghs
        };
        AtomicReference atomicReference = jzb.a;
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                Log.e("ClearcutProviderHolder", "Only a single process-level compliance data provider can be set.");
                return;
            }
        }
    }

    static /* synthetic */ void am(gkh gkhVar, zpg zpgVar, zlv zlvVar, String str, abnb abnbVar, String str2, agvb agvbVar, int i) {
        agvb gieVar = (i & 64) != 0 ? new gie(null) : agvbVar;
        int i2 = i & 16;
        int i3 = i & 8;
        int i4 = i & 4;
        String str3 = (i & 32) != 0 ? null : str2;
        abnb abnbVar2 = i2 != 0 ? null : abnbVar;
        ahal.d(gkhVar.j, null, 4, new yot(gkhVar.w, new gif(gkhVar, zpgVar, i4 != 0 ? null : zlvVar, i3 != 0 ? null : str, abnbVar2, str3, gieVar, null), null), 1);
    }

    @Override // defpackage.ghr
    public final void A(zpg zpgVar) {
        zpgVar.getClass();
        am(this, zpgVar, null, null, null, null, null, 120);
    }

    @Override // defpackage.ghr
    public final void B(int i) {
        if (this.s == hag.g) {
            throw new UnsupportedOperationException("Tvlogger Latency logs should only ever be created in the :interactor process!");
        }
        gkl gklVar = this.z;
        if (gklVar != null) {
            gklVar.b.append(i - 1, Duration.ofNanos(gklVar.a.b()));
        }
    }

    @Override // defpackage.ghr
    public final void C(int i, int i2) {
        am(this, zpg.OPA_TV_ASSISTANT_CONVERSATION_FINISHED, null, null, null, null, new gia(i, i2, null), 60);
    }

    @Override // defpackage.ghr
    public final void D(String str, String str2, int i, long j, long j2) {
        str2.getClass();
        am(this, zpg.OPA_TV_ASSISTANT_INVOCATION, null, null, null, str, new gib(j2, j, i, str2, null), 28);
    }

    @Override // defpackage.ghr
    public final void E(int i) {
        am(this, zpg.OPA_TV_ASSISTANT_INVOCATION_REQUEST, null, null, null, null, new gic(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void F(int i) {
        am(this, zpg.OPA_TV_ASSISTANT_INVOCATION_WITH_VOICE_SESSION, null, null, null, null, new gid(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void G(int i) {
        am(this, zpg.OPA_TV_AUDIO_ERROR_EVENT, null, null, null, null, new gig(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void H(int i, int i2, int i3) {
        am(this, zpg.OPA_TV_AUTHENTICATION_EVENT, null, null, null, null, new gih(i, i2, i3, null), 60);
    }

    @Override // defpackage.ghr
    public final void I(int i, Optional optional, int i2, ycg ycgVar, ycg ycgVar2, int i3, int i4, int i5, List list) {
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        Optional optionalEmpty3 = Optional.empty();
        adzk adzkVar = adzk.SETUP_SKIP_NONE;
        int i6 = yyk.e;
        yyk yykVar = zcg.b;
        J(i, optional, optional, i2, i2, ycgVar, ycgVar2, i3, optionalEmpty, optionalEmpty2, optionalEmpty3, adzkVar, i4, i5, yykVar, yykVar, yykVar, list, Optional.empty());
    }

    @Override // defpackage.ghr
    public final void J(int i, Optional optional, Optional optional2, int i2, int i3, ycg ycgVar, ycg ycgVar2, int i4, Optional optional3, Optional optional4, Optional optional5, adzk adzkVar, int i5, int i6, List list, List list2, List list3, List list4, Optional optional6) {
        optional.getClass();
        optional3.getClass();
        optional4.getClass();
        optional5.getClass();
        am(this, zpg.OPA_TV_SETUP, null, null, null, null, new giv(optional, optional2, i, i2, i3, ycgVar, i4, ycgVar2, optional3, optional4, optional5, adzkVar, i5, i6, list, list2, list3, list4, optional6, null), 60);
    }

    @Override // defpackage.ghr
    public final void K(int i, boolean z, ygm ygmVar, int i2, ybo yboVar, boolean z2) {
        if (i != 0) {
            ygmVar.getClass();
            if (i2 != 0) {
                yboVar.getClass();
                zcp zcpVar = zcp.b;
                zcpVar.getClass();
                L(i, zcpVar, z, ygmVar, i2, yboVar, z2);
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.ghr
    public final void L(int i, Set set, boolean z, ygm ygmVar, int i2, ybo yboVar, boolean z2) {
        if (i != 0) {
            ygmVar.getClass();
            if (i2 != 0) {
                yboVar.getClass();
                am(this, zpg.OPA_TV_HOMEGRAPH_SETUP, null, null, null, null, new gja(i, set, z, ygmVar, i2, yboVar, z2, null), 60);
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.ghr
    public final void M(int i, int i2, ycm ycmVar) {
        N(i, i2, 0L, ycmVar);
    }

    @Override // defpackage.ghr
    public final void N(int i, int i2, long j, ycm ycmVar) {
        am(this, zpg.OPA_TV_SETUP_HOTWORD, null, null, null, null, new gjb(i, i2, ycmVar, j, null), 60);
    }

    @Override // defpackage.ghr
    public final void O(View view, zpg zpgVar, List list, String str, int i) {
        zpgVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        am(this, zpgVar, pam.b(view), str, null, null, new gjj(list, i, null), 48);
    }

    @Override // defpackage.ghr
    public final void P(int i, int i2) {
        if (i < 20) {
            return;
        }
        am(this, zpg.OPA_TV_LOW_MEMORY_EVENT, null, null, null, null, new gjk(i, i2, null), 60);
    }

    @Override // defpackage.ghr
    public final void Q(int i, int i2) {
        am(this, zpg.OPA_TV_NO_ASSISTANT_PUNT, null, null, null, null, new gjn(i, i2, null), 60);
    }

    @Override // defpackage.ghr
    public final void R(int i, int i2) {
        am(this, zpg.OPA_TV_OOBE_EVENT, null, null, null, null, new gjp(i, i2, null), 60);
    }

    @Override // defpackage.ghr
    public final void S(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        am(this, zpg.OPA_TV_PERSONAL_RESULTS_TOGGLE_EVENT, null, null, null, null, new gjr(i, i2, null), 60);
    }

    @Override // defpackage.ghr
    public final void T(int i) {
        am(this, zpg.OPA_TV_PERSONAL_RESULTS_TOGGLE_EVENT, null, null, null, null, new gjs(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void U(int i, int i2, yea yeaVar) {
        yeaVar.getClass();
        am(this, zpg.OPA_TV_PROCESS_MEMORY_USAGE, null, null, null, null, new gjt(i, i2, yeaVar, null), 60);
    }

    @Override // defpackage.ghr
    public final void V(int i) {
        am(this, zpg.OPA_TV_PROCESS_START_EVENT, null, null, null, null, new gju(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void W(int i, int i2) {
        am(this, zpg.OPA_TV_SETTINGS_CHANGE_EVENT, null, null, null, null, new gjy(i, i2, null), 60);
    }

    @Override // defpackage.ghr
    public final void X(int i, List list) {
        if (i == 0) {
            throw null;
        }
        am(this, zpg.OPA_TV_SETTINGS_IMPRESSION, null, null, null, null, new gjz(i, list, null), 60);
    }

    @Override // defpackage.ghr
    public final void Y(int i) {
        am(this, zpg.OPA_TV_SRP_EDITABLE_QUERY_EVENT, null, null, null, null, new gkb(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void Z(int i, abnb abnbVar, String str) {
        am(this, zpg.OPA_TV_SUGGESTED_QUERIES_FETCH, null, null, abnbVar, null, new gkc(i, str, null), 44);
    }

    @Override // defpackage.ghr
    public final void a() {
        if (this.s == hag.g) {
            throw new UnsupportedOperationException("Tvlogger Latency logs should only ever be created in the :interactor process!");
        }
        this.z = new gkl(this.t);
    }

    @Override // defpackage.ghr
    public final void aa(int i) {
        am(this, zpg.OPA_TV_ERROR_EVENT, null, null, null, null, new giy(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void ab(String str, String str2, int i, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        am(this, zpg.OPA_TV_KATNISS_REQUEST, null, null, null, null, new gjh(str, str2, i, str3, null), 60);
    }

    @Override // defpackage.ghr
    public final void ac(int i) {
        am(this, zpg.OPA_TV_KATNISS_STATE_SYNC, null, null, null, null, new gji(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void ad(String str, int i, int i2) {
        str.getClass();
        am(this, zpg.OPA_TV_SEARCH_EVENT, null, null, null, null, new gjw(i, this, str, i2, null), 60);
    }

    @Override // defpackage.ghr
    public final void ae(int i) {
        am(this, zpg.OPA_TV_ACCOUNT_EVENT, null, null, null, null, new ghv(i, null), 60);
    }

    @Override // defpackage.ghr
    public final void af() {
        am(this, zpg.OPA_TV_KATNISS_CLIENT_EXECUTION_FINISHED, null, null, null, null, new gjf(null), 60);
    }

    @Override // defpackage.ghr
    public final void ag(String str, String str2) {
        str.getClass();
        am(this, zpg.OPA_TV_MEDIA_SESSION_EVENT, null, str, null, null, new gjl(str2, null), 52);
    }

    @Override // defpackage.ghr
    public final void ah(ycm ycmVar) {
        am(this, zpg.OPA_TV_START_NETWORK_REAUTH, null, null, null, null, new gjm(ycmVar, null), 60);
    }

    @Override // defpackage.ghr
    public final void ai(int i) {
        am(this, zpg.OPA_TV_NOTIFICATION, null, null, null, null, new gjo(i, null), 60);
    }

    public final zpg aj(View view) {
        pan panVarA = paq.a(view);
        if (panVarA == null) {
            return zpg.OPA_TV_UNCLASSIFIED;
        }
        gns gnsVar = this.A;
        zpg zpgVar = (zpg) gnsVar.a.get(((zpk) panVarA.a.b).d, zpg.OPA_TV_UNCLASSIFIED);
        zpgVar.getClass();
        return zpgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ak(defpackage.zpg r19, defpackage.zlv r20, java.lang.String r21, defpackage.abnb r22, java.lang.String r23, defpackage.agvb r24, defpackage.agsw r25) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkh.ak(zpg, zlv, java.lang.String, abnb, java.lang.String, agvb, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object al(java.lang.String r25, defpackage.abnb r26, java.lang.String r27, defpackage.agsw r28) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkh.al(java.lang.String, abnb, java.lang.String, agsw):java.lang.Object");
    }

    @Override // defpackage.ghr
    public final void b() {
        am(this, zpg.OPA_TV_ACCOUNT_NAME_DATA_MIGRATION_OVERWRITE, null, null, null, null, new ghw(null), 60);
    }

    @Override // defpackage.ghr
    public final void c(String str, String str2) {
        str.getClass();
        am(this, zpg.OPA_TV_CLICK_ATTRIBUTION_WEBLINK, null, str2, null, null, new ghx(str, null), 52);
    }

    @Override // defpackage.ghr
    public final void d(View view, gkk gkkVar) {
        gkkVar.getClass();
        am(this, zpg.OPA_TV_CLICK_SUGGESTION_CHIP, pam.c(view, 5), ((SuggestionChipItem) gkkVar).b, null, null, new ghz(gkkVar, view, null), 48);
    }

    @Override // defpackage.ghr
    public final void e(String str, String str2) {
        am(this, zpg.OPA_TV_CLIENT_OP_EVENT, null, str2, null, null, new gii(str, null), 52);
    }

    @Override // defpackage.ghr
    public final void f(View view, zpg zpgVar, List list) {
        zpgVar.getClass();
        list.getClass();
        am(this, zpgVar, pam.b(view), null, null, null, new giw(list, null), 56);
    }

    @Override // defpackage.ghr
    public final void g(yct yctVar, ycv ycvVar, ycv ycvVar2, boolean z, boolean z2) {
        yctVar.getClass();
        ycvVar.getClass();
        ycvVar2.getClass();
        h(yctVar, ycvVar, ycvVar2, "", z, z2);
    }

    @Override // defpackage.ghr
    public final void h(yct yctVar, ycv ycvVar, ycv ycvVar2, String str, boolean z, boolean z2) {
        yctVar.getClass();
        ycvVar.getClass();
        ycvVar2.getClass();
        str.getClass();
        am(this, zpg.OPA_TV_SETUP_DSC, null, null, null, null, new gix(yctVar, ycvVar, ycvVar2, str, z, z2, null), 60);
    }

    @Override // defpackage.ghr
    public final void i(String str) {
        gkh gkhVar;
        if (this.s == hag.g) {
            throw new UnsupportedOperationException("Tvlogger Latency logs should only ever be created in the :interactor process!");
        }
        gkl gklVar = this.z;
        if (gklVar != null) {
            Instant instantA = this.u.a();
            instantA.getClass();
            ydg ydgVar = ydg.a;
            ydf ydfVar = new ydf();
            int i = 0;
            while (true) {
                SparseArray sparseArray = gklVar.b;
                if (i >= sparseArray.size()) {
                    gkhVar = this;
                    am(gkhVar, zpg.OPA_TV_LATENCY_EVENT, null, str, null, null, new giz(this, ydfVar, instantA, null), 52);
                    break;
                }
                yal yalVar = yal.a;
                yak yakVar = new yak();
                int i2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8}[sparseArray.keyAt(i)];
                if ((yakVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    yakVar.y();
                }
                yal yalVar2 = (yal) yakVar.b;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                yalVar2.c = i3;
                yalVar2.b |= 1;
                int millis = (int) ((Duration) sparseArray.valueAt(i)).toMillis();
                if ((yakVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    yakVar.y();
                }
                yal yalVar3 = (yal) yakVar.b;
                yalVar3.b |= 2;
                yalVar3.d = millis;
                if ((ydfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ydfVar.y();
                }
                ydg ydgVar2 = (ydg) ydfVar.b;
                yal yalVar4 = (yal) yakVar.v();
                yalVar4.getClass();
                abxs abxsVar = ydgVar2.c;
                if (!abxsVar.c()) {
                    int size = abxsVar.size();
                    ydgVar2.c = abxsVar.d(size + size);
                }
                ydgVar2.c.add(yalVar4);
                i++;
            }
        } else {
            gkhVar = this;
        }
        gkhVar.z = null;
    }

    @Override // defpackage.ghr
    public final void j(zpg zpgVar, String str) {
        zpgVar.getClass();
        am(this, zpgVar, null, str, null, null, null, 116);
    }

    @Override // defpackage.ghr
    public final void k(int i, String str) {
        am(this, zpg.OPA_TV_IN_APP_INTERACTION_EVENT, null, str, null, null, new gjc(i, null), 52);
    }

    @Override // defpackage.ghr
    public final void l(View view, gki gkiVar, boolean z, int i, int i2, int i3, gkj gkjVar, String str) {
        view.getClass();
        gkiVar.getClass();
        am(this, aj(view), pam.c(view, 5), str, null, null, new gjd(z, i, i3, gkiVar, i2, gkjVar, null), 48);
    }

    @Override // defpackage.ghr
    public final void m(View view, gki gkiVar, boolean z, int i, int i2, int i3, gkj gkjVar, String str, abnb abnbVar) {
        view.getClass();
        gkiVar.getClass();
        abnbVar.getClass();
        am(this, zpg.OPA_TV_LONG_CLICK_ROW_ITEM_FOR_SEARCH, pam.c(view, 32), str, abnbVar, null, new gje(z, i, i3, gkiVar, i2, gkjVar, null), 32);
    }

    @Override // defpackage.ghr
    public final void n(String str, String str2, Duration duration) {
        str.getClass();
        str2.getClass();
        am(this, zpg.OPA_TV_KATNISS_LATENCY_IN_MS, null, null, null, null, new gjg(duration, str2, str, null), 60);
    }

    @Override // defpackage.ghr
    public final void o(boolean z) {
        am(this, zpg.OPA_TV_OPERATOR_ACCESS_TOKEN, null, null, null, null, new gjq(z, null), 60);
    }

    @Override // defpackage.ghr
    public final void p(zpg zpgVar, boolean z, String str, boolean z2, List list, azd azdVar, List list2, View view, String str2) {
        List arrayList;
        List arrayList2;
        zpgVar.getClass();
        str.getClass();
        List<hej> listX = list != null ? agqq.x(list) : null;
        List listX2 = list2 != null ? agqq.x(list2) : null;
        yej yejVar = yej.a;
        yei yeiVar = new yei();
        if (azdVar != null) {
            int iA = azdVar.a();
            boolean z3 = false;
            for (int i = 0; i < iA; i++) {
                Object objB = azdVar.b(i);
                gkj gkjVar = objB instanceof gkj ? (gkj) objB : null;
                if (gkjVar != null) {
                    if (!z3) {
                        String strD = gkjVar.d();
                        strD.getClass();
                        if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            yeiVar.y();
                        }
                        yej yejVar2 = (yej) yeiVar.b;
                        yejVar2.b |= 4;
                        yejVar2.f = strD;
                        int iA2 = gkjVar.a();
                        if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            yeiVar.y();
                        }
                        yej yejVar3 = (yej) yeiVar.b;
                        yejVar3.b |= 32;
                        yejVar3.k = iA2;
                        String strE = gkjVar.e();
                        if (strE == null) {
                            strE = "";
                        }
                        if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            yeiVar.y();
                        }
                        yej yejVar4 = (yej) yeiVar.b;
                        yejVar4.b |= 8;
                        yejVar4.g = strE;
                    }
                    DesugarCollections.unmodifiableList(((yej) yeiVar.b).j).getClass();
                    ygk ygkVar = ygk.a;
                    ygj ygjVar = new ygj();
                    yhb.b(gkjVar.d(), ygjVar);
                    ygk ygkVarA = yhb.a(ygjVar);
                    if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        yeiVar.y();
                    }
                    yej yejVar5 = (yej) yeiVar.b;
                    abxs abxsVar = yejVar5.j;
                    if (!abxsVar.c()) {
                        int size = abxsVar.size();
                        yejVar5.j = abxsVar.d(size + size);
                    }
                    yejVar5.j.add(ygkVarA);
                    z3 = true;
                }
            }
        }
        DesugarCollections.unmodifiableList(((yej) yeiVar.b).c).getClass();
        if (listX2 != null) {
            ArrayList arrayList3 = new ArrayList(agqq.i(listX2, 10));
            Iterator it = listX2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((adzx) it.next()).aa));
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList3) {
                if (((Number) obj).intValue() != 5) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = agrd.a;
        }
        if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yeiVar.y();
        }
        yej yejVar6 = (yej) yeiVar.b;
        abxj abxjVar = yejVar6.c;
        if (!abxjVar.c()) {
            int size2 = abxjVar.size();
            yejVar6.c = abxjVar.d(size2 + size2);
        }
        abus.m(arrayList, yejVar6.c);
        if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yeiVar.y();
        }
        yej yejVar7 = (yej) yeiVar.b;
        yejVar7.b |= 2;
        yejVar7.e = str;
        if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yeiVar.y();
        }
        yej yejVar8 = (yej) yeiVar.b;
        yejVar8.b = 1 | yejVar8.b;
        yejVar8.d = z;
        if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yeiVar.y();
        }
        yej yejVar9 = (yej) yeiVar.b;
        yejVar9.b |= 16;
        yejVar9.h = z2;
        DesugarCollections.unmodifiableList(yejVar9.i).getClass();
        if (listX != null) {
            arrayList2 = new ArrayList(agqq.i(listX, 10));
            for (hej hejVar : listX) {
                ygq ygqVar = ygq.a;
                ygp ygpVar = new ygp();
                String str3 = hejVar.b;
                if (str3 == null) {
                    str3 = "";
                }
                yho.b(str3, ygpVar);
                int i2 = hejVar.g;
                if ((ygpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ygpVar.y();
                }
                ygq ygqVar2 = (ygq) ygpVar.b;
                ygqVar2.b |= 2;
                ygqVar2.d = i2;
                yho.c(hejVar.p, ygpVar);
                arrayList2.add(yho.a(ygpVar));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = agrd.a;
        }
        if ((yeiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yeiVar.y();
        }
        yej yejVar10 = (yej) yeiVar.b;
        abxs abxsVar2 = yejVar10.i;
        if (!abxsVar2.c()) {
            int size3 = abxsVar2.size();
            yejVar10.i = abxsVar2.d(size3 + size3);
        }
        abus.m(arrayList2, yejVar10.i);
        abxd abxdVarV = yeiVar.v();
        abxdVarV.getClass();
        am(this, zpgVar, pam.b(view), str2, null, null, new gjv((yej) abxdVarV, null), 48);
    }

    @Override // defpackage.ghr
    public final void q(zpg zpgVar, List list, String str) {
        zpgVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        am(this, zpgVar, null, str, null, null, new gjx(list, null), 52);
    }

    @Override // defpackage.ghr
    public final void r(ConversationStateListener.Resolution resolution, int i, int i2) {
        am(this, zpg.OPA_TV_SPEECH_RECOGNITION_EVENT, null, null, null, null, new gka(resolution, i, i2, null), 60);
    }

    @Override // defpackage.ghr
    public final void s(List list, abnb abnbVar, yfn yfnVar, String str) {
        ArrayList arrayList = new ArrayList(agqq.i(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                agqq.h();
            }
            xva xvaVar = (xva) obj;
            pan panVar = new pan(118959);
            zoq zoqVar = panVar.b;
            if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zoqVar.y();
            }
            zot zotVar = (zot) zoqVar.b;
            zot zotVar2 = zot.a;
            zotVar.b |= 2;
            zotVar.d = i;
            acjc acjcVar = xvaVar.d;
            if (acjcVar == null) {
                acjcVar = acjc.a;
            }
            panVar.d(acjcVar);
            arrayList.add(pao.c(panVar, agrd.a));
            i = i2;
        }
        am(this, zpg.OPA_TV_SUGGESTED_QUERIES_IMPRESSION, pam.a(pao.c(new pan(122723), arrayList), 67), str, abnbVar, null, new gkd(yfnVar, null), 32);
    }

    @Override // defpackage.ghr
    public final void t(abnb abnbVar, yfr yfrVar, String str) {
        am(this, zpg.OPA_TV_SUGGESTED_QUERIES_TRIGGER, null, str, abnbVar, null, new gke(yfrVar, null), 36);
    }

    @Override // defpackage.ghr
    public final void u(zpg zpgVar, View view, View view2) {
        zlv zlvVarC;
        zlv zlvVarA;
        zpgVar.getClass();
        view.getClass();
        pao paoVarB = paq.b(view);
        pan panVar = ((pak) paoVarB).a;
        zlv zlvVar = null;
        if (view2 != null && (zlvVarC = pam.c(view2, 1)) != null && (zlvVarA = pam.a(paoVarB, 472)) != null && zlvVarA.d.size() != 0) {
            zlu zluVar = new zlu();
            zluVar.B(zlvVarA);
            zpn zpnVar = zlvVarC.e;
            if (zpnVar == null) {
                zpnVar = zpn.a;
            }
            if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zluVar.y();
            }
            zlv zlvVar2 = (zlv) zluVar.b;
            zpnVar.getClass();
            zlvVar2.e = zpnVar;
            zlvVar2.b |= 2;
            zon zonVar = zlvVarC.f;
            if (zonVar == null) {
                zonVar = zon.a;
            }
            if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zluVar.y();
            }
            zlv zlvVar3 = (zlv) zluVar.b;
            zonVar.getClass();
            zlvVar3.f = zonVar;
            zlvVar3.b |= 16;
            if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zluVar.y();
            }
            zlv zlvVar4 = (zlv) zluVar.b;
            zlvVar4.g = 3;
            zlvVar4.b |= 32;
            zlvVar = (zlv) zluVar.v();
        }
        am(this, zpgVar, zlvVar, null, null, null, null, 120);
    }

    @Override // defpackage.ghr
    public final void v(String str, abnb abnbVar) {
        yrn yrnVar;
        abnbVar.getClass();
        Map map = this.y;
        if (!map.containsKey(abnbVar) || (yrnVar = (yrn) map.get(abnbVar)) == null || yrnVar.a) {
            return;
        }
        Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
        durationOfNanos.getClass();
        am(this, zpg.OPA_TV_VIEW_TIME, null, str, abnbVar, null, new gkf(durationOfNanos, null), 36);
    }

    @Override // defpackage.ghr
    public final void w(abnb abnbVar) {
        abnbVar.getClass();
        Map map = this.y;
        if (!map.containsKey(abnbVar)) {
            map.put(abnbVar, new yrn(this.t));
            return;
        }
        yrn yrnVar = (yrn) map.get(abnbVar);
        if (yrnVar != null) {
            yrnVar.d();
        }
    }

    @Override // defpackage.ghr
    public final void x(abnb abnbVar) {
        abnbVar.getClass();
        Map map = this.y;
        if (!map.containsKey(abnbVar)) {
            map.put(abnbVar, new yrn(this.t));
        }
        yrn yrnVar = (yrn) map.get(abnbVar);
        if (yrnVar == null || yrnVar.a) {
            return;
        }
        yrnVar.e();
    }

    @Override // defpackage.ghr
    public final void y(abnb abnbVar) {
        yrn yrnVar;
        abnbVar.getClass();
        Map map = this.y;
        if (map.containsKey(abnbVar) && (yrnVar = (yrn) map.get(abnbVar)) != null && yrnVar.a) {
            yrnVar.f();
        }
    }

    @Override // defpackage.ghr
    public final void z(View view, hej hejVar, boolean z, String str, List list) {
        view.getClass();
        zpg zpgVarAj = aj(view);
        if (hejVar != null && zpgVarAj == zpg.OPA_TV_UNCLASSIFIED) {
            zpgVarAj = zpg.OPA_TV_CLICK_KP_BUTTON_OTHER_PROVIDER;
        }
        am(this, zpgVarAj, pam.c(view, 5), str, null, null, new ghy(hejVar, view, list, z, null), 48);
    }
}
