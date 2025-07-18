package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum gho {
    GET_SETTINGS_UI("AssistantSettingsUiService.GetSettingsUi"),
    UPDATE_SETTINGS_UI("AssistantSettingsUiService.UpdateSettingsUi"),
    GET_TOKEN_DETAILS("GoogleAuthUtilWrapper.getTokenDetails"),
    TEXT_SEARCH("S3Service.TextSearch"),
    VOICE_SEARCH("S3Service.VoiceSearch"),
    GET_QUERY_HINTS("AahSearchService.getQueryHints");

    public final String g;

    gho(String str) {
        this.g = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
