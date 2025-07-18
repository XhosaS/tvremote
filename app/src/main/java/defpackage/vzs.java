package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzs {
    public static final vzs a;
    public static final vzs b;
    public static final vzs c;
    public static final vzs d;
    private static final /* synthetic */ vzs[] e;

    static {
        vzs vzsVar = new vzs("DEVICE", 0);
        a = vzsVar;
        vzs vzsVar2 = new vzs("USER", 1);
        b = vzsVar2;
        vzs vzsVar3 = new vzs("UI_DEVICE", 2);
        c = vzsVar3;
        vzs vzsVar4 = new vzs("UI_USER", 3);
        d = vzsVar4;
        vzs[] vzsVarArr = {vzsVar, vzsVar2, vzsVar3, vzsVar4};
        e = vzsVarArr;
        agtw.a(vzsVarArr);
    }

    private vzs(String str, int i) {
    }

    public static vzs[] values() {
        return (vzs[]) e.clone();
    }
}
