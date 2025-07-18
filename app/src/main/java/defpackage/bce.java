package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bce {
    private static final /* synthetic */ agtv $ENTRIES;
    private static final /* synthetic */ bce[] $VALUES;
    public static final bcd Companion;
    public static final bce ON_ANY;
    public static final bce ON_CREATE;
    public static final bce ON_DESTROY;
    public static final bce ON_PAUSE;
    public static final bce ON_RESUME;
    public static final bce ON_START;
    public static final bce ON_STOP;

    static {
        bce bceVar = new bce("ON_CREATE", 0);
        ON_CREATE = bceVar;
        bce bceVar2 = new bce("ON_START", 1);
        ON_START = bceVar2;
        bce bceVar3 = new bce("ON_RESUME", 2);
        ON_RESUME = bceVar3;
        bce bceVar4 = new bce("ON_PAUSE", 3);
        ON_PAUSE = bceVar4;
        bce bceVar5 = new bce("ON_STOP", 4);
        ON_STOP = bceVar5;
        bce bceVar6 = new bce("ON_DESTROY", 5);
        ON_DESTROY = bceVar6;
        bce bceVar7 = new bce("ON_ANY", 6);
        ON_ANY = bceVar7;
        bce[] bceVarArr = {bceVar, bceVar2, bceVar3, bceVar4, bceVar5, bceVar6, bceVar7};
        $VALUES = bceVarArr;
        $ENTRIES = agtw.a(bceVarArr);
        Companion = new bcd();
    }

    private bce(String str, int i) {
    }

    public static bce[] values() {
        return (bce[]) $VALUES.clone();
    }

    public final bcf a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return bcf.c;
            case 1:
            case 3:
                return bcf.d;
            case 2:
                return bcf.e;
            case 5:
                return bcf.a;
            case 6:
                toString();
                throw new IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new agpg();
        }
    }
}
