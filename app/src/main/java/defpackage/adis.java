package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adis implements abxf {
    LINEAR16(0),
    FLOAT32(1),
    FLAC(2),
    AMR(3),
    MULAW(4),
    SPEEX_NB(5),
    SPEEX_WB(6),
    OGG_VORBIS(7),
    ADTS_AAC(8),
    AMR_WB(9),
    OGG_OPUS(10),
    WEBM_OPUS(11),
    MKV(12),
    MP3(13),
    OPUS(14),
    ALAW(15);

    public final int q;

    adis(int i) {
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
