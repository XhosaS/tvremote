package defpackage;

import android.content.ContentValues;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class psg {
    static final ImmutableMap a;
    public String A;
    public String B;
    public int C;
    public String D;
    public String E;
    public String F;
    public long G;
    public long H;
    public String I;
    public int J;
    public String K;
    public String L;
    public int M;
    public String N;
    public int O;
    public int P;
    public int Q;
    public long b;
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public String h;
    public long i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;
    public int o;
    public String p;
    public int q;
    public long r;
    public boolean s;
    public String t;
    public String u;
    public String v;
    public int w;
    public String x;
    public String y;
    public String z;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put("_id", "_id");
        builder.put("package_name", "package_name");
        builder.put("author", "author");
        builder.put("availability", "availability");
        builder.put("canonical_genre", "canonical_genre");
        builder.put("content_id", "content_id");
        builder.put("content_rating", "content_rating");
        builder.put("duration_millis", "duration_millis");
        builder.put("episode_display_number", "episode_display_number");
        builder.put("episode_title", "episode_title");
        builder.put("genre", "genre");
        builder.put("intent_uri", "intent_uri");
        builder.put("interaction_count", "interaction_count");
        builder.put("interaction_type", "interaction_type");
        builder.put("internal_provider_id", "internal_provider_id");
        builder.put("item_count", "item_count");
        builder.put("last_playback_position_millis", "last_playback_position_millis");
        builder.put("live", "live");
        builder.put("logo_uri", "logo_uri");
        builder.put("logo_content_description", "logo_content_description");
        builder.put("offer_price", "offer_price");
        builder.put("poster_art_aspect_ratio", "poster_art_aspect_ratio");
        builder.put("poster_art_uri", "poster_art_uri");
        builder.put("preview_audio_uri", "preview_audio_uri");
        builder.put("preview_video_uri", "preview_video_uri");
        builder.put("release_date", "release_date");
        builder.put("review_rating", "review_rating");
        builder.put("review_rating_style", "review_rating_style");
        builder.put("season_display_number", "season_display_number");
        builder.put("season_title", "season_title");
        builder.put("short_description", "short_description");
        builder.put("start_time_utc_millis", "start_time_utc_millis");
        builder.put("end_time_utc_millis", "end_time_utc_millis");
        builder.put("starting_price", "starting_price");
        builder.put("poster_thumbnail_aspect_ratio", "poster_thumbnail_aspect_ratio");
        builder.put("thumbnail_uri", "thumbnail_uri");
        builder.put("title", "title");
        builder.put("type", "type");
        builder.put("series_id", "series_id");
        builder.put("tv_series_item_type", "tv_series_item_type");
        builder.put("video_height", "video_height");
        builder.put("video_width", "video_width");
        a = builder.buildOrThrow();
    }

    public final void a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("_id");
        if (asLong != null) {
            this.b = asLong.longValue();
        }
        String asString = contentValues.getAsString("package_name");
        if (asString != null) {
            this.c = asString;
        }
        String asString2 = contentValues.getAsString("author");
        if (asString2 != null) {
            this.d = asString2;
        }
        Integer asInteger = contentValues.getAsInteger("availability");
        if (asInteger != null) {
            this.e = asInteger.intValue();
        }
        String asString3 = contentValues.getAsString("canonical_genre");
        if (asString3 != null) {
            this.f = asString3;
        }
        String asString4 = contentValues.getAsString("content_id");
        if (asString4 != null) {
            this.g = asString4;
        }
        String asString5 = contentValues.getAsString("content_rating");
        if (asString5 != null) {
            this.h = asString5;
        }
        Long asLong2 = contentValues.getAsLong("duration_millis");
        if (asLong2 != null) {
            this.i = asLong2.longValue();
        }
        String asString6 = contentValues.getAsString("episode_display_number");
        if (asString6 != null) {
            this.j = asString6;
        }
        String asString7 = contentValues.getAsString("episode_title");
        if (asString7 != null) {
            this.k = asString7;
        }
        String asString8 = contentValues.getAsString("genre");
        if (asString8 != null) {
            this.l = asString8;
        }
        String asString9 = contentValues.getAsString("intent_uri");
        if (asString9 != null) {
            this.m = asString9;
        }
        Long asLong3 = contentValues.getAsLong("interaction_count");
        if (asLong3 != null) {
            this.n = asLong3.longValue();
        }
        Integer asInteger2 = contentValues.getAsInteger("interaction_type");
        if (asInteger2 != null) {
            this.o = asInteger2.intValue();
        }
        String asString10 = contentValues.getAsString("internal_provider_id");
        if (asString10 != null) {
            this.p = asString10;
        }
        Integer asInteger3 = contentValues.getAsInteger("item_count");
        if (asInteger3 != null) {
            this.q = asInteger3.intValue();
        }
        Long asLong4 = contentValues.getAsLong("last_playback_position_millis");
        if (asLong4 != null) {
            this.r = asLong4.longValue();
        }
        Boolean asBoolean = contentValues.getAsBoolean("live");
        if (asBoolean != null) {
            this.s = asBoolean.booleanValue();
        }
        String asString11 = contentValues.getAsString("logo_uri");
        if (asString11 != null) {
            this.t = asString11;
        }
        String asString12 = contentValues.getAsString("logo_content_description");
        if (asString12 != null) {
            this.u = asString12;
        }
        String asString13 = contentValues.getAsString("offer_price");
        if (asString13 != null) {
            this.v = asString13;
        }
        Integer asInteger4 = contentValues.getAsInteger("poster_art_aspect_ratio");
        if (asInteger4 != null) {
            this.w = asInteger4.intValue();
        }
        String asString14 = contentValues.getAsString("poster_art_uri");
        if (asString14 != null) {
            this.x = asString14;
        }
        String asString15 = contentValues.getAsString("preview_audio_uri");
        if (asString15 != null) {
            this.y = asString15;
        }
        String asString16 = contentValues.getAsString("preview_video_uri");
        if (asString16 != null) {
            this.z = asString16;
        }
        String asString17 = contentValues.getAsString("release_date");
        if (asString17 != null) {
            this.A = asString17;
        }
        String asString18 = contentValues.getAsString("review_rating");
        if (asString18 != null) {
            this.B = asString18;
        }
        Integer asInteger5 = contentValues.getAsInteger("review_rating_style");
        if (asInteger5 != null) {
            this.C = asInteger5.intValue();
        }
        String asString19 = contentValues.getAsString("season_display_number");
        if (asString19 != null) {
            this.D = asString19;
        }
        String asString20 = contentValues.getAsString("season_title");
        if (asString20 != null) {
            this.E = asString20;
        }
        String asString21 = contentValues.getAsString("short_description");
        if (asString21 != null) {
            this.F = asString21;
        }
        Long asLong5 = contentValues.getAsLong("start_time_utc_millis");
        if (asLong5 != null) {
            this.G = asLong5.longValue();
        }
        Long asLong6 = contentValues.getAsLong("end_time_utc_millis");
        if (asLong6 != null) {
            this.H = asLong6.longValue();
        }
        String asString22 = contentValues.getAsString("starting_price");
        if (asString22 != null) {
            this.I = asString22;
        }
        Integer asInteger6 = contentValues.getAsInteger("poster_thumbnail_aspect_ratio");
        if (asInteger6 != null) {
            this.J = asInteger6.intValue();
        }
        String asString23 = contentValues.getAsString("thumbnail_uri");
        if (asString23 != null) {
            this.K = asString23;
        }
        String asString24 = contentValues.getAsString("title");
        if (asString24 != null) {
            this.L = asString24;
        }
        Integer asInteger7 = contentValues.getAsInteger("type");
        if (asInteger7 != null) {
            this.M = asInteger7.intValue();
        }
        String asString25 = contentValues.getAsString("series_id");
        if (asString25 != null) {
            this.N = asString25;
        }
        Integer asInteger8 = contentValues.getAsInteger("tv_series_item_type");
        if (asInteger8 != null) {
            this.O = asInteger8.intValue();
        }
        Integer asInteger9 = contentValues.getAsInteger("video_height");
        if (asInteger9 != null) {
            this.P = asInteger9.intValue();
        }
        Integer asInteger10 = contentValues.getAsInteger("video_width");
        if (asInteger10 != null) {
            this.Q = asInteger10.intValue();
        }
    }
}
