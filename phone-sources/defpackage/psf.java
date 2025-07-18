package defpackage;

import com.google.android.libraries.mediahome.providers.video.database.Database_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psf extends gfa {
    final /* synthetic */ Database_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psf(Database_Impl database_Impl) {
        super(1, "a194871ae05ed17037dcd47c5a61de9b", "621f826bd799b79be12ef4f9fd7274e1");
        this.d = database_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `channels` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `package_name` TEXT, `display_name` TEXT, `description` TEXT, `app_link_icon_uri` TEXT, `app_link_text` TEXT, `app_link_intent_uri` TEXT, `internal_provider_id` TEXT, `internal_provider_data` BLOB, `internal_provider_flag1` INTEGER NOT NULL, `internal_provider_flag2` INTEGER NOT NULL, `internal_provider_flag3` INTEGER NOT NULL, `internal_provider_flag4` INTEGER NOT NULL)");
        gez.t(gicVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_channels__id_package_name` ON `channels` (`_id`, `package_name`)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_channels_package_name` ON `channels` (`package_name`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `preview_programs` (`channel_id` INTEGER NOT NULL, `weight` INTEGER NOT NULL, `_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `package_name` TEXT, `author` TEXT, `availability` INTEGER NOT NULL, `canonical_genre` TEXT, `content_id` TEXT, `content_rating` TEXT, `duration_millis` INTEGER NOT NULL, `episode_display_number` TEXT, `episode_title` TEXT, `genre` TEXT, `intent_uri` TEXT, `interaction_count` INTEGER NOT NULL, `interaction_type` INTEGER NOT NULL, `internal_provider_id` TEXT, `item_count` INTEGER NOT NULL, `last_playback_position_millis` INTEGER NOT NULL, `live` INTEGER NOT NULL, `logo_uri` TEXT, `logo_content_description` TEXT, `offer_price` TEXT, `poster_art_aspect_ratio` INTEGER NOT NULL, `poster_art_uri` TEXT, `preview_audio_uri` TEXT, `preview_video_uri` TEXT, `release_date` TEXT, `review_rating` TEXT, `review_rating_style` INTEGER NOT NULL, `season_display_number` TEXT, `season_title` TEXT, `short_description` TEXT, `start_time_utc_millis` INTEGER NOT NULL, `end_time_utc_millis` INTEGER NOT NULL, `starting_price` TEXT, `poster_thumbnail_aspect_ratio` INTEGER NOT NULL, `thumbnail_uri` TEXT, `title` TEXT, `type` INTEGER NOT NULL, `series_id` TEXT, `tv_series_item_type` INTEGER NOT NULL, `video_height` INTEGER NOT NULL, `video_width` INTEGER NOT NULL, FOREIGN KEY(`package_name`, `channel_id`) REFERENCES `channels`(`package_name`, `_id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_preview_programs_package_name_channel_id` ON `preview_programs` (`package_name`, `channel_id`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `watch_next_programs` (`watch_next_type` INTEGER NOT NULL, `last_engagement_time_utc_millis` INTEGER NOT NULL, `_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `package_name` TEXT, `author` TEXT, `availability` INTEGER NOT NULL, `canonical_genre` TEXT, `content_id` TEXT, `content_rating` TEXT, `duration_millis` INTEGER NOT NULL, `episode_display_number` TEXT, `episode_title` TEXT, `genre` TEXT, `intent_uri` TEXT, `interaction_count` INTEGER NOT NULL, `interaction_type` INTEGER NOT NULL, `internal_provider_id` TEXT, `item_count` INTEGER NOT NULL, `last_playback_position_millis` INTEGER NOT NULL, `live` INTEGER NOT NULL, `logo_uri` TEXT, `logo_content_description` TEXT, `offer_price` TEXT, `poster_art_aspect_ratio` INTEGER NOT NULL, `poster_art_uri` TEXT, `preview_audio_uri` TEXT, `preview_video_uri` TEXT, `release_date` TEXT, `review_rating` TEXT, `review_rating_style` INTEGER NOT NULL, `season_display_number` TEXT, `season_title` TEXT, `short_description` TEXT, `start_time_utc_millis` INTEGER NOT NULL, `end_time_utc_millis` INTEGER NOT NULL, `starting_price` TEXT, `poster_thumbnail_aspect_ratio` INTEGER NOT NULL, `thumbnail_uri` TEXT, `title` TEXT, `type` INTEGER NOT NULL, `series_id` TEXT, `tv_series_item_type` INTEGER NOT NULL, `video_height` INTEGER NOT NULL, `video_width` INTEGER NOT NULL)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_watch_next_programs_package_name` ON `watch_next_programs` (`package_name`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a194871ae05ed17037dcd47c5a61de9b')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `channels`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `preview_programs`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `watch_next_programs`");
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
        HashMap map = new HashMap(13);
        map.put("_id", new ggt("_id", "INTEGER", true, 1, null, 1));
        map.put("package_name", new ggt("package_name", "TEXT", false, 0, null, 1));
        map.put("display_name", new ggt("display_name", "TEXT", false, 0, null, 1));
        map.put("description", new ggt("description", "TEXT", false, 0, null, 1));
        map.put("app_link_icon_uri", new ggt("app_link_icon_uri", "TEXT", false, 0, null, 1));
        map.put("app_link_text", new ggt("app_link_text", "TEXT", false, 0, null, 1));
        map.put("app_link_intent_uri", new ggt("app_link_intent_uri", "TEXT", false, 0, null, 1));
        map.put("internal_provider_id", new ggt("internal_provider_id", "TEXT", false, 0, null, 1));
        map.put("internal_provider_data", new ggt("internal_provider_data", "BLOB", false, 0, null, 1));
        map.put("internal_provider_flag1", new ggt("internal_provider_flag1", "INTEGER", true, 0, null, 1));
        map.put("internal_provider_flag2", new ggt("internal_provider_flag2", "INTEGER", true, 0, null, 1));
        map.put("internal_provider_flag3", new ggt("internal_provider_flag3", "INTEGER", true, 0, null, 1));
        map.put("internal_provider_flag4", new ggt("internal_provider_flag4", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new ggv("index_channels__id_package_name", true, Arrays.asList("_id", "package_name"), Arrays.asList("ASC", "ASC")));
        hashSet2.add(new ggv("index_channels_package_name", false, Arrays.asList("package_name"), Arrays.asList("ASC")));
        ggw ggwVar = new ggw("channels", map, hashSet, hashSet2);
        ggw ggwVarB = ggs.b(gicVar, "channels");
        if (!gez.F(ggwVar, ggwVarB)) {
            return new xqr(false, hhh.b(ggwVarB, ggwVar, "channels(com.google.android.libraries.mediahome.providers.video.tables.PreviewChannel).\n Expected:\n"));
        }
        HashMap map2 = new HashMap(44);
        map2.put("channel_id", new ggt("channel_id", "INTEGER", true, 0, null, 1));
        map2.put("weight", new ggt("weight", "INTEGER", true, 0, null, 1));
        map2.put("_id", new ggt("_id", "INTEGER", true, 1, null, 1));
        map2.put("package_name", new ggt("package_name", "TEXT", false, 0, null, 1));
        map2.put("author", new ggt("author", "TEXT", false, 0, null, 1));
        map2.put("availability", new ggt("availability", "INTEGER", true, 0, null, 1));
        map2.put("canonical_genre", new ggt("canonical_genre", "TEXT", false, 0, null, 1));
        map2.put("content_id", new ggt("content_id", "TEXT", false, 0, null, 1));
        map2.put("content_rating", new ggt("content_rating", "TEXT", false, 0, null, 1));
        map2.put("duration_millis", new ggt("duration_millis", "INTEGER", true, 0, null, 1));
        map2.put("episode_display_number", new ggt("episode_display_number", "TEXT", false, 0, null, 1));
        map2.put("episode_title", new ggt("episode_title", "TEXT", false, 0, null, 1));
        map2.put("genre", new ggt("genre", "TEXT", false, 0, null, 1));
        map2.put("intent_uri", new ggt("intent_uri", "TEXT", false, 0, null, 1));
        map2.put("interaction_count", new ggt("interaction_count", "INTEGER", true, 0, null, 1));
        map2.put("interaction_type", new ggt("interaction_type", "INTEGER", true, 0, null, 1));
        map2.put("internal_provider_id", new ggt("internal_provider_id", "TEXT", false, 0, null, 1));
        map2.put("item_count", new ggt("item_count", "INTEGER", true, 0, null, 1));
        map2.put("last_playback_position_millis", new ggt("last_playback_position_millis", "INTEGER", true, 0, null, 1));
        map2.put("live", new ggt("live", "INTEGER", true, 0, null, 1));
        map2.put("logo_uri", new ggt("logo_uri", "TEXT", false, 0, null, 1));
        map2.put("logo_content_description", new ggt("logo_content_description", "TEXT", false, 0, null, 1));
        map2.put("offer_price", new ggt("offer_price", "TEXT", false, 0, null, 1));
        map2.put("poster_art_aspect_ratio", new ggt("poster_art_aspect_ratio", "INTEGER", true, 0, null, 1));
        map2.put("poster_art_uri", new ggt("poster_art_uri", "TEXT", false, 0, null, 1));
        map2.put("preview_audio_uri", new ggt("preview_audio_uri", "TEXT", false, 0, null, 1));
        map2.put("preview_video_uri", new ggt("preview_video_uri", "TEXT", false, 0, null, 1));
        map2.put("release_date", new ggt("release_date", "TEXT", false, 0, null, 1));
        map2.put("review_rating", new ggt("review_rating", "TEXT", false, 0, null, 1));
        map2.put("review_rating_style", new ggt("review_rating_style", "INTEGER", true, 0, null, 1));
        map2.put("season_display_number", new ggt("season_display_number", "TEXT", false, 0, null, 1));
        map2.put("season_title", new ggt("season_title", "TEXT", false, 0, null, 1));
        map2.put("short_description", new ggt("short_description", "TEXT", false, 0, null, 1));
        map2.put("start_time_utc_millis", new ggt("start_time_utc_millis", "INTEGER", true, 0, null, 1));
        map2.put("end_time_utc_millis", new ggt("end_time_utc_millis", "INTEGER", true, 0, null, 1));
        map2.put("starting_price", new ggt("starting_price", "TEXT", false, 0, null, 1));
        map2.put("poster_thumbnail_aspect_ratio", new ggt("poster_thumbnail_aspect_ratio", "INTEGER", true, 0, null, 1));
        map2.put("thumbnail_uri", new ggt("thumbnail_uri", "TEXT", false, 0, null, 1));
        map2.put("title", new ggt("title", "TEXT", false, 0, null, 1));
        map2.put("type", new ggt("type", "INTEGER", true, 0, null, 1));
        map2.put("series_id", new ggt("series_id", "TEXT", false, 0, null, 1));
        map2.put("tv_series_item_type", new ggt("tv_series_item_type", "INTEGER", true, 0, null, 1));
        map2.put("video_height", new ggt("video_height", "INTEGER", true, 0, null, 1));
        map2.put("video_width", new ggt("video_width", "INTEGER", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new ggu("channels", "CASCADE", "CASCADE", Arrays.asList("package_name", "channel_id"), Arrays.asList("package_name", "_id")));
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(new ggv("index_preview_programs_package_name_channel_id", false, Arrays.asList("package_name", "channel_id"), Arrays.asList("ASC", "ASC")));
        ggw ggwVar2 = new ggw("preview_programs", map2, hashSet3, hashSet4);
        ggw ggwVarB2 = ggs.b(gicVar, "preview_programs");
        if (!gez.F(ggwVar2, ggwVarB2)) {
            return new xqr(false, hhh.b(ggwVarB2, ggwVar2, "preview_programs(com.google.android.libraries.mediahome.providers.video.tables.PreviewProgram).\n Expected:\n"));
        }
        HashMap map3 = new HashMap(44);
        map3.put("watch_next_type", new ggt("watch_next_type", "INTEGER", true, 0, null, 1));
        map3.put("last_engagement_time_utc_millis", new ggt("last_engagement_time_utc_millis", "INTEGER", true, 0, null, 1));
        map3.put("_id", new ggt("_id", "INTEGER", true, 1, null, 1));
        map3.put("package_name", new ggt("package_name", "TEXT", false, 0, null, 1));
        map3.put("author", new ggt("author", "TEXT", false, 0, null, 1));
        map3.put("availability", new ggt("availability", "INTEGER", true, 0, null, 1));
        map3.put("canonical_genre", new ggt("canonical_genre", "TEXT", false, 0, null, 1));
        map3.put("content_id", new ggt("content_id", "TEXT", false, 0, null, 1));
        map3.put("content_rating", new ggt("content_rating", "TEXT", false, 0, null, 1));
        map3.put("duration_millis", new ggt("duration_millis", "INTEGER", true, 0, null, 1));
        map3.put("episode_display_number", new ggt("episode_display_number", "TEXT", false, 0, null, 1));
        map3.put("episode_title", new ggt("episode_title", "TEXT", false, 0, null, 1));
        map3.put("genre", new ggt("genre", "TEXT", false, 0, null, 1));
        map3.put("intent_uri", new ggt("intent_uri", "TEXT", false, 0, null, 1));
        map3.put("interaction_count", new ggt("interaction_count", "INTEGER", true, 0, null, 1));
        map3.put("interaction_type", new ggt("interaction_type", "INTEGER", true, 0, null, 1));
        map3.put("internal_provider_id", new ggt("internal_provider_id", "TEXT", false, 0, null, 1));
        map3.put("item_count", new ggt("item_count", "INTEGER", true, 0, null, 1));
        map3.put("last_playback_position_millis", new ggt("last_playback_position_millis", "INTEGER", true, 0, null, 1));
        map3.put("live", new ggt("live", "INTEGER", true, 0, null, 1));
        map3.put("logo_uri", new ggt("logo_uri", "TEXT", false, 0, null, 1));
        map3.put("logo_content_description", new ggt("logo_content_description", "TEXT", false, 0, null, 1));
        map3.put("offer_price", new ggt("offer_price", "TEXT", false, 0, null, 1));
        map3.put("poster_art_aspect_ratio", new ggt("poster_art_aspect_ratio", "INTEGER", true, 0, null, 1));
        map3.put("poster_art_uri", new ggt("poster_art_uri", "TEXT", false, 0, null, 1));
        map3.put("preview_audio_uri", new ggt("preview_audio_uri", "TEXT", false, 0, null, 1));
        map3.put("preview_video_uri", new ggt("preview_video_uri", "TEXT", false, 0, null, 1));
        map3.put("release_date", new ggt("release_date", "TEXT", false, 0, null, 1));
        map3.put("review_rating", new ggt("review_rating", "TEXT", false, 0, null, 1));
        map3.put("review_rating_style", new ggt("review_rating_style", "INTEGER", true, 0, null, 1));
        map3.put("season_display_number", new ggt("season_display_number", "TEXT", false, 0, null, 1));
        map3.put("season_title", new ggt("season_title", "TEXT", false, 0, null, 1));
        map3.put("short_description", new ggt("short_description", "TEXT", false, 0, null, 1));
        map3.put("start_time_utc_millis", new ggt("start_time_utc_millis", "INTEGER", true, 0, null, 1));
        map3.put("end_time_utc_millis", new ggt("end_time_utc_millis", "INTEGER", true, 0, null, 1));
        map3.put("starting_price", new ggt("starting_price", "TEXT", false, 0, null, 1));
        map3.put("poster_thumbnail_aspect_ratio", new ggt("poster_thumbnail_aspect_ratio", "INTEGER", true, 0, null, 1));
        map3.put("thumbnail_uri", new ggt("thumbnail_uri", "TEXT", false, 0, null, 1));
        map3.put("title", new ggt("title", "TEXT", false, 0, null, 1));
        map3.put("type", new ggt("type", "INTEGER", true, 0, null, 1));
        map3.put("series_id", new ggt("series_id", "TEXT", false, 0, null, 1));
        map3.put("tv_series_item_type", new ggt("tv_series_item_type", "INTEGER", true, 0, null, 1));
        map3.put("video_height", new ggt("video_height", "INTEGER", true, 0, null, 1));
        map3.put("video_width", new ggt("video_width", "INTEGER", true, 0, null, 1));
        HashSet hashSet5 = new HashSet(0);
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new ggv("index_watch_next_programs_package_name", false, Arrays.asList("package_name"), Arrays.asList("ASC")));
        ggw ggwVar3 = new ggw("watch_next_programs", map3, hashSet5, hashSet6);
        ggw ggwVarB3 = ggs.b(gicVar, "watch_next_programs");
        return !gez.F(ggwVar3, ggwVarB3) ? new xqr(false, hhh.b(ggwVarB3, ggwVar3, "watch_next_programs(com.google.android.libraries.mediahome.providers.video.tables.WatchNextProgram).\n Expected:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
