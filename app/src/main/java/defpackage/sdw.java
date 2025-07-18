package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum sdw implements abxf {
    SOURCE_EMPTY(0),
    SOURCE_BUILTIN(1),
    SOURCE_ZLM(2),
    SOURCE_SYNC(3),
    SOURCE_DSP(4),
    SOURCE_SODA(5),
    SOURCE_BISTO(6),
    SOURCE_CAR(7),
    SOURCE_URI(8),
    SOURCE_PFD(9),
    SOURCE_VOICE_DSP_HOTWORD(10),
    SOURCE_GACS(12),
    SOURCE_HOTWORD(13),
    SOURCE_ECHO_REFERENCE(14),
    SOURCE_MEDIA_OUTPUT(15),
    SOURCE_VIRTUAL_AR(16);

    public final int q;

    sdw(int i) {
        this.q = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
