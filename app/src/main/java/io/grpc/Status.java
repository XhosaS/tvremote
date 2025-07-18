package io.grpc;

import defpackage.a;
import defpackage.afid;
import defpackage.afif;
import defpackage.afig;
import defpackage.afju;
import defpackage.afjv;
import defpackage.afjx;
import defpackage.yqq;
import defpackage.yqr;
import defpackage.yqs;
import defpackage.yrv;
import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Status {
    public static final Status OK;
    public static final List a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public static final Status j;
    public static final Status k;
    public static final Status l;
    public static final afid m;
    public static final afid n;
    private static final afig p;
    public final Throwable o;
    private final Code q;
    private final String r;

    /* compiled from: PG */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public final byte[] r;
        private final int t;

        Code(int i) {
            this.t = i;
            this.r = Integer.toString(i).getBytes(StandardCharsets.US_ASCII);
        }

        public final Status a() {
            return (Status) Status.a.get(this.t);
        }

        public int value() {
            return this.t;
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.getCode().name() + " & " + code.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        OK = Code.OK.a();
        b = Code.CANCELLED.a();
        c = Code.UNKNOWN.a();
        d = Code.INVALID_ARGUMENT.a();
        e = Code.DEADLINE_EXCEEDED.a();
        Code.NOT_FOUND.a();
        Code.ALREADY_EXISTS.a();
        f = Code.PERMISSION_DENIED.a();
        g = Code.UNAUTHENTICATED.a();
        h = Code.RESOURCE_EXHAUSTED.a();
        i = Code.FAILED_PRECONDITION.a();
        Code.ABORTED.a();
        Code.OUT_OF_RANGE.a();
        j = Code.UNIMPLEMENTED.a();
        k = Code.INTERNAL.a();
        l = Code.UNAVAILABLE.a();
        Code.DATA_LOSS.a();
        afju afjuVar = new afju();
        int i2 = afid.c;
        m = new afif("grpc-status", false, afjuVar);
        afjv afjvVar = new afjv();
        p = afjvVar;
        n = new afif("grpc-message", false, afjvVar);
    }

    private Status(Code code, String str, Throwable th) {
        code.getClass();
        this.q = code;
        this.r = str;
        this.o = th;
    }

    public static Status b(Throwable th) {
        th.getClass();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).a;
            }
            if (cause instanceof afjx) {
                return ((afjx) cause).a;
            }
        }
        return c.c(th);
    }

    public static String d(Status status) {
        String str = status.r;
        if (str == null) {
            return status.q.toString();
        }
        return status.q.toString() + ": " + str;
    }

    public static Status fromCodeValue(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (Status) list.get(i2);
            }
        }
        return c.withDescription(a.b(i2, "Unknown code "));
    }

    public final Status a(String str) {
        String str2 = this.r;
        return str2 == null ? new Status(this.q, str, this.o) : new Status(this.q, a.i(str, str2, "\n"), this.o);
    }

    public StatusException asException() {
        return new StatusException(this, null);
    }

    public final Status c(Throwable th) {
        return yqs.a(this.o, th) ? this : new Status(this.q, this.r, th);
    }

    public final boolean e() {
        return Code.OK == this.q;
    }

    public Code getCode() {
        return this.q;
    }

    public String getDescription() {
        return this.r;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("code", this.q.name());
        yqqVarB.b("description", this.r);
        Throwable th = this.o;
        Object string = th;
        if (th != null) {
            int i2 = yrv.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        yqqVarB.b("cause", string);
        return yqqVarB.toString();
    }

    public Status withDescription(String str) {
        return yqs.a(this.r, str) ? this : new Status(this.q, str, this.o);
    }
}
