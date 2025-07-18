package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjb {
    public static final tjb a;
    public static final tjb b;
    public static final tjb c;
    public static final tjb d;
    private static final /* synthetic */ tjb[] f;
    public final String e;

    static {
        tjb tjbVar = new tjb("SEARCH", 0, "search");
        a = tjbVar;
        tjb tjbVar2 = new tjb("GOOGLEAPP", 1, "googleapp");
        b = tjbVar2;
        tjb tjbVar3 = new tjb("INTERACTOR", 2, "interactor");
        c = tjbVar3;
        tjb tjbVar4 = new tjb("CRASH_REPORT", 3, "crash_report");
        d = tjbVar4;
        tjb[] tjbVarArr = {tjbVar, tjbVar2, tjbVar3, tjbVar4};
        f = tjbVarArr;
        agtw.a(tjbVarArr);
    }

    private tjb(String str, int i, String str2) {
        this.e = str2;
    }

    public static tjb[] values() {
        return (tjb[]) f.clone();
    }
}
