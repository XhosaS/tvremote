package j$.time.temporal;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class s implements Serializable {
    public static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final g h;
    private static final long serialVersionUID = -1177360819670808121L;
    public final j$.time.c a;
    public final int b;
    public final transient r c;
    public final transient r d;
    public final transient r e;
    public final transient r f;

    static {
        new s(j$.time.c.MONDAY, 4);
        a(j$.time.c.SUNDAY, 1);
        h = h.d;
    }

    public s(j$.time.c cVar, int i) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.c = new r("DayOfWeek", this, chronoUnit, chronoUnit2, r.f);
        this.d = new r("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, r.g);
        g gVar = h.d;
        this.e = new r("WeekOfWeekBasedYear", this, chronoUnit2, gVar, r.i);
        this.f = new r("WeekBasedYear", this, gVar, ChronoUnit.FOREVER, a.YEAR.d);
        Objects.a(cVar, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = cVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s a(j$.time.c cVar, int i) {
        String str = cVar.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        s sVar = (s) concurrentHashMap.get(str);
        if (sVar != null) {
            return sVar;
        }
        concurrentHashMap.putIfAbsent(str, new s(cVar, i));
        return (s) concurrentHashMap.get(str);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + String.valueOf(this.a) + "," + this.b + "]";
    }
}
