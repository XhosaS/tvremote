package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aabo implements Serializable {
    public static final aabo b = new aabn("era", (byte) 1, aabw.a);
    public static final aabo c;
    public static final aabo d;
    public static final aabo e;
    public static final aabo f;
    public static final aabo g;
    public static final aabo h;
    public static final aabo i;
    public static final aabo j;
    public static final aabo k;
    public static final aabo l;
    public static final aabo m;
    public static final aabo n;
    public static final aabo o;
    public static final aabo p;
    public static final aabo q;
    public static final aabo r;
    public static final aabo s;
    private static final long serialVersionUID = -42615285973990L;
    public static final aabo t;
    public static final aabo u;
    public static final aabo v;
    public static final aabo w;
    public static final aabo x;
    public final String y;

    static {
        aabw aabwVar = aabw.d;
        c = new aabn("yearOfEra", (byte) 2, aabwVar);
        d = new aabn("centuryOfEra", (byte) 3, aabw.b);
        e = new aabn("yearOfCentury", (byte) 4, aabwVar);
        f = new aabn("year", (byte) 5, aabwVar);
        aabw aabwVar2 = aabw.g;
        g = new aabn("dayOfYear", (byte) 6, aabwVar2);
        h = new aabn("monthOfYear", (byte) 7, aabw.e);
        i = new aabn("dayOfMonth", (byte) 8, aabwVar2);
        aabw aabwVar3 = aabw.c;
        j = new aabn("weekyearOfCentury", (byte) 9, aabwVar3);
        k = new aabn("weekyear", (byte) 10, aabwVar3);
        l = new aabn("weekOfWeekyear", (byte) 11, aabw.f);
        m = new aabn("dayOfWeek", (byte) 12, aabwVar2);
        n = new aabn("halfdayOfDay", (byte) 13, aabw.h);
        aabw aabwVar4 = aabw.i;
        o = new aabn("hourOfHalfday", (byte) 14, aabwVar4);
        p = new aabn("clockhourOfHalfday", (byte) 15, aabwVar4);
        q = new aabn("clockhourOfDay", (byte) 16, aabwVar4);
        r = new aabn("hourOfDay", (byte) 17, aabwVar4);
        aabw aabwVar5 = aabw.j;
        s = new aabn("minuteOfDay", (byte) 18, aabwVar5);
        t = new aabn("minuteOfHour", (byte) 19, aabwVar5);
        aabw aabwVar6 = aabw.k;
        u = new aabn("secondOfDay", (byte) 20, aabwVar6);
        v = new aabn("secondOfMinute", (byte) 21, aabwVar6);
        aabw aabwVar7 = aabw.l;
        w = new aabn("millisOfDay", (byte) 22, aabwVar7);
        x = new aabn("millisOfSecond", (byte) 23, aabwVar7);
    }

    protected aabo(String str) {
        this.y = str;
    }

    public abstract aabm a(aabk aabkVar);

    public final String toString() {
        return this.y;
    }
}
