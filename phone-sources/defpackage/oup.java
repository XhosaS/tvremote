package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oup {
    public static final oup a;
    public static final oup b;
    public static final oup c;
    public static final oup d;
    public static final oup e;
    private static final /* synthetic */ oup[] g;
    public final String f;

    static {
        oup oupVar = new oup("AUDIO_MP4", 0, "audio/mp4");
        a = oupVar;
        oup oupVar2 = new oup("AUDIO_WEBM", 1, "audio/webm");
        b = oupVar2;
        oup oupVar3 = new oup("VIDEO_MP4", 2, "video/mp4");
        c = oupVar3;
        oup oupVar4 = new oup("VIDEO_WEBM", 3, "video/webm");
        d = oupVar4;
        oup oupVar5 = new oup("VIDEO_WVM", 4, "video/x-ms-wmv");
        e = oupVar5;
        oup[] oupVarArr = {oupVar, oupVar2, oupVar3, oupVar4, oupVar5};
        g = oupVarArr;
        wcq.P(oupVarArr);
    }

    private oup(String str, int i, String str2) {
        this.f = str2;
    }

    public static oup[] values() {
        return (oup[]) g.clone();
    }
}
