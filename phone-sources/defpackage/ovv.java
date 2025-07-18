package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.ImmutableList;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovv implements ovs, ovl, net, ovf, eam {
    public static final tui a = tui.l("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl");
    public static final Set b = yfm.aZ(new otw[]{otw.d, otw.a, otw.f});
    private final jzs A;
    public final yow c;
    public ExoPlayer d;
    public yjk e;
    public oui f;
    public pku g;
    private final ovk h;
    private final tst i;
    private Context j;
    private final Set k;
    private final ovf l;
    private final net m;
    private final ovl n;
    private String o;
    private egc p;
    private boolean q;
    private byte[] r;
    private String s;
    private nex t;
    private ouj u;
    private ouk v;
    private List w;
    private List x;
    private final yjv y;
    private ovi z;

    public ovv(jzs jzsVar, ovk ovkVar, oum oumVar, yow yowVar, tst tstVar) {
        ovkVar.getClass();
        oumVar.getClass();
        this.A = jzsVar;
        this.h = ovkVar;
        this.c = yowVar;
        this.i = tstVar;
        this.k = new LinkedHashSet();
        this.l = this;
        this.m = this;
        this.n = this;
        new LinkedHashSet();
        yhb yhbVar = yhb.a;
        this.w = yhbVar;
        this.x = yhbVar;
        this.y = new oun(2);
    }

    private static final Integer W(ebg ebgVar, ouj oujVar) {
        for (int i = 0; i < ebgVar.e; i++) {
            dze dzeVarB = ebgVar.b(i);
            dzeVarB.getClass();
            if (yks.e(dzeVarB.N, oujVar.a) && dzeVarB.P == oujVar.a() && dzeVarB.aq == oujVar.b) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06a7  */
    @Override // defpackage.eam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.ebh r25) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovv.B(ebh):void");
    }

    @Override // defpackage.net
    public final void G(String str) {
        Set set = this.k;
        if (set.contains(str)) {
            return;
        }
        ((tug) a.g().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "onPlaybackNonce", 306, "TvodPlayerControllerImpl.kt")).v("Received CPN: %s", str);
        set.add(str);
    }

    @Override // defpackage.ovl
    public final void H() {
        ((tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "onManifestFetchedSuccessfully", 187, "TvodPlayerControllerImpl.kt")).s("DASH manifest is successfully fetched.");
        ykr.q(this.c, null, 0, new kci(this, (yih) null, 11, (char[]) null), 3);
    }

    @Override // defpackage.ovl
    public final void I(ewb ewbVar, out outVar, ovi oviVar) {
        ((tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "onMediaSourcePrepared", 218, "TvodPlayerControllerImpl.kt")).E("MediaSource %s, playerMetadata: %s, MediaDrmLicenseMap: %s", ewbVar, outVar, oviVar);
        this.z = oviVar;
        ykr.q(this.c, null, 0, new fzp(this, ewbVar, this, (yih) null, 7), 3);
        if (this.f != null) {
            ((tug) ((tug) jdd.a.g().h(tvo.a, "[GTVM-Kinetoscope]")).g(4, TimeUnit.HOURS).j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$playerControllerListener$1", "onMediaSourcePrepared", 619, "TvodPlayerFragment.kt")).s("[Kinetoscope] Media source been prepared successfully");
        }
    }

    @Override // defpackage.ovl
    public final void J() {
        ((tug) ((tug) a.f()).i(null).j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "onManifestFetchedFailed", 192, "TvodPlayerControllerImpl.kt")).v("%s", "Error fetching streams. No StreamInfoForDash response.");
        ykr.q(this.c, null, 0, new kci(this, (yih) null, 10, (byte[]) null), 3);
    }

    @Override // defpackage.ovs
    public final Long K() {
        if (!this.q) {
            throw new IllegalStateException("Please setup the controller first by calling Controller#setup().");
        }
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            return Long.valueOf(exoPlayer.D());
        }
        return null;
    }

    @Override // defpackage.ovs
    public final void L() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer == null || !exoPlayer.u()) {
            return;
        }
        exoPlayer.e();
    }

    @Override // defpackage.ovs
    public final void M() {
        ExoPlayer exoPlayer;
        ExoPlayer exoPlayer2 = this.d;
        if (exoPlayer2 == null) {
            ((tug) a.g().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "isStateGoodForPlayback", 557, "TvodPlayerControllerImpl.kt")).s("TvodController has not been initialized. Please call #setup");
            return;
        }
        if (exoPlayer2.u()) {
            ((tug) a.g().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "isStateGoodForPlayback", 561, "TvodPlayerControllerImpl.kt")).s("Player is already playing the stream.");
            return;
        }
        ExoPlayer exoPlayer3 = this.d;
        if (exoPlayer3 != null) {
            int iBf = exoPlayer3.bf();
            if (iBf == 2) {
                exoPlayer3.ab(true);
                return;
            }
            if (iBf == 3) {
                exoPlayer3.f();
            } else if (iBf == 4 && (exoPlayer = this.d) != null) {
                exoPlayer.W();
                exoPlayer.f();
            }
        }
    }

    @Override // defpackage.ovs
    public final void N(out outVar, yjk yjkVar) {
        outVar.getClass();
        Context context = this.j;
        if (context == null) {
            yks.c("context");
            context = null;
        }
        Context context2 = context;
        ovk ovkVar = this.h;
        ovl ovlVar = this.n;
        nex nexVar = this.t;
        net netVar = this.m;
        ovf ovfVar = this.l;
        String str = this.o;
        String str2 = this.s;
        tst tstVar = this.i;
        ouc oucVar = oud.a;
        ovkVar.d(context2, ovlVar, nexVar, netVar, ovfVar, str, str2, outVar, (ouc) tstVar.e(oud.a), null, null);
        ovkVar.a(this.d);
        this.e = yjkVar;
    }

    @Override // defpackage.ovs
    public final void O(out outVar, enr enrVar, yjk yjkVar) {
        outVar.getClass();
        Context context = this.j;
        if (context == null) {
            yks.c("context");
            context = null;
        }
        Context context2 = context;
        ovk ovkVar = this.h;
        ovl ovlVar = this.n;
        nex nexVar = this.t;
        net netVar = this.m;
        ovf ovfVar = this.l;
        String str = this.o;
        String str2 = this.s;
        tst tstVar = this.i;
        ouc oucVar = oud.a;
        ovkVar.d(context2, ovlVar, nexVar, netVar, ovfVar, str, str2, outVar, (ouc) tstVar.e(oud.a), this.p, this.r);
        ovkVar.b(enrVar, this.d);
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.W();
        }
        yjkVar.a();
    }

    @Override // defpackage.ovs
    public final void P() {
        this.h.c();
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.ar();
        }
        this.o = null;
        this.k.clear();
        this.g = null;
        this.p = null;
        this.d = null;
        new LinkedHashSet();
        this.q = false;
        this.r = null;
        this.e = null;
        this.z = null;
        this.s = null;
        this.t = null;
        this.f = null;
        this.u = null;
        this.v = null;
        yhb yhbVar = yhb.a;
        this.w = yhbVar;
        this.x = yhbVar;
    }

    @Override // defpackage.ovs
    public final void Q() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.ab(true);
        }
    }

    @Override // defpackage.ovs
    public final void R(Duration duration) {
        if (this.d == null) {
            throw new IllegalStateException("ExoPlayer not setup. Call TvodPlayerController#setup().");
        }
        if (duration.compareTo(Duration.ZERO) < 0) {
            throw new IllegalArgumentException("Destination duration position cannot be negative.");
        }
        eao eaoVar = this.d;
        if (eaoVar != null) {
            ((dyq) eaoVar).w(duration.toMillis());
        }
    }

    @Override // defpackage.ovs
    public final void S(ouj oujVar) {
        Object next;
        oujVar.getClass();
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer == null) {
            ((tug) a.g().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "setSelectedAudioTrackParameter", 432, "TvodPlayerControllerImpl.kt")).s("Player is not initialized. Call #setup first.");
            return;
        }
        ImmutableList immutableList = exoPlayer.P().c;
        immutableList.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : immutableList) {
            if (((ebg) obj).a() == 1) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ebg ebgVar = (ebg) next;
            ebgVar.getClass();
            Integer numW = W(ebgVar, oujVar);
            if (numW != null) {
                numW.intValue();
                break;
            }
        }
        ebg ebgVar2 = (ebg) next;
        if (ebgVar2 == null) {
            ((tug) a.g().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "setSelectedAudioTrackParameter", 431, "TvodPlayerControllerImpl.kt")).v("Could not find an audio track group containing %s", oujVar);
            return;
        }
        Integer numW2 = W(ebgVar2, oujVar);
        if (numW2 == null) {
            ((tug) a.g().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "setSelectedAudioTrackParameter", 430, "TvodPlayerControllerImpl.kt")).B("Could not locate %s in group %s", oujVar, ebgVar2);
            return;
        }
        int iIntValue = numW2.intValue();
        eyu eyuVar = new eyu((eyv) exoPlayer.O());
        eyuVar.m(oujVar.a);
        eyuVar.q = oujVar.a();
        eyuVar.r = oujVar.b;
        eyuVar.h(new ebb(ebgVar2.f, iIntValue));
        exoPlayer.af(new eyv(eyuVar));
    }

    @Override // defpackage.ovs
    public final void T(ouk oukVar) {
        oukVar.getClass();
        tui tuiVar = a;
        ((tug) tuiVar.b().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "setSelectedSubtitleTrackParameter", 450, "TvodPlayerControllerImpl.kt")).v("Select caption: %s", oukVar);
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer == null) {
            ((tug) tuiVar.g().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "setSelectedSubtitleTrackParameter", 460, "TvodPlayerControllerImpl.kt")).s("Player is not initialized. Call #setup first.");
            return;
        }
        eyu eyuVar = new eyu((eyv) exoPlayer.O());
        String str = oukVar.b;
        if (true == yks.e(str, ouk.a.b)) {
            str = null;
        }
        eyuVar.n(str);
        eyuVar.k(oukVar.a());
        exoPlayer.af(new eyv(eyuVar));
    }

    @Override // defpackage.ovs
    public final void U() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer == null || !exoPlayer.u()) {
            return;
        }
        exoPlayer.ak();
        exoPlayer.ab(false);
    }

    @Override // defpackage.ovs
    public final void V(Context context, ExoPlayer exoPlayer, String str, String str2, owd owdVar, oui ouiVar, pku pkuVar, egc egcVar, byte[] bArr) {
        this.j = context;
        this.d = exoPlayer;
        this.o = str;
        this.s = str2;
        this.f = ouiVar;
        this.g = pkuVar;
        this.p = egcVar;
        this.r = bArr;
        this.u = null;
        this.v = null;
        yhb yhbVar = yhb.a;
        this.w = yhbVar;
        this.x = yhbVar;
        ExoPlayer exoPlayer2 = this.d;
        if (exoPlayer2 != null) {
            exoPlayer2.S(new ovu(this, exoPlayer2));
        }
        nex nexVarS = this.A.s(context, owdVar);
        this.t = nexVarS;
        if (nexVarS != null) {
            exoPlayer.aq(nexVarS);
        }
        exoPlayer.aq(new ovt());
        this.q = true;
    }

    @Override // defpackage.eam
    public final void dd(boolean z) {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            ebh ebhVarP = exoPlayer.P();
            ebhVarP.getClass();
            ImmutableList immutableList = ebhVarP.c;
            immutableList.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : immutableList) {
                if (((ebg) obj).a() == 2) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ebb ebbVar = (ebb) exoPlayer.O().am.get(((ebg) it.next()).f);
                ((tug) a.g().j("com/google/android/libraries/googletv/player/kinetoscope/tvodplayer/impl/TvodPlayerControllerImpl", "onIsPlayingChanged", 291, "TvodPlayerControllerImpl.kt")).C("onIsPlayingChanged, videoTrackSelectionParams: %s, isPlaying: %s", ebbVar, z);
                if (z && ebbVar == null) {
                    B(ebhVarP);
                }
            }
        }
    }

    @Override // defpackage.eam
    public final /* synthetic */ void F() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void A(ebf ebfVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void C(ebo eboVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void D(float f) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void E(eal ealVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void c(eak eakVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void d(ecb ecbVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dc(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void de(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dg(eab eabVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dh(ead eadVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void el(dyo dyoVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void m(eai eaiVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void n(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void p(eah eahVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void q(eah eahVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void s(eab eabVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void df(dzy dzyVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void z(eay eayVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void t(ean eanVar, ean eanVar2, int i) {
    }
}
