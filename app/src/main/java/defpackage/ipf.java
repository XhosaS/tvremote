package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipf implements ipe {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl");
    private ipc b;
    private final Set c = new LinkedHashSet();
    private adzk d = adzk.SETUP_SKIP_NONE;

    @Override // defpackage.ipe
    public final adzk a() {
        return this.d;
    }

    @Override // defpackage.ipe
    public final Set b() {
        return agqq.A(this.c);
    }

    @Override // defpackage.ipe
    public final void c(adzk adzkVar) {
        adzkVar.getClass();
        this.d = adzkVar;
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "setSetupSkipReason", 46, "SetupErrorLoggerImpl.kt")).x("Assistant setup flow is skipped due to: %s", adzkVar);
    }

    @Override // defpackage.ipe
    public final void d(ipc ipcVar) {
        this.b = ipcVar;
    }

    @Override // defpackage.ipe
    public final void e(ipd ipdVar, Throwable th) {
        ipdVar.getClass();
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 52, "SetupErrorLoggerImpl.kt")).x("Assistant setup flow failed with error state: %s", ipdVar);
        switch (ipdVar.ordinal()) {
            case 0:
                Set set = this.c;
                set.add(adzf.ERROR_GET_UDC_SETTINGS);
                set.add(adzf.ERROR_GET_INITIAL_SETTINGS);
                return;
            case 1:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 62, "SetupErrorLoggerImpl.kt")).u("Timed out on checking voice match utterances ready.");
                this.c.add(adzf.ERROR_VOICE_MATCH_LOADING_TIMED_OUT);
                return;
            case 2:
                ((zdv) ((zdv) zdyVar.b()).p(th).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 157, "SetupErrorLoggerImpl.kt")).u("Failed to fetch utterance availability.");
                this.c.add(adzf.ERROR_VOICE_MATCH_LOADING);
                return;
            case 3:
                ((zdv) ((zdv) zdyVar.d()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 69, "SetupErrorLoggerImpl.kt")).x("Timed out on experiments config loading with syncSuccess[%s]", new qsh(false));
                this.c.add(adzf.ERROR_LOAD_KATNISS_EXPERIMENTS_CONFIG);
                return;
            case 4:
                zdv zdvVar = (zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 79, "SetupErrorLoggerImpl.kt");
                ipc ipcVar = this.b;
                qsk qskVar = new qsk(ipcVar != null ? ipcVar.a : null);
                ipc ipcVar2 = this.b;
                zdvVar.F("Failing setup; unable to fetch auth token for a %s account. Token status: %s", qskVar, new qsk(ipcVar2 != null ? ipcVar2.b : null));
                this.c.add(adzf.ERROR_CHECK_AUTH_STATUS);
                return;
            case 5:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 90, "SetupErrorLoggerImpl.kt")).u("Recoverable error on trying to fetch auth token.");
                this.c.add(adzf.RECOVERABLE_ERROR_CHECK_AUTH_STATUS);
                return;
            case 6:
                ((zdv) ((zdv) zdyVar.b()).p(th).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 97, "SetupErrorLoggerImpl.kt")).u("Failed to fetch settings needed for starting Assistant Setup.");
                Set set2 = this.c;
                set2.add(adzf.ERROR_GET_UDC_SETTINGS);
                set2.add(adzf.ERROR_GET_INITIAL_SETTINGS);
                return;
            case 7:
                ((zdv) ((zdv) zdyVar.c()).p(th).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 105, "SetupErrorLoggerImpl.kt")).u("Error receiving personal readout settings from server");
                this.c.add(adzf.ERROR_UPDATE_PERSONAL_RESULTS_OPTIN);
                return;
            case 8:
                ((zdv) ((zdv) zdyVar.c()).p(th).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 109, "SetupErrorLoggerImpl.kt")).u("Error receiving DSC settings from server");
                this.c.add(adzf.ERROR_UPDATE_DSC_SETTINGS);
                return;
            case 9:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 116, "SetupErrorLoggerImpl.kt")).u("Setup failed, displayed something went wrong error toast.");
                this.c.add(adzf.ERROR_SOMETHING_WENT_WRONG_TOAST);
                return;
            case 10:
                ((zdv) ((zdv) zdyVar.c()).p(th).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 123, "SetupErrorLoggerImpl.kt")).u("Error receiving UpdateSettingsUiResponse for server-side enablement of Assistant settings.");
                Set set3 = this.c;
                set3.add(adzf.ERROR_UPDATE_DEVICE_REGISTRATION);
                set3.add(adzf.ERROR_UPDATE_UDC_SETTINGS);
                set3.add(adzf.ERROR_UPDATE_PROMOTION_EMAILS_OPTIN);
                return;
            case 11:
                ((zdv) ((zdv) zdyVar.c()).p(th).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 132, "SetupErrorLoggerImpl.kt")).u("Could not set default music provider.");
                this.c.add(adzf.ERROR_SET_DEFAULT_MUSIC_PROVIDER);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 139, "SetupErrorLoggerImpl.kt")).u("Illegal state: null intent returned! Unable to launch account addition; quitting setup.");
                this.c.add(adzf.ERROR_GET_INTENT_FOR_ADD_ACCOUNT);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((zdv) ((zdv) zdyVar.c()).p(th).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 149, "SetupErrorLoggerImpl.kt")).u("Error getting intent for launching account addition; quitting setup");
                this.c.add(adzf.ERROR_GET_INTENT_FOR_ADD_ACCOUNT);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 153, "SetupErrorLoggerImpl.kt")).u("Cast info loaded was empty.");
                this.c.add(adzf.ERROR_UPDATE_CAST_SETTINGS);
                return;
            case 15:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 164, "SetupErrorLoggerImpl.kt")).u("Cancelling setup due to null UDC settings status.");
                this.c.add(adzf.ERROR_GET_NULL_UDC_SETTINGS_STATUS);
                return;
            case 16:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 171, "SetupErrorLoggerImpl.kt")).u("Cancelling setup due to INVALID_PARAM_ERROR status.");
                this.c.add(adzf.ERROR_GET_INVALID_PARAM_ERROR_UDC);
                return;
            case 17:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 178, "SetupErrorLoggerImpl.kt")).u("Cancelling setup due to UDC_SERVER_ERROR status.");
                this.c.add(adzf.ERROR_GET_UDC_SERVER_ERROR);
                return;
            case 18:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 185, "SetupErrorLoggerImpl.kt")).u("Cancelling setup due to CONSENT_NOT_POSSIBLE_UDC status.");
                this.c.add(adzf.ERROR_GET_CONSENT_NOT_POSSIBLE_UDC);
                return;
            case 19:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 192, "SetupErrorLoggerImpl.kt")).u("Cancelling setup due to SHOULD_NOT_TRIGGER_UDC_SETUP_UDC status.");
                this.c.add(adzf.ERROR_GET_SHOULD_NOT_TRIGGER_UDC_SETUP_UDC);
                return;
            case 20:
                ((zdv) ((zdv) zdyVar.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/setup/logging/SetupErrorLoggerImpl", "updateSetupErrorState", 199, "SetupErrorLoggerImpl.kt")).u("Timing out setup initial loading, users might see Setup screen ignoring their previous choices.");
                this.c.add(adzf.ERROR_INITIAL_LOADING_TIMED_OUT);
                return;
            default:
                throw new agpg();
        }
    }

    @Override // defpackage.ipe
    public final void f() {
    }
}
