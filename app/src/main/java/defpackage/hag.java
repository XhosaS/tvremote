package defpackage;

import java.util.Arrays;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hag {
    public static final Set a;
    public static final hag b;
    public static final hag c;
    public static final hag d;
    public static final hag e;
    public static final hag f;
    public static final hag g;
    public static final hag h;
    public static final hag i;
    private static final /* synthetic */ hag[] k;
    public final qpi j;

    static {
        hag hagVar = new hag("DEFAULT", 0, new qpi(":"));
        b = hagVar;
        hag hagVar2 = new hag("CRASH_REPORT", 1, new qpi(":crash_report"));
        c = hagVar2;
        hag hagVar3 = new hag("INTERACTOR", 2, new qpi(":interactor"));
        d = hagVar3;
        hag hagVar4 = new hag("PLAYCORE_MISSING_SPLITS_ACTIVITY", 3, new qpi(":playcore_missing_splits_activity"));
        e = hagVar4;
        hag hagVar5 = new hag("PRIMES_LIFEBOAT", 4, new qpi(":primes_lifeboat"));
        f = hagVar5;
        hag hagVar6 = new hag("SEARCH", 5, new qpi(":search"));
        g = hagVar6;
        hag hagVar7 = new hag("TRAIN", 6, new qpi(":train"));
        h = hagVar7;
        hag hagVar8 = new hag("UNKNOWN", 7, new qpi(":"));
        i = hagVar8;
        hag[] hagVarArr = {hagVar, hagVar2, hagVar3, hagVar4, hagVar5, hagVar6, hagVar7, hagVar8};
        k = hagVarArr;
        agtw.a(hagVarArr);
        hag[] hagVarArrValues = values();
        Object[] objArrCopyOf = Arrays.copyOf(hagVarArrValues, hagVarArrValues.length);
        objArrCopyOf.getClass();
        a = agqj.p(objArrCopyOf);
    }

    private hag(String str, int i2, qpi qpiVar) {
        this.j = qpiVar;
    }

    public static hag[] values() {
        return (hag[]) k.clone();
    }
}
