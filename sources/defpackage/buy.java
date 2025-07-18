package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum buy implements clx {
    PING_CONTROL(1),
    KEYBOARD(2),
    IME(4),
    VOICE(8),
    PTT_ASSISTANT(16),
    POWER(32),
    VOLUME(64),
    MEDIA_SESSION(128),
    GAMEPAD(256),
    APP_LINK(512),
    AUDIO_DEVICES(1024),
    FIND_MY_REMOTE(2048);

    public final int m;

    buy(int i) {
        this.m = i;
    }

    @Override // defpackage.clx
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
