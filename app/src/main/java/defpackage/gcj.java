package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcj {
    public static final gcj a;
    public static final gcj b;
    public static final gcj c;
    public static final gcj d;
    public static final gcj e;
    public static final gcj f;
    public static final gcj g;
    public static final gcj h;
    public static final gcj i;
    private static final /* synthetic */ gcj[] k;
    public final boolean j;

    static {
        gcj gcjVar = new gcj("LISTENING", 0, false);
        a = gcjVar;
        gcj gcjVar2 = new gcj("THINKING", 1, false);
        b = gcjVar2;
        gcj gcjVar3 = new gcj("RESPONDING", 2, false);
        c = gcjVar3;
        gcj gcjVar4 = new gcj("TIMEOUT", 3, false);
        d = gcjVar4;
        gcj gcjVar5 = new gcj("MUTE", 4, true);
        e = gcjVar5;
        gcj gcjVar6 = new gcj("MUTE_DIMMED", 5, true);
        f = gcjVar6;
        gcj gcjVar7 = new gcj("OFF", 6, true);
        g = gcjVar7;
        gcj gcjVar8 = new gcj("OFF_NO_ANIMATION", 7, true);
        h = gcjVar8;
        gcj gcjVar9 = new gcj("ERROR", 8, false);
        i = gcjVar9;
        gcj[] gcjVarArr = {gcjVar, gcjVar2, gcjVar3, gcjVar4, gcjVar5, gcjVar6, gcjVar7, gcjVar8, gcjVar9};
        k = gcjVarArr;
        agtw.a(gcjVarArr);
    }

    private gcj(String str, int i2, boolean z) {
        this.j = z;
    }

    public static gcj[] values() {
        return (gcj[]) k.clone();
    }
}
