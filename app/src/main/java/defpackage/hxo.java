package defpackage;

import com.google.assistant.sdk.libassistant.ConversationStateListener;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxo extends ConversationStateListener {
    final /* synthetic */ hxr a;

    public hxo(hxr hxrVar) {
        this.a = hxrVar;
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnConversationTurnFinished(final ConversationStateListener.Resolution resolution) {
        resolution.getClass();
        zdy zdyVar = hxr.f;
        final hxr hxrVar = this.a;
        hxrVar.N = false;
        hxrVar.E().post(new Runnable() { // from class: hxl
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                hxr hxrVar2 = hxrVar;
                if (hxrVar2.Z) {
                    return;
                }
                hxo hxoVar = this;
                ConversationStateListener.Resolution resolution2 = resolution;
                ConversationStateListener.RecognitionState recognitionState = ConversationStateListener.RecognitionState.STARTED;
                int iOrdinal = resolution2.ordinal();
                if (iOrdinal == 0) {
                    hxoVar.a();
                    return;
                }
                if (iOrdinal == 1) {
                    if (hxrVar2.o.Z() != jlv.INVOCATION_TYPE_HOTWORD) {
                        hxrVar2.H();
                        hyq hyqVar = hxrVar2.ag;
                        if (hyqVar != null) {
                            hyqVar.c();
                        }
                    }
                    if (((Boolean) hxrVar2.z.a()).booleanValue()) {
                        hxoVar.a();
                        return;
                    }
                    return;
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        if (hxrVar2.ae || hxrVar2.ad) {
                            hxrVar2.a();
                            return;
                        }
                        return;
                    }
                    if (iOrdinal == 5) {
                        if (hxrVar2.ad) {
                            hxrVar2.X();
                            feq.e(hxrVar2.E(), hxr.i, hxrVar2.W);
                        }
                        if (!hxrVar2.aj()) {
                            hxoVar.a();
                            return;
                        }
                        hxrVar2.H().g(hxrVar2.X);
                        hxrVar2.X();
                        feq.e(hxrVar2.E(), hxr.j, hxrVar2.W);
                        return;
                    }
                    if (iOrdinal != 6) {
                        if (iOrdinal != 7) {
                            return;
                        }
                        hxrVar2.H().e();
                        hyq hyqVar2 = hxrVar2.ag;
                        if (hyqVar2 != null) {
                            hyqVar2.c();
                        }
                        hxrVar2.o.M();
                        gph gphVar = hxrVar2.w;
                        if ((gphVar == gph.a || gphVar == gph.c || !hxrVar2.m.h) && !hxrVar2.l.isTouchExplorationEnabled()) {
                            hxrVar2.X();
                            feq.e(hxrVar2.E(), hxr.k, hxrVar2.W);
                            return;
                        }
                        return;
                    }
                }
                hxrVar2.H().e();
                hyq hyqVar3 = hxrVar2.ag;
                if (hyqVar3 != null) {
                    hyqVar3.c();
                }
                gph gphVar2 = hxrVar2.w;
                if ((gphVar2 == gph.a || gphVar2 == gph.c || !hxrVar2.m.h) && !hxrVar2.l.isTouchExplorationEnabled()) {
                    hxrVar2.X();
                    feq.e(hxrVar2.E(), hxr.k, hxrVar2.W);
                }
            }
        });
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnConversationTurnStarted(final boolean z) {
        zdy zdyVar = hxr.f;
        final hxr hxrVar = this.a;
        hxrVar.N = true;
        hxrVar.Y();
        hxrVar.ai = false;
        hxrVar.X();
        hxrVar.E().post(new Runnable() { // from class: hxj
            @Override // java.lang.Runnable
            public final void run() {
                hxr hxrVar2 = hxrVar;
                if (hxrVar2.Z) {
                    return;
                }
                if (!z) {
                    if (hxrVar2.H().n()) {
                        return;
                    }
                    jdt jdtVar = hxrVar2.o;
                    String strI = jdtVar.i();
                    if (strI != null && strI.length() != 0) {
                        hxrVar2.H().f(jdtVar.i());
                        return;
                    }
                    if (hxrVar2.H().o()) {
                        hxrVar2.H().b();
                        hyq hyqVar = hxrVar2.ag;
                        if (hyqVar != null) {
                            hyqVar.c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!hxrVar2.H().o()) {
                    hxrVar2.O();
                }
                if (hxrVar2.p.c() && hxrVar2.o.U()) {
                    hxrVar2.R();
                    return;
                }
                String strI2 = hxrVar2.o.i();
                if (strI2 == null || strI2.length() == 0) {
                    hvt hvtVar = (hvt) hxrVar2.H();
                    hvtVar.r();
                    hvtVar.g = hvtVar.g.a(hzg.OPEN_MIC);
                    hvtVar.s();
                    hyq hyqVar2 = hxrVar2.ag;
                    if (hyqVar2 != null) {
                        hyqVar2.a(hxrVar2.Q);
                    }
                }
            }
        });
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRecognitionStateChanged(final ConversationStateListener.RecognitionState recognitionState, final ConversationStateListener.RecognitionResult recognitionResult) {
        recognitionState.getClass();
        recognitionResult.getClass();
        zdy zdyVar = hxr.f;
        final hxr hxrVar = this.a;
        hxrVar.E().post(new Runnable() { // from class: hxn
            @Override // java.lang.Runnable
            public final void run() {
                hxr hxrVar2 = hxrVar;
                if (hxrVar2.Z) {
                    return;
                }
                ConversationStateListener.RecognitionResult recognitionResult2 = recognitionResult;
                ConversationStateListener.RecognitionState recognitionState2 = recognitionState;
                ConversationStateListener.Resolution resolution = ConversationStateListener.Resolution.NORMAL;
                int iOrdinal = recognitionState2.ordinal();
                if (iOrdinal == 0) {
                    feq.e(hxrVar2.E(), hxr.g, hxrVar2.af);
                    hxrVar2.ao.b();
                    return;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        hxrVar2.E().removeCallbacks(hxrVar2.af);
                        hxrVar2.ao.a();
                        return;
                    }
                    if (iOrdinal != 3) {
                        throw new agpg();
                    }
                    String str = recognitionResult2.recognized_speech;
                    if (str != null && str.length() != 0) {
                        hxrVar2.H().f(recognitionResult2.recognized_speech);
                        hyq hyqVar = hxrVar2.ag;
                        if (hyqVar != null) {
                            hyqVar.c();
                        }
                        if (hxrVar2.ah) {
                            jdt jdtVar = hxrVar2.o;
                            jdtVar.M();
                            String str2 = recognitionResult2.recognized_speech;
                            str2.getClass();
                            jdtVar.y(str2);
                        }
                    }
                    hxrVar2.ao.a();
                    hxrVar2.aj.d();
                    return;
                }
                String str3 = recognitionResult2.recognized_speech;
                if (str3 == null || str3.length() == 0) {
                    return;
                }
                Object objA = hxrVar2.K.a();
                objA.getClass();
                Duration durationOfMillis = Duration.ofMillis(((Number) objA).longValue());
                durationOfMillis.getClass();
                if (durationOfMillis.isZero()) {
                    hvq hvqVarH = hxrVar2.H();
                    String str4 = recognitionResult2.high_confidence_text;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = recognitionResult2.low_confidence_text;
                    hvqVarH.h(str4, str5 != null ? str5 : "");
                } else {
                    yrn yrnVar = hxrVar2.aj;
                    if (!yrnVar.a || Duration.ofNanos(yrnVar.b()).compareTo(durationOfMillis) >= 0) {
                        hvq hvqVarH2 = hxrVar2.H();
                        String str6 = recognitionResult2.high_confidence_text;
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str7 = recognitionResult2.low_confidence_text;
                        hvqVarH2.h(str6, str7 != null ? str7 : "");
                        yrnVar.d();
                        yrnVar.e();
                    }
                }
                hyq hyqVar2 = hxrVar2.ag;
                if (hyqVar2 != null) {
                    hyqVar2.c();
                }
                hxrVar2.ao.b();
            }
        });
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingFinished() {
        zdy zdyVar = hxr.f;
        final hxr hxrVar = this.a;
        hxrVar.E().post(new Runnable() { // from class: hxm
            @Override // java.lang.Runnable
            public final void run() {
                hxr hxrVar2 = hxrVar;
                if (hxrVar2.Z || !hxrVar2.H().p()) {
                    return;
                }
                gph gphVar = hxrVar2.w;
                if (((gphVar == gph.a || gphVar == gph.c || hxrVar2.ae) && !hxrVar2.v.q()) || hxrVar2.a) {
                    return;
                }
                hxrVar2.H().l();
            }
        });
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingStarted(boolean z) {
        zdy zdyVar = hxr.f;
        final hxr hxrVar = this.a;
        hxrVar.E().post(new Runnable() { // from class: hxk
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                hxr hxrVar2 = hxrVar;
                gph gphVar = hxrVar2.w;
                if ((gphVar != gph.a && gphVar != gph.c) || hxrVar2.ae) {
                    if (hxrVar2.Z) {
                        return;
                    }
                    if (gphVar == gph.b) {
                        hxrVar2.N();
                    }
                    if (hxrVar2.aj()) {
                        hxrVar2.H().g(hxrVar2.X);
                    }
                    hxrVar2.H().k();
                    return;
                }
                if (!hxrVar2.v.q()) {
                    hxrVar2.a();
                    return;
                }
                if (hxrVar2.Z || hxrVar2.x.b()) {
                    return;
                }
                if (((Boolean) hxrVar2.I.a()).booleanValue()) {
                    hvt hvtVar = (hvt) hxrVar2.H();
                    hvtVar.r();
                    hvtVar.g = hvtVar.g.a(hzg.START_INTERACTION);
                    hvtVar.s();
                } else {
                    hxrVar2.H().g("");
                }
                hxrVar2.H().k();
            }
        });
    }

    public final void a() throws InterruptedException {
        hxr hxrVar = this.a;
        gph gphVar = hxrVar.w;
        if (gphVar == gph.b) {
            hxrVar.N();
        }
        if (hxrVar.v.q()) {
            return;
        }
        if (gphVar == gph.a || gphVar == gph.c) {
            hxrVar.a();
            return;
        }
        if (hxrVar.ae) {
            hxrVar.ad();
            return;
        }
        hxrVar.H().e();
        hyq hyqVar = hxrVar.ag;
        if (hyqVar != null) {
            hyqVar.c();
        }
    }
}
