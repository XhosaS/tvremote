package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsi implements abxh {
    static final abxh a = new zsi();

    private zsi() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        zsj zsjVar;
        switch (i) {
            case 0:
                zsjVar = zsj.UNKNOWN;
                break;
            case 1:
                zsjVar = zsj.GROUP_NOT_FOUND;
                break;
            case 2:
                zsjVar = zsj.NEW_BUILD_ID;
                break;
            case 3:
                zsjVar = zsj.NEW_VARIANT_ID;
                break;
            case 4:
                zsjVar = zsj.NEW_VERSION_NUMBER;
                break;
            case 5:
                zsjVar = zsj.DIFFERENT_FILES;
                break;
            case 6:
                zsjVar = zsj.DIFFERENT_STALE_LIFETIME;
                break;
            case 7:
                zsjVar = zsj.DIFFERENT_EXPIRATION_DATE;
                break;
            case 8:
                zsjVar = zsj.DIFFERENT_DOWNLOAD_CONDITIONS;
                break;
            case 9:
                zsjVar = zsj.DIFFERENT_ALLOWED_READERS;
                break;
            case 10:
                zsjVar = zsj.DIFFERENT_DOWNLOAD_POLICY;
                break;
            case 11:
                zsjVar = zsj.DIFFERENT_EXPERIMENT_INFO;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                zsjVar = zsj.DIFFERENT_CUSTOM_METADATA;
                break;
            default:
                zsjVar = null;
                break;
        }
        return zsjVar != null;
    }
}
