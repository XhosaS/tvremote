package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oyc implements ager, oxh {
    private final afil a;
    private final oxr b;
    private final oxj c;

    public oyc(oxj oxjVar, afil afilVar, oxr oxrVar) {
        this.c = oxjVar;
        this.a = afilVar;
        this.b = oxrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.oxh
    public final void a(oxj oxjVar) {
        Status status;
        if (oxjVar.b == oxi.COMPLETED && (status = oxjVar.c) != null && status.e()) {
            ?? r5 = oxjVar.d;
            if (!(r5 instanceof MessageLite)) {
                ((zdv) oye.a.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerGrpcClientImpl$GrpcHandler", "onOperationStateChange", 468, "FoyerGrpcClientImpl.java")).u("Unexpected response type");
                return;
            }
            oxr oxrVar = this.b;
            if (oxrVar != 0) {
                oxrVar.o(r5, this.a);
            }
        }
    }

    @Override // defpackage.ager
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void g(MessageLite messageLite) {
        this.c.c(Status.OK, messageLite);
    }

    @Override // defpackage.ager
    public final void f(Throwable th) throws abxv {
        afih afihVar;
        byte bByteValue;
        Status statusB = Status.b(th);
        while (true) {
            if (th == null) {
                afihVar = null;
                break;
            } else if (th instanceof StatusException) {
                afihVar = ((StatusException) th).b;
                break;
            } else {
                if (th instanceof afjx) {
                    afihVar = ((afjx) th).b;
                    break;
                }
                th = th.getCause();
            }
        }
        if (afihVar != null) {
            afhy afhyVar = afih.f;
            int i = afid.c;
            byte[] bArr = (byte[]) afihVar.a(new afic("google.rpc.localizedmessage-bin", afhyVar));
            if (bArr != null) {
                try {
                    abxd abxdVarH = abxd.h(adcg.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
                    if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                        if (bByteValue != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            abxdVarH.cM(2, true != zL ? null : abxdVarH);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                    statusB = statusB.withDescription(((adcg) abxdVarH).b);
                } catch (abxv e) {
                    ((zdv) ((zdv) ((zdv) oye.a.d()).p(e)).q("com/google/android/libraries/home/homegraph/foyer/FoyerGrpcClientImpl$GrpcHandler", "onError", (char) 447, "FoyerGrpcClientImpl.java")).u("Invalid localized message");
                }
            }
        }
        this.c.c(statusB, null);
    }

    @Override // defpackage.ager
    public final void e() {
    }
}
