package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfk {
    public static final sfj a;
    public static final sfk b;
    public static final sfk c;
    public static final sfk d;
    public static final sfk e;
    private static final /* synthetic */ sfk[] g;
    public final int f;

    static {
        sfk sfkVar = new sfk();
        b = sfkVar;
        sfk sfkVar2 = new sfk("STATE_AUDIO_DISCONNECTED", 1, 10);
        c = sfkVar2;
        sfk sfkVar3 = new sfk("STATE_AUDIO_CONNECTING", 2, 11);
        d = sfkVar3;
        sfk sfkVar4 = new sfk("STATE_AUDIO_CONNECTED", 3, 12);
        e = sfkVar4;
        sfk[] sfkVarArr = {sfkVar, sfkVar2, sfkVar3, sfkVar4};
        g = sfkVarArr;
        agtw.a(sfkVarArr);
        a = new sfj();
    }

    private sfk(String str, int i, int i2) {
        this.f = i2;
    }

    public static sfk[] values() {
        return (sfk[]) g.clone();
    }

    public /* synthetic */ sfk() {
        this.f = -1;
    }
}
