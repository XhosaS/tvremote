package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class idk {
    public static final idk a;
    public static final idk b;
    private static final /* synthetic */ idk[] c;

    static {
        idk idkVar = new idk("VOICE_INPUT_DISABLED", 0);
        a = idkVar;
        idk idkVar2 = new idk("VOICE_INPUT_ENABLED", 1);
        b = idkVar2;
        idk[] idkVarArr = {idkVar, idkVar2};
        c = idkVarArr;
        agtw.a(idkVarArr);
    }

    private idk(String str, int i) {
    }

    public static idk[] values() {
        return (idk[]) c.clone();
    }
}
