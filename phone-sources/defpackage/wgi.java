package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wgi implements vug {
    UNKNOWN_PLAYLOG_MOVIES_CONTENT_TYPE(0),
    LOCAL_PLAYBACK(100),
    CAST_PLAYBACK(101),
    UNDO_SNACKBAR(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu),
    AUDIO_CC_DIALOG(R.styleable.AppCompatTheme_textAppearanceListItem),
    MOVIES_CLUSTER_PAGE(R.styleable.AppCompatTheme_textAppearanceListItemSecondary),
    INLINE_LOCAL_PLAYBACK(R.styleable.AppCompatTheme_textAppearanceListItemSmall),
    ACTOR_SECTION(200),
    MOVIES_CLUSTER_CONTAINER(201),
    SONG_INFO_CARD(kwx.JSON3),
    FILMOGRAPHY_CARD(301),
    ASSET_CARD(302),
    CLOSE_BUTTON(400),
    ACTOR_INFO_CARD(401),
    UNDO_BUTTON(402),
    DISMISS_BUTTON(403),
    PLAYER_PLAY_BUTTON(404),
    PLAYER_PAUSE_BUTTON(405),
    REWIND_10_SECONDS_BUTTON(406),
    FORWARD_10_SECONDS_BUTTON(407),
    REWIND_10_SECONDS_SIDE_PANEL(408),
    FORWARD_10_SECONDS_SIDE_PANEL(409),
    MOVIES_AUDIO_CC_BUTTON(410),
    MOVIES_AVOD_PLAY_BUTTON(411),
    MOVIES_AVOD_PAUSE_BUTTON(412),
    PLAYER_STOP_BUTTON(413),
    WATCHLIST_BUTTON(500),
    ZOOM_BUTTON(501),
    INLINE_LOCAL_PLAYBACK_ZOOM_BUTTON(502);

    public final int D;

    wgi(int i) {
        this.D = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.D;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.D);
    }
}
