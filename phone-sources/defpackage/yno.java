package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yno {
    public static final yno a;
    public static final yno b;
    public static final yno c;
    public static final yno d;
    public static final yno e;
    public static final yno f;
    public static final yno g;
    private static final /* synthetic */ yno[] i;
    public final TimeUnit h;

    static {
        yno ynoVar = new yno("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = ynoVar;
        yno ynoVar2 = new yno("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = ynoVar2;
        yno ynoVar3 = new yno("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = ynoVar3;
        yno ynoVar4 = new yno("SECONDS", 3, TimeUnit.SECONDS);
        d = ynoVar4;
        yno ynoVar5 = new yno("MINUTES", 4, TimeUnit.MINUTES);
        e = ynoVar5;
        yno ynoVar6 = new yno("HOURS", 5, TimeUnit.HOURS);
        f = ynoVar6;
        yno ynoVar7 = new yno("DAYS", 6, TimeUnit.DAYS);
        g = ynoVar7;
        yno[] ynoVarArr = {ynoVar, ynoVar2, ynoVar3, ynoVar4, ynoVar5, ynoVar6, ynoVar7};
        i = ynoVarArr;
        wcq.P(ynoVarArr);
    }

    private yno(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static yno[] values() {
        return (yno[]) i.clone();
    }
}
