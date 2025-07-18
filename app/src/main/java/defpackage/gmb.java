package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmb {
    public static final gmb a;
    public static final gmb b;
    private static final /* synthetic */ gmb[] c;

    static {
        gmb gmbVar = new gmb("VOICE_PLATE_ACTIVITY", 0);
        a = gmbVar;
        gmb gmbVar2 = new gmb("SEARCH_RESULT_ACTIVITY", 1);
        b = gmbVar2;
        gmb[] gmbVarArr = {gmbVar, gmbVar2};
        c = gmbVarArr;
        agtw.a(gmbVarArr);
    }

    private gmb(String str, int i) {
    }

    public static gmb[] values() {
        return (gmb[]) c.clone();
    }
}
