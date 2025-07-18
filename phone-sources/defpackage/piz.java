package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class piz {
    public static final piz a;
    public static final piz b;
    private static final /* synthetic */ piz[] c;

    static {
        piz pizVar = new piz("CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG", 0);
        a = pizVar;
        piz pizVar2 = new piz("CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NUDGE", 1);
        b = pizVar2;
        piz[] pizVarArr = {pizVar, pizVar2};
        c = pizVarArr;
        wcq.P(pizVarArr);
    }

    private piz(String str, int i) {
    }

    public static piz[] values() {
        return (piz[]) c.clone();
    }
}
