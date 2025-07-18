package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elh implements ekm, eli {
    private eph A;
    private eph B;
    public final PlaybackSession a;
    private final Context b;
    private final elj d;
    private String j;
    private PlaybackMetrics.Builder k;
    private int l;
    private eah o;
    private dze p;
    private dze q;
    private dze r;
    private boolean s;
    private int t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private eph z;
    private final Executor c = clw.X();
    private final eax f = new eax();
    private final eav g = new eav();
    private final HashMap i = new HashMap();
    private final HashMap h = new HashMap();
    private final long e = SystemClock.elapsedRealtime();
    private int m = 0;
    private int n = 0;

    public elh(Context context, PlaybackSession playbackSession) {
        this.b = context.getApplicationContext();
        this.a = playbackSession;
        elg elgVar = new elg();
        this.d = elgVar;
        elgVar.d = this;
    }

    private final void aA(long j, dze dzeVar, int i) {
        if (Objects.equals(this.q, dzeVar)) {
            return;
        }
        if (this.q == null && i == 0) {
            i = 1;
        }
        this.q = dzeVar;
        aE(0, j, dzeVar, i);
    }

    private final void aB(long j, dze dzeVar, int i) {
        if (Objects.equals(this.r, dzeVar)) {
            return;
        }
        if (this.r == null && i == 0) {
            i = 1;
        }
        this.r = dzeVar;
        aE(2, j, dzeVar, i);
    }

    private final void aC(eay eayVar, evz evzVar) {
        int iA;
        int i;
        PlaybackMetrics.Builder builder = this.k;
        if (evzVar == null || (iA = eayVar.a(evzVar.a)) == -1) {
            return;
        }
        eav eavVar = this.g;
        eayVar.n(iA, eavVar);
        eax eaxVar = this.f;
        eayVar.p(eavVar.h, eaxVar);
        dzt dztVar = eaxVar.q.c;
        if (dztVar == null) {
            i = 0;
        } else {
            int iQ = edt.q(dztVar.i, dztVar.j);
            i = iQ != 0 ? iQ != 1 ? iQ != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (eaxVar.A != -9223372036854775807L && !eaxVar.y && !eaxVar.w && !eaxVar.d()) {
            builder.setMediaDurationMillis(eaxVar.c());
        }
        builder.setPlaybackType(true != eaxVar.d() ? 1 : 2);
        this.y = true;
    }

    private final void aD(long j, dze dzeVar, int i) {
        if (Objects.equals(this.p, dzeVar)) {
            return;
        }
        if (this.p == null && i == 0) {
            i = 1;
        }
        this.p = dzeVar;
        aE(1, j, dzeVar, i);
    }

    private final void aE(int i, long j, dze dzeVar, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (dzeVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = dzeVar.X;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = dzeVar.Y;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = dzeVar.U;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = dzeVar.T;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = dzeVar.af;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = dzeVar.ag;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = dzeVar.aq;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = dzeVar.ar;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = dzeVar.N;
            if (str4 != null) {
                String[] strArrAt = edt.at(str4, "-");
                Pair pairCreate = Pair.create(strArrAt[0], strArrAt.length >= 2 ? strArrAt[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                if (pairCreate.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) pairCreate.second);
                }
            }
            float f = dzeVar.aj;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.y = true;
        this.c.execute(new edd(this, timeSinceCreatedMillis.build(), 8, null));
    }

    private final boolean aF(eph ephVar) {
        if (ephVar == null) {
            return false;
        }
        return ((String) ephVar.b).equals(this.d.c());
    }

    private static int ay(int i) {
        switch (edt.l(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void az() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.y) {
            builder.setAudioUnderrunCount(this.x);
            this.k.setVideoFramesDropped(this.v);
            this.k.setVideoFramesPlayed(this.w);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.c.execute(new edd(this, this.k.build(), 11, null));
        }
        this.k = null;
        this.j = null;
        this.x = 0;
        this.v = 0;
        this.w = 0;
        this.p = null;
        this.q = null;
        this.r = null;
        this.y = false;
    }

    @Override // defpackage.ekm
    public final void J(ekl eklVar, ehw ehwVar) {
        this.v += ehwVar.g;
        this.w += ehwVar.e;
    }

    @Override // defpackage.ekm
    public final void L(ekl eklVar, ebo eboVar) {
        eph ephVar = this.z;
        if (ephVar != null) {
            dze dzeVar = (dze) ephVar.c;
            if (dzeVar.ag == -1) {
                dzd dzdVar = new dzd(dzeVar);
                dzdVar.t = eboVar.e;
                dzdVar.u = eboVar.f;
                this.z = new eph(new dze(dzdVar), ephVar.a, (String) ephVar.b);
            }
        }
    }

    @Override // defpackage.ekm
    public final void ar(ekl eklVar, evq evqVar, evv evvVar, IOException iOException) {
        this.t = evvVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0291  */
    @Override // defpackage.ekm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void at(defpackage.eao r18, defpackage.dwi r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elh.at(eao, dwi):void");
    }

    @Override // defpackage.eli
    public final void av(ekl eklVar, String str) {
        evz evzVar = eklVar.d;
        if (evzVar == null || !evzVar.b()) {
            az();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0-alpha01");
            aC(eklVar.b, evzVar);
        }
    }

    @Override // defpackage.eli
    public final void ax(ekl eklVar, String str, boolean z) {
        evz evzVar = eklVar.d;
        if ((evzVar == null || !evzVar.b()) && str.equals(this.j)) {
            az();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    @Override // defpackage.ekm
    public final void h(ekl eklVar, int i, long j, long j2) {
        evz evzVar = eklVar.d;
        if (evzVar != null) {
            elj eljVar = this.d;
            eay eayVar = eklVar.b;
            HashMap map = this.i;
            String strD = eljVar.d(eayVar, evzVar);
            Long l = (Long) map.get(strD);
            HashMap map2 = this.h;
            Long l2 = (Long) map2.get(strD);
            map.put(strD, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strD, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.ekm
    public final void i(ekl eklVar, evv evvVar) {
        evz evzVar = eklVar.d;
        if (evzVar == null) {
            return;
        }
        dze dzeVar = evvVar.c;
        dzeVar.getClass();
        eph ephVar = new eph(dzeVar, evvVar.d, this.d.d(eklVar.b, evzVar));
        int i = evvVar.b;
        if (i != 0) {
            if (i == 1) {
                this.A = ephVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.B = ephVar;
                return;
            }
        }
        this.z = ephVar;
    }

    @Override // defpackage.ekm
    public final void x(ekl eklVar, eah eahVar) {
        this.o = eahVar;
    }

    @Override // defpackage.ekm
    public final void z(ekl eklVar, ean eanVar, ean eanVar2, int i) {
        if (i == 1) {
            this.s = true;
            i = 1;
        }
        this.l = i;
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
    public final /* synthetic */ void Q(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void R(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void an(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void j(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void k(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void l(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void o(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void B(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void C(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void D(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void F(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void G(ekl eklVar, ebh ebhVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void H(ekl eklVar, evv evvVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void I(ekl eklVar, String str) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void M(ekl eklVar, float f) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void Y(evq evqVar, evv evvVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void a(ekl eklVar, dyo dyoVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ab(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ah(ekl eklVar, Object obj) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ao(int i, int i2) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ap(ekl eklVar, dze dzeVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void aq(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void as(ekl eklVar, dze dzeVar) {
    }

    @Override // defpackage.eli
    public final void aw(ekl eklVar, String str) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void b(ekl eklVar, String str) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void c(ekl eklVar, long j) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void d(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void e(ekl eklVar, elt eltVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void f(ekl eklVar, elt eltVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void m(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void n(ekl eklVar, Exception exc) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void p(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void q(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void s(ekl eklVar, ead eadVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void u(ekl eklVar, eai eaiVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void v(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void w(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void E(ekl eklVar, int i, int i2) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void K(ekl eklVar, long j, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void P(ekl eklVar, String str, long j) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void am(ekl eklVar, String str, long j) {
    }

    @Override // defpackage.eli
    public final void au(ekl eklVar, String str, String str2) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void r(ekl eklVar, evq evqVar, evv evvVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void t(ekl eklVar, boolean z, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void y(ekl eklVar, boolean z, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void A(ekl eklVar, int i, int i2, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void g(ekl eklVar, int i, long j, long j2) {
    }
}
