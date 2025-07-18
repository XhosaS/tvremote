package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ire {
    public static final ire a;
    public static final ire b;
    public static final ire c;
    public static final ire d;
    public static final ire e;
    public static final ire f;
    public static final ire g;
    public static final ire h;
    private static final /* synthetic */ ire[] i;

    static {
        ire ireVar = new ire("CONTINUE", 0);
        a = ireVar;
        ire ireVar2 = new ire("YES", 1);
        b = ireVar2;
        ire ireVar3 = new ire("NO", 2);
        c = ireVar3;
        ire ireVar4 = new ire("BACK", 3);
        d = ireVar4;
        ire ireVar5 = new ire("START", 4);
        e = ireVar5;
        ire ireVar6 = new ire("EXP_CONFIG_LOADED_OR_TIMED_OUT", 5);
        f = ireVar6;
        ire ireVar7 = new ire("VOICE_MATCH_LOADING_PROCEED", 6);
        g = ireVar7;
        ire ireVar8 = new ire("USE_ASSISTANT_WITHOUT_SIGN_IN", 7);
        h = ireVar8;
        ire[] ireVarArr = {ireVar, ireVar2, ireVar3, ireVar4, ireVar5, ireVar6, ireVar7, ireVar8};
        i = ireVarArr;
        agtw.a(ireVarArr);
    }

    private ire(String str, int i2) {
    }

    public static ire[] values() {
        return (ire[]) i.clone();
    }
}
