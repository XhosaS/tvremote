package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class lsa implements khh {
    final /* synthetic */ byte[] a;

    public lsa(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.khh
    public final /* bridge */ /* synthetic */ void a(Object obj) throws abxv {
        rlw rlwVar = (rlw) obj;
        try {
            byte[] bArr = this.a;
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            boolean z = false;
            abxd abxdVarH = abxd.h(rky.a, bArr, 0, bArr.length, ExtensionRegistryLite.a);
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
            rky rkyVar = (rky) abxdVarH;
            Iterator it = rlwVar.b.b.iterator();
            while (it.hasNext()) {
                if (((rlv) it.next()).a(rkyVar.b) && !z) {
                    rlwVar.a.b();
                    z = true;
                }
            }
        } catch (abxv unused) {
        }
    }
}
