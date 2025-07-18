package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.provider.Settings;
import com.google.android.katniss.R;
import com.google.android.testing.assistantreadinesstest.ArtModelService;
import com.google.android.tv.remote.service.AudioStream;
import com.google.assistant.sdk.libassistant.AudioInputUtils;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnk extends jnb {
    public static final /* synthetic */ int b = 0;
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl");
    private static final Duration d;
    private final gmd A;
    private final agow B;
    private final agow C;
    private final jmc D;
    private final grl E;
    private final agow F;
    private final agow G;
    private final jhz H;
    private final agow I;
    private final evt J;
    private final lzb K;
    private final gmu L;
    private final agow M;
    private final agow N;
    private final jnr O;
    private final ghr P;
    private final agow Q;
    private boolean R;
    private String S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private int Y;
    private final PowerManager.WakeLock Z;
    public final irr a;
    private final gxn aa;
    private final ActivityManager e;
    private final eyw f;
    private final jdt g;
    private final hxu h;
    private final Context i;
    private final jna j;
    private final agow k;
    private final agow l;
    private final agow m;
    private final jcv n;
    private final jhs o;
    private final gph p;
    private final jbu q;
    private final gzu r;
    private final hxv s;
    private final agow t;
    private final boolean u;
    private final Supplier v;
    private final agow w;
    private final gfr x;
    private final glq y;
    private final agow z;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        durationOfMinutes.getClass();
        d = durationOfMinutes;
    }

    public jnk(ActivityManager activityManager, eyw eywVar, jdt jdtVar, hxu hxuVar, Context context, jna jnaVar, agow agowVar, agow agowVar2, agow agowVar3, jcv jcvVar, gxn gxnVar, jhs jhsVar, gph gphVar, jbu jbuVar, gzu gzuVar, hxv hxvVar, agow agowVar4, boolean z, Supplier supplier, agow agowVar5, gfr gfrVar, glq glqVar, agow agowVar6, gmd gmdVar, agow agowVar7, agow agowVar8, jmc jmcVar, grl grlVar, agow agowVar9, agow agowVar10, PowerManager powerManager, jhz jhzVar, agow agowVar11, irr irrVar, evt evtVar, lzb lzbVar, gmu gmuVar, agow agowVar12, agow agowVar13, jnr jnrVar, ghr ghrVar, agow agowVar14) {
        activityManager.getClass();
        eywVar.getClass();
        jdtVar.getClass();
        hxuVar.getClass();
        context.getClass();
        jnaVar.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        jcvVar.getClass();
        gxnVar.getClass();
        jhsVar.getClass();
        jbuVar.getClass();
        gzuVar.getClass();
        hxvVar.getClass();
        agowVar4.getClass();
        gfrVar.getClass();
        agowVar6.getClass();
        gmdVar.getClass();
        agowVar7.getClass();
        agowVar8.getClass();
        jmcVar.getClass();
        grlVar.getClass();
        agowVar9.getClass();
        agowVar10.getClass();
        powerManager.getClass();
        jhzVar.getClass();
        evtVar.getClass();
        lzbVar.getClass();
        gmuVar.getClass();
        agowVar12.getClass();
        agowVar13.getClass();
        jnrVar.getClass();
        ghrVar.getClass();
        agowVar14.getClass();
        this.e = activityManager;
        this.f = eywVar;
        this.g = jdtVar;
        this.h = hxuVar;
        this.i = context;
        this.j = jnaVar;
        this.k = agowVar;
        this.l = agowVar2;
        this.m = agowVar3;
        this.n = jcvVar;
        this.aa = gxnVar;
        this.o = jhsVar;
        this.p = gphVar;
        this.q = jbuVar;
        this.r = gzuVar;
        this.s = hxvVar;
        this.t = agowVar4;
        this.u = z;
        this.v = supplier;
        this.w = agowVar5;
        this.x = gfrVar;
        this.y = glqVar;
        this.z = agowVar6;
        this.A = gmdVar;
        this.B = agowVar7;
        this.C = agowVar8;
        this.D = jmcVar;
        this.E = grlVar;
        this.F = agowVar9;
        this.G = agowVar10;
        this.H = jhzVar;
        this.I = agowVar11;
        this.a = irrVar;
        this.J = evtVar;
        this.K = lzbVar;
        this.L = gmuVar;
        this.M = agowVar12;
        this.N = agowVar13;
        this.O = jnrVar;
        this.P = ghrVar;
        this.Q = agowVar14;
        this.S = "";
        this.T = true;
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "Katniss:CONVERSATION_WAKELOCK");
        wakeLockNewWakeLock.setReferenceCounted(false);
        wakeLockNewWakeLock.getClass();
        this.Z = wakeLockNewWakeLock;
    }

    private final void c(agux aguxVar) {
        jdt jdtVar = this.g;
        if (jdtVar.Q()) {
            if (jdtVar.Z() == jlv.INVOCATION_TYPE_INTENT || jdtVar.Z() == jlv.INVOCATION_TYPE_HOTWORD) {
                Context context = this.i;
                if (!vdt.c.booleanValue()) {
                    vdt.a(context);
                }
                if (vdt.b == null) {
                    ((zdv) ((zdv) vdt.a.c().o(zfi.a, "ArtModelServiceProvider")).q("com/google/android/testing/assistantreadinesstest/ArtModelServiceProvider", "getInstance", 60, "ArtModelServiceProvider.java")).u("returning null instance");
                }
                ArtModelService artModelService = vdt.b;
                artModelService.getClass();
                aguxVar.a(artModelService);
            }
        }
    }

    private final void d(String str) {
        lzb lzbVar = this.K;
        lzbVar.p = false;
        while (true) {
            Queue queue = lzbVar.r;
            if (queue.isEmpty()) {
                ((gcd) this.B.a()).c();
                lzbVar.C(str, 1);
                return;
            }
            ((Runnable) queue.poll()).run();
        }
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnConversationTurnFinished(final ConversationStateListener.Resolution resolution) {
        boolean z;
        AudioStream audioStreamA;
        resolution.getClass();
        zdy zdyVar = c;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnFinished", 386, "KatnissConversationStateListenerImpl.kt")).x("OnConversationTurnFinished : resolution[%s].", resolution);
        this.H.c();
        gmd gmdVar = this.A;
        gmdVar.b(gmc.au);
        gfr gfrVar = this.x;
        gfrVar.b(rpm.cs(), null, null);
        ghr ghrVar = this.P;
        ghrVar.r(resolution, this.X, this.Y);
        this.D.a.clear();
        ((gcd) this.B.a()).j();
        evt evtVar = this.J;
        jlv jlvVar = jlv.INVOCATION_TYPE_NOT_INVOKED;
        evtVar.b(false);
        lzb lzbVar = this.K;
        lzbVar.c.set(false);
        lzbVar.d.set(false);
        lzbVar.l();
        this.h.a = Duration.ZERO;
        this.V = false;
        this.W = false;
        ConversationStateListener.RecognitionState recognitionState = ConversationStateListener.RecognitionState.STARTED;
        int iOrdinal = resolution.ordinal();
        int i = 7;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ghrVar.B(5);
                ghrVar.A(zpg.OPA_TV_SPEECH_NO_SPEECH_DETECTED);
                gmdVar.r(gmc.e, rbl.ERROR);
                lzbVar.C(null, 4);
                lzbVar.C(null, 5);
            } else if (iOrdinal == 3) {
                ghrVar.A(zpg.OPA_TV_SPEECH_AUDIO_CAPTURE_CANCELLED);
            } else if (iOrdinal == 5) {
                gmdVar.a(gmc.g);
                lzbVar.C(null, 27);
            } else if (iOrdinal == 6) {
                gmdVar.r(gmc.e, rbl.ERROR);
                this.g.n();
                ghrVar.A(zpg.OPA_TV_SPEECH_DOWNSTREAM_FAILURE);
                if (((Boolean) this.C.a()).booleanValue()) {
                    ((gfn) this.w.a()).a(rpm.cD()).b().c();
                } else {
                    gfq.b(gfrVar, rpm.cD(), null, null, 14);
                }
            } else if (iOrdinal == 7) {
                gmdVar.r(gmc.e, rbl.ERROR);
                lzbVar.C(null, 4);
                lzbVar.C(null, 5);
            }
            z = false;
        } else if (!((Boolean) this.t.a()).booleanValue()) {
            z = true;
            lzbVar.n();
        } else if (this.g.Z() == jlv.INVOCATION_TYPE_HOTWORD) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnFinished", 427, "KatnissConversationStateListenerImpl.kt")).u("Preparing next interaction for Continued Conversation");
            this.V = true;
            z = true;
            lzbVar.n();
        } else {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnFinished", 431, "KatnissConversationStateListenerImpl.kt")).u("Ignore follow on.");
            z = false;
            lzbVar.n();
        }
        jdt jdtVar = this.g;
        jlv jlvVarZ = jdtVar.Z();
        jlv jlvVar2 = jlv.INVOCATION_TYPE_DEVICE_LINK_TOKEN_REQUEST;
        if (jlvVarZ != jlvVar2) {
            switch (resolution) {
                case NORMAL:
                case NORMAL_WITH_FOLLOW_ON:
                    i = 2;
                    break;
                case TIMEOUT:
                    i = 6;
                    break;
                case CANCELLED:
                    i = 13;
                    break;
                case BARGE_IN:
                    i = 15;
                    break;
                case NO_RESPONSE:
                    i = 9;
                    break;
                case COMMUNICATION_ERROR:
                    i = 8;
                    break;
                case DEVICE_NOT_SELECTED:
                    break;
                default:
                    ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "toStatusCode", 1059, "KatnissConversationStateListenerImpl.kt")).x("Unknown Resolution: %s", resolution);
                    i = 0;
                    break;
            }
            if (i != 0) {
                if (((Boolean) this.C.a()).booleanValue()) {
                    ((gfn) this.w.a()).c(rpm.ed()).b().d(i);
                } else {
                    gfrVar.f(rpm.ed(), i);
                }
                if (((Boolean) this.l.a()).booleanValue()) {
                    gfg gfgVarB = ((gfn) this.w.a()).c(rpm.dP()).b();
                    gfgVarB.h(((fex) this.I.a()).b());
                    gfgVarB.d(i);
                }
            }
        }
        int iA = yad.a(resolution.toString());
        int iA2 = yaa.a(jdtVar.c());
        if (iA2 == 0) {
            iA2 = 1;
        }
        if (!((Boolean) this.M.a()).booleanValue() || jdtVar.Z() != jlvVar2) {
            ghrVar.C(iA, iA2);
        }
        lzbVar.A(this.R);
        if (resolution != ConversationStateListener.Resolution.CANCELLED) {
            lzbVar.q(z);
        }
        lzbVar.z(false);
        synchronized (lzbVar.j) {
            List list = lzbVar.g;
            if (!list.isEmpty()) {
                lzb.b = true;
                lzbVar.k();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    lzbVar.j((Message) it.next());
                }
                list.clear();
            }
        }
        if (z) {
            jdt jdtVar2 = this.g;
            if (jdtVar2.Z() == jlv.INVOCATION_TYPE_HOTWORD) {
                jdtVar2.G(-1);
            } else if (!jdtVar2.U() && (audioStreamA = this.q.a()) != null) {
                ParcelFileDescriptor parcelFileDescriptorE = audioStreamA.e();
                jdtVar2.H(parcelFileDescriptorE != null ? parcelFileDescriptorE.detachFd() : -1);
                jlvVar = jlv.INVOCATION_TYPE_INTENT;
            }
        } else {
            jcv jcvVar = this.n;
            if (!jcvVar.s) {
                jdt jdtVar3 = this.g;
                if (jdtVar3.V()) {
                    jdtVar3.v();
                }
            } else if (jcvVar.o == null) {
                ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "maybeResumeDspRecognitionOnConversationEnd", 708, "DspManager.java")).u("DspManager not initialized yet.");
            } else {
                zxn.p(jcvVar.b(), wyo.f(new jcp(jcvVar)), jcvVar.i);
            }
        }
        c(new agux() { // from class: jnf
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ArtModelService artModelService = (ArtModelService) obj;
                int i2 = jnk.b;
                artModelService.getClass();
                ((zdv) ((zdv) ArtModelService.a.b().o(zfi.a, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "registerSessionEnd", 203, "ArtModelService.java")).u("registerSessionEnd is called.");
                vdu vduVar = artModelService.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if ((vduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    vduVar.y();
                }
                vdv vdvVar = (vdv) vduVar.b;
                vdv vdvVar2 = vdv.a;
                vdvVar.b |= 4;
                vdvVar.g = jCurrentTimeMillis;
                if ((vduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    vduVar.y();
                }
                vdv vdvVar3 = (vdv) vduVar.b;
                vdvVar3.b |= 1;
                vdvVar3.e = false;
                return agpu.a;
            }
        });
        gfq.a(this.x, null, null, 14);
        if (resolution != ConversationStateListener.Resolution.BARGE_IN) {
            this.g.az(jlvVar);
        }
        this.j.a(new agux() { // from class: jng
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ConversationStateListener conversationStateListener = (ConversationStateListener) obj;
                int i2 = jnk.b;
                conversationStateListener.getClass();
                conversationStateListener.OnConversationTurnFinished(resolution);
                return agpu.a;
            }
        });
        this.A.s();
        if (z) {
            return;
        }
        this.Z.release();
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnConversationTurnStarted(final boolean z) throws IllegalStateException {
        zdy zdyVar;
        String str;
        zdy zdyVar2 = c;
        ((zdv) zdyVar2.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnStarted", 214, "KatnissConversationStateListenerImpl.kt")).u("OnConversationTurnStarted");
        this.U = false;
        if (((Boolean) this.k.a()).booleanValue()) {
            jdt jdtVar = this.g;
            if (!jdtVar.P()) {
                jdtVar.I();
            }
        }
        jdt jdtVar2 = this.g;
        jdtVar2.Y();
        PowerManager.WakeLock wakeLock = this.Z;
        wakeLock.acquire(d.toMillis());
        if (((Boolean) this.Q.a()).booleanValue()) {
            ((fex) this.I.a()).c(null);
        }
        gmd gmdVar = this.A;
        gmdVar.c();
        gmdVar.d();
        jlv jlvVarZ = jdtVar2.Z();
        if (this.u && ((Boolean) this.v.get()).booleanValue() && jdtVar2.T() && jlvVarZ == jlv.INVOCATION_TYPE_NOT_INVOKED) {
            if (this.s.b()) {
                Context context = this.i;
                if (Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 0) <= 0 || Settings.Secure.getInt(context.getContentResolver(), "tv_user_setup_complete", 0) <= 0) {
                    ((zdv) zdyVar2.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnStarted", 240, "KatnissConversationStateListenerImpl.kt")).u("Skip handling hotword invocation because device setup is not complete.");
                    jdtVar2.M();
                    return;
                }
            }
            jlvVarZ = jlv.INVOCATION_TYPE_HOTWORD;
            jdtVar2.az(jlvVarZ);
            this.P.E(3);
            if (((Boolean) this.N.a()).booleanValue()) {
                this.K.m();
            }
            lzb lzbVar = this.K;
            ActivityManager activityManager = this.e;
            this.i.getPackageName().getClass();
            lzbVar.p(!fbg.a(activityManager, r3));
        }
        agow agowVar = this.z;
        if (!((jod) agowVar.a()).f()) {
            ((zdv) zdyVar2.d().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "maybeStopLaunch", 1013, "KatnissConversationStateListenerImpl.kt")).u("No network.");
            this.K.o();
        } else if (!((jod) agowVar.a()).j()) {
            if (((jod) agowVar.a()).i(new Intent(), z)) {
                wakeLock.release();
            } else if (!((jod) agowVar.a()).k(z)) {
                jlv jlvVar = jlv.INVOCATION_TYPE_INTENT;
                if (jlvVarZ != jlvVar) {
                    this.L.B();
                }
                jlv jlvVar2 = jlv.INVOCATION_TYPE_HOTWORD;
                if (jlvVarZ == jlvVar2 && !this.V) {
                    gcd gcdVar = (gcd) this.B.a();
                    gcdVar.h(true);
                    gcdVar.c();
                }
                c(new agux() { // from class: jnc
                    @Override // defpackage.agux
                    public final Object a(Object obj) throws IllegalStateException {
                        ArtModelService artModelService = (ArtModelService) obj;
                        artModelService.getClass();
                        zdy zdyVar3 = ArtModelService.a;
                        zeo zeoVarB = zdyVar3.b();
                        zer zerVar = zfi.a;
                        ((zdv) ((zdv) zeoVarB.o(zerVar, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "registerSessionStart", 196, "ArtModelService.java")).u("registerSessionStart is called.");
                        vdu vduVar = artModelService.b;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if ((vduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vduVar.y();
                        }
                        vdv vdvVar = (vdv) vduVar.b;
                        vdv vdvVar2 = vdv.a;
                        vdvVar.b |= 2;
                        vdvVar.f = jCurrentTimeMillis;
                        if ((vduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vduVar.y();
                        }
                        vdv vdvVar3 = (vdv) vduVar.b;
                        vdvVar3.b |= 1;
                        vdvVar3.e = true;
                        final vdz vdzVar = vdz.CPU;
                        ((zdv) ((zdv) zdyVar3.b().o(zerVar, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "increaseHotwordCounter", 149, "ArtModelService.java")).u("increaseHotwordCounter is called without AudioMetrics.");
                        adpj adpjVar = adpj.a;
                        ((zdv) ((zdv) zdyVar3.b().o(zerVar, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "increaseHotwordCounter", 155, "ArtModelService.java")).x("increaseHotwordCounter is called for hotwordType %s.", vdzVar.name());
                        if (artModelService.e) {
                            ((zdv) ((zdv) zdyVar3.b().o(zerVar, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "playTone", 373, "ArtModelService.java")).u("Playing tone");
                            MediaPlayer mediaPlayerCreate = MediaPlayer.create(artModelService, R.raw.tone);
                            if (mediaPlayerCreate == null) {
                                ((zdv) ((zdv) zdyVar3.d().o(zerVar, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "playTone", 376, "ArtModelService.java")).u("Failed to create MediaPlayer");
                            } else {
                                mediaPlayerCreate.setVolume(0.8f, 0.8f);
                                mediaPlayerCreate.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: vdp
                                    @Override // android.media.MediaPlayer.OnCompletionListener
                                    public final void onCompletion(MediaPlayer mediaPlayer) {
                                        mediaPlayer.release();
                                    }
                                });
                                mediaPlayerCreate.setOnErrorListener(new vdq());
                                mediaPlayerCreate.start();
                            }
                        }
                        zbp zbpVar = artModelService.d;
                        ((yvo) zbpVar).h(vdzVar, 1);
                        vdx vdxVar = vdx.a;
                        vdw vdwVar = new vdw();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if ((vdwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vdwVar.y();
                        }
                        vdx vdxVar2 = (vdx) vdwVar.b;
                        vdxVar2.b |= 2;
                        vdxVar2.d = jCurrentTimeMillis2;
                        int iB = ((yvi) zbpVar).a.b(vdzVar);
                        if ((vdwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vdwVar.y();
                        }
                        vdx vdxVar3 = (vdx) vdwVar.b;
                        vdxVar3.b |= 4;
                        vdxVar3.e = iB;
                        if ((vdwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vdwVar.y();
                        }
                        vdx vdxVar4 = (vdx) vdwVar.b;
                        vdxVar4.c = vdzVar.d;
                        vdxVar4.b |= 1;
                        float f = adpjVar.b;
                        if ((vdwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vdwVar.y();
                        }
                        vdx vdxVar5 = (vdx) vdwVar.b;
                        vdxVar5.b |= 8;
                        vdxVar5.f = f;
                        float f2 = adpjVar.c;
                        if ((vdwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vdwVar.y();
                        }
                        vdx vdxVar6 = (vdx) vdwVar.b;
                        vdxVar6.b |= 16;
                        vdxVar6.g = f2;
                        vdx vdxVar7 = (vdx) vdwVar.v();
                        int iA = zag.a(DesugarCollections.unmodifiableList(((vdv) vduVar.b).d), new yqx() { // from class: vdn
                            @Override // defpackage.yqx
                            public final boolean a(Object obj2) {
                                vdz vdzVarB = vdz.b(((vdx) obj2).c);
                                if (vdzVarB == null) {
                                    vdzVarB = vdz.HOTWORD_TYPE_UNSPECIFIED;
                                }
                                return vdzVarB == vdzVar;
                            }
                        });
                        Integer numValueOf = iA >= 0 ? Integer.valueOf(iA) : null;
                        if (numValueOf == null) {
                            if ((vduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                vduVar.y();
                            }
                            vdv vdvVar4 = (vdv) vduVar.b;
                            vdxVar7.getClass();
                            abxs abxsVar = vdvVar4.d;
                            if (!abxsVar.c()) {
                                int size = abxsVar.size();
                                vdvVar4.d = abxsVar.d(size + size);
                            }
                            vdvVar4.d.add(vdxVar7);
                        } else {
                            int iIntValue = numValueOf.intValue();
                            if ((vduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                vduVar.y();
                            }
                            vdv vdvVar5 = (vdv) vduVar.b;
                            vdxVar7.getClass();
                            abxs abxsVar2 = vdvVar5.d;
                            if (!abxsVar2.c()) {
                                int size2 = abxsVar2.size();
                                vdvVar5.d = abxsVar2.d(size2 + size2);
                            }
                            vdvVar5.d.set(iIntValue, vdxVar7);
                        }
                        this.a.a.b();
                        return agpu.a;
                    }
                });
                if (this.f.j && jlvVarZ == jlvVar2) {
                    ((zdv) zdyVar2.d().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnStarted", 286, "KatnissConversationStateListenerImpl.kt")).u("Trying to start voice interaction when KeyboardSearchActivity is visible, abort.");
                    if (jdtVar2.R()) {
                        jdtVar2.M();
                    }
                    wakeLock.release();
                    ((zdv) zdyVar2.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnStarted", 291, "KatnissConversationStateListenerImpl.kt")).u("OnConversationTurnStarted complete: KeyboardSearchActivity is visible.");
                    return;
                }
                Intent intent = new Intent("android.intent.action.ASSIST");
                intent.putExtra("isMicOpen", z);
                jlv jlvVar3 = jlv.INVOCATION_TYPE_CLIENT_INPUT_INTENT;
                if (jlvVarZ != jlvVar3 && jlvVarZ != jlv.INVOCATION_TYPE_SUGGESTION_INTENT && jlvVarZ != jlv.INVOCATION_TYPE_TEXT_SEARCH && jlvVarZ != jlvVar && !this.V && ((this.p == gph.b || z) && !this.O.k())) {
                    ((jod) agowVar.a()).c(intent);
                }
                jcv jcvVar = this.n;
                if (jcvVar.s) {
                    jcvVar.p.removeMessages(3);
                }
                this.J.b(true);
                ghr ghrVar = this.P;
                ghrVar.A(zpg.OPA_TV_SPEECH_PRE_START);
                if (jdtVar2.Z() == jlvVar2) {
                    if (this.s.b()) {
                        gmdVar.b(gmc.aA);
                    } else {
                        gmdVar.b(gmc.Y);
                    }
                    if (this.K.q) {
                        gmdVar.b(gmc.Z);
                    }
                    gfr gfrVar = this.x;
                    gfrVar.b(rpm.dy(), null, null);
                    if (((Boolean) this.C.a()).booleanValue()) {
                        agow agowVar2 = this.w;
                        ((gfn) agowVar2.a()).b(rpm.bw()).b().c();
                        ((gfn) agowVar2.a()).a(rpm.bt()).b().c();
                        ((gfn) agowVar2.a()).a(rpm.l()).b().c();
                        ((gfn) agowVar2.a()).a(rpm.j()).b().c();
                        zdyVar = zdyVar2;
                    } else {
                        gfrVar.b(rpm.bw(), null, null);
                        zdyVar = zdyVar2;
                        gfq.b(gfrVar, rpm.bt(), null, null, 14);
                        gfq.b(gfrVar, rpm.l(), null, null, 14);
                        gfq.b(gfrVar, rpm.j(), null, null, 14);
                    }
                    this.y.x();
                } else {
                    zdyVar = zdyVar2;
                    if (this.s.b()) {
                        gmdVar.m(gmc.az);
                    } else {
                        gmdVar.m(gmc.c);
                    }
                    if (this.T) {
                        gmdVar.m(gmc.d);
                        this.T = false;
                    }
                }
                gmdVar.b(gmc.e);
                gfr gfrVar2 = this.x;
                gfrVar2.b(rpm.cs(), null, null);
                gmdVar.b(gmc.au);
                ghrVar.a();
                ghrVar.B(2);
                if (jdtVar2.Z() == jlvVar2 || jdtVar2.Z() == jlvVar) {
                    if (((Boolean) this.C.a()).booleanValue()) {
                        agow agowVar3 = this.w;
                        ((gfn) agowVar3.a()).a(rpm.k()).b().c();
                        ((gfn) agowVar3.a()).a(rpm.bW()).b().c();
                    } else {
                        gfq.b(gfrVar2, rpm.k(), null, null, 14);
                        gfq.b(gfrVar2, rpm.bW(), null, null, 14);
                    }
                    ghrVar.A(zpg.OPA_TV_SPEECH_MIC_OPENED);
                    ghrVar.A(zpg.OPA_TV_SPEECH_START_LISTENING);
                    this.y.t();
                }
                MediaPlayer mediaPlayer = this.aa.a;
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                }
                this.R = false;
                this.o.i();
                boolean z2 = this.p == gph.b && new abxl(((jly) this.m.a()).c, jly.a).contains(jlvVarZ);
                if (z2) {
                    this.K.B(this.r.a);
                }
                lzb lzbVar2 = this.K;
                lzbVar2.r();
                if (!lzbVar2.p) {
                    if (!z2) {
                        lzbVar2.t();
                    }
                    if (!z || jlvVarZ == jlvVar3) {
                        str = null;
                    } else {
                        lzbVar2.k();
                        str = null;
                        lzbVar2.j(Message.obtain((Handler) null, 13));
                    }
                    lzbVar2.l();
                    if (z) {
                        lzbVar2.C(str, 0);
                    } else {
                        lzbVar2.C(str, 2);
                    }
                }
                lzbVar2.z(true);
                this.j.a(new agux() { // from class: jnd
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        ConversationStateListener conversationStateListener = (ConversationStateListener) obj;
                        int i = jnk.b;
                        conversationStateListener.getClass();
                        conversationStateListener.OnConversationTurnStarted(z);
                        return agpu.a;
                    }
                });
                jnr jnrVar = this.O;
                if (jnrVar.k()) {
                    jnrVar.d();
                }
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnStarted", 345, "KatnissConversationStateListenerImpl.kt")).u("OnConversationTurnStarted complete");
                this.X = 0;
                return;
            }
        }
        ((zdv) zdyVar2.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnConversationTurnStarted", 256, "KatnissConversationStateListenerImpl.kt")).u("OnConversationTurnStarted complete: stopping launch");
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRecognitionStateChanged(final ConversationStateListener.RecognitionState recognitionState, final ConversationStateListener.RecognitionResult recognitionResult) throws IllegalStateException {
        recognitionState.getClass();
        recognitionResult.getClass();
        zdy zdyVar = c;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnRecognitionStateChanged", 659, "KatnissConversationStateListenerImpl.kt")).F("#onRecognitionStateChanged : state[%s] : result[%s].", recognitionState, recognitionResult);
        ConversationStateListener.Resolution resolution = ConversationStateListener.Resolution.NORMAL;
        int iOrdinal = recognitionState.ordinal();
        if (iOrdinal == 0) {
            if (!this.V) {
                d(recognitionResult.recognized_speech);
            }
            gmd gmdVar = this.A;
            gmdVar.b(gmc.h);
            gmdVar.b(gmc.i);
            ghr ghrVar = this.P;
            ghrVar.B(4);
            ghrVar.A(zpg.OPA_TV_SPEECH_START_OF_SPEECH_DETECTION);
            agow agowVar = this.w;
            ((gfn) agowVar.a()).a(rpm.cb()).b().c();
            ((gfn) agowVar.a()).a(rpm.cG()).b().c();
        } else if (iOrdinal == 1) {
            int i = this.X;
            String str = recognitionResult.recognized_speech;
            this.X = Math.max(i, str != null ? str.length() : 0);
            ((gcd) this.B.a()).c();
            this.A.m(gmc.h);
            if (!this.U) {
                this.U = true;
                ((gfn) this.w.a()).a(rpm.M()).b().c();
            }
            ((gfn) this.w.a()).a(rpm.V()).b().c();
            if (this.V && !this.W) {
                this.W = true;
                d(recognitionResult.recognized_speech);
                Intent intent = new Intent("android.intent.action.ASSIST");
                intent.putExtra("isMicOpen", true);
                ((jod) this.z.a()).c(intent);
            }
            String str2 = recognitionResult.recognized_speech;
            if (str2 != null && str2.length() != 0) {
                jnr jnrVar = this.O;
                if (jnrVar.k()) {
                    String str3 = recognitionResult.recognized_speech;
                    str3.getClass();
                    jnrVar.f(str3);
                }
                if (agvy.c(this.r.a, "com.google.android.youtube.tv") && ((Boolean) this.F.a()).booleanValue() && !agvy.c(this.S, recognitionResult.recognized_speech)) {
                    String str4 = recognitionResult.recognized_speech;
                    str4.getClass();
                    this.S = str4;
                    grl grlVar = this.E;
                    str4.getClass();
                    grlVar.a(str4);
                }
            }
        } else if (iOrdinal == 2) {
            if (!this.V || this.W) {
                ((gcd) this.B.a()).c();
            }
            jdt jdtVar = this.g;
            if (jdtVar.Z() != jlv.INVOCATION_TYPE_HOTWORD) {
                jdtVar.K(AudioInputUtils.MicType.NEAR_FIELD);
            }
            ghr ghrVar2 = this.P;
            ghrVar2.B(7);
            ghrVar2.A(zpg.OPA_TV_SPEECH_MIC_CLOSED);
            ghrVar2.A(zpg.OPA_TV_SPEECH_AUDIO_CAPTURE_STOPPED);
            if (((Boolean) this.C.a()).booleanValue()) {
                ((gfn) this.w.a()).a(rpm.br()).b().c();
            } else {
                gfq.b(this.x, rpm.br(), null, null, 14);
            }
        } else {
            if (iOrdinal != 3) {
                throw new agpg();
            }
            c(new agux() { // from class: jni
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    ArtModelService artModelService = (ArtModelService) obj;
                    int i2 = jnk.b;
                    artModelService.getClass();
                    String str5 = recognitionResult.recognized_speech;
                    zdy zdyVar2 = ArtModelService.a;
                    zeo zeoVarB = zdyVar2.b();
                    zer zerVar = zfi.a;
                    ((zdv) ((zdv) zeoVarB.o(zerVar, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "registerTranscript", 120, "ArtModelService.java")).x("registerTranscript is called for TRANSCRIPT_TYPE_UNSPECIFIED with %s.", str5);
                    final ved vedVar = ved.TRANSCRIPT_TYPE_UNSPECIFIED;
                    ((zdv) ((zdv) zdyVar2.b().o(zerVar, "ArtModelService")).q("com/google/android/testing/assistantreadinesstest/ArtModelService", "registerTranscript", 100, "ArtModelService.java")).F("registerTranscript is called for transcriptType %s with %s.", vedVar.name(), str5);
                    zbp zbpVar = artModelService.c;
                    ((yvo) zbpVar).h(vedVar, 1);
                    veb vebVar = veb.a;
                    vea veaVar = new vea();
                    if ((veaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        veaVar.y();
                    }
                    veb vebVar2 = (veb) veaVar.b;
                    str5.getClass();
                    vebVar2.b = 1 | vebVar2.b;
                    vebVar2.c = str5;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if ((veaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        veaVar.y();
                    }
                    veb vebVar3 = (veb) veaVar.b;
                    vebVar3.b |= 4;
                    vebVar3.e = jCurrentTimeMillis;
                    int iB = ((yvi) zbpVar).a.b(vedVar);
                    if ((veaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        veaVar.y();
                    }
                    veb vebVar4 = (veb) veaVar.b;
                    vebVar4.b |= 8;
                    vebVar4.f = iB;
                    if ((veaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        veaVar.y();
                    }
                    veb vebVar5 = (veb) veaVar.b;
                    vebVar5.d = vedVar.e;
                    vebVar5.b |= 2;
                    veb vebVar6 = (veb) veaVar.v();
                    vdu vduVar = artModelService.b;
                    int iA = zag.a(DesugarCollections.unmodifiableList(((vdv) vduVar.b).c), new yqx() { // from class: vdo
                        @Override // defpackage.yqx
                        public final boolean a(Object obj2) {
                            ved vedVarB = ved.b(((veb) obj2).d);
                            if (vedVarB == null) {
                                vedVarB = ved.TRANSCRIPT_TYPE_UNSPECIFIED;
                            }
                            return vedVarB == vedVar;
                        }
                    });
                    Integer numValueOf = iA >= 0 ? Integer.valueOf(iA) : null;
                    if (numValueOf == null) {
                        if ((vduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vduVar.y();
                        }
                        vdv vdvVar = (vdv) vduVar.b;
                        vebVar6.getClass();
                        abxs abxsVar = vdvVar.c;
                        if (!abxsVar.c()) {
                            int size = abxsVar.size();
                            vdvVar.c = abxsVar.d(size + size);
                        }
                        vdvVar.c.add(vebVar6);
                    } else {
                        int iIntValue = numValueOf.intValue();
                        if ((vduVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vduVar.y();
                        }
                        vdv vdvVar2 = (vdv) vduVar.b;
                        vebVar6.getClass();
                        abxs abxsVar2 = vdvVar2.c;
                        if (!abxsVar2.c()) {
                            int size2 = abxsVar2.size();
                            vdvVar2.c = abxsVar2.d(size2 + size2);
                        }
                        vdvVar2.c.set(iIntValue, vebVar6);
                    }
                    return agpu.a;
                }
            });
            this.S = "";
            String str5 = recognitionResult.recognized_speech;
            this.Y = str5 != null ? str5.length() : 0;
            if (!this.V || this.W) {
                ((gcd) this.B.a()).i();
            }
            String str6 = recognitionResult.recognized_speech;
            gmd gmdVar2 = this.A;
            gmdVar2.r(gmc.e, rbl.SUCCESS);
            gmdVar2.b(gmc.au);
            gmdVar2.b(gmc.f);
            gmdVar2.b(gmc.g);
            gfr gfrVar = this.x;
            gfrVar.b(rpm.cs(), null, null);
            agow agowVar2 = this.w;
            ((gfn) agowVar2.a()).a(rpm.K()).b().c();
            ((gfn) agowVar2.a()).a(rpm.bV()).b().c();
            ((gfn) agowVar2.a()).a(rpm.bZ()).b().c();
            ghr ghrVar3 = this.P;
            ghrVar3.B(6);
            ghrVar3.A(zpg.OPA_TV_SPEECH_RECOGNIZED);
            this.y.u();
            if (str6 != null && str6.length() != 0) {
                jdt jdtVar2 = this.g;
                int iOrdinal2 = jdtVar2.Z().ordinal();
                if (iOrdinal2 == 2) {
                    ghrVar3.ad(str6, 1, 3);
                    if (((Boolean) this.C.a()).booleanValue()) {
                        ((gfn) agowVar2.a()).a(rpm.da()).b().c();
                    } else {
                        gfq.b(gfrVar, rpm.da(), null, null, 14);
                    }
                } else if (iOrdinal2 == 3) {
                    if (jdtVar2.U()) {
                        ghrVar3.ad(str6, 1, 5);
                        if (((Boolean) this.C.a()).booleanValue()) {
                            ((gfn) agowVar2.a()).a(rpm.dc()).b().c();
                        } else {
                            gfq.b(gfrVar, rpm.dc(), null, null, 14);
                        }
                    } else {
                        ghrVar3.ad(str6, 1, 2);
                        if (((Boolean) this.C.a()).booleanValue()) {
                            ((gfn) agowVar2.a()).a(rpm.dd()).b().c();
                        } else {
                            gfq.b(gfrVar, rpm.dd(), null, null, 14);
                        }
                    }
                }
            }
            MediaPlayer mediaPlayer = this.aa.b;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            String str7 = recognitionResult.recognized_speech;
            if (str7 != null && str7.length() != 0) {
                jnr jnrVar2 = this.O;
                if (jnrVar2.k()) {
                    String str8 = recognitionResult.recognized_speech;
                    str8.getClass();
                    jnrVar2.e(str8);
                    if (!jnrVar2.m()) {
                        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnRecognitionStateChanged", 759, "KatnissConversationStateListenerImpl.kt")).u("stopTopInteraction because hasSpeechRecognitionCallback");
                        this.g.M();
                        return;
                    }
                }
                lzb lzbVar = this.K;
                lzbVar.C(recognitionResult.recognized_speech, 3);
                lzbVar.D(recognitionResult.recognized_speech);
                if (agvy.c(this.r.a, "com.google.android.youtube.tv") && ((Boolean) this.G.a()).booleanValue()) {
                    grl grlVar2 = this.E;
                    String str9 = recognitionResult.recognized_speech;
                    str9.getClass();
                    grlVar2.a(str9);
                }
            } else if (((Boolean) this.C.a()).booleanValue()) {
                ((gfn) agowVar2.a()).a(rpm.J()).b().c();
            } else {
                gfq.b(gfrVar, rpm.J(), null, null, 14);
            }
            jcv jcvVar = this.n;
            if (jcvVar.s && !jcvVar.m()) {
                this.g.L(false);
            }
        }
        this.j.a(new agux() { // from class: jnj
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ConversationStateListener conversationStateListener = (ConversationStateListener) obj;
                int i2 = jnk.b;
                conversationStateListener.getClass();
                conversationStateListener.OnRecognitionStateChanged(recognitionState, recognitionResult);
                return agpu.a;
            }
        });
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingFinished() {
        ((zdv) c.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnRespondingFinished", 643, "KatnissConversationStateListenerImpl.kt")).u("onRespondingFinished()");
        ((gcd) this.B.a()).j();
        this.x.b(rpm.cs(), null, null);
        this.A.b(gmc.au);
        if (lzb.b) {
            this.K.C(null, 5);
        }
        this.j.a(new agux() { // from class: jne
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ConversationStateListener conversationStateListener = (ConversationStateListener) obj;
                int i = jnk.b;
                conversationStateListener.getClass();
                conversationStateListener.OnRespondingFinished();
                return agpu.a;
            }
        });
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingStarted(final boolean z) {
        ((zdv) c.b().q("com/google/android/apps/tvsearch/voice/listener/KatnissConversationStateListenerImpl", "OnRespondingStarted", 599, "KatnissConversationStateListenerImpl.kt")).u("onRespondingStarted()");
        if (z) {
            ((gcd) this.B.a()).a();
            this.P.A(zpg.OPA_TV_SPEECH_DOWNSTREAM_FAILURE);
            gfq.b(this.x, rpm.cD(), null, null, 14);
        } else {
            ((gcd) this.B.a()).g();
        }
        gmd gmdVar = this.A;
        gmdVar.m(gmc.g);
        if (((Boolean) this.C.a()).booleanValue()) {
            ((gfn) this.w.a()).a(rpm.de()).b().c();
        } else {
            gfq.b(this.x, rpm.de(), null, null, 14);
        }
        this.x.b(rpm.cs(), null, null);
        gmdVar.b(gmc.au);
        lzb lzbVar = this.K;
        lzbVar.C(null, 4);
        this.R = true;
        lzbVar.A(true);
        if (((jod) this.z.a()).h()) {
            lzbVar.s();
        }
        this.j.a(new agux() { // from class: jnh
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ConversationStateListener conversationStateListener = (ConversationStateListener) obj;
                int i = jnk.b;
                conversationStateListener.getClass();
                conversationStateListener.OnRespondingStarted(z);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jnb
    public final void a(ConversationStateListener conversationStateListener) {
        conversationStateListener.getClass();
        this.j.b(conversationStateListener);
    }

    @Override // defpackage.jnb
    public final void b(ConversationStateListener conversationStateListener) {
        conversationStateListener.getClass();
        this.j.c(conversationStateListener);
    }
}
