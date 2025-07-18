package defpackage;

import com.google.android.apps.googletv.app.data.room.GoogleTvDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijd extends gfa {
    final /* synthetic */ GoogleTvDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijd(GoogleTvDatabase_Impl googleTvDatabase_Impl) {
        super(28, "74be25c15a39fa5df955e0c669135ead", "9c9cb039f5b05be6f479a2166b6d01b1");
        this.d = googleTvDatabase_Impl;
    }

    @Override // defpackage.gfa
    public final void a(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `destinations` (`account_name` TEXT NOT NULL, `destinations_info` BLOB NOT NULL, PRIMARY KEY(`account_name`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `filter_and_sort_options` (`account_name` TEXT NOT NULL, `id` TEXT NOT NULL, `filter_options_bytes` BLOB NOT NULL, `sort_options_bytes` BLOB NOT NULL, `tag_db_bytes` BLOB, PRIMARY KEY(`account_name`, `id`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `library_config` (`account_name` TEXT NOT NULL, `media_library_config` BLOB NOT NULL, PRIMARY KEY(`account_name`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `user_entity_state` (`account_name` TEXT NOT NULL, `entity_id` TEXT NOT NULL, `in_watchlist` INTEGER NOT NULL, `sentiment` INTEGER NOT NULL, `watched` INTEGER NOT NULL, `family_shared` INTEGER NOT NULL, `last_client_write_millis` INTEGER NOT NULL, `last_server_write_millis` INTEGER NOT NULL, PRIMARY KEY(`account_name`, `entity_id`))");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_user_entity_state_last_server_write_millis` ON `user_entity_state` (`last_server_write_millis`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `watch_actions` (`account_name` TEXT NOT NULL, `entity_id` TEXT NOT NULL, `keep_forever` INTEGER NOT NULL, `watch_actions_blob` BLOB NOT NULL, `last_server_write_millis` INTEGER NOT NULL, PRIMARY KEY(`account_name`, `entity_id`))");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_watch_actions_last_server_write_millis_keep_forever` ON `watch_actions` (`last_server_write_millis`, `keep_forever`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `search_history` (`account_name` TEXT NOT NULL, `query` TEXT NOT NULL, `last_write_mills` INTEGER NOT NULL, PRIMARY KEY(`account_name`, `query`))");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_search_history_last_write_mills` ON `search_history` (`last_write_mills`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `offline_tvm` (`account_name` TEXT NOT NULL, `stream_bytes` BLOB NOT NULL, `entity_id` TEXT NOT NULL, PRIMARY KEY(`account_name`, `entity_id`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `media_library_item` (`play_id` TEXT NOT NULL, `media_library_item_id` BLOB NOT NULL, `account_name` TEXT NOT NULL, `type` INTEGER NOT NULL, `title` TEXT, `order` INTEGER, `parent_id` TEXT, `root_id` TEXT, `component_bytes` BLOB, `family_shared` INTEGER NOT NULL, `bundle_title` TEXT, `media_library_item_info` BLOB NOT NULL, `sort_column_1` TEXT, `sort_column_2` TEXT, `sort_column_3` TEXT, `sort_column_4` TEXT, `sort_column_5` TEXT, PRIMARY KEY(`play_id`, `account_name`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `media_library_item_tag` (`play_id` TEXT NOT NULL, `account_name` TEXT NOT NULL, `tag_id` TEXT NOT NULL, PRIMARY KEY(`play_id`, `account_name`, `tag_id`), FOREIGN KEY(`play_id`, `account_name`) REFERENCES `media_library_item`(`play_id`, `account_name`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_media_library_item_tag_account_name` ON `media_library_item_tag` (`account_name`)");
        gez.t(gicVar, "CREATE INDEX IF NOT EXISTS `index_media_library_item_tag_tag_id` ON `media_library_item_tag` (`tag_id`)");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `media_library_item_metadata` (`play_id` TEXT NOT NULL, `account_name` TEXT NOT NULL, `expiration_time_millis` INTEGER NOT NULL, `component` BLOB, `search_suggestion_component` BLOB, `media_library_item_metadata` BLOB NOT NULL, PRIMARY KEY(`play_id`, `account_name`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `media_library_item_page_data` (`play_id` TEXT NOT NULL, `account_name` TEXT NOT NULL, `entity_stream` BLOB NOT NULL, `expiration_time_millis` INTEGER NOT NULL, PRIMARY KEY(`play_id`, `account_name`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `media_library_item_rental` (`play_id` TEXT NOT NULL, `account_name` TEXT NOT NULL, `short_rental_expiration_timestamp` INTEGER, PRIMARY KEY(`play_id`, `account_name`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `last_watched_item` (`account_name` TEXT NOT NULL, `show_id` TEXT NOT NULL, `last_watched_episode_id` TEXT NOT NULL, PRIMARY KEY(`account_name`, `show_id`))");
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gez.t(gicVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '74be25c15a39fa5df955e0c669135ead')");
    }

    @Override // defpackage.gfa
    public final void b(gic gicVar) {
        gez.t(gicVar, "DROP TABLE IF EXISTS `destinations`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `filter_and_sort_options`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `library_config`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `user_entity_state`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `watch_actions`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `search_history`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `offline_tvm`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `media_library_item`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `media_library_item_tag`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `media_library_item_metadata`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `media_library_item_page_data`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `media_library_item_rental`");
        gez.t(gicVar, "DROP TABLE IF EXISTS `last_watched_item`");
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
        HashMap map = new HashMap(2);
        map.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map.put("destinations_info", new ggt("destinations_info", "BLOB", true, 0, null, 1));
        ggw ggwVar = new ggw("destinations", map, new HashSet(0), new HashSet(0));
        ggw ggwVarB = ggs.b(gicVar, "destinations");
        if (!gez.F(ggwVar, ggwVarB)) {
            return new xqr(false, hhh.b(ggwVarB, ggwVar, "destinations(com.google.android.apps.googletv.app.data.room.entities.Destinations).\n Expected:\n"));
        }
        HashMap map2 = new HashMap(5);
        map2.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map2.put("id", new ggt("id", "TEXT", true, 2, null, 1));
        map2.put("filter_options_bytes", new ggt("filter_options_bytes", "BLOB", true, 0, null, 1));
        map2.put("sort_options_bytes", new ggt("sort_options_bytes", "BLOB", true, 0, null, 1));
        map2.put("tag_db_bytes", new ggt("tag_db_bytes", "BLOB", false, 0, null, 1));
        ggw ggwVar2 = new ggw("filter_and_sort_options", map2, new HashSet(0), new HashSet(0));
        ggw ggwVarB2 = ggs.b(gicVar, "filter_and_sort_options");
        if (!gez.F(ggwVar2, ggwVarB2)) {
            return new xqr(false, hhh.b(ggwVarB2, ggwVar2, "filter_and_sort_options(com.google.android.apps.googletv.app.data.room.entities.FilterAndSortOptions).\n Expected:\n"));
        }
        HashMap map3 = new HashMap(2);
        map3.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map3.put("media_library_config", new ggt("media_library_config", "BLOB", true, 0, null, 1));
        ggw ggwVar3 = new ggw("library_config", map3, new HashSet(0), new HashSet(0));
        ggw ggwVarB3 = ggs.b(gicVar, "library_config");
        if (!gez.F(ggwVar3, ggwVarB3)) {
            return new xqr(false, hhh.b(ggwVarB3, ggwVar3, "library_config(com.google.android.apps.googletv.app.data.room.entities.LibraryConfig).\n Expected:\n"));
        }
        HashMap map4 = new HashMap(8);
        map4.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map4.put("entity_id", new ggt("entity_id", "TEXT", true, 2, null, 1));
        map4.put("in_watchlist", new ggt("in_watchlist", "INTEGER", true, 0, null, 1));
        map4.put("sentiment", new ggt("sentiment", "INTEGER", true, 0, null, 1));
        map4.put("watched", new ggt("watched", "INTEGER", true, 0, null, 1));
        map4.put("family_shared", new ggt("family_shared", "INTEGER", true, 0, null, 1));
        map4.put("last_client_write_millis", new ggt("last_client_write_millis", "INTEGER", true, 0, null, 1));
        map4.put("last_server_write_millis", new ggt("last_server_write_millis", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new ggv("index_user_entity_state_last_server_write_millis", false, Arrays.asList("last_server_write_millis"), Arrays.asList("ASC")));
        ggw ggwVar4 = new ggw("user_entity_state", map4, hashSet, hashSet2);
        ggw ggwVarB4 = ggs.b(gicVar, "user_entity_state");
        if (!gez.F(ggwVar4, ggwVarB4)) {
            return new xqr(false, hhh.b(ggwVarB4, ggwVar4, "user_entity_state(com.google.android.apps.googletv.app.data.room.entities.UserEntityState).\n Expected:\n"));
        }
        HashMap map5 = new HashMap(5);
        map5.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map5.put("entity_id", new ggt("entity_id", "TEXT", true, 2, null, 1));
        map5.put("keep_forever", new ggt("keep_forever", "INTEGER", true, 0, null, 1));
        map5.put("watch_actions_blob", new ggt("watch_actions_blob", "BLOB", true, 0, null, 1));
        map5.put("last_server_write_millis", new ggt("last_server_write_millis", "INTEGER", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(new ggv("index_watch_actions_last_server_write_millis_keep_forever", false, Arrays.asList("last_server_write_millis", "keep_forever"), Arrays.asList("ASC", "ASC")));
        ggw ggwVar5 = new ggw("watch_actions", map5, hashSet3, hashSet4);
        ggw ggwVarB5 = ggs.b(gicVar, "watch_actions");
        if (!gez.F(ggwVar5, ggwVarB5)) {
            return new xqr(false, hhh.b(ggwVarB5, ggwVar5, "watch_actions(com.google.android.apps.googletv.app.data.room.entities.WatchActions).\n Expected:\n"));
        }
        HashMap map6 = new HashMap(3);
        map6.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map6.put("query", new ggt("query", "TEXT", true, 2, null, 1));
        map6.put("last_write_mills", new ggt("last_write_mills", "INTEGER", true, 0, null, 1));
        HashSet hashSet5 = new HashSet(0);
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new ggv("index_search_history_last_write_mills", false, Arrays.asList("last_write_mills"), Arrays.asList("ASC")));
        ggw ggwVar6 = new ggw("search_history", map6, hashSet5, hashSet6);
        ggw ggwVarB6 = ggs.b(gicVar, "search_history");
        if (!gez.F(ggwVar6, ggwVarB6)) {
            return new xqr(false, hhh.b(ggwVarB6, ggwVar6, "search_history(com.google.android.apps.googletv.app.data.room.entities.SearchHistory).\n Expected:\n"));
        }
        HashMap map7 = new HashMap(3);
        map7.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map7.put("stream_bytes", new ggt("stream_bytes", "BLOB", true, 0, null, 1));
        map7.put("entity_id", new ggt("entity_id", "TEXT", true, 2, null, 1));
        ggw ggwVar7 = new ggw("offline_tvm", map7, new HashSet(0), new HashSet(0));
        ggw ggwVarB7 = ggs.b(gicVar, "offline_tvm");
        if (!gez.F(ggwVar7, ggwVarB7)) {
            return new xqr(false, hhh.b(ggwVarB7, ggwVar7, "offline_tvm(com.google.android.apps.googletv.app.data.room.entities.OfflineTvmEntity).\n Expected:\n"));
        }
        HashMap map8 = new HashMap(17);
        map8.put("play_id", new ggt("play_id", "TEXT", true, 1, null, 1));
        map8.put("media_library_item_id", new ggt("media_library_item_id", "BLOB", true, 0, null, 1));
        map8.put("account_name", new ggt("account_name", "TEXT", true, 2, null, 1));
        map8.put("type", new ggt("type", "INTEGER", true, 0, null, 1));
        map8.put("title", new ggt("title", "TEXT", false, 0, null, 1));
        map8.put("order", new ggt("order", "INTEGER", false, 0, null, 1));
        map8.put("parent_id", new ggt("parent_id", "TEXT", false, 0, null, 1));
        map8.put("root_id", new ggt("root_id", "TEXT", false, 0, null, 1));
        map8.put("component_bytes", new ggt("component_bytes", "BLOB", false, 0, null, 1));
        map8.put("family_shared", new ggt("family_shared", "INTEGER", true, 0, null, 1));
        map8.put("bundle_title", new ggt("bundle_title", "TEXT", false, 0, null, 1));
        map8.put("media_library_item_info", new ggt("media_library_item_info", "BLOB", true, 0, null, 1));
        map8.put("sort_column_1", new ggt("sort_column_1", "TEXT", false, 0, null, 1));
        map8.put("sort_column_2", new ggt("sort_column_2", "TEXT", false, 0, null, 1));
        map8.put("sort_column_3", new ggt("sort_column_3", "TEXT", false, 0, null, 1));
        map8.put("sort_column_4", new ggt("sort_column_4", "TEXT", false, 0, null, 1));
        map8.put("sort_column_5", new ggt("sort_column_5", "TEXT", false, 0, null, 1));
        ggw ggwVar8 = new ggw("media_library_item", map8, new HashSet(0), new HashSet(0));
        ggw ggwVarB8 = ggs.b(gicVar, "media_library_item");
        if (!gez.F(ggwVar8, ggwVarB8)) {
            return new xqr(false, hhh.b(ggwVarB8, ggwVar8, "media_library_item(com.google.android.apps.googletv.app.data.room.entities.MediaLibraryItem).\n Expected:\n"));
        }
        HashMap map9 = new HashMap(3);
        map9.put("play_id", new ggt("play_id", "TEXT", true, 1, null, 1));
        map9.put("account_name", new ggt("account_name", "TEXT", true, 2, null, 1));
        map9.put("tag_id", new ggt("tag_id", "TEXT", true, 3, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new ggu("media_library_item", "NO ACTION", "NO ACTION", Arrays.asList("play_id", "account_name"), Arrays.asList("play_id", "account_name")));
        HashSet hashSet8 = new HashSet(2);
        hashSet8.add(new ggv("index_media_library_item_tag_account_name", false, Arrays.asList("account_name"), Arrays.asList("ASC")));
        hashSet8.add(new ggv("index_media_library_item_tag_tag_id", false, Arrays.asList("tag_id"), Arrays.asList("ASC")));
        ggw ggwVar9 = new ggw("media_library_item_tag", map9, hashSet7, hashSet8);
        ggw ggwVarB9 = ggs.b(gicVar, "media_library_item_tag");
        if (!gez.F(ggwVar9, ggwVarB9)) {
            return new xqr(false, hhh.b(ggwVarB9, ggwVar9, "media_library_item_tag(com.google.android.apps.googletv.app.data.room.entities.MediaLibraryItemTag).\n Expected:\n"));
        }
        HashMap map10 = new HashMap(6);
        map10.put("play_id", new ggt("play_id", "TEXT", true, 1, null, 1));
        map10.put("account_name", new ggt("account_name", "TEXT", true, 2, null, 1));
        map10.put("expiration_time_millis", new ggt("expiration_time_millis", "INTEGER", true, 0, null, 1));
        map10.put("component", new ggt("component", "BLOB", false, 0, null, 1));
        map10.put("search_suggestion_component", new ggt("search_suggestion_component", "BLOB", false, 0, null, 1));
        map10.put("media_library_item_metadata", new ggt("media_library_item_metadata", "BLOB", true, 0, null, 1));
        ggw ggwVar10 = new ggw("media_library_item_metadata", map10, new HashSet(0), new HashSet(0));
        ggw ggwVarB10 = ggs.b(gicVar, "media_library_item_metadata");
        if (!gez.F(ggwVar10, ggwVarB10)) {
            return new xqr(false, hhh.b(ggwVarB10, ggwVar10, "media_library_item_metadata(com.google.android.apps.googletv.app.data.room.entities.MediaLibraryItemMetadata).\n Expected:\n"));
        }
        HashMap map11 = new HashMap(4);
        map11.put("play_id", new ggt("play_id", "TEXT", true, 1, null, 1));
        map11.put("account_name", new ggt("account_name", "TEXT", true, 2, null, 1));
        map11.put("entity_stream", new ggt("entity_stream", "BLOB", true, 0, null, 1));
        map11.put("expiration_time_millis", new ggt("expiration_time_millis", "INTEGER", true, 0, null, 1));
        ggw ggwVar11 = new ggw("media_library_item_page_data", map11, new HashSet(0), new HashSet(0));
        ggw ggwVarB11 = ggs.b(gicVar, "media_library_item_page_data");
        if (!gez.F(ggwVar11, ggwVarB11)) {
            return new xqr(false, hhh.b(ggwVarB11, ggwVar11, "media_library_item_page_data(com.google.android.apps.googletv.app.data.room.entities.MediaLibraryItemPageData).\n Expected:\n"));
        }
        HashMap map12 = new HashMap(3);
        map12.put("play_id", new ggt("play_id", "TEXT", true, 1, null, 1));
        map12.put("account_name", new ggt("account_name", "TEXT", true, 2, null, 1));
        map12.put("short_rental_expiration_timestamp", new ggt("short_rental_expiration_timestamp", "INTEGER", false, 0, null, 1));
        ggw ggwVar12 = new ggw("media_library_item_rental", map12, new HashSet(0), new HashSet(0));
        ggw ggwVarB12 = ggs.b(gicVar, "media_library_item_rental");
        if (!gez.F(ggwVar12, ggwVarB12)) {
            return new xqr(false, hhh.b(ggwVarB12, ggwVar12, "media_library_item_rental(com.google.android.apps.googletv.app.data.room.entities.MediaLibraryItemRental).\n Expected:\n"));
        }
        HashMap map13 = new HashMap(3);
        map13.put("account_name", new ggt("account_name", "TEXT", true, 1, null, 1));
        map13.put("show_id", new ggt("show_id", "TEXT", true, 2, null, 1));
        map13.put("last_watched_episode_id", new ggt("last_watched_episode_id", "TEXT", true, 0, null, 1));
        ggw ggwVar13 = new ggw("last_watched_item", map13, new HashSet(0), new HashSet(0));
        ggw ggwVarB13 = ggs.b(gicVar, "last_watched_item");
        return !gez.F(ggwVar13, ggwVarB13) ? new xqr(false, hhh.b(ggwVarB13, ggwVar13, "last_watched_item(com.google.android.apps.googletv.app.data.room.entities.MediaLibraryLastWatchedEpisode).\n Expected:\n")) : new xqr(true, (String) null);
    }

    @Override // defpackage.gfa
    public final void e() {
    }

    @Override // defpackage.gfa
    public final void f() {
    }
}
