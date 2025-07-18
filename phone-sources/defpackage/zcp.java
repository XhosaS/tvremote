package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcp {
    public static final zcp a;
    public static final zcp b;
    public static final zcp c;
    public static final zcp d;
    public static final zcp e;
    private static final /* synthetic */ zcp[] g;
    public final String f;

    static {
        zcp zcpVar = new zcp("TLS_1_3", 0, "TLSv1.3");
        a = zcpVar;
        zcp zcpVar2 = new zcp("TLS_1_2", 1, "TLSv1.2");
        b = zcpVar2;
        zcp zcpVar3 = new zcp("TLS_1_1", 2, "TLSv1.1");
        c = zcpVar3;
        zcp zcpVar4 = new zcp("TLS_1_0", 3, "TLSv1");
        d = zcpVar4;
        zcp zcpVar5 = new zcp("SSL_3_0", 4, "SSLv3");
        e = zcpVar5;
        zcp[] zcpVarArr = {zcpVar, zcpVar2, zcpVar3, zcpVar4, zcpVar5};
        g = zcpVarArr;
        wcq.P(zcpVarArr);
    }

    private zcp(String str, int i, String str2) {
        this.f = str2;
    }

    public static zcp[] values() {
        return (zcp[]) g.clone();
    }
}
