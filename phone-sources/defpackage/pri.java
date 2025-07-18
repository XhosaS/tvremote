package defpackage;

import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pri implements ufw {
    private final /* synthetic */ int a;

    public /* synthetic */ pri(int i) {
        this.a = i;
    }

    @Override // defpackage.ufw
    public final uhp a(Object obj) throws Exception {
        switch (this.a) {
            case 0:
                return sfy.B(new IllegalStateException());
            case 1:
                nwk nwkVar = (nwk) obj;
                int iA = nwkVar.a();
                if (iA == 17 || iA == 31003) {
                    return uhl.a;
                }
                throw nwkVar;
            case 2:
                throw ((Exception) obj);
            case 3:
                throw ((Exception) obj);
            case 4:
                throw ((Exception) obj);
            case 5:
                throw ((Exception) obj);
            case 6:
                byte[] bArr = (byte[]) obj;
                vtp vtpVar = vtp.a;
                vvs vvsVar = vvs.a;
                vuc vucVarP = vuc.p(uzr.a, bArr, 0, bArr.length, vtp.a);
                vuc.B(vucVarP);
                return sfy.C((uzr) vucVarP);
            case 7:
                nwk nwkVar2 = (nwk) obj;
                return nwkVar2.a() == 17 ? sfy.B(new MdiNotAvailableException$ApiNotConnectedException()) : sfy.B(nwkVar2);
            case 8:
                IOException iOException = (IOException) obj;
                nwk nwkVar3 = (nwk) rrx.ar(iOException, nwk.class);
                return (nwkVar3 == null || nwkVar3.a() != 10) ? sfy.B(iOException) : sfy.B(new MdiNotAvailableException$DeveloperErrorException());
            case 9:
                nwk nwkVar4 = (nwk) obj;
                throw new rxh(nwkVar4.a(), nwkVar4.getMessage(), nwkVar4);
            default:
                return sfy.C("");
        }
    }
}
