package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipb {
    public static final ipb a;
    public static final ipb b;
    public static final ipb c;
    private static final /* synthetic */ ipb[] d;

    static {
        ipb ipbVar = new ipb("EMPTY", 0);
        a = ipbVar;
        ipb ipbVar2 = new ipb("GMAIL", 1);
        b = ipbVar2;
        ipb ipbVar3 = new ipb("NON_GMAIL", 2);
        c = ipbVar3;
        ipb[] ipbVarArr = {ipbVar, ipbVar2, ipbVar3};
        d = ipbVarArr;
        agtw.a(ipbVarArr);
    }

    private ipb(String str, int i) {
    }

    public static ipb[] values() {
        return (ipb[]) d.clone();
    }
}
