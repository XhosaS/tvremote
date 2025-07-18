package defpackage;

import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtk {
    public static final List a;
    public static final xtk b;
    public static final xtk c;
    public static final xtk d;
    public static final xtk e;
    public static final xtk f;
    public static final xtk g;
    public static final xtk h;
    public static final xtk i;
    public static final xtk j;
    public static final xtk k;
    static final xsj l;
    static final xsj m;
    private static final xsl q;
    public final xth n;
    public final String o;
    public final Throwable p;

    static {
        TreeMap treeMap = new TreeMap();
        for (xth xthVar : xth.values()) {
            xtk xtkVar = (xtk) treeMap.put(Integer.valueOf(xthVar.r), new xtk(xthVar, null, null));
            if (xtkVar != null) {
                throw new IllegalStateException("Code value duplication between " + xtkVar.n.name() + " & " + xthVar.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = xth.OK.a();
        c = xth.CANCELLED.a();
        d = xth.UNKNOWN.a();
        xth.INVALID_ARGUMENT.a();
        e = xth.DEADLINE_EXCEEDED.a();
        xth.NOT_FOUND.a();
        xth.ALREADY_EXISTS.a();
        f = xth.PERMISSION_DENIED.a();
        g = xth.UNAUTHENTICATED.a();
        h = xth.RESOURCE_EXHAUSTED.a();
        i = xth.FAILED_PRECONDITION.a();
        xth.ABORTED.a();
        xth.OUT_OF_RANGE.a();
        xth.UNIMPLEMENTED.a();
        j = xth.INTERNAL.a();
        k = xth.UNAVAILABLE.a();
        xth.DATA_LOSS.a();
        xti xtiVar = new xti();
        int i2 = xsj.c;
        l = new xsk("grpc-status", false, xtiVar);
        xtj xtjVar = new xtj();
        q = xtjVar;
        m = new xsk("grpc-message", false, xtjVar);
    }

    private xtk(xth xthVar, String str, Throwable th) {
        xthVar.getClass();
        this.n = xthVar;
        this.o = str;
        this.p = th;
    }

    public static xtk b(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (xtk) list.get(i2);
            }
        }
        return d.e(a.cf(i2, "Unknown code "));
    }

    public static xtk c(Throwable th) {
        th.getClass();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof xtl) {
                return ((xtl) cause).a;
            }
            if (cause instanceof xtn) {
                return ((xtn) cause).a;
            }
        }
        return d.d(th);
    }

    static String f(xtk xtkVar) {
        String str = xtkVar.o;
        if (str == null) {
            return xtkVar.n.toString();
        }
        return xtkVar.n.toString() + ": " + str;
    }

    public final xtk a(String str) {
        String str2 = this.o;
        return str2 == null ? new xtk(this.n, str, this.p) : new xtk(this.n, a.cq(str, str2, "\n"), this.p);
    }

    public final xtk d(Throwable th) {
        return a.Q(this.p, th) ? this : new xtk(this.n, this.o, th);
    }

    public final xtk e(String str) {
        return a.Q(this.o, str) ? this : new xtk(this.n, str, this.p);
    }

    public final boolean g() {
        return xth.OK == this.n;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("code", this.n.name());
        tssVarH.b("description", this.o);
        Throwable th = this.p;
        Object string = th;
        if (th != null) {
            int i2 = ttq.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        tssVarH.b("cause", string);
        return tssVarH.toString();
    }
}
