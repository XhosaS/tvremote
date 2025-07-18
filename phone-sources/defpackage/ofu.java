package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ofu implements nzs {
    final /* synthetic */ byte[] a;
    private final /* synthetic */ int b;

    public ofu(byte[] bArr, int i) {
        this.b = i;
        this.a = bArr;
    }

    @Override // defpackage.nzs
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ofl oflVar = (ofl) obj;
            try {
                byte[] bArr = this.a;
                vuc vucVarP = vuc.p(ofg.a, bArr, 0, bArr.length, vtp.a());
                vuc.B(vucVarP);
                oflVar.a(DesugarCollections.unmodifiableMap(((ofg) vucVarP).b));
                return;
            } catch (vuq e) {
                throw new IllegalStateException("Failed parsing account alerts proto", e);
            }
        }
        if (i == 1) {
            ofk ofkVar = (ofk) obj;
            try {
                byte[] bArr2 = this.a;
                vuc vucVarP2 = vuc.p(ofd.a, bArr2, 0, bArr2.length, vtp.a());
                vuc.B(vucVarP2);
                ofkVar.a(DesugarCollections.unmodifiableMap(((ofd) vucVarP2).b));
                return;
            } catch (vuq e2) {
                throw new IllegalStateException("Failed parsing account alerts proto", e2);
            }
        }
        tvv tvvVar = (tvv) obj;
        try {
            byte[] bArr3 = this.a;
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vuc vucVarP3 = vuc.p(ryu.a, bArr3, 0, bArr3.length, vtp.a);
            vuc.B(vucVarP3);
            ryu ryuVar = (ryu) vucVarP3;
            Iterator it = ((ryz) tvvVar.b).f.iterator();
            boolean z = false;
            while (it.hasNext()) {
                vun vunVar = ryuVar.b;
                unx unxVar = ryp.h;
                if (vunVar != null && !vunVar.isEmpty()) {
                    Iterator<E> it2 = vunVar.iterator();
                    boolean z2 = false;
                    while (it2.hasNext()) {
                        ryp[] rypVarArrG = unxVar.g((String) it2.next());
                        if (rypVarArrG != null) {
                            int i2 = 0;
                            while (i2 < rypVarArrG.length) {
                                boolean z3 = rypVarArrG[i2].f;
                                i2++;
                                z2 = true;
                            }
                        }
                    }
                    if (z2 && !z) {
                        ((rza) tvvVar.a).a();
                        z = true;
                    }
                }
            }
        } catch (vuq unused) {
        }
    }
}
