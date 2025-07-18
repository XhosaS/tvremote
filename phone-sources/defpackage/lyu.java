package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyu {
    public static final String[] a = {"asset_type", "asset_id", "(pinned IS NOT NULL AND pinned > 0)", "pinning_status", "pinning_status_reason", "pinning_drm_error_code", "download_bytes_downloaded", "pinning_download_size", "root_asset_id"};
    public static final String b = "account = ? AND purchase_status =2 AND (purchase_type = " + kvm.TYPE_PURCHASE.f + " OR cast(ifnull(min(expiration_timestamp_seconds * 1000,ifnull(license_expiration_timestamp,9223372036854775807)),9223372036854775807) as integer) > CAST(? AS INT))";
    public static final lxq c = new lxq(6);
    public static final lxq d = new lxq(5);
}
