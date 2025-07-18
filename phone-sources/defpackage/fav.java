package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fav implements ekm {
    private static final NumberFormat a;
    private final String b = "EventLogger";
    private final eax c = new eax();
    private final eav d = new eav();
    private final long e = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        a = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    private final void aA(ekl eklVar, String str, String str2) {
        edb.g(aw(eklVar, str, str2, null));
    }

    private final void aB(ekl eklVar, String str, String str2, Throwable th) {
        au(aw(eklVar, str, str2, th));
    }

    private final void aC(ekl eklVar, String str, Exception exc) {
        aB(eklVar, "internalError", str, exc);
    }

    private static final void aD(ead eadVar, String str) {
        for (int i = 0; i < eadVar.a(); i++) {
            edb.g(str.concat(String.valueOf(String.valueOf(eadVar.b(i)))));
        }
    }

    private static String av(elt eltVar) {
        return eltVar.a + "," + eltVar.c + "," + eltVar.b + "," + eltVar.d + "," + eltVar.e + "," + eltVar.f;
    }

    private final String aw(ekl eklVar, String str, String str2, Throwable th) {
        String strCq = str + " [" + ax(eklVar);
        if (th instanceof eah) {
            strCq = strCq + ", errorCode=" + ((eah) th).a();
        }
        if (str2 != null) {
            strCq = a.cq(str2, strCq, ", ");
        }
        String strB = edb.b(th);
        if (!TextUtils.isEmpty(strB)) {
            strCq = strCq + "\n  " + strB.replace("\n", "\n  ") + "\n";
        }
        return strCq.concat("]");
    }

    private final String ax(ekl eklVar) {
        String str = "window=" + eklVar.c;
        evz evzVar = eklVar.d;
        if (evzVar != null) {
            str = str + ", period=" + eklVar.b.a(evzVar.a);
            if (evzVar.b()) {
                str = (str + ", adGroup=" + evzVar.b) + ", ad=" + evzVar.c;
            }
        }
        long j = eklVar.a;
        long j2 = this.e;
        long j3 = eklVar.e;
        return "eventTime=" + ay(j - j2) + ", mediaPos=" + ay(j3) + ", " + str;
    }

    private static String ay(long j) {
        return j == -9223372036854775807L ? "?" : a.format(j / 1000.0f);
    }

    private final void az(ekl eklVar, String str) {
        edb.g(aw(eklVar, str, null, null));
    }

    @Override // defpackage.ekm
    public final void A(ekl eklVar, int i, int i2, boolean z) {
        String str = edt.a;
        aA(eklVar, "rendererReady", "rendererIndex=" + i + ", " + edt.Y(i2) + ", " + z);
    }

    @Override // defpackage.ekm
    public final void B(ekl eklVar, int i) {
        aA(eklVar, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // defpackage.ekm
    public final void C(ekl eklVar, boolean z) {
        aA(eklVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // defpackage.ekm
    public final void D(ekl eklVar, boolean z) {
        aA(eklVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.ekm
    public final void E(ekl eklVar, int i, int i2) {
        aA(eklVar, "surfaceSize", a.ce(i2, i, "w=", ", h="));
    }

    @Override // defpackage.ekm
    public final void F(ekl eklVar, int i) {
        eay eayVar = eklVar.b;
        int iB = eayVar.b();
        int iC = eayVar.c();
        edb.g("timeline [" + ax(eklVar) + ", periodCount=" + iB + ", windowCount=" + iC + ", reason=" + (i != 0 ? "SOURCE_UPDATE" : "PLAYLIST_CHANGED"));
        for (int i2 = 0; i2 < Math.min(iB, 3); i2++) {
            eav eavVar = this.d;
            eayVar.n(i2, eavVar);
            edb.g("  period [" + ay(edt.F(eavVar.i)) + "]");
        }
        if (iB > 3) {
            edb.g("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iC, 3); i3++) {
            eax eaxVar = this.c;
            eayVar.p(i3, eaxVar);
            edb.g("  window [" + ay(eaxVar.c()) + ", seekable=" + eaxVar.v + ", dynamic=" + eaxVar.w + "]");
        }
        if (iC > 3) {
            edb.g("  ...");
        }
        edb.g("]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekm
    public final void G(ekl eklVar, ebh ebhVar) throws IOException {
        ImmutableList immutableList;
        ead eadVar;
        edb.g("tracks [".concat(ax(eklVar)));
        int i = 0;
        while (true) {
            immutableList = ebhVar.c;
            if (i >= immutableList.size()) {
                break;
            }
            ebg ebgVar = (ebg) immutableList.get(i);
            edb.g("  group [ id=".concat(String.valueOf(ebgVar.f.d)));
            for (int i2 = 0; i2 < ebgVar.e; i2++) {
                String str = true != ebgVar.c(i2) ? "[ ]" : "[X]";
                String strW = edt.W(ebgVar.h[i2]);
                edb.g("    " + str + " Track:" + i2 + ", " + dze.f(ebgVar.b(i2)) + ", supported=" + strW);
            }
            edb.g("  ]");
            i++;
        }
        boolean z = false;
        int i3 = 0;
        while (!z && i3 < immutableList.size()) {
            ebg ebgVar2 = (ebg) immutableList.get(i3);
            boolean z2 = false;
            for (int i4 = 0; !z2 && i4 < ebgVar2.e; i4++) {
                if (!ebgVar2.c(i4) || (eadVar = ebgVar2.b(i4).V) == null || eadVar.a() <= 0) {
                    z2 = false;
                } else {
                    edb.g("  Metadata [");
                    aD(eadVar, "    ");
                    edb.g("  ]");
                    z2 = true;
                }
            }
            i3++;
            z = z2;
        }
        edb.g("]");
    }

    @Override // defpackage.ekm
    public final void H(ekl eklVar, evv evvVar) {
        aA(eklVar, "upstreamDiscarded", dze.f(evvVar.c));
    }

    @Override // defpackage.ekm
    public final void I(ekl eklVar, String str) {
        aA(eklVar, "videoDecoderReleased", str);
    }

    @Override // defpackage.ekm
    public final void J(ekl eklVar, ehw ehwVar) {
        az(eklVar, "videoDisabled");
    }

    @Override // defpackage.ekm
    public final void L(ekl eklVar, ebo eboVar) {
        StringBuilder sb = new StringBuilder("w=" + eboVar.e + ", h=" + eboVar.f);
        float f = eboVar.g;
        if (f != 1.0f) {
            sb.append(", par=" + f);
        }
        aA(eklVar, "videoSize", sb.toString());
    }

    @Override // defpackage.ekm
    public final void M(ekl eklVar, float f) {
        aA(eklVar, "volume", Float.toString(f));
    }

    @Override // defpackage.ekm
    public final void P(ekl eklVar, String str, long j) {
        aA(eklVar, "audioDecoderInitialized", str);
    }

    @Override // defpackage.ekm
    public final void Q(ekl eklVar) {
        az(eklVar, "audioDisabled");
    }

    @Override // defpackage.ekm
    public final void R(ekl eklVar) {
        az(eklVar, "audioEnabled");
    }

    @Override // defpackage.ekm
    public final void a(ekl eklVar, dyo dyoVar) {
        aA(eklVar, "audioAttributes", dyoVar.g + "," + dyoVar.h + "," + dyoVar.i + "," + dyoVar.j);
    }

    @Override // defpackage.ekm
    public final void ab(ekl eklVar, int i) {
        edb.g(a.ci(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT", ax(eklVar), "mediaItem [", ", reason=", "]"));
    }

    @Override // defpackage.ekm
    public final void ah(ekl eklVar, Object obj) {
        aA(eklVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.ekm
    public final void am(ekl eklVar, String str, long j) {
        aA(eklVar, "videoDecoderInitialized", str);
    }

    @Override // defpackage.ekm
    public final void an(ekl eklVar) {
        az(eklVar, "videoEnabled");
    }

    @Override // defpackage.ekm
    public final void ap(ekl eklVar, dze dzeVar) {
        aA(eklVar, "audioInputFormat", dze.f(dzeVar));
    }

    @Override // defpackage.ekm
    public final void aq(ekl eklVar, int i) {
        aA(eklVar, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.ekm
    public final void ar(ekl eklVar, evq evqVar, evv evvVar, IOException iOException) {
        aC(eklVar, "loadError", iOException);
    }

    @Override // defpackage.ekm
    public final void as(ekl eklVar, dze dzeVar) {
        aA(eklVar, "videoInputFormat", dze.f(dzeVar));
    }

    protected final void au(String str) {
        edb.c(this.b, str);
    }

    @Override // defpackage.ekm
    public final void b(ekl eklVar, String str) {
        aA(eklVar, "audioDecoderReleased", str);
    }

    @Override // defpackage.ekm
    public final void c(ekl eklVar, long j) {
        aA(eklVar, "audioPositionAdvancing", "since ".concat(String.valueOf(ay(((j - System.currentTimeMillis()) + SystemClock.elapsedRealtime()) - this.e))));
    }

    @Override // defpackage.ekm
    public final void d(ekl eklVar, int i) {
        aA(eklVar, "audioSessionId", Integer.toString(i));
    }

    @Override // defpackage.ekm
    public final void e(ekl eklVar, elt eltVar) {
        aA(eklVar, "audioTrackInit", av(eltVar));
    }

    @Override // defpackage.ekm
    public final void f(ekl eklVar, elt eltVar) {
        aA(eklVar, "audioTrackReleased", av(eltVar));
    }

    @Override // defpackage.ekm
    public final void g(ekl eklVar, int i, long j, long j2) {
        aB(eklVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // defpackage.ekm
    public final void i(ekl eklVar, evv evvVar) {
        aA(eklVar, "downstreamFormat", dze.f(evvVar.c));
    }

    @Override // defpackage.ekm
    public final void j(ekl eklVar) {
        az(eklVar, "drmKeysLoaded");
    }

    @Override // defpackage.ekm
    public final void k(ekl eklVar) {
        az(eklVar, "drmKeysRemoved");
    }

    @Override // defpackage.ekm
    public final void l(ekl eklVar) {
        az(eklVar, "drmKeysRestored");
    }

    @Override // defpackage.ekm
    public final void m(ekl eklVar, int i) {
        aA(eklVar, "drmSessionAcquired", a.cf(i, "state="));
    }

    @Override // defpackage.ekm
    public final void n(ekl eklVar, Exception exc) {
        aC(eklVar, "drmSessionManagerError", exc);
    }

    @Override // defpackage.ekm
    public final void o(ekl eklVar) {
        az(eklVar, "drmSessionReleased");
    }

    @Override // defpackage.ekm
    public final void p(ekl eklVar, boolean z) {
        aA(eklVar, "loading", Boolean.toString(z));
    }

    @Override // defpackage.ekm
    public final void q(ekl eklVar, boolean z) {
        aA(eklVar, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.ekm
    public final void s(ekl eklVar, ead eadVar) {
        edb.g("metadata [".concat(ax(eklVar)));
        aD(eadVar, "  ");
        edb.g("]");
    }

    @Override // defpackage.ekm
    public final void t(ekl eklVar, boolean z, int i) {
        aA(eklVar, "playWhenReady", z + ", " + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST"));
    }

    @Override // defpackage.ekm
    public final void u(ekl eklVar, eai eaiVar) {
        aA(eklVar, "playbackParameters", eaiVar.toString());
    }

    @Override // defpackage.ekm
    public final void v(ekl eklVar, int i) {
        aA(eklVar, "state", i != 1 ? i != 2 ? i != 3 ? "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // defpackage.ekm
    public final void w(ekl eklVar, int i) {
        aA(eklVar, "playbackSuppressionReason", i != 0 ? i != 1 ? i != 3 ? i != 4 ? "?" : "SCRUBBING" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // defpackage.ekm
    public final void x(ekl eklVar, eah eahVar) {
        au(aw(eklVar, "playerFailed", null, eahVar));
    }

    @Override // defpackage.ekm
    public final void z(ekl eklVar, ean eanVar, ean eanVar2, int i) {
        String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "SILENCE_SKIP" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
        aA(eklVar, "positionDiscontinuity", "reason=" + str + ", PositionInfo:old [" + eanVar.toString() + "], PositionInfo:new [" + eanVar2.toString() + "]");
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void N() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void O() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void S() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void T() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void U() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void Z() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ae() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void Y(evq evqVar, evv evvVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ao(int i, int i2) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void at(eao eaoVar, dwi dwiVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void K(ekl eklVar, long j, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void r(ekl eklVar, evq evqVar, evv evvVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void y(ekl eklVar, boolean z, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void h(ekl eklVar, int i, long j, long j2) {
    }
}
