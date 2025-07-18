package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcd {
    public static final hcd a;
    public static final hcd b;
    private static final /* synthetic */ hcd[] c;

    static {
        hcd hcdVar = new hcd("PNG", 0);
        a = hcdVar;
        hcd hcdVar2 = new hcd("TAKE_SCREENSHOT", 1);
        b = hcdVar2;
        hcd[] hcdVarArr = {hcdVar, hcdVar2};
        c = hcdVarArr;
        agtw.a(hcdVarArr);
    }

    private hcd(String str, int i) {
    }

    public static hcd[] values() {
        return (hcd[]) c.clone();
    }
}
