package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlf extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    public dlf() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
