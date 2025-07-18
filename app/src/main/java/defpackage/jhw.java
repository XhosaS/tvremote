package defpackage;

import com.google.assistant.sdk.libassistant.ExternalAppFlowLogger;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhw extends ExternalAppFlowLogger {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/LibAssistantAppFlowLogger");
    private static final Set b = agqj.p(new rqs[]{rpm.bg(), rpm.aG(), rpm.aF(), rpm.aQ(), rpm.aS(), rpm.aB()});
    private static final Set c = agqj.p(new Object[]{rpu.LIBAS_START_OF_HOTWORD_AUDIO, rpu.LIBAS_HOTWORD_DETECTION_RECEIVED, rpu.LIBAS_HOTWORD_DETECTED, rpu.LIBAS_MIC_OPENED, rpu.LIBAS_PLAYED_INVOCATION_BEEP, rpu.LIBAS_BEGIN_ACTIVE_INVOCATION, rpu.LIBAS_VOICE_INTERACTION_FROM_HOTWORD, rpu.LIBAS_VOICE_INTERACTION_FROM_TAP, rpu.LIBAS_VOICE_INTERACTION_FROM_CONTINUED_CONVERSATION, rpu.LIBAS_VOICE_INTERACTION_FROM_ALWAYS_ON, rpu.LIBAS_VOICE_INTERACTION_FROM_HOT_GAZE, rpu.LIBAS_VOICE_INTERACTION_FROM_HOT_GESTURE, rpu.LIBAS_VOICE_INTERACTION_FROM_MAGIC_MIC, rpu.LIBAS_VOICE_INTERACTION_FROM_STORYBOOKS, rpu.WARM_WORDS_INTERACTION_START, rpu.WARM_WORDS_MATCHER_REQUEST_PREFETCH, rpu.WARM_WORDS_REJECTED_PREFETCH, rpu.WARM_WORDS_TRIGGERED_PREFETCH, rpu.WARM_WORDS_MATCHER_REQUEST, rpu.WARM_WORDS_TRIGGERED, rpu.LIBAS_VOICE_INTERACTION_FROM_HOT_QUERIES, rpu.LIBAS_VOICELESS_INTERACTION_FROM_UI_PRESS, rpu.LIBAS_HOTWORD_PEAK_EVENT, rpu.LIBAS_START_OF_SPEECH_ESTIMATION, rpu.LIBAS_SPEECH_START_ENDPOINTER_INFERRED, rpu.LIBAS_SPEECH_FINISH_ENDPOINTER_INFERRED, rpu.LIBAS_S3_TRANSPORT_CREATED, rpu.LIBAS_S3_TRANSPORT_STARTED, rpu.LIBAS_S3_CONNECTION_UP, rpu.LIBAS_S3_INITIAL_REQUEST_BUILT, rpu.LIBAS_S3_INITIAL_REQUEST_SENT, rpu.LIBAS_S3_CONNECTION_RETRY, rpu.LIBAS_NETWORK_ROUNDTRIP_TIME, rpu.LIBAS_S3_ENDPOINTER_RECEIVED, rpu.LIBAS_S3_INTERMEDIATE_RECOGNITION, rpu.LIBAS_S3_FINAL_RECOGNITION, rpu.LIBAS_ASSISTANT_OUTPUT_RECEIVED, rpu.LIBAS_REMOTE_CLIENT_OPS_DISPATCHED, rpu.LIBAS_S3_TTS_RECEIVE_START, rpu.LIBAS_S3_TTS_RECEIVE_END, rpu.LIBAS_TTS_PLAYBACK_STARTED, rpu.LIBAS_TTS_PLAYBACK_FINISHED, rpu.LIBAS_REMOTE_CLIENT_OPS_RECEIVED, rpu.LIBAS_CLIENT_OPS_RECEIVED, rpu.LIBAS_CLIENT_OPS_EXECUTED, rpu.LIBAS_REMOTE_CLIENT_OPS_EXECUTED, rpu.LIBAS_ON_DEVICE_ASR_ENDPOINTER_RECEIVED, rpu.LIBAS_S3_TRUE_END_OF_QUERY_ESTIMATION, rpu.ON_DEVICE_TTS_SYNTHESIZE_START, rpu.ON_DEVICE_FIRST_TTS_BUFFER_RECEIVED, rpu.ON_DEVICE_FINAL_TTS_BUFFER_RECEIVED, rpu.ON_DEVICE_TRUE_END_OF_QUERY_ESTIMATION, rpu.ON_DEVICE_ASSISTANT_SESSION_START, rpu.ON_DEVICE_ASSISTANT_SESSION_END, rpu.ON_DEVICE_ASSISTANT_FINAL_REQUEST_RECEIVED, rpu.ON_DEVICE_ASSISTANT_NLU_CACHE_START, rpu.ON_DEVICE_ASSISTANT_NLU_CACHE_HIT, rpu.ON_DEVICE_ASSISTANT_NLU_CACHE_MISSED, rpu.ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_START, rpu.ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_SUCCESS, rpu.ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_FAILURE, rpu.ON_DEVICE_ASSISTANT_EXECUTION_START, rpu.ON_DEVICE_ASSISTANT_EXECUTION_SUCCESS, rpu.ON_DEVICE_ASSISTANT_EXECUTION_FAILURE, rpu.ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_START, rpu.ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_SUCCESS, rpu.ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_FAILURE, rpu.ON_DEVICE_ASSISTANT_PREFETCH_REQUEST_RECEIVED, rpu.LIBAS_ALARM_TIMER_REQUEST_RECEIVED, rpu.LIBAS_CANCEL_ALARM_TIMER_ACTIVITY, rpu.LIBAS_ALARM_TIMER_REQUEST_HANDLED, rpu.WARM_WORDS_REJECTED, rpu.LIBAS_INTERACTION_FINISHED_SUCCESS, rpu.LIBAS_INTERACTION_NO_TTS_RESPONSE, rpu.LIBAS_INTERACTION_ERROR_COMMUNICATION, rpu.LIBAS_INTERACTION_TIMEOUT, rpu.LIBAS_INTERACTION_CANCELLED_BY_ARBITRATION, rpu.LIBAS_INTERACTION_CANCELLED, rpu.LIBAS_INTERACTION_CANCELLED_BY_BARGE_IN, rpu.LIBAS_INTERACTION_NO_SPEECH_DETECTED, "LIBAS_INTERACTION_INVALID_REQUEST"});
    private final agow d;
    private final agow e;
    private final agow f;
    private final agow g;
    private final gfr h;
    private final agow i;
    private final mcw j;

    public jhw(agow agowVar, agow agowVar2, mcw mcwVar, agow agowVar3, agow agowVar4, gfr gfrVar, agow agowVar5) {
        agowVar.getClass();
        agowVar2.getClass();
        mcwVar.getClass();
        agowVar3.getClass();
        gfrVar.getClass();
        agowVar5.getClass();
        this.d = agowVar;
        this.e = agowVar2;
        this.j = mcwVar;
        this.f = agowVar3;
        this.g = agowVar4;
        this.h = gfrVar;
        this.i = agowVar5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    @Override // com.google.assistant.sdk.libassistant.ExternalAppFlowLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void logAppFlowEvent(byte[] r30) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhw.logAppFlowEvent(byte[]):void");
    }
}
