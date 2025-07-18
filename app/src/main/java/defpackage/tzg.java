package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.speech.RecognitionPart;
import android.speech.RecognitionService;
import com.google.common.collect.Lists;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tzg implements twb {
    final /* synthetic */ String a;
    final /* synthetic */ twe b;
    final /* synthetic */ tzh c;
    final /* synthetic */ tzy d;

    public tzg(tzh tzhVar, tzy tzyVar, String str, twe tweVar) {
        this.d = tzyVar;
        this.a = str;
        this.b = tweVar;
        this.c = tzhVar;
    }

    @Override // defpackage.twb
    public final void b() {
        ((zdv) ((zdv) tzh.a.b()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onEndOfSpeech", 244, "RecognitionServiceImpl.java")).u("RecognitionService#onEndOfSpeech");
        tzy tzyVar = this.d;
        final RecognitionService.Callback callback = tzyVar.a;
        callback.getClass();
        tzyVar.b(new tzz() { // from class: tzu
            @Override // defpackage.tzz
            public final void a() throws RemoteException {
                callback.endOfSpeech();
            }
        });
        final String str = this.a;
        this.c.f.ifPresent(new Consumer() { // from class: tze
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tur) obj).d(str);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    @Override // defpackage.twb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final defpackage.trr r12) {
        /*
            r11 = this;
            trb r0 = r12.a
            trd r0 = (defpackage.trd) r0
            int r1 = r0.b
            int r0 = r0.a
            zdy r2 = defpackage.tzh.a
            zeo r2 = r2.d()
            zdv r2 = (defpackage.zdv) r2
            r3 = 254(0xfe, float:3.56E-43)
            java.lang.String r4 = "RecognitionServiceImpl.java"
            java.lang.String r5 = "com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2"
            java.lang.String r6 = "onError"
            zeo r2 = r2.q(r5, r6, r3, r4)
            zdv r2 = (defpackage.zdv) r2
            java.lang.String r3 = defpackage.eso.a(r1)
            java.lang.String r4 = "Speech recognition error type %s with error code %d"
            r2.D(r4, r3, r0)
            int r2 = r1 + (-1)
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L61
            r5 = 5
            if (r2 == r3) goto L58
            if (r2 == r5) goto L56
            r6 = 7
            if (r2 == r6) goto L54
            r6 = 8
            if (r2 == r6) goto L52
            r3 = 11
            if (r2 == r3) goto L43
            r0 = 12
            if (r2 == r0) goto L56
        L41:
            r8 = r5
            goto L68
        L43:
            twe r2 = r11.b
            tsk r2 = (defpackage.tsk) r2
            boolean r2 = r2.j
            if (r2 == 0) goto L56
            if (r0 == r4) goto L54
            r2 = 13
            if (r0 != r2) goto L41
            goto L54
        L52:
            r8 = r3
            goto L68
        L54:
            r8 = r6
            goto L68
        L56:
            r8 = r4
            goto L68
        L58:
            twe r0 = r11.b
            tsk r0 = (defpackage.tsk) r0
            boolean r0 = r0.j
            if (r0 == 0) goto L56
            goto L41
        L61:
            r2 = 102(0x66, float:1.43E-43)
            if (r0 != r2) goto L52
            r3 = 9
            goto L52
        L68:
            if (r1 != r4) goto L83
            tzy r0 = r11.d
            r0.a(r8)
            tzh r1 = r11.c
            j$.util.concurrent.ConcurrentHashMap r2 = r1.e
            r2.remove(r0)
            java.lang.String r0 = r11.a
            tyv r2 = new tyv
            r2.<init>()
            j$.util.Optional r12 = r1.g
            r12.ifPresent(r2)
            return
        L83:
            tzh r0 = r11.c
            tzy r7 = r11.d
            java.lang.String r9 = r11.a
            tyx r5 = new tyx
            r6 = r11
            r10 = r12
            r5.<init>()
            tyg r12 = new tyg
            tyi r0 = r0.d
            r12.<init>()
            java.lang.Runnable r12 = defpackage.wyo.h(r12)
            zyh r0 = r0.a
            r0.submit(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzg.c(trr):void");
    }

    @Override // defpackage.twb
    public final void d(final trr trrVar) {
        ((zdv) ((zdv) ((zdv) tzh.a.d()).p(trrVar)).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onFallback", (char) 393, "RecognitionServiceImpl.java")).u("RecognitionService#onFallback");
        final String str = this.a;
        this.c.g.ifPresent(new Consumer() { // from class: tzf
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tus) obj).e(str, trrVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.twb
    public final void f(final txt txtVar, txv txvVar) {
        final String str = this.a;
        this.c.g.ifPresent(new Consumer() { // from class: tzb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((zdv) ((zdv) tzh.a.b()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onInitializeRecognizer", 403, "RecognitionServiceImpl.java")).u("Log languagePackInfo and personalizationInfo to westWorld logger.");
                ((tus) obj).o(str, txtVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // defpackage.twb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.adqj r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzg.g(adqj):void");
    }

    @Override // defpackage.twb
    public final void h(final tuw tuwVar) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("results_recognition", Lists.newArrayList(tuwVar.c));
        bundle.putStringArrayList("android.speech.extra.UNSTABLE_TEXT", Lists.newArrayList(tuwVar.d));
        bundle.putString("current_locale", tuwVar.e);
        final String str = this.a;
        this.c.f.ifPresent(new Consumer() { // from class: tyw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tur) obj).j(str, tuwVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.d.c(bundle);
    }

    @Override // defpackage.twb
    public final void i() {
        ((zdv) ((zdv) tzh.a.b()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onRecognitionFinished", 382, "RecognitionServiceImpl.java")).u("RecognitionService#onEndRecognitionSession");
        if (((tsk) this.b).o) {
            tzy tzyVar = this.d;
            if (tto.i(tzyVar.b) == null) {
                final RecognitionService.Callback callback = tzyVar.a;
                tzyVar.b(new tzz() { // from class: tzr
                    @Override // defpackage.tzz
                    public final void a() throws RemoteException {
                        callback.results(Bundle.EMPTY);
                    }
                });
            } else if (adn.c()) {
                final RecognitionService.Callback callback2 = tzyVar.a;
                callback2.getClass();
                tzyVar.b(new tzz() { // from class: tzs
                    @Override // defpackage.tzz
                    public final void a() throws RemoteException {
                        callback2.endOfSegmentedSession();
                    }
                });
            }
            uaa uaaVar = tzyVar.c;
            uaaVar.b.remove(tzyVar.a);
        }
        tzh tzhVar = this.c;
        tzhVar.e.remove(this.d);
        final String str = this.a;
        tzhVar.g.ifPresent(new Consumer() { // from class: tyz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tus) obj).c(str);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.twb
    public final void j(final tso tsoVar) {
        final Bundle bundle = new Bundle();
        bundle.putStringArrayList("results_recognition", new ArrayList<>(tsoVar.c));
        bundle.putString("current_locale", tsoVar.f);
        if (tsoVar.e.size() > 0) {
            bundle.putParcelableArrayList("results_alternatives", (ArrayList) Collection.EL.stream(tsoVar.e).map(new Function() { // from class: tyn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo116andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Stream map = Collection.EL.stream(((adlj) obj).c).map(new Function() { // from class: tyk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo116andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            adlh adlhVar = (adlh) obj2;
                            return new tsd(adlhVar.b, adlhVar.c, new ArrayList(adlhVar.d));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = yyk.e;
                    yyk yykVar = (yyk) map.collect(ywk.a);
                    int i2 = tsa.a;
                    tse tseVar = new tse(yykVar);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArrayList("alternative_spans", (ArrayList) Collection.EL.stream(tseVar.b).map(new Function() { // from class: try
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo116andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            trx trxVar = (trx) obj2;
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("start", trxVar.b());
                            bundle3.putInt("end", trxVar.a());
                            bundle3.putStringArrayList("alternatives", trxVar.c());
                            return bundle3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: trz
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    })));
                    return bundle2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: tyo
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            })));
        }
        if (tsoVar.d.size() > 0) {
            bundle.putFloatArray("confidence_scores", ztj.b(tsoVar.d));
        }
        if (adn.d() && tsoVar.g.size() > 0) {
            bundle.putParcelableArrayList("recognition_parts", (ArrayList) Collection.EL.stream(tsoVar.g).filter(new Predicate() { // from class: typ
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public final /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((tun) obj).c.size() > 0;
                }
            }).map(new Function() { // from class: tyq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo116andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    tun tunVar = (tun) obj;
                    RecognitionPart.Builder builder = new RecognitionPart.Builder((String) tunVar.c.get(tunVar.c.size() - 1));
                    int i = 0;
                    if (tunVar.c.size() == 2) {
                        builder.setFormattedText((String) tunVar.c.get(0));
                    }
                    if ((tunVar.b & 1) != 0) {
                        builder.setTimestampMillis(tunVar.d);
                    }
                    if ((tunVar.b & 2) != 0) {
                        int iA = tum.a(tunVar.e);
                        if (iA == 0) {
                            iA = 1;
                        }
                        int i2 = iA - 1;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                i = 1;
                            } else if (i2 != 2) {
                                i = 3;
                                if (i2 != 3) {
                                    i = 4;
                                    if (i2 != 4) {
                                        i = 5;
                                    }
                                }
                            } else {
                                i = 2;
                            }
                        }
                        builder.setConfidenceLevel(i);
                    }
                    return builder.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: tyo
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            })));
        }
        if (((tsk) this.b).o) {
            tzy tzyVar = this.d;
            tzyVar.c.a();
            if (tto.i(tzyVar.b) == null) {
                bundle.putBoolean("final_result", true);
                final RecognitionService.Callback callback = tzyVar.a;
                tzyVar.b(new tzz() { // from class: tzv
                    @Override // defpackage.tzz
                    public final void a() throws RemoteException {
                        callback.partialResults(bundle);
                    }
                });
            } else if (adn.c()) {
                final RecognitionService.Callback callback2 = tzyVar.a;
                tzyVar.b(new tzz() { // from class: tzw
                    @Override // defpackage.tzz
                    public final void a() throws RemoteException {
                        callback2.segmentResults(bundle);
                    }
                });
            }
        } else {
            tzy tzyVar2 = this.d;
            uaa uaaVar = tzyVar2.c;
            uaaVar.a();
            final RecognitionService.Callback callback3 = tzyVar2.a;
            tzyVar2.b(new tzz() { // from class: tzx
                @Override // defpackage.tzz
                public final void a() throws RemoteException {
                    callback3.results(bundle);
                }
            });
            uaaVar.b.remove(callback3);
        }
        tzh tzhVar = this.c;
        final String str = this.a;
        tzhVar.f.ifPresent(new Consumer() { // from class: tyy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tur) obj).f(str, tsoVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.twb
    public final void k(adrb adrbVar) {
        Bundle bundle = new Bundle();
        acas.b(bundle, "soda_event", adrbVar);
        this.d.c(bundle);
    }

    @Override // defpackage.twb
    public final void l() {
        ((zdv) ((zdv) tzh.a.b()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onStartOfSpeech", 237, "RecognitionServiceImpl.java")).u("RecognitionService#onStartOfSpeech");
        tzy tzyVar = this.d;
        final RecognitionService.Callback callback = tzyVar.a;
        callback.getClass();
        tzyVar.b(new tzz() { // from class: tzt
            @Override // defpackage.tzz
            public final void a() throws RemoteException {
                callback.beginningOfSpeech();
            }
        });
        final String str = this.a;
        this.c.f.ifPresent(new Consumer() { // from class: tza
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tur) obj).l(str);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.twb
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.twb
    public final /* synthetic */ void a(boolean z) {
    }
}
