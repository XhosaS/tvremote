package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvc {
    private static final /* synthetic */ yja $ENTRIES;
    private static final /* synthetic */ dvc[] $VALUES;
    public static final dvb Companion;
    public static final dvc ON_ANY;
    public static final dvc ON_CREATE;
    public static final dvc ON_DESTROY;
    public static final dvc ON_PAUSE;
    public static final dvc ON_RESUME;
    public static final dvc ON_START;
    public static final dvc ON_STOP;

    static {
        dvc dvcVar = new dvc("ON_CREATE", 0);
        ON_CREATE = dvcVar;
        dvc dvcVar2 = new dvc("ON_START", 1);
        ON_START = dvcVar2;
        dvc dvcVar3 = new dvc("ON_RESUME", 2);
        ON_RESUME = dvcVar3;
        dvc dvcVar4 = new dvc("ON_PAUSE", 3);
        ON_PAUSE = dvcVar4;
        dvc dvcVar5 = new dvc("ON_STOP", 4);
        ON_STOP = dvcVar5;
        dvc dvcVar6 = new dvc("ON_DESTROY", 5);
        ON_DESTROY = dvcVar6;
        dvc dvcVar7 = new dvc("ON_ANY", 6);
        ON_ANY = dvcVar7;
        dvc[] dvcVarArr = {dvcVar, dvcVar2, dvcVar3, dvcVar4, dvcVar5, dvcVar6, dvcVar7};
        $VALUES = dvcVarArr;
        $ENTRIES = wcq.P(dvcVarArr);
        Companion = new dvb();
    }

    private dvc(String str, int i) {
    }

    public static dvc[] values() {
        return (dvc[]) $VALUES.clone();
    }

    public final dvd a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return dvd.c;
            case 1:
            case 3:
                return dvd.d;
            case 2:
                return dvd.e;
            case 5:
                return dvd.a;
            case 6:
                toString();
                throw new IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new yfu();
        }
    }
}
