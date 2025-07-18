package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface lyw {
    public static final String[] a = {"asset_type", "asset_id", "parent_asset_id", "root_asset_id", "purchase_type", "resume_timestamp", "cast(ifnull(min(expiration_timestamp_seconds * 1000,ifnull(license_expiration_timestamp,9223372036854775807)),9223372036854775807) as integer)", "purchase_status", "format_type", "rental_short_timer_seconds", "purchase_timestamp_seconds", "added_to_library_timestamp_seconds", "is_bonus_content OR purchase_is_bonus_content", "purchase_source", "purchase_4k_upgrade_timestamp_seconds", "purchase_4k_upgrade_notification_timestamp_seconds", "hidden"};
    public static final String b = "account = ? AND purchase_status IN (2, 6) AND (purchase_type = " + kvm.TYPE_PURCHASE.f + " OR cast(ifnull(min(expiration_timestamp_seconds * 1000,ifnull(license_expiration_timestamp,9223372036854775807)),9223372036854775807) as integer) > CAST(? AS INT))";
}
