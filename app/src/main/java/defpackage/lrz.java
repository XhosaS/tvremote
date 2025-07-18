package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
class lrz extends lsi {
    final /* synthetic */ lvj a;

    public lrz(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // defpackage.lsj
    public final void c(Status status, byte[] bArr) throws abxv {
        byte bByteValue;
        abxd abxdVar = null;
        if (!status.c()) {
            kid.a(status, null, this.a);
            return;
        }
        try {
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            abxd abxdVarH = abxd.h(rhy.a, bArr, 0, bArr.length, ExtensionRegistryLite.a);
            if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
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
            kid.a(status, (rhy) abxdVarH, this.a);
        } catch (abxv e) {
            this.a.a.o(e);
        }
    }
}
