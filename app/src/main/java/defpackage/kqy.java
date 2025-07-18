package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import java.util.HashMap;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kqy extends eru implements kqz {
    public kqy() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static kqz asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof kqz ? (kqz) iInterfaceQueryLocalInterface : new kqx(iBinder);
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        kme kmcVar;
        kme kmcVar2;
        kme kmcVar3;
        kme kmcVar4 = null;
        krf krdVar = null;
        krc kraVar = null;
        krc kraVar2 = null;
        krc kraVar3 = null;
        krc kraVar4 = null;
        krh krgVar = null;
        krh krgVar2 = null;
        krh krgVar3 = null;
        kme kmcVar5 = null;
        krc kraVar5 = null;
        krc kraVar6 = null;
        kme kmcVar6 = null;
        kme kmcVar7 = null;
        kme kmcVar8 = null;
        kme kmcVar9 = null;
        kme kmcVar10 = null;
        kme kmcVar11 = null;
        krc kraVar7 = null;
        krc kraVar8 = null;
        krc kraVar9 = null;
        krc kraVar10 = null;
        krj kriVar = null;
        krc kraVar11 = null;
        krc kraVar12 = null;
        kme kmcVar12 = null;
        krc kraVar13 = null;
        krc kraVar14 = null;
        krc kraVar15 = null;
        kme kmcVar13 = null;
        krc kraVar16 = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar4 = iInterfaceQueryLocalInterface instanceof kme ? (kme) iInterfaceQueryLocalInterface : new kmc(strongBinder);
                }
                InitializationParams initializationParams = (InitializationParams) erv.a(parcel, InitializationParams.CREATOR);
                long j = parcel.readLong();
                O(parcel);
                initialize(kmcVar4, initializationParams, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) erv.a(parcel, Bundle.CREATOR);
                boolean zD = erv.d(parcel);
                boolean zD2 = erv.d(parcel);
                long j2 = parcel.readLong();
                O(parcel);
                logEvent(string, string2, bundle, zD, zD2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar16 = iInterfaceQueryLocalInterface2 instanceof krc ? (krc) iInterfaceQueryLocalInterface2 : new kra(strongBinder2);
                }
                krc krcVar = kraVar16;
                long j3 = parcel.readLong();
                O(parcel);
                logEventAndBundle(string3, string4, bundle2, krcVar, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar13 = iInterfaceQueryLocalInterface3 instanceof kme ? (kme) iInterfaceQueryLocalInterface3 : new kmc(strongBinder3);
                }
                kme kmeVar = kmcVar13;
                boolean zD3 = erv.d(parcel);
                long j4 = parcel.readLong();
                O(parcel);
                setUserProperty(string5, string6, kmeVar, zD3, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zD4 = erv.d(parcel);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar15 = iInterfaceQueryLocalInterface4 instanceof krc ? (krc) iInterfaceQueryLocalInterface4 : new kra(strongBinder4);
                }
                O(parcel);
                getUserProperties(string7, string8, zD4, kraVar15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar14 = iInterfaceQueryLocalInterface5 instanceof krc ? (krc) iInterfaceQueryLocalInterface5 : new kra(strongBinder5);
                }
                O(parcel);
                getMaxUserProperties(string9, kraVar14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                O(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                O(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                O(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar13 = iInterfaceQueryLocalInterface6 instanceof krc ? (krc) iInterfaceQueryLocalInterface6 : new kra(strongBinder6);
                }
                O(parcel);
                getConditionalUserProperties(string13, string14, kraVar13);
                break;
            case 11:
                boolean zD5 = erv.d(parcel);
                long j7 = parcel.readLong();
                O(parcel);
                setMeasurementEnabled(zD5, j7);
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                long j8 = parcel.readLong();
                O(parcel);
                resetAnalyticsData(j8);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                long j9 = parcel.readLong();
                O(parcel);
                setMinimumSessionDuration(j9);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                long j10 = parcel.readLong();
                O(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar12 = iInterfaceQueryLocalInterface7 instanceof kme ? (kme) iInterfaceQueryLocalInterface7 : new kmc(strongBinder7);
                }
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                O(parcel);
                setCurrentScreen(kmcVar12, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar12 = iInterfaceQueryLocalInterface8 instanceof krc ? (krc) iInterfaceQueryLocalInterface8 : new kra(strongBinder8);
                }
                O(parcel);
                getCurrentScreenName(kraVar12);
                break;
            case 17:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar11 = iInterfaceQueryLocalInterface9 instanceof krc ? (krc) iInterfaceQueryLocalInterface9 : new kra(strongBinder9);
                }
                O(parcel);
                getCurrentScreenClass(kraVar11);
                break;
            case 18:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    kriVar = iInterfaceQueryLocalInterface10 instanceof krj ? (krj) iInterfaceQueryLocalInterface10 : new kri(strongBinder10);
                }
                O(parcel);
                setInstanceIdProvider(kriVar);
                break;
            case 19:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar10 = iInterfaceQueryLocalInterface11 instanceof krc ? (krc) iInterfaceQueryLocalInterface11 : new kra(strongBinder11);
                }
                O(parcel);
                getCachedAppInstanceId(kraVar10);
                break;
            case 20:
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar9 = iInterfaceQueryLocalInterface12 instanceof krc ? (krc) iInterfaceQueryLocalInterface12 : new kra(strongBinder12);
                }
                O(parcel);
                getAppInstanceId(kraVar9);
                break;
            case 21:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar8 = iInterfaceQueryLocalInterface13 instanceof krc ? (krc) iInterfaceQueryLocalInterface13 : new kra(strongBinder13);
                }
                O(parcel);
                getGmpAppId(kraVar8);
                break;
            case 22:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar7 = iInterfaceQueryLocalInterface14 instanceof krc ? (krc) iInterfaceQueryLocalInterface14 : new kra(strongBinder14);
                }
                O(parcel);
                generateEventId(kraVar7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                O(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                O(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar11 = iInterfaceQueryLocalInterface15 instanceof kme ? (kme) iInterfaceQueryLocalInterface15 : new kmc(strongBinder15);
                }
                long j14 = parcel.readLong();
                O(parcel);
                onActivityStarted(kmcVar11, j14);
                break;
            case 26:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar10 = iInterfaceQueryLocalInterface16 instanceof kme ? (kme) iInterfaceQueryLocalInterface16 : new kmc(strongBinder16);
                }
                long j15 = parcel.readLong();
                O(parcel);
                onActivityStopped(kmcVar10, j15);
                break;
            case 27:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar9 = iInterfaceQueryLocalInterface17 instanceof kme ? (kme) iInterfaceQueryLocalInterface17 : new kmc(strongBinder17);
                }
                Bundle bundle5 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                O(parcel);
                onActivityCreated(kmcVar9, bundle5, j16);
                break;
            case 28:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar8 = iInterfaceQueryLocalInterface18 instanceof kme ? (kme) iInterfaceQueryLocalInterface18 : new kmc(strongBinder18);
                }
                long j17 = parcel.readLong();
                O(parcel);
                onActivityDestroyed(kmcVar8, j17);
                break;
            case 29:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar7 = iInterfaceQueryLocalInterface19 instanceof kme ? (kme) iInterfaceQueryLocalInterface19 : new kmc(strongBinder19);
                }
                long j18 = parcel.readLong();
                O(parcel);
                onActivityPaused(kmcVar7, j18);
                break;
            case 30:
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar6 = iInterfaceQueryLocalInterface20 instanceof kme ? (kme) iInterfaceQueryLocalInterface20 : new kmc(strongBinder20);
                }
                long j19 = parcel.readLong();
                O(parcel);
                onActivityResumed(kmcVar6, j19);
                break;
            case 31:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 == null) {
                    kmcVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar = iInterfaceQueryLocalInterface21 instanceof kme ? (kme) iInterfaceQueryLocalInterface21 : new kmc(strongBinder21);
                }
                IBinder strongBinder22 = parcel.readStrongBinder();
                if (strongBinder22 != null) {
                    IInterface iInterfaceQueryLocalInterface22 = strongBinder22.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar6 = iInterfaceQueryLocalInterface22 instanceof krc ? (krc) iInterfaceQueryLocalInterface22 : new kra(strongBinder22);
                }
                long j20 = parcel.readLong();
                O(parcel);
                onActivitySaveInstanceState(kmcVar, kraVar6, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                IBinder strongBinder23 = parcel.readStrongBinder();
                if (strongBinder23 != null) {
                    IInterface iInterfaceQueryLocalInterface23 = strongBinder23.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar5 = iInterfaceQueryLocalInterface23 instanceof krc ? (krc) iInterfaceQueryLocalInterface23 : new kra(strongBinder23);
                }
                long j21 = parcel.readLong();
                O(parcel);
                performAction(bundle6, kraVar5, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                IBinder strongBinder24 = parcel.readStrongBinder();
                if (strongBinder24 == null) {
                    kmcVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface24 = strongBinder24.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar2 = iInterfaceQueryLocalInterface24 instanceof kme ? (kme) iInterfaceQueryLocalInterface24 : new kmc(strongBinder24);
                }
                IBinder strongBinder25 = parcel.readStrongBinder();
                if (strongBinder25 == null) {
                    kmcVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface25 = strongBinder25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar3 = iInterfaceQueryLocalInterface25 instanceof kme ? (kme) iInterfaceQueryLocalInterface25 : new kmc(strongBinder25);
                }
                IBinder strongBinder26 = parcel.readStrongBinder();
                if (strongBinder26 != null) {
                    IInterface iInterfaceQueryLocalInterface26 = strongBinder26.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kmcVar5 = iInterfaceQueryLocalInterface26 instanceof kme ? (kme) iInterfaceQueryLocalInterface26 : new kmc(strongBinder26);
                }
                O(parcel);
                logHealthData(i2, string19, kmcVar2, kmcVar3, kmcVar5);
                break;
            case 34:
                IBinder strongBinder27 = parcel.readStrongBinder();
                if (strongBinder27 != null) {
                    IInterface iInterfaceQueryLocalInterface27 = strongBinder27.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    krgVar3 = iInterfaceQueryLocalInterface27 instanceof krh ? (krh) iInterfaceQueryLocalInterface27 : new krg(strongBinder27);
                }
                O(parcel);
                setEventInterceptor(krgVar3);
                break;
            case 35:
                IBinder strongBinder28 = parcel.readStrongBinder();
                if (strongBinder28 != null) {
                    IInterface iInterfaceQueryLocalInterface28 = strongBinder28.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    krgVar2 = iInterfaceQueryLocalInterface28 instanceof krh ? (krh) iInterfaceQueryLocalInterface28 : new krg(strongBinder28);
                }
                O(parcel);
                registerOnMeasurementEventListener(krgVar2);
                break;
            case 36:
                IBinder strongBinder29 = parcel.readStrongBinder();
                if (strongBinder29 != null) {
                    IInterface iInterfaceQueryLocalInterface29 = strongBinder29.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    krgVar = iInterfaceQueryLocalInterface29 instanceof krh ? (krh) iInterfaceQueryLocalInterface29 : new krg(strongBinder29);
                }
                O(parcel);
                unregisterOnMeasurementEventListener(krgVar);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(erv.a);
                O(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder30 = parcel.readStrongBinder();
                if (strongBinder30 != null) {
                    IInterface iInterfaceQueryLocalInterface30 = strongBinder30.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar4 = iInterfaceQueryLocalInterface30 instanceof krc ? (krc) iInterfaceQueryLocalInterface30 : new kra(strongBinder30);
                }
                int i3 = parcel.readInt();
                O(parcel);
                getTestFlag(kraVar4, i3);
                break;
            case 39:
                boolean zD6 = erv.d(parcel);
                O(parcel);
                setDataCollectionEnabled(zD6);
                break;
            case 40:
                IBinder strongBinder31 = parcel.readStrongBinder();
                if (strongBinder31 != null) {
                    IInterface iInterfaceQueryLocalInterface31 = strongBinder31.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar3 = iInterfaceQueryLocalInterface31 instanceof krc ? (krc) iInterfaceQueryLocalInterface31 : new kra(strongBinder31);
                }
                O(parcel);
                isDataCollectionEnabled(kraVar3);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                O(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                O(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                O(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                O(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder32 = parcel.readStrongBinder();
                if (strongBinder32 != null) {
                    IInterface iInterfaceQueryLocalInterface32 = strongBinder32.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar2 = iInterfaceQueryLocalInterface32 instanceof krc ? (krc) iInterfaceQueryLocalInterface32 : new kra(strongBinder32);
                }
                O(parcel);
                getSessionId(kraVar2);
                break;
            case 48:
                Intent intent = (Intent) erv.a(parcel, Intent.CREATOR);
                O(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                ScionActivityInfo scionActivityInfo = (ScionActivityInfo) erv.a(parcel, ScionActivityInfo.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                O(parcel);
                setCurrentScreenByScionActivityInfo(scionActivityInfo, string20, string21, j25);
                break;
            case 51:
                ScionActivityInfo scionActivityInfo2 = (ScionActivityInfo) erv.a(parcel, ScionActivityInfo.CREATOR);
                long j26 = parcel.readLong();
                O(parcel);
                onActivityStartedByScionActivityInfo(scionActivityInfo2, j26);
                break;
            case 52:
                ScionActivityInfo scionActivityInfo3 = (ScionActivityInfo) erv.a(parcel, ScionActivityInfo.CREATOR);
                long j27 = parcel.readLong();
                O(parcel);
                onActivityStoppedByScionActivityInfo(scionActivityInfo3, j27);
                break;
            case 53:
                ScionActivityInfo scionActivityInfo4 = (ScionActivityInfo) erv.a(parcel, ScionActivityInfo.CREATOR);
                Bundle bundle10 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                O(parcel);
                onActivityCreatedByScionActivityInfo(scionActivityInfo4, bundle10, j28);
                break;
            case 54:
                ScionActivityInfo scionActivityInfo5 = (ScionActivityInfo) erv.a(parcel, ScionActivityInfo.CREATOR);
                long j29 = parcel.readLong();
                O(parcel);
                onActivityDestroyedByScionActivityInfo(scionActivityInfo5, j29);
                break;
            case 55:
                ScionActivityInfo scionActivityInfo6 = (ScionActivityInfo) erv.a(parcel, ScionActivityInfo.CREATOR);
                long j30 = parcel.readLong();
                O(parcel);
                onActivityPausedByScionActivityInfo(scionActivityInfo6, j30);
                break;
            case 56:
                ScionActivityInfo scionActivityInfo7 = (ScionActivityInfo) erv.a(parcel, ScionActivityInfo.CREATOR);
                long j31 = parcel.readLong();
                O(parcel);
                onActivityResumedByScionActivityInfo(scionActivityInfo7, j31);
                break;
            case 57:
                ScionActivityInfo scionActivityInfo8 = (ScionActivityInfo) erv.a(parcel, ScionActivityInfo.CREATOR);
                IBinder strongBinder33 = parcel.readStrongBinder();
                if (strongBinder33 != null) {
                    IInterface iInterfaceQueryLocalInterface33 = strongBinder33.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kraVar = iInterfaceQueryLocalInterface33 instanceof krc ? (krc) iInterfaceQueryLocalInterface33 : new kra(strongBinder33);
                }
                long j32 = parcel.readLong();
                O(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(scionActivityInfo8, kraVar, j32);
                break;
            case 58:
                IBinder strongBinder34 = parcel.readStrongBinder();
                if (strongBinder34 != null) {
                    IInterface iInterfaceQueryLocalInterface34 = strongBinder34.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    krdVar = iInterfaceQueryLocalInterface34 instanceof krf ? (krf) iInterfaceQueryLocalInterface34 : new krd(strongBinder34);
                }
                O(parcel);
                retrieveAndUploadBatches(krdVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
