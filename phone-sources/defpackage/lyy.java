package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.appcompat.R;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyy extends ieq {
    private static final tui a = tui.l("com/google/android/apps/play/movies/common/store/db/DatabaseHelper");
    private final lie b;
    private final lfn c;

    public lyy(Context context, lie lieVar, lfn lfnVar) {
        super(context);
        this.b = lieVar;
        this.c = lfnVar;
    }

    private static void e(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE asset_images (images_asset_type INT NOT NULL,images_asset_id TEXT NOT NULL,images_category INT NOT NULL,images_uri TEXT NOT NULL,images_etag TEXT,images_last_modified TEXT,images_last_update_seconds INT NOT NULL DEFAULT 0,PRIMARY KEY (images_asset_type,images_asset_id,images_category))");
    }

    private static final void f(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + str + " ADD COLUMN " + str2 + " " + str3);
    }

    private static final void g(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE atv_recommendation_removed_items (atv_recommendation_removed_item_account TEXT NOT NULL,atv_recommendation_removed_item_asset_type INT NOT NULL,atv_recommendation_removed_item_asset_id TEXT NOT NULL,atv_recommendation_removed_item_timestamp INT NOT NULL,PRIMARY KEY (atv_recommendation_removed_item_account,atv_recommendation_removed_item_asset_type,atv_recommendation_removed_item_asset_id))");
    }

    private static final void h(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE cached_items (cache_account TEXT NOT NULL,cache_type INTEGER NOT NULL,cache_key TEXT NOT NULL,cache_value BLOB NOT NULL,cache_play_country TEXT NOT NULL,cache_locale TEXT NOT NULL,cache_last_update_sec INTEGER NOT NULL,cache_expiration_sec INTEGER NOT NULL,cache_persistent INTEGER NOT NULL DEFAULT 0,PRIMARY KEY (cache_account,cache_type,cache_key,cache_play_country,cache_locale))");
    }

    private static final void i(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE guide_settings (settings_account TEXT NOT NULL PRIMARY KEY,settings_value BLOB NOT NULL)");
    }

    private static final void j(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE pending_qoe_logs (session_nonce TEXT NOT NULL,ping_uri TEXT NOT NULL,failure_count INT NOT NULL,last_sending_attempt INT NOT NULL,first_storage_time INT NOT NULL,PRIMARY KEY (session_nonce,ping_uri))");
    }

    private static final void k(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE search_history (account TEXT NOT NULL,query TEXT NOT NULL,timestamp INT NOT NULL DEFAULT 0)");
    }

    private static final void l(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE user_sentiments (user_sentiment_account TEXT NOT NULL,user_sentiment_type INT NOT NULL,user_sentiment_id TEXT NOT NULL,user_sentiment_value BLOB NOT NULL,user_sentiment_timestamp INT NOT NULL DEFAULT 0,user_sentiment_uploading INT NOT NULL DEFAULT 0,PRIMARY KEY (user_sentiment_account,user_sentiment_type,user_sentiment_id))");
    }

    private static final void m(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS user_configuration");
        sQLiteDatabase.execSQL("CREATE TABLE user_configuration (config_account TEXT NOT NULL PRIMARY KEY,config_play_country TEXT,config_proto BLOB,account_links INT NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS purchased_assets");
        sQLiteDatabase.execSQL("CREATE TABLE purchased_assets (account TEXT NOT NULL,asset_type INT NOT NULL,asset_id TEXT NOT NULL,parent_asset_id TEXT,root_asset_id TEXT,purchase_id TEXT,purchase_type INT NOT NULL,format_type INT NOT NULL,share_type INT NOT NULL DEFAULT 4,purchase_status INT NOT NULL,added_to_library_timestamp_seconds INT NOT NULL DEFAULT 0,purchase_timestamp_seconds INT NOT NULL,purchase_source INT NOT NULL DEFAULT 0,purchase_is_bonus_content INT NOT NULL DEFAULT 0,expiration_timestamp_seconds INT,rental_short_timer_seconds INT,purchase_4k_upgrade_timestamp_seconds INT NOT NULL DEFAULT 0,purchase_4k_upgrade_notification_timestamp_seconds INT NOT NULL DEFAULT 0,hidden INT,last_playback_is_dirty INT,last_playback_start_timestamp INT,last_watched_timestamp INT,resume_timestamp INT,pinned INT,pinning_notification_active INT,pinning_status INT,pinning_status_reason INT,pinning_drm_error_code INT,is_new_notification_dismissed INT,license_type INT,license_expiration_timestamp INT,license_activation BLOB,license_force_sync INT,license_last_synced_timestamp INT,license_last_synced_sdk_int INT,license_release_pending INT NOT NULL DEFAULT 0,license_video_format INT,license_file_path_key TEXT,license_key_id INT,license_asset_id INT,license_system_id INT,license_cenc_key_set_id BLOB,license_cenc_pssh_data BLOB,license_cenc_security_level INT,license_cenc_mimetype TEXT,streaming_pssh_data_key TEXT,streaming_pssh_data BLOB,streaming_mimetype TEXT,have_subtitles INT,download_relative_filepath TEXT,pinning_download_size INT,download_bytes_downloaded INT,download_last_modified TEXT,download_quality INT,download_extra_proto BLOB,external_storage_index INT,PRIMARY KEY (account,asset_type,asset_id) CONSTRAINT videos_non_null_columns CHECK (asset_type NOT IN (6, 20) OR (last_playback_is_dirty IS NOT NULL AND last_playback_start_timestamp IS NOT NULL AND last_watched_timestamp IS NOT NULL AND resume_timestamp IS NOT NULL AND pinned IS NOT NULL AND pinning_notification_active IS NOT NULL AND is_new_notification_dismissed IS NOT NULL AND have_subtitles IS NOT NULL)))");
        sQLiteDatabase.execSQL("CREATE TABLE assets (assets_type INT NOT NULL,assets_id TEXT NOT NULL,root_id TEXT NOT NULL,title_eidr_id TEXT,assets_title TEXT,assets_poster TEXT,assets_rating_id TEXT,assets_rating_name TEXT,season_seqno INT NOT NULL DEFAULT -1,episode_seqno INT NOT NULL DEFAULT -1,next_episode_id TEXT,next_episode_in_same_season INT NOT NULL DEFAULT 0,end_credit_start_seconds INT NOT NULL DEFAULT 0,is_bonus_content INT NOT NULL DEFAULT 0,in_bundle TEXT,assets_last_update_seconds INT NOT NULL DEFAULT 0,PRIMARY KEY (assets_type,assets_id))");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS assets_seqnos_index");
        sQLiteDatabase.execSQL("CREATE INDEX assets_seqnos_index ON assets(root_id,season_seqno,episode_seqno)");
        sQLiteDatabase.execSQL("CREATE TABLE user_assets (user_assets_account TEXT NOT NULL,user_assets_type INT NOT NULL,user_assets_id TEXT NOT NULL,metadata_timestamp_at_last_sync INT NOT NULL DEFAULT 0,last_activity_timestamp INT,ppm_remaining INT,watched_to_end_credit INT,merged_expiration_timestamp INT,season_id_of_last_activity TEXT,season_seqno_of_last_activity INT,last_watched_episode_id TEXT,last_watched_episode_seqno INT,last_watched_season_seqno INT,next_show_episode_id TEXT,next_show_episode_in_same_season INT,owned_complete_show INT,owned_episode_count INT,PRIMARY KEY (user_assets_account,user_assets_type,user_assets_id))");
        sQLiteDatabase.execSQL("CREATE TABLE user_data (user_account TEXT NOT NULL PRIMARY KEY,sync_snapshot_token TEXT,wishlist_snapshot_token TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE posters (poster_video_id TEXT PRIMARY KEY,image_uri TEXT,image_etag TEXT,image_last_modified TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE screenshots (screenshot_video_id TEXT PRIMARY KEY,image_uri TEXT,image_etag TEXT,image_last_modified TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE show_posters (poster_show_id TEXT PRIMARY KEY,image_uri TEXT,image_etag TEXT,image_last_modified TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE show_banners (banner_show_id TEXT PRIMARY KEY,image_uri TEXT,image_etag TEXT,image_last_modified TEXT)");
        l(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE wishlist (wishlist_account TEXT NOT NULL,wishlist_item_id TEXT NOT NULL,wishlist_item_type TEXT NOT NULL,wishlist_item_state INT NOT NULL,wishlist_item_order INT NOT NULL DEFAULT -1,wishlist_in_cloud INT NOT NULL DEFAULT 0,PRIMARY KEY (wishlist_account,wishlist_item_id,wishlist_item_type))");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS wishlist_item_order_index");
        sQLiteDatabase.execSQL("CREATE INDEX wishlist_item_order_index ON wishlist (wishlist_account, wishlist_item_order)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS video_formats");
        sQLiteDatabase.execSQL("CREATE TABLE video_formats (itag INT NOT NULL PRIMARY KEY,width INT NOT NULL,height INT NOT NULL,audio_channels INT NOT NULL,drm_type INT NOT NULL,is_dash INT NOT NULL,is_multi INT NOT NULL,dynamic_range_type INT NOT NULL DEFAULT 0,mime_type TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE bundles (bundle_id TEXT NOT NULL PRIMARY KEY,bundle_title TEXT NOT NULL,bundle_synced_timestamp INT NOT NULL DEFAULT 0)");
        k(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE watch_next_feed (watch_next_feed_account TEXT NOT NULL PRIMARY KEY,feed TEXT,feed_blob BLOB NOT NULL DEFAULT X'')");
        i(sQLiteDatabase);
        h(sQLiteDatabase);
        g(sQLiteDatabase);
        j(sQLiteDatabase);
        e(sQLiteDatabase);
    }

    private static final void n(SQLiteDatabase sQLiteDatabase) throws SQLException {
        mei.g(sQLiteDatabase);
        m(sQLiteDatabase);
    }

    public final SQLiteDatabase c(boolean z) {
        ieg iegVarD = d(z);
        if (!iegVarD.m()) {
            throw ((SQLException) iegVarD.i());
        }
        if (((SQLiteDatabase) iegVarD.g()).isDbLockedByCurrentThread()) {
            this.b.k(new SQLException("Database is locked by current thread"));
        }
        return (SQLiteDatabase) iegVarD.g();
    }

    final synchronized ieg d(boolean z) {
        try {
        } catch (SQLException e) {
            return ieg.b(e);
        }
        return ieg.a(z ? super.getWritableDatabase() : super.getReadableDatabase());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return c(false);
        } catch (SQLException e) {
            krd.d(e.getMessage(), e);
            this.b.k(e);
            ((tug) ((tug) ((tug) a.g()).i(e)).j("com/google/android/apps/play/movies/common/store/db/DatabaseHelper", "getReadableDatabase", (char) 1170, "DatabaseHelper.java")).s("Exception raised while opening database for reading.");
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return c(true);
        } catch (SQLException e) {
            krd.d(e.getMessage(), e);
            this.b.k(e);
            ((tug) ((tug) ((tug) a.g()).i(e)).j("com/google/android/apps/play/movies/common/store/db/DatabaseHelper", "getWritableDatabase", (char) 1183, "DatabaseHelper.java")).s("Exception raised while opening database for writing.");
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        n(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        krd.b(a.ce(i2, i, "Upgrading database from version ", " to "));
        a.H(i2 == 97);
        try {
            switch (i) {
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    f(sQLiteDatabase, "videos", "audio_track_surround_sound", "TEXT");
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    f(sQLiteDatabase, "videos", "caption_track_languages", "TEXT");
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    f(sQLiteDatabase, "videos", "badge_video_4k", "INT NOT NULL DEFAULT 0");
                    f(sQLiteDatabase, "videos", "badge_video_hdr", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    k(sQLiteDatabase);
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    sQLiteDatabase.execSQL("CREATE TABLE watch_next_feed (watch_next_feed_account TEXT NOT NULL PRIMARY KEY,feed TEXT)");
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    f(sQLiteDatabase, "videos", "seller", "TEXT");
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    f(sQLiteDatabase, "videos", "includes_vat", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    f(sQLiteDatabase, "watch_next_feed", "feed_blob", "BLOB NOT NULL DEFAULT X''");
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cached_items");
                    h(sQLiteDatabase);
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    f(sQLiteDatabase, "videos", "trailers", "TEXT");
                case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS last_playback_information");
                case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS user_selection");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ptime_time_selection");
                    i(sQLiteDatabase);
                case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                    f(sQLiteDatabase, "purchased_assets", "added_to_library_timestamp_seconds", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    f(sQLiteDatabase, "videos", "badge_movies_anywhere", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                    f(sQLiteDatabase, "purchased_assets", "parent_asset_id", "TEXT");
                    sQLiteDatabase.execSQL("UPDATE purchased_assets SET parent_asset_id = ( SELECT episode_season_id FROM videos WHERE video_id = asset_id) WHERE asset_type = 20");
                    sQLiteDatabase.execSQL("UPDATE purchased_assets SET parent_asset_id = root_asset_id WHERE asset_type != 20");
                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    f(sQLiteDatabase, "video_formats", "dynamic_range_type", "INT NOT NULL DEFAULT 0");
                    sQLiteDatabase.execSQL("UPDATE OR IGNORE video_formats SET dynamic_range_type = CASE WHEN itag IN (" + TextUtils.join(",", this.c.bs()) + ") THEN 2 WHEN height > 0 THEN 1 ELSE 0 END");
                case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS atv_recommendation_removed_items");
                    g(sQLiteDatabase);
                case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                    f(sQLiteDatabase, "videos", "badge_video_3d", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS user_sentiments");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS user_sentiments_pending");
                    l(sQLiteDatabase);
                case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    j(sQLiteDatabase);
                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    f(sQLiteDatabase, "videos", "caption_track_types", "TEXT");
                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                    f(sQLiteDatabase, "purchased_assets", "purchase_source", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                    f(sQLiteDatabase, "purchased_assets", "purchase_4k_upgrade_timestamp_seconds", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                    f(sQLiteDatabase, "videos", "audio_track_types", "TEXT");
                    f(sQLiteDatabase, "videos", "audio_track_language_types", "TEXT");
                case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                    f(sQLiteDatabase, "purchased_assets", "purchase_4k_upgrade_notification_timestamp_seconds", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    f(sQLiteDatabase, "purchased_assets", "streaming_pssh_data_key", "TEXT");
                case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS purchased_assets_update_trigger_icing_movies");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS purchased_assets_delete_trigger_icing_movies");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS videos_insert_trigger_icing_movies");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS videos_update_trigger_icing_movies");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS purchased_assets_trigger_icing_shows");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS purchased_assets_delete_trigger_icing_shows");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS videos_insert_trigger_icing_shows");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS seasons_insert_trigger_icing_shows");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS shows_insert_trigger_icing_shows");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS shows_update_trigger_icing_shows");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS icing_metadata");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS icing_metadata");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS icing_movies");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS icing_shows");
                case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS videos_delete_trigger_icing_movies");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS videos_delete_trigger_icing_shows");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS seasons_update_trigger_icing_movie");
                    sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS seasons_delete_trigger_icing_shows");
                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                    f(sQLiteDatabase, "assets", "assets_title", "TEXT");
                    f(sQLiteDatabase, "assets", "assets_poster", "TEXT");
                    f(sQLiteDatabase, "assets", "assets_rating_id", "TEXT");
                    f(sQLiteDatabase, "assets", "assets_rating_name", "TEXT");
                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                    f(sQLiteDatabase, "purchased_assets", "purchase_is_bonus_content", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                    f(sQLiteDatabase, "assets", "assets_last_update_seconds", "INT NOT NULL DEFAULT 0");
                case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                    e(sQLiteDatabase);
                case 95:
                    f(sQLiteDatabase, "purchased_assets", "purchase_id", "TEXT");
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS shows");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS videos");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS seasons");
                    sQLiteDatabase.execSQL("DROP INDEX IF EXISTS seasons_show_index");
                    sQLiteDatabase.execSQL("DROP INDEX IF EXISTS videos_season_index");
                case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    krd.b("Upgraded database");
                    break;
                default:
                    n(sQLiteDatabase);
                    krd.b("Upgrade not supported; recreated database");
                    break;
            }
            this.b.m(i, i2);
        } catch (RuntimeException e) {
            krd.d("Failed to upgrade the database", e);
            this.b.l(i, i2, e);
            n(sQLiteDatabase);
        }
    }
}
