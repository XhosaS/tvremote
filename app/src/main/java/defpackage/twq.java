package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;
import j$.util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twq implements twg {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController");
    public final sah b;
    public final twe c;
    public final ttq d;
    public final uab e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    zyd g;
    rux h;
    public sag i;
    private final zyh j;
    private final zyh k;
    private final agow l;
    private final slz m;
    private final sdd n;
    private sdj o;

    public twq(sdd sddVar, agow agowVar, slz slzVar, uab uabVar, zyh zyhVar, zyh zyhVar2, sah sahVar, twe tweVar, ttq ttqVar) {
        this.n = sddVar;
        this.l = agowVar;
        this.m = slzVar;
        this.e = uabVar;
        this.j = zyhVar;
        this.k = zyhVar2;
        this.b = sahVar;
        this.c = tweVar;
        this.d = ttqVar;
    }

    private final synchronized void g() {
        rua ruaVar = rua.a;
        rtz rtzVar = new rtz();
        if ((rtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rtzVar.y();
        }
        rua ruaVar2 = (rua) rtzVar.b;
        ruaVar2.b |= 1;
        ruaVar2.c = 4;
        if ((rtzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rtzVar.y();
        }
        rua ruaVar3 = (rua) rtzVar.b;
        ruaVar3.b |= 2;
        ruaVar3.d = 3;
        sgo sgoVar = sgo.a;
        sgm sgmVar = new sgm();
        shz shzVar = shz.a;
        if ((sgmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            sgmVar.y();
        }
        sgo sgoVar2 = (sgo) sgmVar.b;
        shzVar.getClass();
        sgoVar2.c = shzVar;
        sgoVar2.b = 20;
        if ((Integer.MIN_VALUE & rtzVar.b.memoizedSerializedSize) == 0) {
            rtzVar.y();
        }
        rua ruaVar4 = (rua) rtzVar.b;
        sgo sgoVar3 = (sgo) sgmVar.v();
        sgoVar3.getClass();
        ruaVar4.g = sgoVar3;
        ruaVar4.b |= 16;
        rua ruaVar5 = (rua) rtzVar.v();
        zdv zdvVar = (zdv) ((zdv) sdd.a.b().o(zfi.a, "ALT.AFClient")).q("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusClientImpl", "acquireAudioFocus", 24, "AudioFocusClientImpl.java");
        sgo sgoVar4 = ruaVar5.g;
        if (sgoVar4 == null) {
            sgoVar4 = sgo.a;
        }
        int iB = sgn.b(sgoVar4.b);
        if (iB == 0) {
            throw null;
        }
        sdd sddVar = this.n;
        zdvVar.x("#audio# acquire audio focus for client(%s)", sgn.a(iB));
        sdj sdjVarA = sddVar.b.a(ruaVar5);
        this.o = sdjVarA;
        zxn.p(zxn.i(sdjVarA.e), wyo.f(new twp()), this.j);
    }

    @Override // defpackage.twg
    public final int a() {
        int i;
        Optional optional = ((tsk) this.c).n;
        if (!optional.isPresent() || (i = ((tsg) optional.get()).d) == 1) {
            return 16;
        }
        if (i == 2) {
            return 12;
        }
        throw new IllegalStateException("Unsupported audio channel count!");
    }

    @Override // defpackage.twg
    public final int b() {
        Optional optional = ((tsk) this.c).n;
        if (optional.isPresent()) {
            return ((tsg) optional.get()).c;
        }
        return 16000;
    }

    @Override // defpackage.twg
    public final synchronized InputStream c() {
        Optional optional = ((tsk) this.c).n;
        if (optional.isPresent() && ((tsg) optional.get()).b.isPresent()) {
            optional.get();
        }
        return new sfa(this.g);
    }

    @Override // defpackage.twg
    public final synchronized void d() {
        if (this.f.compareAndSet(false, true)) {
            if (this.h != null) {
                this.d.n();
                zyd zydVarA = this.h.a().a();
                twn twnVar = new twn(this);
                zxn.p(zydVarA, wyo.f(twnVar), this.j);
            }
            sdj sdjVar = this.o;
            if (sdjVar != null) {
                zdv zdvVar = (zdv) ((zdv) sdj.a.b().o(zfi.a, "ALT.AFCSession")).q("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionImpl", "releaseAudioFocus", 87, "AudioFocusSessionImpl.java");
                sdo sdoVar = sdjVar.b;
                zdvVar.v("#audio# release audio focus session(token(%d))", sdoVar.c);
                zyd zydVarI = zxn.i(sdjVar.g.b(sdoVar, 2));
                two twoVar = new two();
                zxn.p(zydVarI, wyo.f(twoVar), this.j);
            }
        }
    }

    @Override // defpackage.twg
    public final synchronized void e() {
        Optional optional;
        if (this.f.get()) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", 157, "AudioLibraryAudioController.java")).u("#closeMicIfNeeded called before #initializeAsync");
            this.g = zxn.g(new tre());
            return;
        }
        twe tweVar = this.c;
        Optional optional2 = ((tsk) tweVar).n;
        if (optional2.isPresent() && ((tsg) optional2.get()).b.isPresent()) {
            optional2.get();
        }
        rvf rvfVar = rvf.a;
        rve rveVar = new rve();
        if ((rveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rveVar.y();
        }
        rvf rvfVar2 = (rvf) rveVar.b;
        rvfVar2.b |= 4;
        rvfVar2.i = false;
        ruo ruoVarF = f();
        if ((rveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rveVar.y();
        }
        rvf rvfVar3 = (rvf) rveVar.b;
        ruoVarF.getClass();
        rvfVar3.g = ruoVarF;
        rvfVar3.b |= 1;
        if (optional2.isPresent() && ((tsg) optional2.get()).a.isPresent()) {
            saa saaVar = saa.a;
            rzz rzzVar = new rzz();
            String string = ((Uri) ((tsg) optional2.get()).a.get()).toString();
            if ((rzzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rzzVar.y();
            }
            saa saaVar2 = (saa) rzzVar.b;
            string.getClass();
            saaVar2.b |= 1;
            saaVar2.c = string;
            if ((rveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rveVar.y();
            }
            rvf rvfVar4 = (rvf) rveVar.b;
            saa saaVar3 = (saa) rzzVar.v();
            saaVar3.getClass();
            rvfVar4.d = saaVar3;
            rvfVar4.c = 13;
            this.h = this.m.b((rvf) rveVar.v());
        } else if (optional2.isPresent() && ((tsg) optional2.get()).b.isPresent()) {
            this.h = this.m.a((ParcelFileDescriptor) ((tsg) optional2.get()).b.get(), f());
        } else {
            String str = String.format(Locale.US, "TNT_%s", ((tsk) tweVar).f.name());
            rvc rvcVar = rvc.a;
            rvb rvbVar = new rvb();
            sgo sgoVar = sgo.a;
            sgm sgmVar = new sgm();
            shz shzVar = shz.a;
            shy shyVar = new shy();
            if ((shyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                shyVar.y();
            }
            shz shzVar2 = (shz) shyVar.b;
            str.getClass();
            shzVar2.b |= 1;
            shzVar2.c = str;
            if ((sgmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                sgmVar.y();
            }
            sgo sgoVar2 = (sgo) sgmVar.b;
            shz shzVar3 = (shz) shyVar.v();
            shzVar3.getClass();
            sgoVar2.c = shzVar3;
            sgoVar2.b = 20;
            if ((rvbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rvbVar.y();
            }
            rvc rvcVar2 = (rvc) rvbVar.b;
            sgo sgoVar3 = (sgo) sgmVar.v();
            sgoVar3.getClass();
            rvcVar2.c = sgoVar3;
            rvcVar2.b |= 1;
            rvc rvcVar3 = (rvc) rvbVar.v();
            g();
            if (adn.b() && (optional = ((tsk) tweVar).u) != null && optional.isPresent()) {
                sag sagVarA = this.b.a(mr$$ExternalSyntheticApiModelOutline0.m(optional.get()));
                this.i = sagVarA;
                if ((rveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rveVar.y();
                }
                rvf rvfVar5 = (rvf) rveVar.b;
                sagVarA.getClass();
                rvfVar5.f = sagVarA;
                rvfVar5.e = 12;
            }
            sjf sjfVar = (sjf) this.l.a();
            zeo zeoVarB = sjf.a.b();
            zer zerVar = zfi.a;
            zdv zdvVar = (zdv) ((zdv) zeoVarB.o(zerVar, "ALT.ARCProvider")).q("com/google/android/libraries/search/audio/clients/impl/AudioRequestClientProviderImpl", "activateAudioRequestClient", 32, "AudioRequestClientProviderImpl.java");
            sgo sgoVar4 = rvcVar3.c;
            if (sgoVar4 == null) {
                sgoVar4 = sgo.a;
            }
            int iB = sgn.b(sgoVar4.b);
            if (iB == 0) {
                throw null;
            }
            zdvVar.x("#audio# activating audio request client(%s)", sgn.a(iB));
            sjd sjdVar = ((sjt) sjfVar.b.a(rvcVar3)).a;
            rvf rvfVar6 = (rvf) rveVar.v();
            zdv zdvVar2 = (zdv) ((zdv) sjd.a.b().o(zerVar, "ALT.ARClient")).q("com/google/android/libraries/search/audio/clients/impl/AudioRequestClientImpl", "startListening", 44, "AudioRequestClientImpl.java");
            int i = sjdVar.b;
            zdvVar2.v("#audio# starting listening for audio request client(token(%s))", i);
            this.h = ((sju) sjdVar.c.b(i, rvfVar6)).a;
            sjdVar.d.d(new Runnable() { // from class: twh
                @Override // java.lang.Runnable
                public final void run() {
                    twq twqVar = this.a;
                    if (twqVar.f.compareAndSet(false, true)) {
                        ((zdv) ((zdv) twq.a.d()).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", 219, "AudioLibraryAudioController.java")).u("Transcription audio client deactivated before explicit mic close requested");
                        ttq ttqVar = twqVar.d;
                        ttqVar.p();
                        ttqVar.o();
                    }
                }
            }, zwk.a);
        }
        wzx wzxVarG = wzx.g(this.h.b());
        zvi zviVar = new zvi() { // from class: twi
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                rxh rxhVarB;
                ruv ruvVar = (ruv) obj;
                if (ruvVar.a().g()) {
                    this.a.d.q();
                    return zxn.h(ruvVar.a());
                }
                rxj rxjVar = ((rvk) ruvVar.f()).c;
                if (rxjVar == null) {
                    rxjVar = rxj.a;
                }
                if (rxjVar.b != 2 || (rxhVarB = rxh.b(((Integer) rxjVar.c).intValue())) == null) {
                    rxhVarB = rxh.UNKNOWN_OPENING_FAILURE;
                }
                return zxn.g(new trq(rxhVarB.aq));
            }
        };
        zyh zyhVar = this.j;
        this.g = wzxVarG.i(zviVar, zyhVar).e(Exception.class, new zvi() { // from class: twj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                Exception exc = (Exception) obj;
                zdy zdyVar = twq.a;
                ((zdv) ((zdv) ((zdv) zdyVar.d()).p(exc)).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", (char) 247, "AudioLibraryAudioController.java")).u("start listening request failed.");
                twq twqVar = this.a;
                if (twqVar.i != null) {
                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", 249, "AudioLibraryAudioController.java")).v("remove attributionKey: %d", twqVar.i.c);
                    twqVar.b.b(twqVar.i);
                }
                return zxn.g(exc);
            }
        }, zyhVar);
        Callable callable = new Callable() { // from class: twk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                float f;
                float f2;
                twq twqVar = this.a;
                InputStream inputStreamC = twqVar.c();
                ruo ruoVarF2 = twqVar.f();
                int i2 = ruoVarF2.d;
                int iBitCount = ((i2 + i2) / 1000) * 20 * Integer.bitCount(ruoVarF2.e);
                byte[] bArr = new byte[iBitCount];
                float f3 = 75.0f;
                while (true) {
                    ttq ttqVar = twqVar.d;
                    int i3 = ((sfa) inputStreamC).read(bArr, 0, iBitCount);
                    if (i3 == -1) {
                        ttqVar.r(0);
                        return null;
                    }
                    if (i3 != 0) {
                        long j = 0;
                        int i4 = i3;
                        long j2 = 0;
                        while (i4 >= 2) {
                            int i5 = bArr[i4 - 1] << 8;
                            i4 -= 2;
                            j2 += i5 + (bArr[i4] & 255);
                            j += r12 * r12;
                        }
                        double d = i3 / 2.0d;
                        float fSqrt = (float) Math.sqrt(((j * d) - (j2 * j2)) / (d * d));
                        if (f3 < fSqrt) {
                            f = f3 * 0.999f;
                            f2 = 0.001f;
                        } else {
                            f = f3 * 0.95f;
                            f2 = 0.05f;
                        }
                        f3 = f + (f2 * fSqrt);
                        float fLog10 = -120.0f;
                        if (f3 > 0.0d) {
                            double d2 = fSqrt / f3;
                            if (d2 > 1.0E-6d) {
                                fLog10 = ((float) Math.log10(d2)) * 10.0f;
                            }
                        }
                        ttqVar.r((int) (((Math.min(Math.max(fLog10, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f));
                    }
                }
            }
        };
        zyh zyhVar2 = this.k;
        zxn.k(wyo.i(callable), zyhVar2);
        zxn.p(zxn.k(wyo.i(new Callable() { // from class: twl
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                int i2;
                boolean z;
                byte[] bArrA;
                twq twqVar = this.a;
                Optional optional3 = ((tsk) twqVar.c).h;
                if (!optional3.isPresent()) {
                    return Uri.EMPTY;
                }
                uab uabVar = twqVar.e;
                ruo ruoVarF2 = twqVar.f();
                InputStream inputStreamC = twqVar.c();
                Object obj = optional3.get();
                for (tqh tqhVar : tqh.values()) {
                    adis adisVar = tqhVar.f;
                    if (adisVar == obj) {
                        Context context = uabVar.b;
                        File file = new File(new File(context.getFilesDir(), "recordings"), "recording.amr");
                        abt abtVarB = FileProvider.b(context, String.valueOf(context.getPackageName()).concat(".AudioRecordingProvider"));
                        try {
                            String canonicalPath = file.getCanonicalPath();
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : abtVarB.b.entrySet()) {
                                String path = ((File) entry2.getValue()).getPath();
                                if (abtVarB.b(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                                    entry = entry2;
                                }
                            }
                            if (entry == null) {
                                throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
                            }
                            String path2 = ((File) entry.getValue()).getPath();
                            Uri uriBuild = new Uri.Builder().scheme("content").authority(abtVarB.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
                            context.revokeUriPermission(uriBuild, 1);
                            byte[] bArrB = abvo.w(inputStreamC).B();
                            adis adisVar2 = adis.AMR;
                            if (adisVar == adisVar2) {
                                i2 = 8000;
                            } else {
                                if (adisVar != adis.AMR_WB && adisVar != adis.OGG_OPUS) {
                                    throw new RuntimeException("Unsupported AMR encoding: ".concat(String.valueOf(adisVar.name())));
                                }
                                i2 = 16000;
                            }
                            int i3 = ruoVarF2.d;
                            if (i3 != i2) {
                                int length = bArrB.length;
                                z = false;
                                ((zdv) ((zdv) uac.a.b()).q("com/google/android/libraries/speech/transcription/recording/PcmResampler", "resample", 20, "PcmResampler.java")).z("Resampling from %d to %d", i3, i2);
                                if (i3 != i2) {
                                    if (i3 < i2) {
                                        throw new UnsupportedOperationException("Upsampling is not supported yet");
                                    }
                                    int i4 = i3 / i2;
                                    int i5 = length / i4;
                                    if ((i5 & 1) == 1) {
                                        i5++;
                                    }
                                    int i6 = i5 - 1;
                                    Integer numValueOf = Integer.valueOf(i6);
                                    Integer numValueOf2 = Integer.valueOf(length - 1);
                                    if (i6 >= length) {
                                        throw new IllegalArgumentException(yro.a("The src array does not have enough space to hold the downsampled audio.  Downsampling would write from src[%s] to src[%s], but src terminates at src[%s].", 0, numValueOf, numValueOf2));
                                    }
                                    for (int i7 = 0; i7 < i5; i7 += 2) {
                                        int i8 = i7 * i4;
                                        bArrB[i7] = bArrB[i8];
                                        bArrB[i7 + 1] = bArrB[i8 + 1];
                                    }
                                    length = i5;
                                }
                                bArrB = Arrays.copyOf(bArrB, length);
                            } else {
                                z = false;
                            }
                            int iOrdinal = tqhVar.ordinal();
                            if (iOrdinal == 0) {
                                bArrA = tqi.a(bArrB, adisVar2, true);
                            } else {
                                if (iOrdinal != 1) {
                                    throw new IllegalArgumentException("Encoding not supported: ".concat(String.valueOf(String.valueOf(tqhVar))));
                                }
                                bArrA = tqi.a(bArrB, adis.AMR_WB, z);
                            }
                            File file2 = new File(context.getFilesDir(), "recordings");
                            file2.mkdir();
                            File file3 = new File(file2, "recording.amr");
                            file3.createNewFile();
                            ((zdv) ((zdv) uab.a.b()).q("com/google/android/libraries/speech/transcription/recording/AudioRecordingProvider", "saveAudioFile", 79, "AudioRecordingProvider.java")).x("Writing audio to file %s", file3);
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            try {
                                fileOutputStream.write(bArrA);
                                return uriBuild;
                            } finally {
                                fileOutputStream.close();
                            }
                        } catch (IOException unused) {
                            file.toString();
                            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file.toString()));
                        }
                    }
                }
                throw new IllegalArgumentException("invalid recognizer encoding: ".concat(String.valueOf(((adis) obj).name())));
            }
        }), zyhVar2), wyo.f(new twm(this)), zyhVar);
    }

    public final ruo f() {
        ruo ruoVar = ruo.a;
        rui ruiVar = new rui();
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        long j = true != ((tsk) this.c).o ? 300000L : 86400000L;
        ruo ruoVar2 = (ruo) ruiVar.b;
        ruoVar2.b |= 128;
        ruoVar2.i = j;
        int iA = a();
        if ((ruiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ruiVar.y();
        }
        ruo ruoVar3 = (ruo) ruiVar.b;
        ruoVar3.b |= 4;
        ruoVar3.e = iA;
        int iB = b();
        if ((Integer.MIN_VALUE & ruiVar.b.memoizedSerializedSize) == 0) {
            ruiVar.y();
        }
        ruo ruoVar4 = (ruo) ruiVar.b;
        ruoVar4.b |= 2;
        ruoVar4.d = iB;
        return (ruo) ruiVar.v();
    }
}
