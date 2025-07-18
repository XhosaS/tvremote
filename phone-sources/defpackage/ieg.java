package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ieg<T> {
    public static final ieg a;
    public static final ieg b;
    private static final Throwable e;
    public final Object c;
    public final Throwable d;
    private volatile transient List f;

    static {
        Throwable th = new Throwable("Attempt failed");
        th.setStackTrace(new StackTraceElement[0]);
        b = new ieg(null, th);
        NullPointerException nullPointerException = new NullPointerException("Value is absent");
        e = nullPointerException;
        nullPointerException.setStackTrace(new StackTraceElement[0]);
        a = new ieg(null, nullPointerException);
    }

    public ieg(Object obj, Throwable th) {
        a.aD((th != null) ^ (obj != null), "Illegal Result arguments");
        this.c = obj;
        this.d = th;
        this.f = obj != null ? null : Collections.EMPTY_LIST;
    }

    public static ieg a(Object obj) {
        return obj == null ? a : f(obj);
    }

    public static ieg b(Throwable th) {
        if (th == e) {
            return a;
        }
        th.getClass();
        return new ieg(null, th);
    }

    public static ieg f(Object obj) {
        obj.getClass();
        return new ieg(obj, null);
    }

    public final ieg c(idf idfVar) {
        Object obj = this.c;
        if (obj != null) {
            return (ieg) idfVar.b(obj);
        }
        p();
        return this;
    }

    public final ieg d(Object obj, idp idpVar) {
        Object obj2 = this.c;
        if (obj2 != null) {
            return (ieg) idpVar.c(obj2, obj);
        }
        p();
        return this;
    }

    public final ieg e(idf idfVar) {
        Object obj = this.c;
        if (obj != null) {
            return f(idfVar.b(obj));
        }
        p();
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ieg iegVar = (ieg) obj;
        Object obj2 = this.c;
        if (obj2 == null ? iegVar.c != null : !obj2.equals(iegVar.c)) {
            return false;
        }
        Throwable th = this.d;
        return th == null ? iegVar.d == null : th.equals(iegVar.d);
    }

    public final Object g() {
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        throw new ide(this.d);
    }

    public final Object h(Object obj) {
        Object obj2 = this.c;
        if (obj2 != null) {
            return obj2;
        }
        obj.getClass();
        return obj;
    }

    public final int hashCode() {
        Object obj = this.c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Throwable th = this.d;
        return (iHashCode * 31) + (th != null ? th.hashCode() : 0);
    }

    public final Throwable i() {
        Throwable th = this.d;
        a.ah(th != null, "Not a failure");
        return th;
    }

    public final List j() {
        List listSingletonList;
        List list = this.f;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            listSingletonList = this.f;
            if (listSingletonList == null) {
                listSingletonList = Collections.singletonList(this.c);
                this.f = listSingletonList;
            }
        }
        return listSingletonList;
    }

    public final boolean k() {
        return this.c == null;
    }

    public final boolean l() {
        return this == a;
    }

    public final boolean m() {
        return this.c != null;
    }

    public final void n(idy idyVar) {
        Throwable th = this.d;
        if (th != null) {
            idyVar.c(th);
        }
    }

    public final void o(idy idyVar) {
        Object obj = this.c;
        if (obj != null) {
            idyVar.c(obj);
        }
    }

    public final void p() {
        a.ah(k(), "Not a failure");
    }

    public final String toString() {
        if (this == a) {
            return "Result{Absent}";
        }
        if (this == b) {
            return "Result{Failure}";
        }
        Object obj = this.c;
        if (obj != null) {
            return a.ch(obj, "Result{Success; value=", "}");
        }
        return "Result{Failure; failure=" + String.valueOf(this.d) + "}";
    }
}
