package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raj extends rbn {
    private final rbr a;
    private final rcy b;
    private final rde c;
    private final vvd d;

    public raj(rbr rbrVar, vvd vvdVar, rcy rcyVar, rde rdeVar) {
        this.a = rbrVar;
        this.d = vvdVar;
        this.b = rcyVar;
        this.c = rdeVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        vpg vpgVar = (vpg) obj2;
        vpgVar.getClass();
        View view = ((rak) obj).itemView;
        view.getClass();
        vph vphVar = new vph(vpgVar);
        vvd vvdVar = this.d;
        vvdVar.o(view, 90144, null, new nay(vvdVar, vphVar, 6));
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        rak rakVar = (rak) obj;
        vpg vpgVar = (vpg) obj2;
        vpgVar.getClass();
        rakVar.b.setText(vpgVar.c);
        TextView textView = rakVar.c;
        String str = vpgVar.d;
        textView.setText(str);
        rakVar.e.setVisibility(8);
        cqn cqnVar = new cqn();
        ConstraintLayout constraintLayout = rakVar.a;
        cqnVar.e(constraintLayout);
        FrameLayout frameLayout = rakVar.e;
        int id = textView.getId();
        cqnVar.g(frameLayout.getId(), 3, id, 3);
        cqnVar.g(frameLayout.getId(), 4, id, 4);
        cqnVar.c(constraintLayout);
        textView.setVisibility(str != null ? 0 : 8);
        this.a.c(rakVar.h, new rbq(vpgVar.a, vpgVar.b, vpgVar.g));
        vqs vqsVar = vpgVar.f;
        if (vqsVar == null) {
            rakVar.f.setVisibility(8);
            return;
        }
        rakVar.f.setVisibility(0);
        rcy rcyVar = this.b;
        Object obj3 = rakVar.g.get();
        obj3.getClass();
        rcyVar.c(obj3, vqsVar);
    }
}
