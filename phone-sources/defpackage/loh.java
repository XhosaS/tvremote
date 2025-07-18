package defpackage;

import com.google.android.apps.play.movies.common.service.room.PlayMoviesRoomDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loh extends gfa {
    final /* synthetic */ PlayMoviesRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public loh(PlayMoviesRoomDatabase_Impl playMoviesRoomDatabase_Impl) {
        super(2, "d2cb4648065c08821db79e7a0b770708", "1b923e0e3cf2f7678aa4d8cdded44324");
        this.d = playMoviesRoomDatabase_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `search_queries_history` (`account_name` TEXT NOT NULL, `query_text` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`account_name`, `query_text`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `video_format` (`itag` INTEGER NOT NULL, `video_height` INTEGER NOT NULL, `video_width` INTEGER NOT NULL, `audio_channels` INTEGER NOT NULL, `drm_type` INTEGER NOT NULL, `is_dash` INTEGER NOT NULL, `is_multi` INTEGER NOT NULL, `dynamic_range_type` INTEGER NOT NULL, `mime_type` TEXT, PRIMARY KEY(`itag`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `user_configuration` (`account_name` TEXT NOT NULL, `proto_config` BLOB NOT NULL, `guide_settings` BLOB NOT NULL, PRIMARY KEY(`account_name`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `asset_image` (`asset_id` TEXT NOT NULL, `asset_type` INTEGER NOT NULL, `category_type` INTEGER NOT NULL, `etag` TEXT, `image_url` TEXT NOT NULL, `last_time_updated_timestamp` INTEGER NOT NULL, PRIMARY KEY(`asset_id`, `asset_type`, `category_type`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `license` (`id` INTEGER NOT NULL, `expiration_timestamp` INTEGER NOT NULL, `activation` BLOB NOT NULL, `force_sync` INTEGER NOT NULL, `last_sync_timestamp` INTEGER NOT NULL, `last_sync_sdk` INTEGER NOT NULL, `release_pending` INTEGER NOT NULL, `cenc_key_set_id` BLOB NOT NULL, `cenc_init_data` BLOB NOT NULL, `cenc_security_level` INTEGER NOT NULL, `cenc_mimetype` TEXT NOT NULL, PRIMARY KEY(`id`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `download` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `relative_filepath` TEXT NOT NULL, `size` INTEGER NOT NULL, `downloaded_bytes_amount` INTEGER NOT NULL, `quality` INTEGER NOT NULL, `extra_proto` BLOB NOT NULL, `external_storage_index` INTEGER NOT NULL)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `library` (`account_name` TEXT NOT NULL, `asset_id` TEXT NOT NULL, `asset_type` INTEGER NOT NULL, `purchase_id` TEXT NOT NULL, `root_id` TEXT, `is_bonus_content` INTEGER NOT NULL, `purchase_type` INTEGER NOT NULL, `purchase_status` INTEGER NOT NULL, `format_type` INTEGER NOT NULL, `share_type` INTEGER NOT NULL, `added_to_library_timestamp` INTEGER NOT NULL, `purchase_done_timestamp` INTEGER NOT NULL, `purchase_source` INTEGER NOT NULL, `expiration_timestamp` INTEGER, `rental_short_timer_seconds` INTEGER, `purchase_4k_upgrade_timestamp_seconds` INTEGER, `purchase_4k_upgrade_notification_timestamp_seconds` INTEGER, `visibility` INTEGER NOT NULL, `last_playback_is_dirty` INTEGER NOT NULL, `last_playback_start_timestamp` INTEGER, `last_watched_timestamp` INTEGER, `resumed_timestamp` INTEGER, `pinned_on_timestamp` INTEGER, `pinning_notification_active` INTEGER, `pinning_status` INTEGER, `pinning_status_reason` INTEGER, `pinning_drm_error_code` INTEGER, `streaming_cenc_init_data_key` TEXT, `streaming_cenc_init_data` BLOB, `streaming_cenc_mimetype` TEXT, `have_subtitles` INTEGER NOT NULL, `licence_id` INTEGER NOT NULL, PRIMARY KEY(`account_name`, `purchase_id`), FOREIGN KEY(`licence_id`) REFERENCES `license`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`asset_id`, `asset_type`) REFERENCES `assets`(`asset_id`, `asset_type`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_library_asset_id` ON `library` (`asset_id`)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_library_asset_type` ON `library` (`asset_type`)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_library_licence_id` ON `library` (`licence_id`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `watchlist` (`account_name` TEXT NOT NULL, `asset_id` TEXT NOT NULL, `asset_type` INTEGER NOT NULL, `asset_state` INTEGER NOT NULL, `asset_order` INTEGER NOT NULL, `in_cloud` INTEGER NOT NULL, PRIMARY KEY(`account_name`, `asset_id`, `asset_type`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `assets` (`asset_id` TEXT NOT NULL, `asset_type` INTEGER NOT NULL, `root_id` TEXT, `parent_id` TEXT, `eidr_id` TEXT, `title` TEXT NOT NULL, `poster_url` TEXT, `rating_id` TEXT, `rating_name` TEXT, `season_sequence_number` INTEGER, `episode_sequence_number` INTEGER, `next_episode_id` TEXT, `bundle_id` TEXT, `next_episode_in_the_same_season` INTEGER NOT NULL, `end_credit_start_timestamp` INTEGER NOT NULL, `is_bonus_content` INTEGER NOT NULL, `last_update_timestamp` INTEGER NOT NULL, PRIMARY KEY(`asset_id`, `asset_type`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd2cb4648065c08821db79e7a0b770708')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `search_queries_history`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `video_format`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `user_configuration`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `asset_image`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `license`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `download`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `library`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `watchlist`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `assets`");
    }

    @Override // defpackage.gfa
    public final void c(gic gicVar) throws Exception {
        gez.t(gicVar, "PRAGMA foreign_keys = ON");
        this.d.v(gicVar);
    }

    @Override // defpackage.gfa
    public final void d(gic gicVar) throws Exception {
        gez.m(gicVar);
    }

    @Override // defpackage.gfa
    public final xqr g(gic gicVar) throws Exception {
        HashMap map = new HashMap(3);
        map.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map.put("query_text", new ggt("query_text", "TEXT", true, 2, null, 1));
        map.put("timestamp", new ggt("timestamp", "INTEGER", true, 0, null, 1));
        ggw ggwVar = new ggw("search_queries_history", map, new HashSet(0), new HashSet(0));
        ggw ggwVarB = ggs.b(gicVar, "search_queries_history");
        if (!gez.F(ggwVar, ggwVarB)) {
            return new xqr(false, hhh.b(ggwVarB, ggwVar, "search_queries_history(com.google.android.apps.play.movies.common.service.room.entity.SearchQueryHistory).\n Expected:\n"));
        }
        HashMap map2 = new HashMap(9);
        map2.put("itag", new ggt("itag", "INTEGER", true, 1, null, 1));
        map2.put("video_height", new ggt("video_height", "INTEGER", true, 0, null, 1));
        map2.put("video_width", new ggt("video_width", "INTEGER", true, 0, null, 1));
        map2.put("audio_channels", new ggt("audio_channels", "INTEGER", true, 0, null, 1));
        map2.put("drm_type", new ggt("drm_type", "INTEGER", true, 0, null, 1));
        map2.put("is_dash", new ggt("is_dash", "INTEGER", true, 0, null, 1));
        map2.put("is_multi", new ggt("is_multi", "INTEGER", true, 0, null, 1));
        map2.put("dynamic_range_type", new ggt("dynamic_range_type", "INTEGER", true, 0, null, 1));
        map2.put("mime_type", new ggt("mime_type", "TEXT", false, 0, null, 1));
        ggw ggwVar2 = new ggw("video_format", map2, new HashSet(0), new HashSet(0));
        ggw ggwVarB2 = ggs.b(gicVar, "video_format");
        if (!gez.F(ggwVar2, ggwVarB2)) {
            return new xqr(false, hhh.b(ggwVarB2, ggwVar2, "video_format(com.google.android.apps.play.movies.common.service.room.entity.VideoFormat).\n Expected:\n"));
        }
        HashMap map3 = new HashMap(3);
        map3.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map3.put("proto_config", new ggt("proto_config", "BLOB", true, 0, null, 1));
        map3.put("guide_settings", new ggt("guide_settings", "BLOB", true, 0, null, 1));
        ggw ggwVar3 = new ggw("user_configuration", map3, new HashSet(0), new HashSet(0));
        ggw ggwVarB3 = ggs.b(gicVar, "user_configuration");
        if (!gez.F(ggwVar3, ggwVarB3)) {
            return new xqr(false, hhh.b(ggwVarB3, ggwVar3, "user_configuration(com.google.android.apps.play.movies.common.service.room.entity.UserConfiguration).\n Expected:\n"));
        }
        HashMap map4 = new HashMap(6);
        map4.put("asset_id", new ggt("asset_id", "TEXT", true, 1, null, 1));
        map4.put("asset_type", new ggt("asset_type", "INTEGER", true, 2, null, 1));
        map4.put("category_type", new ggt("category_type", "INTEGER", true, 3, null, 1));
        map4.put("etag", new ggt("etag", "TEXT", false, 0, null, 1));
        map4.put("image_url", new ggt("image_url", "TEXT", true, 0, null, 1));
        map4.put("last_time_updated_timestamp", new ggt("last_time_updated_timestamp", "INTEGER", true, 0, null, 1));
        ggw ggwVar4 = new ggw("asset_image", map4, new HashSet(0), new HashSet(0));
        ggw ggwVarB4 = ggs.b(gicVar, "asset_image");
        if (!gez.F(ggwVar4, ggwVarB4)) {
            return new xqr(false, hhh.b(ggwVarB4, ggwVar4, "asset_image(com.google.android.apps.play.movies.common.service.room.entity.AssetImage).\n Expected:\n"));
        }
        HashMap map5 = new HashMap(11);
        map5.put("id", new ggt("id", "INTEGER", true, 1, null, 1));
        map5.put("expiration_timestamp", new ggt("expiration_timestamp", "INTEGER", true, 0, null, 1));
        map5.put("activation", new ggt("activation", "BLOB", true, 0, null, 1));
        map5.put("force_sync", new ggt("force_sync", "INTEGER", true, 0, null, 1));
        map5.put("last_sync_timestamp", new ggt("last_sync_timestamp", "INTEGER", true, 0, null, 1));
        map5.put("last_sync_sdk", new ggt("last_sync_sdk", "INTEGER", true, 0, null, 1));
        map5.put("release_pending", new ggt("release_pending", "INTEGER", true, 0, null, 1));
        map5.put("cenc_key_set_id", new ggt("cenc_key_set_id", "BLOB", true, 0, null, 1));
        map5.put("cenc_init_data", new ggt("cenc_init_data", "BLOB", true, 0, null, 1));
        map5.put("cenc_security_level", new ggt("cenc_security_level", "INTEGER", true, 0, null, 1));
        map5.put("cenc_mimetype", new ggt("cenc_mimetype", "TEXT", true, 0, null, 1));
        ggw ggwVar5 = new ggw("license", map5, new HashSet(0), new HashSet(0));
        ggw ggwVarB5 = ggs.b(gicVar, "license");
        if (!gez.F(ggwVar5, ggwVarB5)) {
            return new xqr(false, hhh.b(ggwVarB5, ggwVar5, "license(com.google.android.apps.play.movies.common.service.room.entity.License).\n Expected:\n"));
        }
        HashMap map6 = new HashMap(7);
        map6.put("id", new ggt("id", "INTEGER", true, 1, null, 1));
        map6.put("relative_filepath", new ggt("relative_filepath", "TEXT", true, 0, null, 1));
        map6.put("size", new ggt("size", "INTEGER", true, 0, null, 1));
        map6.put("downloaded_bytes_amount", new ggt("downloaded_bytes_amount", "INTEGER", true, 0, null, 1));
        map6.put("quality", new ggt("quality", "INTEGER", true, 0, null, 1));
        map6.put("extra_proto", new ggt("extra_proto", "BLOB", true, 0, null, 1));
        map6.put("external_storage_index", new ggt("external_storage_index", "INTEGER", true, 0, null, 1));
        ggw ggwVar6 = new ggw("download", map6, new HashSet(0), new HashSet(0));
        ggw ggwVarB6 = ggs.b(gicVar, "download");
        if (!gez.F(ggwVar6, ggwVarB6)) {
            return new xqr(false, hhh.b(ggwVarB6, ggwVar6, "download(com.google.android.apps.play.movies.common.service.room.entity.Download).\n Expected:\n"));
        }
        HashMap map7 = new HashMap(32);
        map7.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map7.put("asset_id", new ggt("asset_id", "TEXT", true, 0, null, 1));
        map7.put("asset_type", new ggt("asset_type", "INTEGER", true, 0, null, 1));
        map7.put("purchase_id", new ggt("purchase_id", "TEXT", true, 2, null, 1));
        map7.put("root_id", new ggt("root_id", "TEXT", false, 0, null, 1));
        map7.put("is_bonus_content", new ggt("is_bonus_content", "INTEGER", true, 0, null, 1));
        map7.put("purchase_type", new ggt("purchase_type", "INTEGER", true, 0, null, 1));
        map7.put("purchase_status", new ggt("purchase_status", "INTEGER", true, 0, null, 1));
        map7.put("format_type", new ggt("format_type", "INTEGER", true, 0, null, 1));
        map7.put("share_type", new ggt("share_type", "INTEGER", true, 0, null, 1));
        map7.put("added_to_library_timestamp", new ggt("added_to_library_timestamp", "INTEGER", true, 0, null, 1));
        map7.put("purchase_done_timestamp", new ggt("purchase_done_timestamp", "INTEGER", true, 0, null, 1));
        map7.put("purchase_source", new ggt("purchase_source", "INTEGER", true, 0, null, 1));
        map7.put("expiration_timestamp", new ggt("expiration_timestamp", "INTEGER", false, 0, null, 1));
        map7.put("rental_short_timer_seconds", new ggt("rental_short_timer_seconds", "INTEGER", false, 0, null, 1));
        map7.put("purchase_4k_upgrade_timestamp_seconds", new ggt("purchase_4k_upgrade_timestamp_seconds", "INTEGER", false, 0, null, 1));
        map7.put("purchase_4k_upgrade_notification_timestamp_seconds", new ggt("purchase_4k_upgrade_notification_timestamp_seconds", "INTEGER", false, 0, null, 1));
        map7.put("visibility", new ggt("visibility", "INTEGER", true, 0, null, 1));
        map7.put("last_playback_is_dirty", new ggt("last_playback_is_dirty", "INTEGER", true, 0, null, 1));
        map7.put("last_playback_start_timestamp", new ggt("last_playback_start_timestamp", "INTEGER", false, 0, null, 1));
        map7.put("last_watched_timestamp", new ggt("last_watched_timestamp", "INTEGER", false, 0, null, 1));
        map7.put("resumed_timestamp", new ggt("resumed_timestamp", "INTEGER", false, 0, null, 1));
        map7.put("pinned_on_timestamp", new ggt("pinned_on_timestamp", "INTEGER", false, 0, null, 1));
        map7.put("pinning_notification_active", new ggt("pinning_notification_active", "INTEGER", false, 0, null, 1));
        map7.put("pinning_status", new ggt("pinning_status", "INTEGER", false, 0, null, 1));
        map7.put("pinning_status_reason", new ggt("pinning_status_reason", "INTEGER", false, 0, null, 1));
        map7.put("pinning_drm_error_code", new ggt("pinning_drm_error_code", "INTEGER", false, 0, null, 1));
        map7.put("streaming_cenc_init_data_key", new ggt("streaming_cenc_init_data_key", "TEXT", false, 0, null, 1));
        map7.put("streaming_cenc_init_data", new ggt("streaming_cenc_init_data", "BLOB", false, 0, null, 1));
        map7.put("streaming_cenc_mimetype", new ggt("streaming_cenc_mimetype", "TEXT", false, 0, null, 1));
        map7.put("have_subtitles", new ggt("have_subtitles", "INTEGER", true, 0, null, 1));
        map7.put("licence_id", new ggt("licence_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new ggu("license", "CASCADE", "NO ACTION", Arrays.asList("licence_id"), Arrays.asList("id")));
        hashSet.add(new ggu("assets", "CASCADE", "NO ACTION", Arrays.asList("asset_id", "asset_type"), Arrays.asList("asset_id", "asset_type")));
        HashSet hashSet2 = new HashSet(3);
        hashSet2.add(new ggv("index_library_asset_id", false, Arrays.asList("asset_id"), Arrays.asList("ASC")));
        hashSet2.add(new ggv("index_library_asset_type", false, Arrays.asList("asset_type"), Arrays.asList("ASC")));
        hashSet2.add(new ggv("index_library_licence_id", false, Arrays.asList("licence_id"), Arrays.asList("ASC")));
        ggw ggwVar7 = new ggw("library", map7, hashSet, hashSet2);
        ggw ggwVarB7 = ggs.b(gicVar, "library");
        if (!gez.F(ggwVar7, ggwVarB7)) {
            return new xqr(false, hhh.b(ggwVarB7, ggwVar7, "library(com.google.android.apps.play.movies.common.service.room.entity.Library).\n Expected:\n"));
        }
        HashMap map8 = new HashMap(6);
        map8.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map8.put("asset_id", new ggt("asset_id", "TEXT", true, 2, null, 1));
        map8.put("asset_type", new ggt("asset_type", "INTEGER", true, 3, null, 1));
        map8.put("asset_state", new ggt("asset_state", "INTEGER", true, 0, null, 1));
        map8.put("asset_order", new ggt("asset_order", "INTEGER", true, 0, null, 1));
        map8.put("in_cloud", new ggt("in_cloud", "INTEGER", true, 0, null, 1));
        ggw ggwVar8 = new ggw("watchlist", map8, new HashSet(0), new HashSet(0));
        ggw ggwVarB8 = ggs.b(gicVar, "watchlist");
        if (!gez.F(ggwVar8, ggwVarB8)) {
            return new xqr(false, hhh.b(ggwVarB8, ggwVar8, "watchlist(com.google.android.apps.play.movies.common.service.room.entity.Watchlist).\n Expected:\n"));
        }
        HashMap map9 = new HashMap(17);
        map9.put("asset_id", new ggt("asset_id", "TEXT", true, 1, null, 1));
        map9.put("asset_type", new ggt("asset_type", "INTEGER", true, 2, null, 1));
        map9.put("root_id", new ggt("root_id", "TEXT", false, 0, null, 1));
        map9.put("parent_id", new ggt("parent_id", "TEXT", false, 0, null, 1));
        map9.put("eidr_id", new ggt("eidr_id", "TEXT", false, 0, null, 1));
        map9.put("title", new ggt("title", "TEXT", true, 0, null, 1));
        map9.put("poster_url", new ggt("poster_url", "TEXT", false, 0, null, 1));
        map9.put("rating_id", new ggt("rating_id", "TEXT", false, 0, null, 1));
        map9.put("rating_name", new ggt("rating_name", "TEXT", false, 0, null, 1));
        map9.put("season_sequence_number", new ggt("season_sequence_number", "INTEGER", false, 0, null, 1));
        map9.put("episode_sequence_number", new ggt("episode_sequence_number", "INTEGER", false, 0, null, 1));
        map9.put("next_episode_id", new ggt("next_episode_id", "TEXT", false, 0, null, 1));
        map9.put("bundle_id", new ggt("bundle_id", "TEXT", false, 0, null, 1));
        map9.put("next_episode_in_the_same_season", new ggt("next_episode_in_the_same_season", "INTEGER", true, 0, null, 1));
        map9.put("end_credit_start_timestamp", new ggt("end_credit_start_timestamp", "INTEGER", true, 0, null, 1));
        map9.put("is_bonus_content", new ggt("is_bonus_content", "INTEGER", true, 0, null, 1));
        map9.put("last_update_timestamp", new ggt("last_update_timestamp", "INTEGER", true, 0, null, 1));
        ggw ggwVar9 = new ggw("assets", map9, new HashSet(0), new HashSet(0));
        ggw ggwVarB9 = ggs.b(gicVar, "assets");
        return !gez.F(ggwVar9, ggwVarB9) ? new xqr(false, hhh.b(ggwVarB9, ggwVar9, "assets(com.google.android.apps.play.movies.common.service.room.entity.Asset).\n Expected:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
