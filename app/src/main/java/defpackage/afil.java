package defpackage;

import com.google.protobuf.MessageLite;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afil {
    public final afik a;
    public final String b;
    public final String c;
    public final afij d;
    public final afij e;
    public final boolean f;

    public afil(afik afikVar, String str, afij afijVar, afij afijVar2, boolean z) {
        new AtomicReferenceArray(2);
        afikVar.getClass();
        this.a = afikVar;
        str.getClass();
        this.b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        afijVar.getClass();
        this.d = afijVar;
        afijVar2.getClass();
        this.e = afijVar2;
        this.f = z;
    }

    public static String b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public static afii c() {
        afii afiiVar = new afii();
        afiiVar.a = null;
        afiiVar.b = null;
        return afiiVar;
    }

    public final InputStream a(Object obj) {
        return new agdy((MessageLite) obj, ((agdz) this.d).b);
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("fullMethodName", this.b);
        yqqVarB.b("type", this.a);
        yqqVarB.c("idempotent", "false");
        yqqVarB.c("safe", "false");
        yqqVarB.c("sampledToLocalTracing", String.valueOf(this.f));
        yqqVarB.b("requestMarshaller", this.d);
        yqqVarB.b("responseMarshaller", this.e);
        yqqVarB.b("schemaDescriptor", null);
        yqqVarB.a = true;
        return yqqVarB.toString();
    }
}
