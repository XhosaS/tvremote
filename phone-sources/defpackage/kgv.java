package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgv {
    public static final kgv a;
    public static final kgv b;
    public static final kgv c;
    public static final kgv d;
    private static final /* synthetic */ kgv[] e;

    static {
        kgv kgvVar = new kgv("DPAD_LAYOUT", 0);
        a = kgvVar;
        kgv kgvVar2 = new kgv("MEDIA_PLAYBACK", 1);
        b = kgvVar2;
        kgv kgvVar3 = new kgv("TEXT_INPUT_LAYOUT", 2);
        c = kgvVar3;
        kgv kgvVar4 = new kgv("SWIPE_LAYOUT", 3);
        d = kgvVar4;
        kgv[] kgvVarArr = {kgvVar, kgvVar2, kgvVar3, kgvVar4};
        e = kgvVarArr;
        wcq.P(kgvVarArr);
    }

    private kgv(String str, int i) {
    }

    public static kgv[] values() {
        return (kgv[]) e.clone();
    }
}
