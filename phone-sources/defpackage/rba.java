package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rba extends rbn {
    private final yyh a;
    private final vvd b;

    public rba(vvd vvdVar, yyh yyhVar) {
        this.b = vvdVar;
        this.a = yyhVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        vvd vvdVar = (vvd) obj;
        vox voxVar = (vox) obj2;
        voxVar.getClass();
        vrn vrnVar = voxVar.a;
        vqf vqfVar = new vqf(vrnVar);
        Object obj3 = vvdVar.a;
        vvd vvdVar2 = this.b;
        vvdVar2.o((View) obj3, 90532, null, new nay(vvdVar2, vqfVar, 6));
        vvdVar2.o((View) vvdVar.b, 90533, null, new nay(vvdVar2, new vqk(vrnVar), 6));
        vvdVar2.o((View) vvdVar.c, 90534, null, new nay(vvdVar2, new vpr(vrnVar), 6));
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) throws NumberFormatException {
        vox voxVar = (vox) obj2;
        voxVar.getClass();
        rbg rbgVar = (rbg) ((vvd) obj).d;
        if (yks.e(voxVar, rbgVar.n)) {
            return;
        }
        yyh yyhVar = this.a;
        rbgVar.n = voxVar;
        rbgVar.m = null;
        vqe vqeVar = voxVar.b;
        MaterialButton materialButton = rbgVar.j;
        Context context = materialButton.getContext();
        context.getClass();
        vqe vqeVar2 = voxVar.c;
        MaterialButton materialButton2 = rbgVar.k;
        String strK = yyhVar.k(vqeVar, context);
        Context context2 = materialButton2.getContext();
        context2.getClass();
        String strK2 = yyhVar.k(vqeVar2, context2);
        if (!yks.e(materialButton.getText(), strK)) {
            materialButton.setText(strK);
        }
        if (!yks.e(materialButton2.getText(), strK2)) {
            materialButton2.setText(strK2);
        }
        rbgVar.l.setText((CharSequence) null);
        rbgVar.p = rbgVar.o;
    }
}
