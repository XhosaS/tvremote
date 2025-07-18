package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum yct implements abxf {
    ENTRY_POINT_UNKNOWN(0),
    ASSISTANT_SETUP(1),
    FROM_ASSISTANT_BUTTON(2),
    SETTINGS(3),
    SUGGESTION_CHIP(4),
    PUNT_CARD(5),
    VOICE_QUERY(6),
    KEYBOARD_SEARCH(7),
    ASSISTANT_SETUP_START_FROM_DSC(8);

    public final int j;

    yct(int i) {
        this.j = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
