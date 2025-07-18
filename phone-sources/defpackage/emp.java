package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.Surface;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emp extends esv implements ejj {
    private dze A;
    private long B;
    private boolean C;
    private int D;
    private boolean E;
    private long F;
    private final emm G;
    public boolean f;
    public boolean g;
    public final ghc h;
    public final dwi i;
    private int x;
    private boolean y;
    private dze z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emp(Context context, eso esoVar, esx esxVar, Handler handler, els elsVar, emm emmVar) {
        super(1, esoVar, esxVar, 44100.0f);
        ghc ghcVar = Build.VERSION.SDK_INT >= 35 ? new ghc() : null;
        context.getApplicationContext();
        this.G = emmVar;
        this.h = ghcVar;
        this.D = -1000;
        this.i = new dwi(handler, elsVar);
        this.F = -9223372036854775807L;
        emmVar.e = new emo(this);
    }

    private final int aG(dze dzeVar) {
        elr elrVarE = this.G.e(dzeVar);
        if (!elrVarE.b) {
            return 0;
        }
        int i = true != elrVarE.c ? 512 : 1536;
        return elrVarE.d ? i | RecyclerView.ItemAnimator.FLAG_MOVED : i;
    }

    private final void aH() {
        cH();
        long jD = this.G.D();
        if (jD != Long.MIN_VALUE) {
            if (!this.f) {
                jD = Math.max(this.B, jD);
            }
            this.B = jD;
            this.f = false;
        }
    }

    private static List aI(esx esxVar, dze dzeVar, boolean z, emm emmVar) {
        ess essVarB;
        return dzeVar.Y == null ? ImmutableList.of() : (!emmVar.B(dzeVar) || (essVarB = ete.b()) == null) ? ete.i(dzeVar, z, false) : ImmutableList.of(essVarB);
    }

    private static final int aJ(ess essVar, dze dzeVar) {
        "OMX.google.raw.decoder".equals(essVar.a);
        return dzeVar.Z;
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void A() throws IllegalStateException {
        this.g = false;
        this.F = -9223372036854775807L;
        try {
            super.A();
            if (this.C) {
                this.C = false;
                this.G.m();
            }
        } catch (Throwable th) {
            if (this.C) {
                this.C = false;
                this.G.m();
            }
            throw th;
        }
    }

    @Override // defpackage.ehv
    protected final void B() throws IllegalStateException {
        this.G.k();
        this.E = true;
    }

    @Override // defpackage.ehv
    protected final void C() throws IllegalStateException {
        aH();
        this.E = false;
        this.G.j();
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.esv
    protected final float W(float f, dze dzeVar, dze[] dzeVarArr) {
        int iMax = -1;
        for (dze dzeVar2 : dzeVarArr) {
            int i = dzeVar2.ar;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // defpackage.esv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int X(defpackage.esx r11, defpackage.dze r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.Y
            boolean r1 = defpackage.eae.l(r0)
            r2 = 0
            if (r1 != 0) goto La
            goto L65
        La:
            int r1 = r12.az
            boolean r3 = aC(r12)
            r4 = 4
            r5 = 8
            if (r3 == 0) goto L31
            if (r1 == 0) goto L1d
            ess r1 = defpackage.ete.b()
            if (r1 == 0) goto L31
        L1d:
            int r1 = r10.aG(r12)
            emm r6 = r10.G
            boolean r6 = r6.B(r12)
            if (r6 != 0) goto L2a
            goto L32
        L2a:
            r11 = 32
            int r11 = defpackage.clw.H(r4, r5, r11, r1)
            return r11
        L31:
            r1 = r2
        L32:
            java.lang.String r6 = "audio/raw"
            boolean r0 = r6.equals(r0)
            r6 = 1
            if (r0 == 0) goto L44
            emm r0 = r10.G
            boolean r0 = r0.B(r12)
            if (r0 != 0) goto L44
            goto L55
        L44:
            emm r0 = r10.G
            int r7 = r12.aq
            int r8 = r12.ar
            r9 = 2
            dze r7 = defpackage.edt.O(r9, r7, r8)
            boolean r7 = r0.B(r7)
            if (r7 != 0) goto L57
        L55:
            r2 = r6
            goto L65
        L57:
            java.util.List r11 = aI(r11, r12, r2, r0)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L62
            goto L55
        L62:
            if (r3 != 0) goto L6a
            r2 = r9
        L65:
            int r11 = defpackage.clw.F(r2)
            return r11
        L6a:
            java.lang.Object r0 = r11.get(r2)
            ess r0 = (defpackage.ess) r0
            boolean r3 = r0.e(r12)
            if (r3 != 0) goto L90
            r7 = r6
        L77:
            int r8 = r11.size()
            if (r7 >= r8) goto L90
            java.lang.Object r8 = r11.get(r7)
            ess r8 = (defpackage.ess) r8
            boolean r9 = r8.e(r12)
            if (r9 == 0) goto L8d
            r11 = r2
            r3 = r6
            r0 = r8
            goto L91
        L8d:
            int r7 = r7 + 1
            goto L77
        L90:
            r11 = r6
        L91:
            if (r6 == r3) goto L94
            r4 = 3
        L94:
            if (r3 == 0) goto L9e
            boolean r12 = r0.g(r12)
            if (r12 == 0) goto L9e
            r5 = 16
        L9e:
            boolean r12 = r0.g
            if (r6 == r12) goto La4
            r3 = r2
            goto La7
        La4:
            r12 = 64
            r3 = r12
        La7:
            if (r6 == r11) goto Laa
            goto Lac
        Laa:
            r2 = 128(0x80, float:1.8E-43)
        Lac:
            r11 = 32
            r0 = r5
            r5 = r1
            r1 = r0
            r0 = r4
            r4 = r2
            r2 = r11
            int r11 = defpackage.clw.I(r0, r1, r2, r3, r4, r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emp.X(esx, dze):int");
    }

    @Override // defpackage.esv
    protected final ehx Y(ess essVar, dze dzeVar, dze dzeVar2) {
        int i;
        int i2;
        ehx ehxVarB = essVar.b(dzeVar, dzeVar2);
        int i3 = ehxVarB.e;
        if (ax(dzeVar2)) {
            i3 |= 32768;
        }
        if (aJ(essVar, dzeVar2) > this.x) {
            i3 |= 64;
        }
        String str = essVar.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = ehxVarB.d;
        }
        return new ehx(str, dzeVar, dzeVar2, i2, i);
    }

    @Override // defpackage.esv
    protected final esn Z(ess essVar, dze dzeVar, MediaCrypto mediaCrypto, float f) {
        dze[] dzeVarArrR = R();
        int length = dzeVarArrR.length;
        int iAJ = aJ(essVar, dzeVar);
        if (length != 1) {
            for (dze dzeVar2 : dzeVarArrR) {
                if (essVar.b(dzeVar, dzeVar2).d != 0) {
                    iAJ = Math.max(iAJ, aJ(essVar, dzeVar2));
                }
            }
        }
        this.x = iAJ;
        String str = essVar.a;
        this.y = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = essVar.c;
        int i = this.x;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i2 = dzeVar.aq;
        mediaFormat.setInteger("channel-count", i2);
        int i3 = dzeVar.ar;
        mediaFormat.setInteger("sample-rate", i3);
        ecm.d(mediaFormat, dzeVar.ab);
        ecm.c(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = dzeVar.Y;
        if ("audio/ac4".equals(str3)) {
            Pair pairA = eco.a(dzeVar);
            if (pairA != null) {
                ecm.c(mediaFormat, "profile", ((Integer) pairA.first).intValue());
                ecm.c(mediaFormat, "level", ((Integer) pairA.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.G.a(edt.O(4, i2, i3)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.D));
        }
        dze dzeVar3 = null;
        if ("audio/raw".equals(essVar.b) && !"audio/raw".equals(str3)) {
            dzeVar3 = dzeVar;
        }
        this.A = dzeVar3;
        return new esn(essVar, mediaFormat, dzeVar, (Surface) null, mediaCrypto, this.h);
    }

    @Override // defpackage.ejj
    public final long a() {
        if (this.a == 2) {
            aH();
        }
        return this.B;
    }

    @Override // defpackage.esv
    protected final List aa(esx esxVar, dze dzeVar, boolean z) {
        return ete.e(aI(esxVar, dzeVar, z, this.G), dzeVar);
    }

    @Override // defpackage.esv
    protected final void ab(ehk ehkVar) {
        dze dzeVar;
        emg emgVar;
        if (Build.VERSION.SDK_INT < 29 || (dzeVar = ehkVar.a) == null || !Objects.equals(dzeVar.Y, "audio/opus") || !((esv) this).o) {
            return;
        }
        ByteBuffer byteBuffer = ehkVar.f;
        byteBuffer.getClass();
        dze dzeVar2 = ehkVar.a;
        dzeVar2.getClass();
        if (byteBuffer.remaining() == 8) {
            long j = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000;
            emm emmVar = this.G;
            AudioTrack audioTrack = emmVar.g;
            if (audioTrack == null || !emm.A(audioTrack) || (emgVar = emmVar.f) == null || !emgVar.k) {
                return;
            }
            emmVar.g.setOffloadDelayPadding(dzeVar2.at, (int) (j / 1000000000));
        }
    }

    @Override // defpackage.esv
    protected final void ac(Exception exc) {
        edb.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.i.c(exc);
    }

    @Override // defpackage.esv
    protected final void ad(String str) {
        this.i.i(str);
    }

    @Override // defpackage.esv
    protected final void ae(dze dzeVar, MediaFormat mediaFormat) throws eii, ebt {
        dze dzeVar2 = this.A;
        int[] iArrK = null;
        if (dzeVar2 != null) {
            dzeVar = dzeVar2;
        } else if (((esv) this).k != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(dzeVar.Y) ? dzeVar.as : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? edt.n(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            dzd dzdVar = new dzd();
            dzdVar.d("audio/raw");
            dzdVar.G = integer;
            dzdVar.H = dzeVar.at;
            dzdVar.I = dzeVar.au;
            dzdVar.k = dzeVar.V;
            Object obj = dzeVar.W;
            dzdVar.a = dzeVar.K;
            dzdVar.b = dzeVar.L;
            dzdVar.c(dzeVar.M);
            dzdVar.d = dzeVar.N;
            dzdVar.e = dzeVar.O;
            dzdVar.f = dzeVar.P;
            dzdVar.E = mediaFormat.getInteger("channel-count");
            dzdVar.F = mediaFormat.getInteger("sample-rate");
            dzeVar = new dze(dzdVar);
            if (this.y) {
                iArrK = fki.K(dzeVar.aq);
            }
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!((esv) this).o || l().b == 0) {
                    this.G.r(0);
                } else {
                    this.G.r(l().b);
                }
            }
            this.G.C(dzeVar, iArrK);
        } catch (elu e) {
            throw h(e, e.a, 5001);
        }
    }

    @Override // defpackage.esv
    protected final void af() {
        this.G.i();
    }

    @Override // defpackage.esv
    protected final void ag() throws IllegalStateException, eii {
        try {
            this.G.l();
            long j = ((esv) this).p;
            if (j != -9223372036854775807L) {
                this.F = j;
            }
        } catch (ely e) {
            throw i(e, e.c, e.b, true != ((esv) this).o ? 5002 : 5003);
        }
    }

    @Override // defpackage.esv
    protected final boolean ah(long j, long j2, esp espVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, dze dzeVar) throws eii {
        byteBuffer.getClass();
        this.F = -9223372036854775807L;
        if (this.A != null && (i2 & 2) != 0) {
            espVar.getClass();
            espVar.q(i);
            return true;
        }
        if (z) {
            if (espVar != null) {
                espVar.q(i);
            }
            this.t.f += i3;
            this.G.i();
            return true;
        }
        try {
            if (!this.G.w(byteBuffer, j3, i3)) {
                this.F = j3;
                return false;
            }
            if (espVar != null) {
                espVar.q(i);
            }
            this.t.e += i3;
            return true;
        } catch (elv e) {
            dze dzeVar2 = this.z;
            int i4 = 5001;
            if (((esv) this).o && l().b != 0) {
                i4 = 5004;
            }
            throw i(e, dzeVar2, e.b, i4);
        } catch (ely e2) {
            int i5 = 5002;
            if (((esv) this).o && l().b != 0) {
                i5 = 5003;
            }
            throw i(e2, dzeVar, e2.b, i5);
        }
    }

    @Override // defpackage.esv
    protected final boolean ai(dze dzeVar) {
        if (l().b != 0) {
            int iAG = aG(dzeVar);
            if ((iAG & 512) != 0) {
                if (l().b == 2 || (iAG & 1024) != 0) {
                    return true;
                }
                if (dzeVar.at == 0 && dzeVar.au == 0) {
                    return true;
                }
            }
        }
        return this.G.B(dzeVar);
    }

    @Override // defpackage.esv
    protected final long aj(long j, long j2) {
        if (this.F != -9223372036854775807L) {
            if (this.G.b() != -9223372036854775807L) {
                long jMin = (long) ((Math.min(r0, this.F - j) / (b() != null ? b().d : 1.0f)) / 2.0f);
                if (this.E) {
                    dm();
                    jMin -= edt.y(SystemClock.elapsedRealtime()) - j2;
                }
                return Math.max(10000L, jMin);
            }
        }
        return 10000L;
    }

    @Override // defpackage.esv
    protected final void ak(String str, long j, long j2) {
        this.i.h(str, j, j2);
    }

    @Override // defpackage.esv
    protected final ehx al(hig higVar) throws Throwable {
        Object obj = higVar.a;
        obj.getClass();
        dze dzeVar = (dze) obj;
        this.z = dzeVar;
        ehx ehxVarAl = super.al(higVar);
        this.i.l(dzeVar, ehxVarAl);
        return ehxVarAl;
    }

    @Override // defpackage.ejj
    public final eai b() {
        return this.G.j;
    }

    @Override // defpackage.esv, defpackage.ekc
    public final boolean cH() {
        return ((esv) this).q && this.G.z();
    }

    @Override // defpackage.esv, defpackage.ekc
    public final boolean cI() {
        return this.G.y() || super.cI();
    }

    @Override // defpackage.ejj
    public final void d(eai eaiVar) {
        this.G.s(eaiVar);
    }

    @Override // defpackage.ejj
    public final boolean g() {
        boolean z = this.g;
        this.g = false;
        return z;
    }

    @Override // defpackage.esv, defpackage.ehv, defpackage.ejz
    public final void s(int i, Object obj) throws IllegalStateException {
        ghc ghcVar;
        if (i == 2) {
            emm emmVar = this.G;
            obj.getClass();
            emmVar.v(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            dyo dyoVar = (dyo) obj;
            emm emmVar2 = this.G;
            dyoVar.getClass();
            emmVar2.n(dyoVar);
            return;
        }
        if (i == 6) {
            dyp dypVar = (dyp) obj;
            emm emmVar3 = this.G;
            dypVar.getClass();
            emmVar3.p(dypVar);
            return;
        }
        if (i == 12) {
            this.G.t((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.D = ((Integer) obj).intValue();
            esp espVar = ((esv) this).k;
            if (espVar == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.D));
            espVar.l(bundle);
            return;
        }
        if (i == 9) {
            emm emmVar4 = this.G;
            obj.getClass();
            emmVar4.u(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.s(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.G.o(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (ghcVar = this.h) == null) {
                return;
            }
            ghcVar.g(iIntValue);
        }
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void v() {
        this.C = true;
        this.z = null;
        this.F = -9223372036854775807L;
        try {
            this.G.h();
            super.v();
        } catch (Throwable th) {
            super.v();
            throw th;
        } finally {
            this.i.j(this.t);
        }
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void w(boolean z, boolean z2) throws IllegalStateException {
        super.w(z, z2);
        this.i.k(this.t);
        if (l().c) {
            this.G.g();
        } else {
            this.G.f();
        }
        emm emmVar = this.G;
        emmVar.d = m();
        emmVar.q(dm());
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void x(long j, boolean z) throws Throwable {
        super.x(j, z);
        this.G.h();
        this.B = j;
        this.F = -9223372036854775807L;
        this.g = false;
        this.f = true;
    }

    @Override // defpackage.ehv
    protected final void y() {
        ghc ghcVar;
        elq elqVar = this.G.i;
        if (elqVar != null && elqVar.h) {
            elqVar.f = null;
            eln elnVar = elqVar.c;
            if (elnVar != null) {
                dvb.i(elqVar.a).unregisterAudioDeviceCallback(elnVar);
            }
            elqVar.a.unregisterReceiver(elqVar.d);
            elo eloVar = elqVar.e;
            if (eloVar != null) {
                eloVar.a.unregisterContentObserver(eloVar);
            }
            elqVar.h = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (ghcVar = this.h) == null) {
            return;
        }
        ((HashSet) ghcVar.a).clear();
        Object obj = ghcVar.b;
        if (obj != null) {
            if$$ExternalSyntheticApiModelOutline7.m(obj).close();
        }
    }

    @Override // defpackage.ehv, defpackage.ekc
    public final ejj j() {
        return this;
    }
}
