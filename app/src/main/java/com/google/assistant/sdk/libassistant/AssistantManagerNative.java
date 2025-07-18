package com.google.assistant.sdk.libassistant;

import android.content.Context;
import com.google.android.apps.assistant.audio.LibAAudioManager;
import com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClient;
import com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClientImpl;
import com.google.assistant.base.ContextHelper;
import com.google.assistant.base.Log;
import com.google.assistant.base.annotations.JNINamespace;
import com.google.assistant.sdk.libassistant.ActionExecutor;
import com.google.assistant.sdk.libassistant.AudioInputUtils;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.abxd;
import defpackage.abxv;
import defpackage.abza;
import defpackage.abzz;
import defpackage.xwu;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;

/* compiled from: PG */
@JNINamespace("assistant::sdk")
/* loaded from: classes2.dex */
public class AssistantManagerNative {
    private static final String KATNISS_PACKAGE_NAME = "com.google.android.katniss";
    private static final String LOCAL_GRPC_CLIENT_PERMISSION = "com.google.android.apps.mediashell.permission.LOCAL_GRPC_CLIENT";
    private static final String TAG = "AssistantManagerNative";
    private static final long nullptr = -1;
    private long assistantManagerInternalPtr;
    private long assistantManagerPtr;
    private boolean deviceActionHandlerRegistered;
    private LocalGrpcAuthClient localGrpcAuthClient;
    private boolean startCalled;
    private boolean startCompleted;
    private final ArrayList deviceStateListeners = new ArrayList();
    private final ArrayList conversationStateListeners = new ArrayList();
    private final ArrayList testStateChangeObservers = new ArrayList();
    private final Set audioInputEventListenersRegistered = new HashSet();
    private boolean localExecutionEnabled = false;
    private final DeviceStateListener ownedDeviceStateListener = new AnonymousClass1(this);
    private final ConversationStateListener ownedConversationStateListener = new AnonymousClass2(this);
    private final TestStateChangeObserver ownedTestStateChangeObserver = new AnonymousClass3(this);
    private final AssistantEventListener ownedAssistantEventListener = new AnonymousClass4(this);
    private final ArrayList assistantEventListeners = new ArrayList();
    private final ArrayList actionExecutorWrappers = new ArrayList();

    /* compiled from: PG */
    /* renamed from: com.google.assistant.sdk.libassistant.AssistantManagerNative$1, reason: invalid class name */
    class AnonymousClass1 extends DeviceStateListener {
        final /* synthetic */ AssistantManagerNative this$0;

        public AnonymousClass1(AssistantManagerNative assistantManagerNative) {
            assistantManagerNative.getClass();
            this.this$0 = assistantManagerNative;
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnAlarmSoundingFinished() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda10
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnAlarmSoundingFinished();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnAlarmSoundingStarted() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda7
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnAlarmSoundingStarted();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnAuthenticationReceived(final boolean z) {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda3
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnAuthenticationReceived(z);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnDeviceStateChange(final byte[] bArr) {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda6
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnDeviceStateChange(bArr);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnHoldFinished() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda9
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnHoldFinished();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnHoldStarted() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnHoldStarted();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnLocalTtsFinished() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda14
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnLocalTtsFinished();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnLocalTtsStarted() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnLocalTtsStarted();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnMicMutedChange(final boolean z) {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda11
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnMicMutedChange(z);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnNotificationClear() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda8
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnNotificationClear();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnNotificationTrigger() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda5
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnNotificationTrigger();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnStartFinished() {
            this.this$0.startCompleted = true;
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda4
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnStartFinished();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnStopTopInteraction() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda12
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnStopTopInteraction();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnTimerSoundingFinished() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda13
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnTimerSoundingFinished();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
        public void OnTimerSoundingStarted() {
            synchronized (this.this$0.deviceStateListeners) {
                Iterable$EL.forEach(this.this$0.deviceStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$1$$ExternalSyntheticLambda1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((DeviceStateListener) obj).OnTimerSoundingStarted();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.assistant.sdk.libassistant.AssistantManagerNative$2, reason: invalid class name */
    class AnonymousClass2 extends ConversationStateListener {
        final /* synthetic */ AssistantManagerNative this$0;

        public AnonymousClass2(AssistantManagerNative assistantManagerNative) {
            assistantManagerNative.getClass();
            this.this$0 = assistantManagerNative;
        }

        @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
        public void OnConversationTurnFinished(final ConversationStateListener.Resolution resolution) {
            synchronized (this.this$0.conversationStateListeners) {
                Iterable$EL.forEach(this.this$0.conversationStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$2$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((ConversationStateListener) obj).OnConversationTurnFinished(resolution);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
        public void OnConversationTurnStarted(final boolean z) {
            synchronized (this.this$0.conversationStateListeners) {
                Iterable$EL.forEach(this.this$0.conversationStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$2$$ExternalSyntheticLambda4
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((ConversationStateListener) obj).OnConversationTurnStarted(z);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
        public void OnRecognitionStateChanged(final ConversationStateListener.RecognitionState recognitionState, final ConversationStateListener.RecognitionResult recognitionResult) {
            synchronized (this.this$0.conversationStateListeners) {
                Iterable$EL.forEach(this.this$0.conversationStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$2$$ExternalSyntheticLambda1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((ConversationStateListener) obj).OnRecognitionStateChanged(recognitionState, recognitionResult);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
        public void OnRespondingFinished() {
            synchronized (this.this$0.conversationStateListeners) {
                Iterable$EL.forEach(this.this$0.conversationStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$2$$ExternalSyntheticLambda3
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((ConversationStateListener) obj).OnRespondingFinished();
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
        public void OnRespondingStarted(final boolean z) {
            synchronized (this.this$0.conversationStateListeners) {
                Iterable$EL.forEach(this.this$0.conversationStateListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$2$$ExternalSyntheticLambda2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((ConversationStateListener) obj).OnRespondingStarted(z);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.assistant.sdk.libassistant.AssistantManagerNative$3, reason: invalid class name */
    class AnonymousClass3 extends TestStateChangeObserver {
        final /* synthetic */ AssistantManagerNative this$0;

        public AnonymousClass3(AssistantManagerNative assistantManagerNative) {
            assistantManagerNative.getClass();
            this.this$0 = assistantManagerNative;
        }

        @Override // com.google.assistant.sdk.libassistant.TestStateChangeObserver
        public void StateChanged(final xwu xwuVar) {
            synchronized (this.this$0.testStateChangeObservers) {
                Iterable$EL.forEach(this.this$0.testStateChangeObservers, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$3$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((TestStateChangeObserver) obj).StateChanged(xwuVar);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.TestStateChangeObserver
        public void StateChangedBytes(byte[] bArr) throws abxv {
            try {
                abxd abxdVarH = abxd.h(xwu.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH != null) {
                    abxd abxdVar = null;
                    byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                    if (bByteValue != 1) {
                        if (bByteValue != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            if (true == zL) {
                                abxdVar = abxdVarH;
                            }
                            abxdVarH.cM(2, abxdVar);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                }
                StateChanged((xwu) abxdVarH);
            } catch (Exception e) {
                throw new IllegalArgumentException("Failed to parse InternalStateChange protocol buffer descriptor.", e);
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.assistant.sdk.libassistant.AssistantManagerNative$4, reason: invalid class name */
    class AnonymousClass4 extends AssistantEventListener {
        final /* synthetic */ AssistantManagerNative this$0;

        public AnonymousClass4(AssistantManagerNative assistantManagerNative) {
            assistantManagerNative.getClass();
            this.this$0 = assistantManagerNative;
        }

        @Override // com.google.assistant.sdk.libassistant.AssistantEventListener
        public void onAlarmEvent(final byte[] bArr) {
            synchronized (this.this$0.assistantEventListeners) {
                Iterable$EL.forEach(this.this$0.assistantEventListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$4$$ExternalSyntheticLambda1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((AssistantEventListener) obj).onAlarmEvent(bArr);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.AssistantEventListener
        public void onSpeechLevelEvent(final float f) {
            synchronized (this.this$0.assistantEventListeners) {
                Iterable$EL.forEach(this.this$0.assistantEventListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$4$$ExternalSyntheticLambda2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((AssistantEventListener) obj).onSpeechLevelEvent(f);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.AssistantEventListener
        public void onTimerEvent(final byte[] bArr) {
            synchronized (this.this$0.assistantEventListeners) {
                Iterable$EL.forEach(this.this$0.assistantEventListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$4$$ExternalSyntheticLambda3
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((AssistantEventListener) obj).onTimerEvent(bArr);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        @Override // com.google.assistant.sdk.libassistant.AssistantEventListener
        public void onZwiebackUpdateEvent(final String str) {
            synchronized (this.this$0.assistantEventListeners) {
                Iterable$EL.forEach(this.this$0.assistantEventListeners, new Consumer() { // from class: com.google.assistant.sdk.libassistant.AssistantManagerNative$4$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((AssistantEventListener) obj).onZwiebackUpdateEvent(str);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    /* compiled from: PG */
    public class AssistantLocalGrpcAuthCallback implements LocalGrpcAuthClient.Callback {
        private final String TAG;
        final /* synthetic */ AssistantManagerNative this$0;

        public AssistantLocalGrpcAuthCallback(AssistantManagerNative assistantManagerNative) {
            assistantManagerNative.getClass();
            this.this$0 = assistantManagerNative;
            this.TAG = AssistantLocalGrpcAuthCallback.class.getSimpleName();
        }

        @Override // com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClient.Callback
        public void onError() {
            Log.e(this.TAG, "the port or token cannot be retrieved from local grpc client", new Object[0]);
        }

        @Override // com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClient.Callback
        public void onResult(int i, String str) {
            Log.i(this.TAG, "local grpc token update", new Object[0]);
            this.this$0.setLocalGrpcAuthToken(i, str);
        }
    }

    /* compiled from: PG */
    public enum RequestSource {
        UI_PRESS(1),
        OTHER(2);

        private final int sourceCode;

        RequestSource(int i) {
            this.sourceCode = i;
        }
    }

    /* compiled from: PG */
    public class VoicelessOptions {
        public final RequestSource source;
        public final boolean userInitiated;

        public VoicelessOptions(RequestSource requestSource, boolean z) {
            this.source = requestSource;
            this.userInitiated = z;
        }

        public VoicelessOptions() {
            this(RequestSource.OTHER, false);
        }
    }

    public AssistantManagerNative() {
        resetVariables();
    }

    private void checkAlive() {
        if (!isAlive()) {
            throw new IllegalAssistantUsageException("Error: AssistantManagerNative is not alive. Only call after create() and before destroy().");
        }
    }

    private void checkStartCompleted() {
        if (!this.startCompleted) {
            throw new IllegalAssistantUsageException("Error: start() has not yet been called.");
        }
    }

    private boolean isAlive() {
        return this.assistantManagerPtr != -1;
    }

    private static native void nativeAddConversationStateListener(long j, ConversationStateListener conversationStateListener);

    private static native void nativeAddDeviceStateListener(long j, DeviceStateListener deviceStateListener);

    private static native void nativeAddExperimentIds(long j, String[] strArr);

    private static native void nativeAddExternalServerTriggerTokens(long j, String[] strArr);

    private static native long nativeCreate(String str, Context context, LibAAudioManager libAAudioManager, ExternalAppFlowLogger externalAppFlowLogger);

    private static native void nativeDestroy(long j);

    private static native void nativeEnableListening(long j, boolean z);

    private static native long nativeGetAssistantManagerInternal(long j, AssistantEventListener assistantEventListener);

    private static native String nativeGetDeviceId(long j);

    private static native void nativeInvokeAssistantWithAudioFd(long j, int i);

    public static native void nativeLogAppFlowEvent(long j, int i, byte[] bArr, int[] iArr, String[] strArr, long j2);

    private static native void nativeOnFcmMessage(String str, String str2, String[] strArr, String[] strArr2, String str3);

    private static native void nativeOnFcmToken(String str);

    private static native void nativeRegisterActionExecutor(long j, String str, ActionExecutor.SupportedAction[] supportedActionArr, ActionExecutorWrapper actionExecutorWrapper);

    private static native void nativeRegisterAudioInputEventListener(int i, AudioInputEventListener audioInputEventListener);

    private static native void nativeRegisterDeviceActionHandler(long j, DeviceActionHandler deviceActionHandler);

    private static native boolean nativeRegisterLocaleChangeEventListener(LocaleChangeEventListener localeChangeEventListener);

    private static native void nativeRemoveExperimentIds(long j, String[] strArr);

    private static native void nativeResetAllDataAndShutdown(long j);

    private static native void nativeSendExplicitAutomationRequest(long j, HomeAutomationRequest homeAutomationRequest);

    private static native void nativeSendTextQuery(long j, String str);

    private static native void nativeSendVoicelessInteraction(long j, byte[] bArr, String str, VoicelessOptions voicelessOptions);

    private static native void nativeSetAccessTokens(long j, String[] strArr, String[] strArr2);

    private static native void nativeSetAppCapabilities(byte[][] bArr);

    private static native boolean nativeSetBatteryState(boolean z, int i);

    private static native void nativeSetLocalGrpcAuthToken(long j, int i, String str);

    private static native void nativeSetLocaleOverride(long j, String str);

    private static native boolean nativeSetLocation(double d, double d2);

    private static native void nativeSetScreenCapabilities(byte[] bArr);

    private static native void nativeSetScreenProperties(byte[] bArr);

    private static native void nativeSetSupportedProviderTypes(byte[] bArr);

    private static native void nativeSetSurfaceSpecificFeatures(byte[] bArr);

    private static native void nativeSetTalkbackEnabled(long j, boolean z);

    private static native void nativeSetTestStateChangeObserver(long j, TestStateChangeObserver testStateChangeObserver);

    private static native void nativeSetThirdPartyCapabilities(byte[] bArr);

    private static native void nativeStart(long j);

    private static native void nativeStartAssistantInteraction(long j);

    private static native void nativeStartAssistantInteractionWithMicType(long j, int i);

    private static native void nativeStartAudioInput(int i, int i2, int i3);

    private static native void nativeStartPresetExecuteInteraction(long j, String str);

    private static native void nativeStartPresetRemoveInteraction(long j, String str);

    private static native void nativeStartPresetUpdateInteraction(long j, String str);

    private static native void nativeStartReferenceAudio();

    private static native void nativeStopAllInteractions(long j);

    private static native void nativeStopAllTts(long j);

    private static native void nativeStopAssistantInteraction(long j);

    private static native void nativeStopAudioInput(int i);

    private static native void nativeStopReferenceAudio();

    private static native void nativeStopTopInteraction(long j);

    private void resetLocalGrpcAuthClientConnection() {
        LocalGrpcAuthClient localGrpcAuthClient = this.localGrpcAuthClient;
        if (localGrpcAuthClient != null) {
            localGrpcAuthClient.unbind();
        }
    }

    private void resetVariables() {
        resetLocalGrpcAuthClientConnection();
        this.assistantManagerPtr = -1L;
        this.assistantManagerInternalPtr = -1L;
        this.startCalled = false;
        this.startCompleted = false;
        this.deviceActionHandlerRegistered = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalGrpcAuthToken(int i, String str) {
        nativeSetLocalGrpcAuthToken(this.assistantManagerInternalPtr, i, str);
    }

    private void startLocalGrpcAuthClientConnection() {
        if (ContextHelper.getApplicationContext().getPackageName().equals(KATNISS_PACKAGE_NAME)) {
            LocalGrpcAuthClientImpl localGrpcAuthClientImpl = new LocalGrpcAuthClientImpl(ContextHelper.getApplicationContext());
            this.localGrpcAuthClient = localGrpcAuthClientImpl;
            localGrpcAuthClientImpl.getLocalCloudcastServiceInfo(new AssistantLocalGrpcAuthCallback(this));
        }
    }

    public void addAssistantEventListener(AssistantEventListener assistantEventListener) {
        synchronized (this.assistantEventListeners) {
            if (this.assistantEventListeners.contains(assistantEventListener)) {
                throw new IllegalAssistantUsageException("The same AssistantEventListener was added multiple times.");
            }
            this.assistantEventListeners.add(assistantEventListener);
        }
    }

    public void addConversationStateListener(ConversationStateListener conversationStateListener) {
        synchronized (this.conversationStateListeners) {
            if (this.conversationStateListeners.contains(conversationStateListener)) {
                throw new IllegalAssistantUsageException("The same ConversationStateListener was added multiple times.");
            }
            this.conversationStateListeners.add(conversationStateListener);
        }
    }

    public void addDeviceStateListener(DeviceStateListener deviceStateListener) {
        synchronized (this.deviceStateListeners) {
            if (this.deviceStateListeners.contains(deviceStateListener)) {
                throw new IllegalAssistantUsageException("The same DeviceStateListener was added multiple times.");
            }
            this.deviceStateListeners.add(deviceStateListener);
        }
    }

    public void addExperimentIds(List list) {
        nativeAddExperimentIds(this.assistantManagerInternalPtr, (String[]) list.toArray(new String[list.size()]));
    }

    public void addExternalServerTriggerTokens(List list) {
        checkStartCompleted();
        nativeAddExternalServerTriggerTokens(this.assistantManagerInternalPtr, (String[]) list.toArray(new String[list.size()]));
    }

    public void addTestStateChangeObserver(TestStateChangeObserver testStateChangeObserver) {
        synchronized (this.testStateChangeObservers) {
            if (this.testStateChangeObservers.contains(testStateChangeObserver)) {
                throw new IllegalAssistantUsageException("The same TestStateChangeObserver was added multiple times.");
            }
            this.testStateChangeObservers.add(testStateChangeObserver);
        }
    }

    public void create(String str, Context context, LibAAudioManager libAAudioManager, ExternalAppFlowLogger externalAppFlowLogger) {
        this.assistantManagerPtr = nativeCreate(str, context, libAAudioManager, externalAppFlowLogger);
        ContextHelper.initApplicationContext(context);
        checkAlive();
        nativeAddDeviceStateListener(this.assistantManagerPtr, this.ownedDeviceStateListener);
        nativeAddConversationStateListener(this.assistantManagerPtr, this.ownedConversationStateListener);
        nativeSetTestStateChangeObserver(this.assistantManagerPtr, this.ownedTestStateChangeObserver);
        this.assistantManagerInternalPtr = nativeGetAssistantManagerInternal(this.assistantManagerPtr, this.ownedAssistantEventListener);
    }

    public void destroy() {
        checkAlive();
        this.audioInputEventListenersRegistered.clear();
        nativeDestroy(this.assistantManagerPtr);
        resetVariables();
    }

    public void enableListening(boolean z) {
        checkAlive();
        nativeEnableListening(this.assistantManagerPtr, z);
    }

    public void enableLocalGrpcExecution(boolean z) {
        if (z == this.localExecutionEnabled) {
            Log.w(TAG, "Ignoring request because local GRPC execution enabled is already ".concat(String.valueOf(Boolean.toString(z))), new Object[0]);
        } else if (z) {
            Log.i(TAG, "Enabling local GRPC execution", new Object[0]);
            startLocalGrpcAuthClientConnection();
            this.localExecutionEnabled = true;
        } else {
            Log.i(TAG, "Disabling local GRPC execution", new Object[0]);
            setLocalGrpcAuthToken(-1, "");
            resetLocalGrpcAuthClientConnection();
            this.localExecutionEnabled = false;
        }
    }

    public String getDeviceId() {
        checkAlive();
        checkStartCompleted();
        return nativeGetDeviceId(this.assistantManagerPtr);
    }

    public void invokeAssistantWithAudioFd(int i) {
        checkStartCompleted();
        nativeInvokeAssistantWithAudioFd(this.assistantManagerInternalPtr, i);
    }

    public void logAppFlowEvent(int i, byte[] bArr) {
        logAppFlowEvent(i, bArr, new HashMap());
    }

    public void onFcmMessage(String str, String str2, Map map, String str3) {
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        nativeOnFcmMessage(str, str2, strArr, strArr2, str3);
    }

    public void onFcmToken(String str) {
        nativeOnFcmToken(str);
    }

    public void registerActionExecutor(String str, ActionExecutor.SupportedAction[] supportedActionArr, ActionExecutor actionExecutor) {
        ActionExecutorWrapper actionExecutorWrapper = new ActionExecutorWrapper(actionExecutor, supportedActionArr);
        this.actionExecutorWrappers.add(actionExecutorWrapper);
        nativeRegisterActionExecutor(this.assistantManagerInternalPtr, str, supportedActionArr, actionExecutorWrapper);
    }

    public void registerAudioInputEventListener(AudioInputUtils.MicType micType, AudioInputEventListener audioInputEventListener) {
        checkAlive();
        if (this.audioInputEventListenersRegistered.contains(micType)) {
            throw new IllegalAssistantUsageException("Only one audioInputEventListener can be registered for an audio type.");
        }
        nativeRegisterAudioInputEventListener(micType.getInputType(), audioInputEventListener);
        this.audioInputEventListenersRegistered.add(micType);
    }

    public void registerDeviceActionHandler(DeviceActionHandler deviceActionHandler) {
        checkAlive();
        if (this.deviceActionHandlerRegistered) {
            throw new IllegalAssistantUsageException("Only one DeviceActionHandler can be registered.");
        }
        nativeRegisterDeviceActionHandler(this.assistantManagerPtr, deviceActionHandler);
        this.deviceActionHandlerRegistered = true;
    }

    public boolean registerLocaleChangeEventListener(LocaleChangeEventListener localeChangeEventListener) {
        checkAlive();
        return nativeRegisterLocaleChangeEventListener(localeChangeEventListener);
    }

    public void removeAssistantEventListener(AssistantEventListener assistantEventListener) {
        synchronized (this.assistantEventListeners) {
            this.assistantEventListeners.remove(assistantEventListener);
        }
    }

    public void removeConversationStateListener(ConversationStateListener conversationStateListener) {
        synchronized (this.conversationStateListeners) {
            this.conversationStateListeners.remove(conversationStateListener);
        }
    }

    public void removeDeviceStateListener(DeviceStateListener deviceStateListener) {
        synchronized (this.deviceStateListeners) {
            this.deviceStateListeners.remove(deviceStateListener);
        }
    }

    public void removeExperimentIds(List list) {
        nativeRemoveExperimentIds(this.assistantManagerInternalPtr, (String[]) list.toArray(new String[list.size()]));
    }

    public void removeTestStateChangeObserver(TestStateChangeObserver testStateChangeObserver) {
        synchronized (this.testStateChangeObservers) {
            this.testStateChangeObservers.remove(testStateChangeObserver);
        }
    }

    public void resetAllDataAndShutdown() {
        checkAlive();
        nativeResetAllDataAndShutdown(this.assistantManagerPtr);
    }

    public void sendExplicitAutomationRequest(HomeAutomationRequest homeAutomationRequest) {
        checkStartCompleted();
        nativeSendExplicitAutomationRequest(this.assistantManagerInternalPtr, homeAutomationRequest);
    }

    public void sendTextQuery(String str) {
        checkStartCompleted();
        nativeSendTextQuery(this.assistantManagerInternalPtr, str);
    }

    public void sendVoicelessInteraction(byte[] bArr, String str, VoicelessOptions voicelessOptions) {
        checkStartCompleted();
        nativeSendVoicelessInteraction(this.assistantManagerInternalPtr, bArr, str, voicelessOptions);
    }

    public void setAppCapabilities(List list) {
        checkStartCompleted();
        nativeSetAppCapabilities((byte[][]) list.toArray(new byte[list.size()][]));
    }

    public void setAuthTokens(Map map) {
        checkAlive();
        new TreeMap(map);
        nativeSetAccessTokens(this.assistantManagerPtr, (String[]) map.keySet().toArray(new String[map.keySet().size()]), (String[]) map.values().toArray(new String[map.values().size()]));
    }

    public boolean setBatteryState(boolean z, int i) {
        return nativeSetBatteryState(z, i);
    }

    public void setLocaleOverride(String str) {
        nativeSetLocaleOverride(this.assistantManagerInternalPtr, str);
    }

    public boolean setLocation(double d, double d2) {
        return nativeSetLocation(d, d2);
    }

    public void setScreenCapabilities(byte[] bArr) {
        checkStartCompleted();
        nativeSetScreenCapabilities(bArr);
    }

    public void setScreenProperties(byte[] bArr) {
        checkStartCompleted();
        nativeSetScreenProperties(bArr);
    }

    public void setSupportedProviderTypes(byte[] bArr) {
        checkStartCompleted();
        nativeSetSupportedProviderTypes(bArr);
    }

    public void setSurfaceSpecificFeatures(byte[] bArr) {
        checkStartCompleted();
        nativeSetSurfaceSpecificFeatures(bArr);
    }

    public void setTalkbackEnabled(boolean z) {
        nativeSetTalkbackEnabled(this.assistantManagerInternalPtr, z);
    }

    public void setThirdPartyCapabilities(byte[] bArr) {
        checkStartCompleted();
        nativeSetThirdPartyCapabilities(bArr);
    }

    public void start() {
        checkAlive();
        if (this.startCalled) {
            throw new IllegalAssistantUsageException("Error: start() may only be called once between create() and destroy().");
        }
        this.startCalled = true;
        nativeStart(this.assistantManagerPtr);
    }

    public void startAssistantInteraction() {
        checkAlive();
        checkStartCompleted();
        nativeStartAssistantInteraction(this.assistantManagerPtr);
    }

    public void startAssistantInteractionWithMicType(AudioInputUtils.MicType micType) {
        checkStartCompleted();
        nativeStartAssistantInteractionWithMicType(this.assistantManagerInternalPtr, micType.getInputType());
    }

    public void startAudioInput(AudioInputUtils.MicType micType, int i, int i2) {
        Log.i(TAG, "startAudioInput: micType= " + String.valueOf(micType) + " captureSessionId=" + i + " audioFd=" + i2, new Object[0]);
        nativeStartAudioInput(micType.getInputType(), i, i2);
    }

    public void startPresetExecuteInteraction(String str) {
        checkAlive();
        checkStartCompleted();
        nativeStartPresetExecuteInteraction(this.assistantManagerPtr, str);
    }

    public void startPresetRemoveInteraction(String str) {
        checkAlive();
        checkStartCompleted();
        nativeStartPresetRemoveInteraction(this.assistantManagerPtr, str);
    }

    public void startPresetUpdateInteraction(String str) {
        checkAlive();
        checkStartCompleted();
        nativeStartPresetUpdateInteraction(this.assistantManagerPtr, str);
    }

    public void startReferenceAudio() {
        Log.i(TAG, "startReferenceAudio", new Object[0]);
        nativeStartReferenceAudio();
    }

    public void stopAllInteractions() {
        checkAlive();
        checkStartCompleted();
        nativeStopAllInteractions(this.assistantManagerPtr);
    }

    public void stopAllTts() {
        checkAlive();
        checkStartCompleted();
        nativeStopAllTts(this.assistantManagerPtr);
    }

    public void stopAssistantInteraction() {
        checkAlive();
        checkStartCompleted();
        nativeStopAssistantInteraction(this.assistantManagerPtr);
    }

    public void stopAudioInput(AudioInputUtils.MicType micType) {
        nativeStopAudioInput(micType.getInputType());
    }

    public void stopReferenceAudio() {
        nativeStopReferenceAudio();
    }

    public void stopTopInteraction() {
        checkAlive();
        checkStartCompleted();
        nativeStopTopInteraction(this.assistantManagerPtr);
    }

    public void logAppFlowEvent(int i, byte[] bArr, Map map) {
        logAppFlowEvent(i, bArr, map, 0L);
    }

    public void logAppFlowEvent(int i, byte[] bArr, Map map, long j) {
        int[] iArr = new int[map.size()];
        String[] strArr = new String[map.size()];
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            iArr[i2] = ((Integer) entry.getKey()).intValue();
            strArr[i2] = (String) entry.getValue();
            i2++;
        }
        nativeLogAppFlowEvent(this.assistantManagerInternalPtr, i, bArr, iArr, strArr, j);
    }

    /* compiled from: PG */
    public class HomeAutomationRequest {
        private byte[] automationRequestProto;
        private AutomationOptions options;

        /* compiled from: PG */
        public class AutomationOptions {
            private boolean isFromOda;
            private String obfuscatedGaiaId;

            public AutomationOptions(boolean z, String str) {
                this.isFromOda = z;
                this.obfuscatedGaiaId = str;
            }

            public AutomationOptions() {
                this("");
            }

            public AutomationOptions(String str) {
                this(false, str);
            }
        }

        public HomeAutomationRequest(byte[] bArr, AutomationOptions automationOptions) {
            this.automationRequestProto = bArr;
            this.options = automationOptions;
        }

        public void onDone(byte[] bArr) {
        }
    }
}
