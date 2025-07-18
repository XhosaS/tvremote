package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovq implements ovl, net {
    private static final tui e = tui.l("com/google/android/libraries/googletv/player/kinetoscope/trailerplayer/impl/TrailerControllerImpl");
    public ExoPlayer a;
    public boolean b;
    public yjk c;
    public oui d;
    private final ovk f;
    private final yow g;
    private final tst h;
    private Context i;
    private final Set j;
    private final net k;
    private String l;
    private String m;
    private eam n;
    private nex o;
    private final ovl p;
    private final jzs q;

    public ovq(jzs jzsVar, ovk ovkVar, oum oumVar, yow yowVar, yfo yfoVar, tst tstVar) {
        ovkVar.getClass();
        oumVar.getClass();
        yfoVar.getClass();
        this.q = jzsVar;
        this.f = ovkVar;
        this.g = yowVar;
        this.h = tstVar;
        this.j = new LinkedHashSet();
        this.k = this;
        this.p = this;
    }

    @Override // defpackage.net
    public final void G(String str) {
        Set set = this.j;
        if (set.contains(str)) {
            return;
        }
        ((tug) e.g().j("com/google/android/libraries/googletv/player/kinetoscope/trailerplayer/impl/TrailerControllerImpl", "onPlaybackNonce", 310, "TrailerControllerImpl.kt")).v("Received CPN: %s", str);
        set.add(str);
    }

    @Override // defpackage.ovl
    public final void H() {
        ((tug) e.b().j("com/google/android/libraries/googletv/player/kinetoscope/trailerplayer/impl/TrailerControllerImpl", "onManifestFetchedSuccessfully", 258, "TrailerControllerImpl.kt")).s("Stream is successfully fetched.");
        ykr.q(this.g, null, 0, new kci(this, (yih) null, 8, (byte[]) null), 3);
    }

    @Override // defpackage.ovl
    public final void I(ewb ewbVar, out outVar, ovi oviVar) {
        ((tug) e.b().j("com/google/android/libraries/googletv/player/kinetoscope/trailerplayer/impl/TrailerControllerImpl", "onMediaSourcePrepared", 289, "TrailerControllerImpl.kt")).E("MediaSource %s, playerMetadata: %s, nurMediaDrmLicenseMap: %s", ewbVar, outVar, oviVar);
        ykr.q(this.g, null, 0, new iyc(this, ewbVar, (yih) null, 8), 3);
        if (this.d != null) {
            ((tug) jcm.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$trailerControllerListener$1", "onMediaSourcePrepared", 247, "TrailerPlayerFragment.kt")).s("Media source been prepared successfully");
        }
    }

    @Override // defpackage.ovl
    public final void J() {
        ((tug) ((tug) e.f()).i(null).j("com/google/android/libraries/googletv/player/kinetoscope/trailerplayer/impl/TrailerControllerImpl", "onManifestFetchedFailed", 263, "TrailerControllerImpl.kt")).v("%s", "Error fetching streams. No StreamInfoForDash response.");
        ykr.q(this.g, null, 0, new kci(this, (yih) null, 7), 3);
    }

    public final void a() {
        ExoPlayer exoPlayer = this.a;
        if (exoPlayer == null || !exoPlayer.u()) {
            return;
        }
        exoPlayer.e();
    }

    public final void b() {
        ExoPlayer exoPlayer = this.a;
        if (exoPlayer == null) {
            ((tug) e.g().j("com/google/android/libraries/googletv/player/kinetoscope/trailerplayer/impl/TrailerControllerImpl", "isStateGoodForPlayback", 326, "TrailerControllerImpl.kt")).s("TrailerController has not been initialized. Please call #setup");
            return;
        }
        if (exoPlayer.u()) {
            ((tug) e.g().j("com/google/android/libraries/googletv/player/kinetoscope/trailerplayer/impl/TrailerControllerImpl", "isStateGoodForPlayback", 330, "TrailerControllerImpl.kt")).s("Player is already playing the stream.");
            return;
        }
        ExoPlayer exoPlayer2 = this.a;
        if (exoPlayer2 != null) {
            int iBf = exoPlayer2.bf();
            if (iBf == 2) {
                exoPlayer2.ab(true);
                return;
            }
            if (iBf == 3) {
                exoPlayer2.f();
                return;
            }
            ExoPlayer exoPlayer3 = this.a;
            if (exoPlayer3 != null) {
                exoPlayer3.W();
                exoPlayer3.f();
            }
        }
    }

    public final void c(out outVar, yjk yjkVar) {
        outVar.getClass();
        if (!this.b && this.a == null) {
            throw new IllegalStateException("TrailerController should be setup first. Please call #setup with related params.");
        }
        ExoPlayer exoPlayer = this.a;
        if (exoPlayer != null) {
            ovp ovpVar = new ovp(yjkVar, exoPlayer);
            this.n = ovpVar;
            exoPlayer.S(ovpVar);
            if (exoPlayer.bf() == 1) {
                exoPlayer.W();
            }
        }
        ovo ovoVar = new ovo(this, 0);
        ovk ovkVar = this.f;
        Context context = this.i;
        if (context != null) {
            ovl ovlVar = this.p;
            nex nexVar = this.o;
            net netVar = this.k;
            String str = this.l;
            String str2 = this.m;
            tst tstVar = this.h;
            ouc oucVar = oud.a;
            ovkVar.d(context, ovlVar, nexVar, netVar, null, str, str2, outVar, (ouc) tstVar.e(oud.a), null, null);
            ovkVar.a(null);
        } else {
            ((tug) e.f().j("com/google/android/libraries/googletv/player/kinetoscope/trailerplayer/impl/TrailerControllerImpl", "preloadStream", R.styleable.AppCompatTheme_tooltipForegroundColor, "TrailerControllerImpl.kt")).s("\n              Cannot preload stream due to an invalid context.\n              Ensure trailerController.setup() and trailerController has not been released before\n              invoking preloadStream().\n             ");
        }
        this.c = ovoVar;
    }

    public final void d() {
        this.f.c();
        ExoPlayer exoPlayer = this.a;
        if (exoPlayer != null) {
            exoPlayer.ar();
            eam eamVar = this.n;
            if (eamVar != null) {
                exoPlayer.X(eamVar);
            }
        }
        this.a = null;
        this.d = null;
        this.l = null;
        this.o = null;
        this.n = null;
        this.c = null;
        this.i = null;
        this.b = false;
    }

    public final /* synthetic */ void e(Context context, ExoPlayer exoPlayer, String str, String str2) {
        context.getClass();
        exoPlayer.getClass();
        f(context, exoPlayer, str, str2, null, null);
    }

    public final void f(Context context, ExoPlayer exoPlayer, String str, String str2, owc owcVar, oui ouiVar) {
        this.i = context;
        this.a = exoPlayer;
        this.l = str;
        this.m = str2;
        this.d = ouiVar;
        nex nexVarS = owcVar != null ? this.q.s(context, owcVar) : null;
        this.o = nexVarS;
        if (nexVarS != null) {
            exoPlayer.aq(nexVarS);
        }
        this.b = true;
    }
}
