package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mvs implements nzy {
    public final oat a;

    public mvs(oat oatVar) {
        this.a = oatVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return aczh.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, nzx nzxVar) {
        final aczh aczhVar = (aczh) obj;
        return this.a.a(aczhVar.c).p(ypv.a).a(new aggz() { // from class: mvr
            @Override // defpackage.aggz
            public final Object a(Object obj2) {
                byte[] bArr = (byte[]) ((yqt) obj2).e(ock.a);
                mvs mvsVar = this.a;
                aczh aczhVar2 = aczhVar;
                try {
                    aeef aeefVarA = EkoProcessor.a(aczhVar2.d.B(), bArr);
                    Status status = aeefVarA.a;
                    if (!status.e()) {
                        throw new ocp("Eko processor error: " + status.getDescription());
                    }
                    oat oatVar = mvsVar.a;
                    String str = aczhVar2.c;
                    byte[] bArr2 = aeefVarA.b;
                    bArr2.getClass();
                    oatVar.b(str, bArr2);
                    agff agffVar = agij.a;
                    aggz aggzVar = agoh.n;
                    return agffVar;
                } catch (IOException e) {
                    throw new ocp("Invalid eko template", e);
                }
            }
        });
    }
}
