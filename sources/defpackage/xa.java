package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class xa {
    private static final /* synthetic */ ctf $ENTRIES;
    private static final /* synthetic */ xa[] $VALUES;
    public static final wz Companion;
    public static final xa ON_ANY;
    public static final xa ON_CREATE;
    public static final xa ON_DESTROY;
    public static final xa ON_PAUSE;
    public static final xa ON_RESUME;
    public static final xa ON_START;
    public static final xa ON_STOP;

    static {
        xa xaVar = new xa("ON_CREATE", 0);
        ON_CREATE = xaVar;
        xa xaVar2 = new xa("ON_START", 1);
        ON_START = xaVar2;
        xa xaVar3 = new xa("ON_RESUME", 2);
        ON_RESUME = xaVar3;
        xa xaVar4 = new xa("ON_PAUSE", 3);
        ON_PAUSE = xaVar4;
        xa xaVar5 = new xa("ON_STOP", 4);
        ON_STOP = xaVar5;
        xa xaVar6 = new xa("ON_DESTROY", 5);
        ON_DESTROY = xaVar6;
        xa xaVar7 = new xa("ON_ANY", 6);
        ON_ANY = xaVar7;
        xa[] xaVarArr = {xaVar, xaVar2, xaVar3, xaVar4, xaVar5, xaVar6, xaVar7};
        $VALUES = xaVarArr;
        $ENTRIES = dnx.aD(xaVarArr);
        Companion = new wz();
    }

    private xa(String str, int i) {
    }

    public static xa[] values() {
        return (xa[]) $VALUES.clone();
    }

    public final xb a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return xb.c;
            case 1:
            case 3:
                return xb.d;
            case 2:
                return xb.e;
            case 5:
                return xb.a;
            case 6:
                toString();
                throw new IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new crz();
        }
    }
}
