package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface kqz extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(krc krcVar);

    void getAppInstanceId(krc krcVar);

    void getCachedAppInstanceId(krc krcVar);

    void getConditionalUserProperties(String str, String str2, krc krcVar);

    void getCurrentScreenClass(krc krcVar);

    void getCurrentScreenName(krc krcVar);

    void getGmpAppId(krc krcVar);

    void getMaxUserProperties(String str, krc krcVar);

    void getSessionId(krc krcVar);

    void getTestFlag(krc krcVar, int i);

    void getUserProperties(String str, String str2, boolean z, krc krcVar);

    void initForTests(Map map);

    void initialize(kme kmeVar, InitializationParams initializationParams, long j);

    void isDataCollectionEnabled(krc krcVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, krc krcVar, long j);

    void logHealthData(int i, String str, kme kmeVar, kme kmeVar2, kme kmeVar3);

    void onActivityCreated(kme kmeVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(ScionActivityInfo scionActivityInfo, Bundle bundle, long j);

    void onActivityDestroyed(kme kmeVar, long j);

    void onActivityDestroyedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j);

    void onActivityPaused(kme kmeVar, long j);

    void onActivityPausedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j);

    void onActivityResumed(kme kmeVar, long j);

    void onActivityResumedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j);

    void onActivitySaveInstanceState(kme kmeVar, krc krcVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(ScionActivityInfo scionActivityInfo, krc krcVar, long j);

    void onActivityStarted(kme kmeVar, long j);

    void onActivityStartedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j);

    void onActivityStopped(kme kmeVar, long j);

    void onActivityStoppedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j);

    void performAction(Bundle bundle, krc krcVar, long j);

    void registerOnMeasurementEventListener(krh krhVar);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(krf krfVar);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(kme kmeVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(ScionActivityInfo scionActivityInfo, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(krh krhVar);

    void setInstanceIdProvider(krj krjVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, kme kmeVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(krh krhVar);
}
