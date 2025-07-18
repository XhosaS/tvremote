package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttz implements twa {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer");
    public final zyh b;
    public final Context c;
    public final twb d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public ager f;
    private final zyh g;
    private final adkp h;
    private final twe i;
    private ager j;

    public ttz(zyh zyhVar, zyh zyhVar2, adkp adkpVar, Context context, twe tweVar, twb twbVar) {
        this.g = zyhVar;
        this.b = zyhVar2;
        this.h = adkpVar;
        this.c = context;
        this.i = tweVar;
        this.d = twbVar;
    }

    public static Throwable b(Throwable th, Class cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return th;
            }
            th = th.getCause();
        }
        return null;
    }

    private final synchronized void e() {
        StatusException statusExceptionAsException = Status.b.asException();
        if (this.e.compareAndSet(false, true)) {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "closeNetworkIfNeeded", 280, "NetworkSpeechRecognizer.java")).u("User cancelled, closing S3 stream");
            ager agerVar = this.f;
            if (agerVar != null) {
                adkb adkbVar = adkb.a;
                adka adkaVar = new adka();
                if ((adkaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adkaVar.y();
                }
                adkb adkbVar2 = (adkb) adkaVar.b;
                adkbVar2.b |= 8;
                adkbVar2.e = true;
                ((trv) agerVar).g((adkb) adkaVar.v());
                this.f.f(statusExceptionAsException);
            }
            ager agerVar2 = this.j;
            if (agerVar2 != null) {
                agerVar2.f(statusExceptionAsException);
            }
        }
    }

    @Override // defpackage.twa
    public final void a() {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "cancel", 207, "NetworkSpeechRecognizer.java")).u("#cancel");
        d(new tre());
    }

    @Override // defpackage.twa
    public final synchronized void c(Supplier supplier, final int i, final int i2) throws Throwable {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            zdy zdyVar = a;
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "startListening", 100, "NetworkSpeechRecognizer.java")).u("Online recognizer - start listening");
            try {
                if (this.e.get()) {
                    ((zdv) ((zdv) zdyVar.c()).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "startListening", 102, "NetworkSpeechRecognizer.java")).u("#closeNetworkIfNeeded called before #startNetworkAndProcessResponses");
                    return;
                }
                if (this.j == null && this.f == null) {
                    tyb tybVar = new tyb();
                    tye tyeVar = new tye();
                    twe tweVar = this.i;
                    tty ttyVar = new tty(this, yyk.r(tybVar, tyeVar, new tyc(((tsk) tweVar).C, ((tsk) tweVar).v.isPresent()), new tyd(), new tya()));
                    this.j = ttyVar;
                    adkp adkpVar = this.h;
                    afih afihVar = new afih();
                    afib afibVar = afih.b;
                    int i3 = afid.c;
                    afihVar.e(new afia("X-Goog-Api-Key", afibVar), "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU");
                    afihVar.e(new afia("X-Android-Package", afibVar), "com.google.android.googlequicksearchbox");
                    afihVar.e(new afia("X-Android-Cert", afibVar), "58E1C4133F7441EC3D2C270270A14802DA47BA0E");
                    this.f = new trv(((adkp) ((adkp) adkpVar.g(new ageq(afihVar))).h(aatd.a, new aatf())).b(ttyVar));
                    final InputStream inputStream = (InputStream) supplier.get();
                    twc twcVar = ((tsk) tweVar).f;
                    if (twcVar.equals(twc.GRPC_SERVICE_API)) {
                        twcVar = twc.SERVICE_API;
                    }
                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "startSendingS3Requests", 131, "NetworkSpeechRecognizer.java")).U(((tsk) tweVar).o, twcVar.name());
                    tsj tsjVar = new tsj(tweVar);
                    tsjVar.i(twcVar);
                    final twe tweVarV = tsjVar.v();
                    Runnable runnable = new Runnable() { // from class: ttt
                        /* JADX WARN: Type inference failed for: r5v0, types: [tqo] */
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            zdy zdyVar2 = tqp.a;
                            ?? r5 = new Object() { // from class: tqo
                            };
                            eoo eooVar = new eoo();
                            eoj eojVar = new eoj();
                            eon.a(this.a.c, "ogg_opus_encoder", new HashSet(), eooVar, r5, eojVar);
                            tqp.b = true;
                        }
                    };
                    zyh zyhVar = this.g;
                    zxn.p(zuz.h(zxn.j(wyo.h(runnable), zyhVar), wyo.c(new zvi() { // from class: ttu
                        @Override // defpackage.zvi
                        public final zyd a(Object obj) throws IOException {
                            Optional optionalEmpty;
                            adgk adgkVar;
                            adgd adgdVar;
                            int iA;
                            ttz ttzVar = this.a;
                            ager agerVar = ttzVar.f;
                            agerVar.getClass();
                            adkb adkbVar = adkb.a;
                            final adka adkaVar = new adka();
                            if ((adkaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adkaVar.y();
                            }
                            twe tweVar2 = tweVarV;
                            adkb adkbVar2 = (adkb) adkaVar.b;
                            adkbVar2.b |= 2;
                            adkbVar2.d = true;
                            tsk tskVar = (tsk) tweVar2;
                            String str = true != tskVar.c.isEmpty() ? "multi-recognizer" : "recognizer";
                            if ((adkaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adkaVar.y();
                            }
                            adkb adkbVar3 = (adkb) adkaVar.b;
                            adkbVar3.b |= 1;
                            adkbVar3.c = str;
                            yyk yykVar = tskVar.H;
                            try {
                                if (!yykVar.isEmpty()) {
                                    abxc abxcVar = adjx.b;
                                    adjw adjwVar = new adjw();
                                    Iterable iterable = (Iterable) Collection.EL.stream(yykVar).map(new Function() { // from class: txw
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo116andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            return Integer.valueOf(Integer.parseInt((String) obj2));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(ywk.a);
                                    if ((adjwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adjwVar.y();
                                    }
                                    adjx adjxVar = (adjx) adjwVar.b;
                                    abxj abxjVar = adjxVar.c;
                                    if (!abxjVar.c()) {
                                        int size = abxjVar.size();
                                        adjxVar.c = abxjVar.d(size + size);
                                    }
                                    abus.m(iterable, adjxVar.c);
                                    adkaVar.f(abxcVar, (adjx) adjwVar.v());
                                }
                            } catch (NumberFormatException e) {
                                ((zdv) ((zdv) ((zdv) txz.a.c()).p(e)).q("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "buildS3Header", 'S', "BaseS3HeaderProducer.java")).u("[RS][S3] failed to parse experiment ids.");
                            }
                            yyf yyfVar = new yyf(4);
                            twc twcVar2 = tskVar.f;
                            if (twcVar2.equals(twc.UNDEFINED)) {
                                ((zdv) ((zdv) txz.a.c()).q("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "s3ClientInfo", 115, "BaseS3HeaderProducer.java")).u("[RS][S3] transcription entrypoint is undefined.");
                            }
                            String strReplace = twcVar2.name().toLowerCase(Locale.US).replace('_', '-');
                            String str2 = tskVar.g;
                            if (true != str2.isEmpty()) {
                                strReplace = str2;
                            }
                            String str3 = tskVar.e;
                            if (str3.isEmpty()) {
                                str3 = tskVar.d;
                            }
                            ((zdv) ((zdv) txz.a.b()).q("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "s3ClientInfo", 126, "BaseS3HeaderProducer.java")).x("[RS][S3] triggerApplicationId: %s", str3);
                            adjt adjtVar = adjt.a;
                            adjs adjsVar = new adjs();
                            if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adjsVar.y();
                            }
                            adjt adjtVar2 = (adjt) adjsVar.b;
                            adjtVar2.c |= 2048;
                            adjtVar2.k = str3;
                            if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adjsVar.y();
                            }
                            adjt adjtVar3 = (adjt) adjsVar.b;
                            adjtVar3.c |= 4;
                            adjtVar3.f = "Android";
                            String str4 = Build.DISPLAY;
                            if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adjsVar.y();
                            }
                            adjt adjtVar4 = (adjt) adjsVar.b;
                            str4.getClass();
                            adjtVar4.c |= 8;
                            adjtVar4.g = str4;
                            String str5 = Build.MODEL;
                            if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adjsVar.y();
                            }
                            adjt adjtVar5 = (adjt) adjsVar.b;
                            str5.getClass();
                            adjtVar5.c |= 64;
                            adjtVar5.j = str5;
                            if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                adjsVar.y();
                            }
                            Context context = ttzVar.c;
                            adjt adjtVar6 = (adjt) adjsVar.b;
                            strReplace.getClass();
                            adjtVar6.c |= 16;
                            adjtVar6.h = strReplace;
                            try {
                                String string = Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                                if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adjsVar.y();
                                }
                                adjt adjtVar7 = (adjt) adjsVar.b;
                                string.getClass();
                                adjtVar7.c |= 32;
                                adjtVar7.i = string;
                                txx txxVar = new txx(adjt.b, (adjt) adjsVar.v());
                                adkh adkhVar = adkh.a;
                                adkg adkgVar = new adkg();
                                adjr adjrVar = adjr.a;
                                adjq adjqVar = new adjq();
                                if ((adjqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adjqVar.y();
                                }
                                adjr adjrVar2 = (adjr) adjqVar.b;
                                adjrVar2.b |= 2;
                                adjrVar2.d = 1;
                                String str6 = tskVar.b;
                                if ((adjqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adjqVar.y();
                                }
                                adjr adjrVar3 = (adjr) adjqVar.b;
                                adjrVar3.b |= 1;
                                adjrVar3.c = str6;
                                adjr adjrVar4 = (adjr) adjqVar.v();
                                if ((adkgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adkgVar.y();
                                }
                                adkh adkhVar2 = (adkh) adkgVar.b;
                                adjrVar4.getClass();
                                adkhVar2.f = adjrVar4;
                                adkhVar2.c |= 1;
                                yyk yykVar2 = tskVar.c;
                                int i4 = 0;
                                while (i4 < ((zcg) yykVar2).d) {
                                    String str7 = (String) yykVar2.get(i4);
                                    adjq adjqVar2 = new adjq();
                                    if ((adjqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adjqVar2.y();
                                    }
                                    adjr adjrVar5 = (adjr) adjqVar2.b;
                                    ager agerVar2 = agerVar;
                                    adjrVar5.b |= 2;
                                    adjrVar5.d = 1;
                                    if ((adjqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adjqVar2.y();
                                    }
                                    adjr adjrVar6 = (adjr) adjqVar2.b;
                                    str7.getClass();
                                    adjrVar6.b |= 1;
                                    adjrVar6.c = str7;
                                    adjr adjrVar7 = (adjr) adjqVar2.v();
                                    if ((adkgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adkgVar.y();
                                    }
                                    adkh adkhVar3 = (adkh) adkgVar.b;
                                    adjrVar7.getClass();
                                    abxs abxsVar = adkhVar3.g;
                                    if (!abxsVar.c()) {
                                        int size2 = abxsVar.size();
                                        adkhVar3.g = abxsVar.d(size2 + size2);
                                    }
                                    adkhVar3.g.add(adjrVar7);
                                    i4++;
                                    agerVar = agerVar2;
                                }
                                ager agerVar3 = agerVar;
                                Optional optional = tskVar.L;
                                if (optional.isPresent()) {
                                    adkgVar.a((adjm) optional.get());
                                }
                                txx txxVar2 = new txx(adkh.b, (adkh) adkgVar.v());
                                adji adjiVar = adji.a;
                                adjh adjhVar = new adjh();
                                if ((adjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adjhVar.y();
                                }
                                adji adjiVar2 = (adji) adjhVar.b;
                                adjiVar2.c |= 1;
                                adjiVar2.d = true;
                                txx txxVar3 = new txx(adji.b, (adji) adjhVar.v());
                                adjf adjfVar = adjf.a;
                                adje adjeVar = new adje();
                                adis adisVar = adis.OGG_OPUS;
                                if ((adjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adjeVar.y();
                                }
                                int i5 = i;
                                adjf adjfVar2 = (adjf) adjeVar.b;
                                adjfVar2.d = adisVar.q;
                                adjfVar2.c |= 1;
                                if ((adjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adjeVar.y();
                                }
                                adjf adjfVar3 = (adjf) adjeVar.b;
                                adjfVar3.c |= 2;
                                adjfVar3.e = i5;
                                if ((adjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adjeVar.y();
                                }
                                int i6 = i2;
                                adjf adjfVar4 = (adjf) adjeVar.b;
                                adjfVar4.c |= 4;
                                adjfVar4.f = i6;
                                txx txxVar4 = new txx(adjf.b, (adjf) adjeVar.v());
                                int i7 = tskVar.a;
                                if (i7 <= 0) {
                                    throw new IllegalStateException("Illegal Max Results param, should be >= 1");
                                }
                                advj advjVar = advj.a;
                                advi adviVar = new advi();
                                boolean z = tskVar.k;
                                if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adviVar.y();
                                }
                                advj advjVar2 = (advj) adviVar.b;
                                advjVar2.c |= 16;
                                advjVar2.h = z;
                                if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adviVar.y();
                                }
                                advj advjVar3 = (advj) adviVar.b;
                                advjVar3.c |= 64;
                                advjVar3.i = z;
                                if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adviVar.y();
                                }
                                advj advjVar4 = (advj) adviVar.b;
                                advjVar4.d |= 1;
                                advjVar4.m = true;
                                if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adviVar.y();
                                }
                                advj advjVar5 = (advj) adviVar.b;
                                advjVar5.c |= 33554432;
                                advjVar5.l = true;
                                int i8 = true != tskVar.q ? 0 : 2;
                                if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adviVar.y();
                                }
                                advj advjVar6 = (advj) adviVar.b;
                                advjVar6.c |= 16384;
                                advjVar6.j = i8;
                                if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adviVar.y();
                                }
                                advj advjVar7 = (advj) adviVar.b;
                                advjVar7.c |= 2;
                                advjVar7.g = i7;
                                boolean zIsPresent = tskVar.r.isPresent();
                                if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adviVar.y();
                                }
                                advj advjVar8 = (advj) adviVar.b;
                                advjVar8.d |= 65536;
                                advjVar8.n = zIsPresent;
                                boolean z2 = tskVar.C;
                                if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adviVar.y();
                                }
                                advj advjVar9 = (advj) adviVar.b;
                                advjVar9.e |= 8;
                                advjVar9.q = z2;
                                if (tskVar.I.equals("web_search")) {
                                    ((zdv) ((zdv) txz.a.b()).q("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "s3RecognizerInfo", 207, "BaseS3HeaderProducer.java")).u("[RS][S3] enabled secondary routing key");
                                    if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adviVar.y();
                                    }
                                    advj advjVar10 = (advj) adviVar.b;
                                    advjVar10.c |= 2097152;
                                    advjVar10.k = "android_3p_shortform";
                                }
                                Optional optional2 = tskVar.v;
                                if (optional2.isPresent() && (iA = adnv.a(((adnx) optional2.get()).c)) != 0 && iA == 2) {
                                    if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adviVar.y();
                                    }
                                    advj advjVar11 = (advj) adviVar.b;
                                    advjVar11.d |= 1048576;
                                    advjVar11.o = true;
                                    adiy adiyVar = adiy.a;
                                    adiw adiwVar = new adiw();
                                    int i9 = ((adnx) optional2.get()).d;
                                    if ((adiwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adiwVar.y();
                                    }
                                    adiy adiyVar2 = (adiy) adiwVar.b;
                                    adiyVar2.b |= 2;
                                    adiyVar2.d = i9;
                                    int i10 = ((adnx) optional2.get()).e;
                                    if ((adiwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adiwVar.y();
                                    }
                                    adiy adiyVar3 = (adiy) adiwVar.b;
                                    adiyVar3.b |= 1;
                                    adiyVar3.c = i10;
                                    if ((adiwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adiwVar.y();
                                    }
                                    adiy adiyVar4 = (adiy) adiwVar.b;
                                    adiyVar4.e = 1;
                                    adiyVar4.b |= 8;
                                    if ((adiwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adiwVar.y();
                                    }
                                    adiy adiyVar5 = (adiy) adiwVar.b;
                                    adiyVar5.f = 2;
                                    adiyVar5.b |= 16;
                                    adiy adiyVar6 = (adiy) adiwVar.v();
                                    if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adviVar.y();
                                    }
                                    advj advjVar12 = (advj) adviVar.b;
                                    adiyVar6.getClass();
                                    advjVar12.p = adiyVar6;
                                    advjVar12.d |= 2097152;
                                }
                                Optional optional3 = tskVar.F;
                                abxc abxcVar2 = advj.b;
                                if (optional3.isPresent()) {
                                    adgi adgiVar = adgi.a;
                                    adgh adghVar = new adgh();
                                    String str8 = ((esq) optional3.get()).b;
                                    if ((adghVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adghVar.y();
                                    }
                                    adgi adgiVar2 = (adgi) adghVar.b;
                                    str8.getClass();
                                    adgiVar2.b |= 1;
                                    adgiVar2.c = str8;
                                    String str9 = ((esq) optional3.get()).c;
                                    if ((adghVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adghVar.y();
                                    }
                                    adgi adgiVar3 = (adgi) adghVar.b;
                                    str9.getClass();
                                    adgiVar3.b |= 2;
                                    adgiVar3.d = str9;
                                    adgi adgiVar4 = (adgi) adghVar.v();
                                    adgj adgjVar = adgj.a;
                                    adgg adggVar = new adgg();
                                    if ((adggVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adggVar.y();
                                    }
                                    adgj adgjVar2 = (adgj) adggVar.b;
                                    adgiVar4.getClass();
                                    adgjVar2.c = adgiVar4;
                                    adgjVar2.b |= 2;
                                    adgj adgjVar3 = (adgj) adggVar.v();
                                    adgl adglVar = adgl.a;
                                    adgk adgkVar2 = new adgk();
                                    if ((adgkVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adgkVar2.y();
                                    }
                                    adgl adglVar2 = (adgl) adgkVar2.b;
                                    adgjVar3.getClass();
                                    abxs abxsVar2 = adglVar2.b;
                                    if (abxsVar2.c()) {
                                        adgkVar = adgkVar2;
                                    } else {
                                        int size3 = abxsVar2.size();
                                        adgkVar = adgkVar2;
                                        adglVar2.b = abxsVar2.d(size3 + size3);
                                    }
                                    adglVar2.b.add(adgjVar3);
                                    adgl adglVar3 = (adgl) adgkVar.v();
                                    adge adgeVar = adge.a;
                                    adgd adgdVar2 = new adgd();
                                    adgm adgmVar = adgm.a;
                                    adgf adgfVar = new adgf();
                                    if ((adgfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adgfVar.y();
                                    }
                                    adgm adgmVar2 = (adgm) adgfVar.b;
                                    adglVar3.getClass();
                                    adgmVar2.c = adglVar3;
                                    adgmVar2.b |= 128;
                                    if ((adgdVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adgdVar2.y();
                                    }
                                    adge adgeVar2 = (adge) adgdVar2.b;
                                    adgm adgmVar3 = (adgm) adgfVar.v();
                                    adgmVar3.getClass();
                                    abxs abxsVar3 = adgeVar2.b;
                                    if (abxsVar3.c()) {
                                        adgdVar = adgdVar2;
                                    } else {
                                        int size4 = abxsVar3.size();
                                        adgdVar = adgdVar2;
                                        adgeVar2.b = abxsVar3.d(size4 + size4);
                                    }
                                    adgeVar2.b.add(adgmVar3);
                                    adge adgeVar3 = (adge) adgdVar.v();
                                    if ((adviVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        adviVar.y();
                                    }
                                    advj advjVar13 = (advj) adviVar.b;
                                    adgeVar3.getClass();
                                    advjVar13.f = adgeVar3;
                                    advjVar13.c |= 1;
                                }
                                txx txxVar5 = new txx(abxcVar2, (advj) adviVar.v());
                                adkl adklVar = adkl.a;
                                adkk adkkVar = new adkk();
                                if ((adkkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    adkkVar.y();
                                }
                                adkl adklVar2 = (adkl) adkkVar.b;
                                adklVar2.c |= 1;
                                adklVar2.d = 1000;
                                yyfVar.h(yyk.s(txxVar, txxVar2, txxVar3, txxVar4, txxVar5, new txx(adkl.b, (adkl) adkkVar.v())));
                                adjz adjzVar = adjz.a;
                                adjy adjyVar = new adjy();
                                yyk yykVar3 = tskVar.H;
                                if (yykVar3.isEmpty()) {
                                    optionalEmpty = Optional.empty();
                                } else {
                                    try {
                                        Iterable iterable2 = (Iterable) Collection.EL.stream(yykVar3).map(new Function() { // from class: txw
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo116andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return Integer.valueOf(Integer.parseInt((String) obj2));
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(ywk.a);
                                        if ((adjyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            adjyVar.y();
                                        }
                                        adjz adjzVar2 = (adjz) adjyVar.b;
                                        abxj abxjVar2 = adjzVar2.c;
                                        if (!abxjVar2.c()) {
                                            int size5 = abxjVar2.size();
                                            adjzVar2.c = abxjVar2.d(size5 + size5);
                                        }
                                        abus.m(iterable2, adjzVar2.c);
                                        optionalEmpty = Optional.of(new txx(adjz.b, (adjz) adjyVar.v()));
                                    } catch (NumberFormatException e2) {
                                        ((zdv) ((zdv) ((zdv) txz.a.c()).p(e2)).q("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "s3Experiment", (char) 287, "BaseS3HeaderProducer.java")).u("[RS][S3] failed to parse experiment ids.");
                                        optionalEmpty = Optional.empty();
                                    }
                                }
                                if (optionalEmpty.isPresent()) {
                                    yyfVar.g(optionalEmpty.get());
                                }
                                yyk yykVarF = yyfVar.f();
                                int i11 = ((zcg) yykVarF).d;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    ((txx) yykVarF.get(i12)).accept(adkaVar);
                                }
                                InputStream inputStream2 = inputStream;
                                tskVar.G.isPresent();
                                Optional.empty().ifPresent(new Consumer() { // from class: txy
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj2) {
                                        ((txx) obj2).accept(adkaVar);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                adkb adkbVar4 = (adkb) adkaVar.v();
                                ((zdv) ((zdv) txz.a.b()).q("com/google/android/libraries/speech/transcription/recognition/s3request/BaseS3HeaderProducer", "buildS3Header", 107, "BaseS3HeaderProducer.java")).x("S3Request:\n%s", adkbVar4);
                                ((trv) agerVar3).g(adkbVar4);
                                tqp tqpVar = new tqp(inputStream2, i5, 24000, i6);
                                byte[] bArr = new byte[224];
                                while (true) {
                                    if (ttzVar.e.get()) {
                                        break;
                                    }
                                    int iC = zkn.c(tqpVar, bArr, 224);
                                    if (iC > 0) {
                                        adjd adjdVar = adjd.a;
                                        adjc adjcVar = new adjc();
                                        abvo abvoVarU = abvo.u(bArr, 0, iC);
                                        if ((adjcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            adjcVar.y();
                                        }
                                        adjd adjdVar2 = (adjd) adjcVar.b;
                                        adjdVar2.c |= 1;
                                        adjdVar2.d = abvoVarU;
                                        adjd adjdVar3 = (adjd) adjcVar.v();
                                        ager agerVar4 = ttzVar.f;
                                        adka adkaVar2 = new adka();
                                        adkaVar2.f(adjd.b, adjdVar3);
                                        ((trv) agerVar4).g((adkb) adkaVar2.v());
                                    }
                                    if (iC != 224) {
                                        ager agerVar5 = ttzVar.f;
                                        adka adkaVar3 = new adka();
                                        if ((adkaVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            adkaVar3.y();
                                        }
                                        adkb adkbVar5 = (adkb) adkaVar3.b;
                                        adkbVar5.b |= 8;
                                        adkbVar5.e = true;
                                        ((trv) agerVar5).g((adkb) adkaVar3.v());
                                        ttzVar.f.e();
                                    }
                                }
                                return zxy.a;
                            } catch (PackageManager.NameNotFoundException e3) {
                                throw new IllegalStateException(e3);
                            }
                        }
                    }), zyhVar), wyo.f(new ttv(this)), this.b);
                    return;
                }
                ((zdv) ((zdv) zdyVar.c()).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "startListening", 106, "NetworkSpeechRecognizer.java")).u("#startNetworkAndProcessResponses called twice");
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void d(trr trrVar) {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer", "failWithException", 200, "NetworkSpeechRecognizer.java")).u("#failWithException");
        this.d.c(trrVar);
        e();
    }
}
