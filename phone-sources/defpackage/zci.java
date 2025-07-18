package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zci {
    public static final zci a;
    public static final zci b;

    @yfp
    public static final zci c;
    public static final zci d;
    public static final zci e;
    public static final zci f;
    private static final /* synthetic */ zci[] h;
    public final String g;

    static {
        zci zciVar = new zci("HTTP_1_0", 0, "http/1.0");
        a = zciVar;
        zci zciVar2 = new zci("HTTP_1_1", 1, "http/1.1");
        b = zciVar2;
        zci zciVar3 = new zci("SPDY_3", 2, "spdy/3.1");
        c = zciVar3;
        zci zciVar4 = new zci("HTTP_2", 3, "h2");
        d = zciVar4;
        zci zciVar5 = new zci("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        e = zciVar5;
        zci zciVar6 = new zci("QUIC", 5, "quic");
        f = zciVar6;
        zci[] zciVarArr = {zciVar, zciVar2, zciVar3, zciVar4, zciVar5, zciVar6};
        h = zciVarArr;
        wcq.P(zciVarArr);
    }

    private zci(String str, int i, String str2) {
        this.g = str2;
    }

    public static zci[] values() {
        return (zci[]) h.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
