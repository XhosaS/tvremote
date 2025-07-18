package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivy {
    public static final ivy a;
    public static final ivy b;
    public static final ivy c;
    public static final ivy d;
    public static final ivy e;
    public static final ivy f;
    public static final ivy g;
    public static final ivy h;
    private static final /* synthetic */ ivy[] i;

    static {
        ivy ivyVar = new ivy("DISCONNECTED", 0);
        a = ivyVar;
        ivy ivyVar2 = new ivy("CONNECTING", 1);
        b = ivyVar2;
        ivy ivyVar3 = new ivy("PAIRING_REQUESTED", 2);
        c = ivyVar3;
        ivy ivyVar4 = new ivy("PAIRING_CODE_SENT", 3);
        d = ivyVar4;
        ivy ivyVar5 = new ivy("PAIRING_CANCELED", 4);
        e = ivyVar5;
        ivy ivyVar6 = new ivy("RECONNECTING", 5);
        f = ivyVar6;
        ivy ivyVar7 = new ivy("CONNECTED", 6);
        g = ivyVar7;
        ivy ivyVar8 = new ivy("LOST", 7);
        h = ivyVar8;
        ivy[] ivyVarArr = {ivyVar, ivyVar2, ivyVar3, ivyVar4, ivyVar5, ivyVar6, ivyVar7, ivyVar8};
        i = ivyVarArr;
        wcq.P(ivyVarArr);
    }

    private ivy(String str, int i2) {
    }

    public static ivy[] values() {
        return (ivy[]) i.clone();
    }
}
