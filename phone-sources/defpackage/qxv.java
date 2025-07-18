package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxv extends AppCompatDialogFragment {
    public vrj a;
    private final yft b;

    public qxv() {
        yft yftVarG = ybn.g(3, new qxu(new bck(this, 20), 1));
        int i = ylg.a;
        this.b = new dwv(new ykl(qxw.class), new qxu(yftVarG, 0), new kfd(this, yftVarG, 3), new qxu(yftVarG, 2));
    }

    private final qxw a() {
        return (qxw) this.b.a();
    }

    @Override // android.support.v7.app.AppCompatDialogFragment, defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        vrj vrjVar = a().a;
        byte[] bArr = null;
        if (vrjVar != null) {
            this.a = vrjVar;
        } else if (this.a != null) {
            qxw qxwVarA = a();
            vrj vrjVar2 = this.a;
            if (vrjVar2 == null) {
                yks.c("data");
                vrjVar2 = null;
            }
            qxwVarA.a = vrjVar2;
        }
        vrj vrjVar3 = this.a;
        if (vrjVar3 == null) {
            throw new IllegalArgumentException("setData has to be called before onAttach");
        }
        ssn ssnVar = new ssn(requireContext());
        ssnVar.p(vrjVar3.a);
        ssnVar.e(vrjVar3.b);
        ssnVar.m(vrjVar3.c, new izm(vrjVar3, this, 3, bArr));
        CharSequence charSequence = vrjVar3.e;
        if (charSequence != null) {
            ssnVar.h(charSequence, null);
        }
        return ssnVar.create();
    }
}
