package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzq {
    public static final agzq a;
    public static final agzq b;
    public static final agzq c;
    public static final agzq d;
    public static final agzq e;
    public static final agzq f;
    public static final agzq g;
    private static final /* synthetic */ agzq[] i;
    public final TimeUnit h;

    static {
        agzq agzqVar = new agzq("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = agzqVar;
        agzq agzqVar2 = new agzq("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = agzqVar2;
        agzq agzqVar3 = new agzq("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = agzqVar3;
        agzq agzqVar4 = new agzq("SECONDS", 3, TimeUnit.SECONDS);
        d = agzqVar4;
        agzq agzqVar5 = new agzq("MINUTES", 4, TimeUnit.MINUTES);
        e = agzqVar5;
        agzq agzqVar6 = new agzq("HOURS", 5, TimeUnit.HOURS);
        f = agzqVar6;
        agzq agzqVar7 = new agzq("DAYS", 6, TimeUnit.DAYS);
        g = agzqVar7;
        agzq[] agzqVarArr = {agzqVar, agzqVar2, agzqVar3, agzqVar4, agzqVar5, agzqVar6, agzqVar7};
        i = agzqVarArr;
        agtw.a(agzqVarArr);
    }

    private agzq(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static agzq[] values() {
        return (agzq[]) i.clone();
    }
}
