package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tqh {
    AMR("audio/AMR", adis.AMR),
    AMRWB("audio/amr-wb", adis.AMR_WB),
    PCM("audio/wav", adis.LINEAR16),
    OGGOPUS("audio/ogg", adis.OGG_OPUS);

    public final String e;
    public final adis f;

    tqh(String str, adis adisVar) {
        this.e = str;
        this.f = adisVar;
    }
}
