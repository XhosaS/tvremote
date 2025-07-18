package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jid {
    public static final jid a;
    public static final jid b;
    public static final jid c;
    public static final jid d;
    private static final /* synthetic */ jid[] e;

    static {
        jid jidVar = new jid("UNINITIALIZED", 0);
        a = jidVar;
        jid jidVar2 = new jid("INFO_RETRIEVAL", 1);
        b = jidVar2;
        jid jidVar3 = new jid("INITIALIZING", 2);
        c = jidVar3;
        jid jidVar4 = new jid("RUNNING", 3);
        d = jidVar4;
        jid[] jidVarArr = {jidVar, jidVar2, jidVar3, jidVar4};
        e = jidVarArr;
        agtw.a(jidVarArr);
    }

    private jid(String str, int i) {
    }

    public static jid[] values() {
        return (jid[]) e.clone();
    }
}
