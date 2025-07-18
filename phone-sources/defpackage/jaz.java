package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jaz {
    public static final jaz a;
    public static final jaz b;
    public static final jaz c;
    private static final /* synthetic */ jaz[] d;

    static {
        jaz jazVar = new jaz("MOVIES", 0);
        a = jazVar;
        jaz jazVar2 = new jaz("SHOWS", 1);
        b = jazVar2;
        jaz jazVar3 = new jaz("UNSPECIFIED", 2);
        c = jazVar3;
        jaz[] jazVarArr = {jazVar, jazVar2, jazVar3};
        d = jazVarArr;
        wcq.P(jazVarArr);
    }

    private jaz(String str, int i) {
    }

    public static jaz[] values() {
        return (jaz[]) d.clone();
    }
}
