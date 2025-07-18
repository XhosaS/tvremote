package defpackage;

import android.content.Context;
import android.os.Process;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvy implements twa {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer");
    public final zyh c;
    public final zyh d;
    public final mbp e;
    public final yqt f;
    public final wxc g;
    public final abwf h;
    public final boolean i;
    public final int j;
    public final twe l;
    public final twb m;
    public final yzq n;
    public final yqt o;
    public final yqt p;
    public final yqt q;
    public final yqt r;
    public final yqt s;
    public final ttq t;
    public final Context u;
    public mbo w;
    public final mck x;
    public final tru y;
    public final txq z;
    public final AtomicBoolean v = new AtomicBoolean(false);
    public final adgq k = adgq.a;
    public final wzw b = new wzw();

    static {
        acbg.d(10L, 0);
    }

    public tvy(Context context, tru truVar, txq txqVar, zyh zyhVar, zyh zyhVar2, mbp mbpVar, mck mckVar, yqt yqtVar, wxc wxcVar, Map map, Map map2, yqt yqtVar2, yqt yqtVar3, yqt yqtVar4, yqt yqtVar5, twe tweVar, twb twbVar, ttq ttqVar) {
        this.u = context;
        this.y = truVar;
        this.i = truVar.d;
        this.h = truVar.c;
        this.j = truVar.e;
        this.z = txqVar;
        this.c = zyhVar;
        this.d = zyhVar2;
        this.e = mbpVar;
        this.x = mckVar;
        this.f = yqtVar;
        this.g = wxcVar;
        tsk tskVar = (tsk) tweVar;
        this.n = (tskVar.y || f(tweVar)) ? (yzq) Collection.EL.stream(map.values()).map(new Function() { // from class: tvl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (mby) ((agow) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ywk.b) : zcp.b;
        this.o = yqt.h((agow) map2.get(f(tweVar) ? "smart_dictation" : tskVar.y ? "ANDROID_SPEECH_API" : "")).b(new yqi() { // from class: tvm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (mbz) ((agow) obj).a();
            }
        });
        this.p = yqtVar2;
        this.q = yqtVar3;
        this.r = yqtVar4;
        this.s = yqtVar5;
        this.l = tweVar;
        this.m = twbVar;
        this.t = ttqVar;
    }

    public static adma b(twe tweVar) {
        tsk tskVar = (tsk) tweVar;
        if (!tskVar.f.equals(twc.GRPC_SERVICE_API)) {
            return adma.RECOGNITION_SERVICE_PUBLIC_API;
        }
        Optional optional = tskVar.E;
        if (optional.isEmpty()) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "getHostAppId", 618, "SodaSpeechRecognizer.java")).u("Google ASR Service did not send a HostAppId.");
        }
        return (adma) optional.orElse(adma.UNKNOWN_HOST_APP_ID);
    }

    static /* synthetic */ void d(zyd zydVar, String str, Object[] objArr) {
        try {
            zxn.o(zydVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e.getCause())).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "logFutureOnFailure", 1061, "SodaSpeechRecognizer.java")).M(str, objArr);
        }
    }

    public static void e(final zyd zydVar, final String str, final Object... objArr) {
        zydVar.d(new Runnable() { // from class: tvd
            @Override // java.lang.Runnable
            public final void run() {
                tvy.d(zydVar, str, objArr);
            }
        }, zwk.a);
    }

    public static boolean f(twe tweVar) {
        return b(tweVar).equals(adma.GBOARD_SMART_DICTATION) || ((tsk) tweVar).w.equals("smart_dictation");
    }

    @Override // defpackage.twa
    public final void a() {
        e(this.b.a(new Callable() { // from class: tvf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((zdv) ((zdv) tvy.a.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "cancel", 272, "SodaSpeechRecognizer.java")).u("Offline recognizer - stop detection");
                tvy tvyVar = this.a;
                if (!tvyVar.v.compareAndSet(false, true)) {
                    return null;
                }
                tvyVar.m.c(new tre());
                mbo mboVar = tvyVar.w;
                if (mboVar == null) {
                    return null;
                }
                mboVar.f();
                return null;
            }
        }, this.c), "Failed call #cancel", new Object[0]);
    }

    @Override // defpackage.twa
    public final void c(final Supplier supplier, final int i, final int i2) {
        e(this.b.b(new zvh() { // from class: tvg
            @Override // defpackage.zvh
            public final zyd a() {
                zdy zdyVar = tvy.a;
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startListening", 227, "SodaSpeechRecognizer.java")).u("Offline recognizer - start listening");
                final tvy tvyVar = this.a;
                if (tvyVar.w != null) {
                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startListening", 231, "SodaSpeechRecognizer.java")).u("Recognizer already starts listening.");
                    return zxy.a;
                }
                final int i3 = i2;
                final int i4 = i;
                final Supplier supplier2 = supplier;
                twe tweVar = tvyVar.l;
                zdv zdvVar = (zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startListening", 237, "SodaSpeechRecognizer.java");
                tsk tskVar = (tsk) tweVar;
                String str = tskVar.b;
                final adlm adlmVar = tskVar.i;
                zdvVar.F("Initialize Soda [locale: %s], [applicationDomain: %s]", str, adlmVar.name());
                txq txqVar = tvyVar.z;
                tskVar.A.isPresent();
                wzx wzxVarG = wzx.g(txqVar.a(str));
                zvi zviVar = new zvi() { // from class: tvr
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        int iA;
                        tvy tvyVar2 = tvyVar;
                        final yyr yyrVar = (yyr) obj;
                        if (tvyVar2.y.f) {
                            Optional optional = ((tsk) tvyVar2.l).B;
                            if (!optional.isEmpty() && (iA = adnn.a(((adno) optional.get()).c)) != 0 && iA != 1) {
                                wzx wzxVarG2 = wzx.g(tvyVar2.z.a("ag-AG"));
                                yqi yqiVar = new yqi() { // from class: tvn
                                    @Override // defpackage.yqi
                                    public final Object apply(Object obj2) {
                                        zdy zdyVar2 = tvy.a;
                                        txt txtVar = (txt) ((yyr) obj2).get("ag-AG");
                                        yyr yyrVar2 = yyrVar;
                                        if (txtVar == null) {
                                            ((zdv) ((zdv) tvy.a.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "includeUsmEncoderLanguagePackIfPossible", 320, "SodaSpeechRecognizer.java")).u("USM encoder LP not available.");
                                            return yyrVar2;
                                        }
                                        ((zdv) ((zdv) tvy.a.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "includeUsmEncoderLanguagePackIfPossible", 314, "SodaSpeechRecognizer.java")).u("Found USM encoder LP.");
                                        yyn yynVar = new yyn(4);
                                        yynVar.f(yyrVar2);
                                        yynVar.c("ag-AG", txtVar);
                                        return yynVar.a(false);
                                    }
                                };
                                zyh zyhVar = tvyVar2.d;
                                return wzxVarG2.h(yqiVar, zyhVar).e(Throwable.class, new zvi() { // from class: tvo
                                    @Override // defpackage.zvi
                                    public final zyd a(Object obj2) {
                                        ((zdv) ((zdv) ((zdv) tvy.a.b()).p((Throwable) obj2)).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "includeUsmEncoderLanguagePackIfPossible", 328, "SodaSpeechRecognizer.java")).u("Can't get USM encoder LP.");
                                        return zxn.h(yyrVar);
                                    }
                                }, zyhVar);
                            }
                        }
                        return zxn.h(yyrVar);
                    }
                };
                zyh zyhVar = tvyVar.c;
                wzx wzxVarI = wzxVarG.i(zviVar, zyhVar).i(new zvi() { // from class: tvs
                    /* JADX WARN: Removed duplicated region for block: B:122:0x03ad  */
                    /* JADX WARN: Removed duplicated region for block: B:138:0x0426  */
                    /* JADX WARN: Removed duplicated region for block: B:150:0x0483  */
                    /* JADX WARN: Removed duplicated region for block: B:152:0x0489  */
                    /* JADX WARN: Removed duplicated region for block: B:153:0x048f  */
                    /* JADX WARN: Removed duplicated region for block: B:160:0x04ca  */
                    /* JADX WARN: Type inference failed for: r1v92, types: [java.lang.Object, zyd] */
                    @Override // defpackage.zvi
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final defpackage.zyd a(java.lang.Object r22) {
                        /*
                            Method dump skipped, instructions count: 1607
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvs.a(java.lang.Object):zyd");
                    }
                }, zyhVar);
                zvi zviVar2 = new zvi() { // from class: tvt
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        zdy zdyVar2;
                        int i5;
                        tvy tvyVar2 = tvyVar;
                        tvyVar2.w = (mbo) obj;
                        AtomicBoolean atomicBoolean = tvyVar2.v;
                        final mbo mboVar = tvyVar2.w;
                        if (atomicBoolean.get()) {
                            ((zdv) ((zdv) tvy.a.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startDetection", 347, "SodaSpeechRecognizer.java")).u("Transcription already cancelled - not start detection");
                            mboVar.f();
                            return zxy.a;
                        }
                        if (mboVar.g() && ((mbt) mboVar.f.c()).p()) {
                            ((zdv) ((zdv) tvy.a.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startDetection", 355, "SodaSpeechRecognizer.java")).u("Soda already running!");
                            tvyVar2.m.c(new trp(2));
                            return zxy.a;
                        }
                        zdy zdyVar3 = tvy.a;
                        ((zdv) ((zdv) zdyVar3.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "startDetection", 361, "SodaSpeechRecognizer.java")).u("Offline recognizer - start detection");
                        tsk tskVar2 = (tsk) tvyVar2.l;
                        tskVar2.J.isPresent();
                        adtt adttVar = adtt.a;
                        adts adtsVar = new adts();
                        adtn adtnVar = adtn.a;
                        adtl adtlVar = new adtl();
                        yqt yqtVar = tvyVar2.o;
                        if (yqtVar.g()) {
                            mbz mbzVar = (mbz) yqtVar.c();
                            i5 = Integer.MIN_VALUE;
                            ((zdv) ((zdv) zdyVar3.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "getRecognitionContext", 760, "SodaSpeechRecognizer.java")).x("Adding device context biasing for %s", mbzVar.b());
                            adtk adtkVar = adtk.a;
                            adtj adtjVar = new adtj();
                            adta adtaVar = adta.a;
                            adsz adszVar = new adsz();
                            abvo abvoVarV = abvo.v(mbzVar.b());
                            if ((adszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adszVar.y();
                            }
                            adta adtaVar2 = (adta) adszVar.b;
                            abxs abxsVar = adtaVar2.b;
                            if (abxsVar.c()) {
                                zdyVar2 = zdyVar3;
                            } else {
                                int size = abxsVar.size();
                                zdyVar2 = zdyVar3;
                                adtaVar2.b = abxsVar.d(size + size);
                            }
                            adtaVar2.b.add(abvoVarV);
                            if ((adtjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adtjVar.y();
                            }
                            adtk adtkVar2 = (adtk) adtjVar.b;
                            adta adtaVar3 = (adta) adszVar.v();
                            adtaVar3.getClass();
                            adtkVar2.c = adtaVar3;
                            adtkVar2.b = 1;
                            adtlVar.a("client-id", (adtk) adtjVar.v());
                            adtsVar.a(mbzVar.a());
                        } else {
                            zdyVar2 = zdyVar3;
                            i5 = Integer.MIN_VALUE;
                        }
                        adgq adgqVar = tvyVar2.k;
                        adgo adgoVar = adgqVar.b;
                        if (adgoVar == null) {
                            adgoVar = adgo.a;
                        }
                        if (!adgoVar.b.isEmpty()) {
                            adtk adtkVar3 = adtk.a;
                            adtj adtjVar2 = new adtj();
                            adta adtaVar4 = adta.a;
                            adsz adszVar2 = new adsz();
                            adgo adgoVar2 = adgqVar.b;
                            if (adgoVar2 == null) {
                                adgoVar2 = adgo.a;
                            }
                            Stream map = Collection.EL.stream(adgoVar2.b).map(new Function() { // from class: tvj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo116andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return abvo.v((String) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i6 = yyk.e;
                            Iterable iterable = (Iterable) map.collect(ywk.a);
                            if ((adszVar2.b.memoizedSerializedSize & i5) == 0) {
                                adszVar2.y();
                            }
                            adta adtaVar5 = (adta) adszVar2.b;
                            abxs abxsVar2 = adtaVar5.b;
                            if (!abxsVar2.c()) {
                                int size2 = abxsVar2.size();
                                adtaVar5.b = abxsVar2.d(size2 + size2);
                            }
                            abus.m(iterable, adtaVar5.b);
                            if ((adtjVar2.b.memoizedSerializedSize & i5) == 0) {
                                adtjVar2.y();
                            }
                            adtk adtkVar4 = (adtk) adtjVar2.b;
                            adta adtaVar6 = (adta) adszVar2.v();
                            adtaVar6.getClass();
                            adtkVar4.c = adtaVar6;
                            adtkVar4.b = 1;
                            adtlVar.a("experiment-labels", (adtk) adtjVar2.v());
                        }
                        zdl it = tvyVar2.n.iterator();
                        while (it.hasNext()) {
                            mby mbyVar = (mby) it.next();
                            adti adtiVarB = mbyVar.b();
                            if ((adtsVar.b.memoizedSerializedSize & i5) == 0) {
                                adtsVar.y();
                            }
                            adtt adttVar2 = (adtt) adtsVar.b;
                            adtiVarB.getClass();
                            abxs abxsVar3 = adttVar2.c;
                            if (!abxsVar3.c()) {
                                int size3 = abxsVar3.size();
                                adttVar2.c = abxsVar3.d(size3 + size3);
                            }
                            adttVar2.c.add(adtiVarB);
                            yyr yyrVarA = mbyVar.a();
                            if ((adtlVar.b.memoizedSerializedSize & i5) == 0) {
                                adtlVar.y();
                            }
                            adtn adtnVar2 = (adtn) adtlVar.b;
                            abyl abylVar = adtnVar2.b;
                            if (!abylVar.b) {
                                adtnVar2.b = abylVar.a();
                            }
                            adtnVar2.b.putAll(yyrVarA);
                        }
                        if ((adtsVar.b.memoizedSerializedSize & i5) == 0) {
                            adtsVar.y();
                        }
                        adtt adttVar3 = (adtt) adtsVar.b;
                        adtn adtnVar3 = (adtn) adtlVar.v();
                        adtnVar3.getClass();
                        adttVar3.d = adtnVar3;
                        adttVar3.b |= 1;
                        adgo adgoVar3 = adgqVar.b;
                        if (adgoVar3 == null) {
                            adgoVar3 = adgo.a;
                        }
                        adgs adgsVar = adgoVar3.d;
                        if (adgsVar == null) {
                            adgsVar = adgs.a;
                        }
                        if ((adtsVar.b.memoizedSerializedSize & i5) == 0) {
                            adtsVar.y();
                        }
                        adtt adttVar4 = (adtt) adtsVar.b;
                        adgsVar.getClass();
                        adttVar4.f = adgsVar;
                        adttVar4.b |= 4;
                        adgo adgoVar4 = adgqVar.b;
                        if (adgoVar4 == null) {
                            adgoVar4 = adgo.a;
                        }
                        if (!adgoVar4.c.isEmpty()) {
                            adgo adgoVar5 = adgqVar.b;
                            if (adgoVar5 == null) {
                                adgoVar5 = adgo.a;
                            }
                            adtsVar.a(adgoVar5.c);
                        }
                        yyk yykVar = tskVar2.x;
                        if (!yykVar.isEmpty()) {
                            ((zdv) ((zdv) zdyVar2.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "getRecognitionContext", 805, "SodaSpeechRecognizer.java")).u("Adding phrases biasing...");
                            adth adthVar = adth.a;
                            adtg adtgVar = new adtg();
                            int size4 = yykVar.size();
                            for (int i7 = 0; i7 < size4; i7++) {
                                String str2 = (String) yykVar.get(i7);
                                adtf adtfVar = adtf.a;
                                adte adteVar = new adte();
                                if ((adteVar.b.memoizedSerializedSize & i5) == 0) {
                                    adteVar.y();
                                }
                                adtf adtfVar2 = (adtf) adteVar.b;
                                str2.getClass();
                                adtfVar2.b |= 1;
                                adtfVar2.c = str2;
                                if ((adtgVar.b.memoizedSerializedSize & i5) == 0) {
                                    adtgVar.y();
                                }
                                adth adthVar2 = (adth) adtgVar.b;
                                adtf adtfVar3 = (adtf) adteVar.v();
                                adtfVar3.getClass();
                                abxs abxsVar4 = adthVar2.b;
                                if (!abxsVar4.c()) {
                                    int size5 = abxsVar4.size();
                                    adthVar2.b = abxsVar4.d(size5 + size5);
                                }
                                adthVar2.b.add(adtfVar3);
                            }
                            adti adtiVar = adti.a;
                            adtb adtbVar = new adtb();
                            if ((adtbVar.b.memoizedSerializedSize & i5) == 0) {
                                adtbVar.y();
                            }
                            adti adtiVar2 = (adti) adtbVar.b;
                            adtiVar2.b |= 1;
                            adtiVar2.e = "android-speech-api-generic-phrases";
                            if ((adtbVar.b.memoizedSerializedSize & i5) == 0) {
                                adtbVar.y();
                            }
                            adti adtiVar3 = (adti) adtbVar.b;
                            adth adthVar3 = (adth) adtgVar.v();
                            adthVar3.getClass();
                            adtiVar3.d = adthVar3;
                            adtiVar3.c = 2;
                            if ((adtsVar.b.memoizedSerializedSize & i5) == 0) {
                                adtsVar.y();
                            }
                            adtt adttVar5 = (adtt) adtsVar.b;
                            adti adtiVar4 = (adti) adtbVar.v();
                            adtiVar4.getClass();
                            abxs abxsVar5 = adttVar5.c;
                            if (!abxsVar5.c()) {
                                int size6 = abxsVar5.size();
                                adttVar5.c = abxsVar5.d(size6 + size6);
                            }
                            adttVar5.c.add(adtiVar4);
                        }
                        boolean z = adgqVar.c;
                        if ((adtsVar.b.memoizedSerializedSize & i5) == 0) {
                            adtsVar.y();
                        }
                        adtt adttVar6 = (adtt) adtsVar.b;
                        adttVar6.b |= 16;
                        adttVar6.g = z;
                        final yqt yqtVarI = yqt.i((adtt) adtsVar.v());
                        yqt yqtVar2 = tvyVar2.q;
                        if (yqtVar2.g() && ((tva) yqtVar2.c()).e()) {
                            ((tva) yqtVar2.c()).f();
                        }
                        final int i8 = i3;
                        final int i9 = i4;
                        final InputStream inputStream = (InputStream) supplier2.get();
                        final ypv ypvVar = ypv.a;
                        zxn.p(zxn.l(wyo.b(new zvh() { // from class: mbj
                            @Override // defpackage.zvh
                            public final zyd a() throws SecurityException, IllegalArgumentException {
                                zyd zydVarG;
                                Boolean bool = false;
                                bool.getClass();
                                adsy adsyVar = adsy.a;
                                adsx adsxVar = new adsx();
                                adsq adsqVar = adsq.a;
                                adsp adspVar = new adsp();
                                adsw adswVar = adsw.a;
                                adsr adsrVar = new adsr();
                                int i10 = adsrVar.b.memoizedSerializedSize & Integer.MIN_VALUE;
                                yqt yqtVar3 = ypvVar;
                                if (i10 == 0) {
                                    adsrVar.y();
                                }
                                adsw adswVar2 = (adsw) adsrVar.b;
                                adswVar2.c = 0;
                                adswVar2.b |= 1;
                                if ((adsrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adsrVar.y();
                                }
                                adsw adswVar3 = (adsw) adsrVar.b;
                                adswVar3.f = 0;
                                adswVar3.b |= 32;
                                if ((adsrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adsrVar.y();
                                }
                                adsw adswVar4 = (adsw) adsrVar.b;
                                adswVar4.d = 2;
                                adswVar4.b |= 2;
                                adls adlsVar = adls.a;
                                adlp adlpVar = new adlp();
                                if ((adlpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adlpVar.y();
                                }
                                adls adlsVar2 = (adls) adlpVar.b;
                                adlsVar2.c = 1;
                                adlsVar2.b |= 1;
                                if ((adlpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adlpVar.y();
                                }
                                int i11 = i8;
                                adls adlsVar3 = (adls) adlpVar.b;
                                adlsVar3.b |= 4;
                                adlsVar3.e = i11;
                                if ((adlpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adlpVar.y();
                                }
                                int i12 = i9;
                                adls adlsVar4 = (adls) adlpVar.b;
                                adlsVar4.b |= 2;
                                adlsVar4.d = i12;
                                if ((adsrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adsrVar.y();
                                }
                                adsw adswVar5 = (adsw) adsrVar.b;
                                adls adlsVar5 = (adls) adlpVar.v();
                                adlsVar5.getClass();
                                adswVar5.e = adlsVar5;
                                adswVar5.b |= 4;
                                if ((adspVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adspVar.y();
                                }
                                adsq adsqVar2 = (adsq) adspVar.b;
                                adsw adswVar6 = (adsw) adsrVar.v();
                                adswVar6.getClass();
                                adsqVar2.c = adswVar6;
                                adsqVar2.b = 1;
                                if ((adsxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adsxVar.y();
                                }
                                adsy adsyVar2 = (adsy) adsxVar.b;
                                adsq adsqVar3 = (adsq) adspVar.v();
                                adsqVar3.getClass();
                                adsyVar2.e = adsqVar3;
                                adsyVar2.b |= 8;
                                if ((adsxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adsxVar.y();
                                }
                                adsy adsyVar3 = (adsy) adsxVar.b;
                                adsyVar3.b |= 2;
                                adsyVar3.d = false;
                                if ((adsxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adsxVar.y();
                                }
                                adsy adsyVar4 = (adsy) adsxVar.b;
                                adsyVar4.b |= 128;
                                adsyVar4.g = 0;
                                if ((adsxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adsxVar.y();
                                }
                                yqt yqtVar4 = yqtVarI;
                                adsy adsyVar5 = (adsy) adsxVar.b;
                                adsyVar5.b |= 1;
                                adsyVar5.c = true;
                                if ((adsxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adsxVar.y();
                                }
                                Object obj2 = ((yqz) yqtVar4).a;
                                mbo mboVar2 = mboVar;
                                adsy adsyVar6 = (adsy) adsxVar.b;
                                adsyVar6.f = (adtt) obj2;
                                adsyVar6.b |= 32;
                                adlo adloVar = mboVar2.d;
                                if (adloVar != null) {
                                    if ((adsxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adsxVar.y();
                                    }
                                    adsy adsyVar7 = (adsy) adsxVar.b;
                                    adsyVar7.h = adloVar;
                                    adsyVar7.b |= 256;
                                }
                                InputStream inputStream2 = inputStream;
                                adsy adsyVar8 = (adsy) adsxVar.v();
                                if (!mboVar2.e) {
                                    if (mboVar2.g()) {
                                        yqt yqtVar5 = mboVar2.f;
                                        if (!((mbt) yqtVar5.c()).p()) {
                                            try {
                                                Process.setThreadPriority(Process.getThreadPriority(0));
                                                return ((mbt) yqtVar5.c()).e(adsyVar8, inputStream2, yqtVar3);
                                            } catch (IllegalStateException e) {
                                                ((zdv) ((zdv) ((zdv) mbo.a.c()).p(e)).q("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "startDetectionInternal", 593, "SodaDetectionHandler.java")).u("SODA failed to start capturing.");
                                                zydVarG = zxn.g(new IllegalStateException("SODA failed to start capturing"));
                                            } finally {
                                            }
                                        }
                                    }
                                    return zxn.g(new IllegalStateException("SODA is not ready for startCapture"));
                                }
                                max maxVar = mboVar2.g;
                                String strC = mboVar2.c();
                                mbg mbgVar = mboVar2.c;
                                Optional optionalOfNullable = Optional.ofNullable(null);
                                ((zdv) ((zdv) max.a.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "startDetection", 378, "ConcurrentSodaManager.java")).u("#startDetection with input stream");
                                synchronized (maxVar.j) {
                                    mbt mbtVarB = maxVar.b(strC, mbgVar);
                                    if (mbtVarB != null && mbtVarB.o()) {
                                        if (mbtVarB.p()) {
                                            return zxn.g(new IllegalStateException("SODA is not ready for startCapture"));
                                        }
                                        try {
                                            try {
                                                Process.setThreadPriority(Process.getThreadPriority(0));
                                                zydVarG = mbtVarB.e(adsyVar8, inputStream2, yqt.h(optionalOfNullable.orElse(null)));
                                            } catch (IllegalStateException unused) {
                                                zydVarG = zxn.g(new IllegalStateException("SODA failed to start capturing"));
                                            }
                                        } finally {
                                        }
                                    }
                                    return zxn.g(new IllegalStateException("SODA is not initialized for this client"));
                                }
                                return zydVarG;
                            }
                        }), mboVar.h), wyo.f(new tvu(tvyVar2)), tvyVar2.d);
                        return zxy.a;
                    }
                };
                zyh zyhVar2 = tvyVar.d;
                return wzxVarI.i(zviVar2, zyhVar2).e(Throwable.class, new zvi() { // from class: tve
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        Throwable th = (Throwable) obj;
                        boolean z = th instanceof tri;
                        tvy tvyVar2 = tvyVar;
                        if (z) {
                            tri triVar = (tri) th;
                            ((zdv) ((zdv) tvy.a.c()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleStartListeningError", 396, "SodaSpeechRecognizer.java")).v("Failed to get language pack of required locale: error %d", ((trd) triVar.a).a);
                            tvyVar2.m.c(triVar);
                        } else if (th instanceof tro) {
                            tro troVar = (tro) th;
                            ((zdv) ((zdv) tvy.a.c()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleStartListeningError", 401, "SodaSpeechRecognizer.java")).v("Soda recognizer failed to initialize: ConfigStatus %d!", ((trd) troVar.a).a);
                            tvyVar2.m.c(troVar);
                        } else {
                            ((zdv) ((zdv) ((zdv) tvy.a.c()).p(th)).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleStartListeningError", (char) 406, "SodaSpeechRecognizer.java")).u("Soda recognizer failed to initialize: ConfigStatus UNKNOWN_FAILURE!");
                            tvyVar2.m.c(new tro(adsg.UNKNOWN_FAILURE));
                        }
                        return zxy.a;
                    }
                }, zyhVar2);
            }
        }, this.c), "Failed call #startListening", new Object[0]);
    }
}
