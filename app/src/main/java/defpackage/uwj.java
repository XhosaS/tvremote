package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uwj implements obn {
    final /* synthetic */ addh a;
    final /* synthetic */ obz b;
    final /* synthetic */ uwl c;

    public uwj(uwl uwlVar, addh addhVar, obz obzVar) {
        this.a = addhVar;
        this.b = obzVar;
        this.c = uwlVar;
    }

    @Override // defpackage.obn
    public final void a(View view, boolean z) {
        if (z) {
            uwl uwlVar = this.c;
            CommandOuterClass$Command defaultInstance = this.a.e;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
            oaa oaaVar = uwlVar.a;
            obz obzVar = this.b;
            nzv nzvVarP = nzx.p();
            ((nyu) nzvVarP).d = obzVar;
            nzvVarP.f(view);
            oaaVar.a(defaultInstance, nzvVarP.e()).k();
        }
    }
}
