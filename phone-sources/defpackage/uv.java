package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class uv {
    public static final uv a;
    public static final uv b;
    private static final /* synthetic */ uv[] c;

    static {
        uv uvVar = new uv("Vertical", 0);
        a = uvVar;
        uv uvVar2 = new uv("Horizontal", 1);
        b = uvVar2;
        uv[] uvVarArr = {uvVar, uvVar2};
        c = uvVarArr;
        wcq.P(uvVarArr);
    }

    private uv(String str, int i) {
    }

    public static uv[] values() {
        return (uv[]) c.clone();
    }
}
