package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsq {
    public final xsp a;
    public final String b;
    public final String c;
    public final xso d;
    public final xso e;
    private final boolean f;

    public xsq(xsp xspVar, String str, xso xsoVar, xso xsoVar2, boolean z) {
        new AtomicReferenceArray(2);
        xspVar.getClass();
        this.a = xspVar;
        str.getClass();
        this.b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        xsoVar.getClass();
        this.d = xsoVar;
        xsoVar2.getClass();
        this.e = xsoVar2;
        this.f = z;
    }

    public static xsn a() {
        xsn xsnVar = new xsn();
        xsnVar.b = null;
        xsnVar.c = null;
        return xsnVar;
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public final InputStream b(Object obj) {
        return this.d.a(obj);
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("fullMethodName", this.b);
        tssVarH.b("type", this.a);
        tssVarH.f("idempotent", false);
        tssVarH.f("safe", false);
        tssVarH.f("sampledToLocalTracing", this.f);
        tssVarH.b("requestMarshaller", this.d);
        tssVarH.b("responseMarshaller", this.e);
        tssVarH.b("schemaDescriptor", null);
        tssVarH.a = true;
        return tssVarH.toString();
    }
}
