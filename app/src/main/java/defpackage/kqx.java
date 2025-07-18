package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqx extends ert implements kqz {
    public kqx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.kqz
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeLong(j);
        J(23, parcelA);
    }

    @Override // defpackage.kqz
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        erv.b(parcelA, bundle);
        J(9, parcelA);
    }

    @Override // defpackage.kqz
    public final void clearMeasurementEnabled(long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeLong(j);
        J(24, parcelA);
    }

    @Override // defpackage.kqz
    public final void generateEventId(krc krcVar) {
        Parcel parcelA = a();
        erv.c(parcelA, krcVar);
        J(22, parcelA);
    }

    @Override // defpackage.kqz
    public final void getAppInstanceId(krc krcVar) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void getCachedAppInstanceId(krc krcVar) {
        Parcel parcelA = a();
        erv.c(parcelA, krcVar);
        J(19, parcelA);
    }

    @Override // defpackage.kqz
    public final void getConditionalUserProperties(String str, String str2, krc krcVar) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        erv.c(parcelA, krcVar);
        J(10, parcelA);
    }

    @Override // defpackage.kqz
    public final void getCurrentScreenClass(krc krcVar) {
        Parcel parcelA = a();
        erv.c(parcelA, krcVar);
        J(17, parcelA);
    }

    @Override // defpackage.kqz
    public final void getCurrentScreenName(krc krcVar) {
        Parcel parcelA = a();
        erv.c(parcelA, krcVar);
        J(16, parcelA);
    }

    @Override // defpackage.kqz
    public final void getGmpAppId(krc krcVar) {
        Parcel parcelA = a();
        erv.c(parcelA, krcVar);
        J(21, parcelA);
    }

    @Override // defpackage.kqz
    public final void getMaxUserProperties(String str, krc krcVar) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        erv.c(parcelA, krcVar);
        J(6, parcelA);
    }

    @Override // defpackage.kqz
    public final void getSessionId(krc krcVar) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void getTestFlag(krc krcVar, int i) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void getUserProperties(String str, String str2, boolean z, krc krcVar) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        ClassLoader classLoader = erv.a;
        parcelA.writeInt(z ? 1 : 0);
        erv.c(parcelA, krcVar);
        J(5, parcelA);
    }

    @Override // defpackage.kqz
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void initialize(kme kmeVar, InitializationParams initializationParams, long j) {
        Parcel parcelA = a();
        erv.c(parcelA, kmeVar);
        erv.b(parcelA, initializationParams);
        parcelA.writeLong(j);
        J(1, parcelA);
    }

    @Override // defpackage.kqz
    public final void isDataCollectionEnabled(krc krcVar) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        erv.b(parcelA, bundle);
        parcelA.writeInt(1);
        parcelA.writeInt(1);
        parcelA.writeLong(j);
        J(2, parcelA);
    }

    @Override // defpackage.kqz
    public final void logEventAndBundle(String str, String str2, Bundle bundle, krc krcVar, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void logHealthData(int i, String str, kme kmeVar, kme kmeVar2, kme kmeVar3) {
        Parcel parcelA = a();
        parcelA.writeInt(5);
        parcelA.writeString("Error with data collection. Data lost.");
        erv.c(parcelA, kmeVar);
        erv.c(parcelA, kmeVar2);
        erv.c(parcelA, kmeVar3);
        J(33, parcelA);
    }

    @Override // defpackage.kqz
    public final void onActivityCreated(kme kmeVar, Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void onActivityCreatedByScionActivityInfo(ScionActivityInfo scionActivityInfo, Bundle bundle, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, scionActivityInfo);
        erv.b(parcelA, bundle);
        parcelA.writeLong(j);
        J(53, parcelA);
    }

    @Override // defpackage.kqz
    public final void onActivityDestroyed(kme kmeVar, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void onActivityDestroyedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, scionActivityInfo);
        parcelA.writeLong(j);
        J(54, parcelA);
    }

    @Override // defpackage.kqz
    public final void onActivityPaused(kme kmeVar, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void onActivityPausedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, scionActivityInfo);
        parcelA.writeLong(j);
        J(55, parcelA);
    }

    @Override // defpackage.kqz
    public final void onActivityResumed(kme kmeVar, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void onActivityResumedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, scionActivityInfo);
        parcelA.writeLong(j);
        J(56, parcelA);
    }

    @Override // defpackage.kqz
    public final void onActivitySaveInstanceState(kme kmeVar, krc krcVar, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void onActivitySaveInstanceStateByScionActivityInfo(ScionActivityInfo scionActivityInfo, krc krcVar, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, scionActivityInfo);
        erv.c(parcelA, krcVar);
        parcelA.writeLong(j);
        J(57, parcelA);
    }

    @Override // defpackage.kqz
    public final void onActivityStarted(kme kmeVar, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void onActivityStartedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, scionActivityInfo);
        parcelA.writeLong(j);
        J(51, parcelA);
    }

    @Override // defpackage.kqz
    public final void onActivityStopped(kme kmeVar, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void onActivityStoppedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, scionActivityInfo);
        parcelA.writeLong(j);
        J(52, parcelA);
    }

    @Override // defpackage.kqz
    public final void performAction(Bundle bundle, krc krcVar, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void registerOnMeasurementEventListener(krh krhVar) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void resetAnalyticsData(long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void retrieveAndUploadBatches(krf krfVar) {
        Parcel parcelA = a();
        erv.c(parcelA, krfVar);
        J(58, parcelA);
    }

    @Override // defpackage.kqz
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, bundle);
        parcelA.writeLong(j);
        J(8, parcelA);
    }

    @Override // defpackage.kqz
    public final void setConsent(Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setConsentThirdParty(Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setCurrentScreen(kme kmeVar, String str, String str2, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setCurrentScreenByScionActivityInfo(ScionActivityInfo scionActivityInfo, String str, String str2, long j) {
        Parcel parcelA = a();
        erv.b(parcelA, scionActivityInfo);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        parcelA.writeLong(j);
        J(50, parcelA);
    }

    @Override // defpackage.kqz
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setDefaultEventParameters(Bundle bundle) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setEventInterceptor(krh krhVar) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setInstanceIdProvider(krj krjVar) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setMeasurementEnabled(boolean z, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setSessionTimeoutDuration(long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setSgtmDebugInfo(Intent intent) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setUserId(String str, long j) {
        throw null;
    }

    @Override // defpackage.kqz
    public final void setUserProperty(String str, String str2, kme kmeVar, boolean z, long j) {
        Parcel parcelA = a();
        parcelA.writeString("fcm");
        parcelA.writeString("_ln");
        erv.c(parcelA, kmeVar);
        parcelA.writeInt(1);
        parcelA.writeLong(j);
        J(4, parcelA);
    }

    @Override // defpackage.kqz
    public final void unregisterOnMeasurementEventListener(krh krhVar) {
        throw null;
    }
}
