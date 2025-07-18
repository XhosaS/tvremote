package defpackage;

import com.google.android.libraries.elements.interfaces.FetcherFactory;
import com.google.protobuf.ExtensionRegistryLite;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mqu extends FetcherFactory {
    final /* synthetic */ abwk a;
    final /* synthetic */ oan b;
    final /* synthetic */ mqv c;

    public mqu(mqv mqvVar, abwk abwkVar, oan oanVar) {
        this.a = abwkVar;
        this.b = oanVar;
        this.c = mqvVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FetcherFactory
    public final StatusOr create(int i, byte[] bArr) throws abxv {
        try {
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            acwp acwpVar = acwp.a;
            abxd abxdVarH = abxd.h(acwpVar, bArr, 0, bArr.length, generatedRegistry);
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            acwp acwpVar2 = (acwp) abxdVarH;
            abxc abxcVar = (abxc) this.a;
            if (abxcVar.a != acwpVar) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Object objK = acwpVar2.n.k(abxcVar.d);
            if (objK == null) {
                Object obj = abxcVar.b;
            } else {
                abxcVar.b(objK);
            }
            return StatusOr.fromValue(this.b.b());
        } catch (abxv e) {
            this.c.a.d(acsw.LOG_TYPE_CONFIGURATION_ERROR, oal.A, e, "Error parsing Fetcher configuration", new Object[0]);
            return StatusOr.fromStatus(Status.b(e));
        }
    }
}
