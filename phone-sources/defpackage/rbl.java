package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.common.collect.ImmutableExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbl extends rbn {
    private final rbr a;
    private final yyh b;
    private final vvd c;

    public rbl(rbr rbrVar, vvd vvdVar, yyh yyhVar) {
        this.a = rbrVar;
        this.c = vvdVar;
        this.b = yyhVar;
    }

    private final void d(xrk xrkVar, List list, Context context) {
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.k((vqe) it.next(), context));
        }
        xrkVar.j(ImmutableExtensionsKt.toImmutableList((Collection) arrayList));
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        yyh yyhVar = (yyh) obj;
        vqj vqjVar = (vqj) obj2;
        vqjVar.getClass();
        Object obj3 = yyhVar.b;
        vpu vpuVar = new vpu(vqjVar.a);
        vvd vvdVar = this.c;
        vvdVar.o((View) obj3, 90139, null, new nay(vvdVar, vpuVar, 6));
        Object obj4 = yyhVar.a;
        vrp vrpVar = vqjVar.e;
        if (vrpVar != null) {
            vvdVar.i((View) obj4, 111271, vrpVar, null);
            ((FrameLayout) obj4).setImportantForAccessibility(1);
        } else {
            FrameLayout frameLayout = (FrameLayout) obj4;
            frameLayout.setClickable(false);
            frameLayout.setImportantForAccessibility(4);
        }
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        yyh yyhVar = (yyh) obj;
        vqj vqjVar = (vqj) obj2;
        vqjVar.getClass();
        this.a.c(yyhVar.e, new rbq(vqjVar.a, vqjVar.b));
        Object obj3 = yyhVar.b;
        Object obj4 = yyhVar.d;
        Button button = (Button) obj3;
        Context context = button.getContext();
        context.getClass();
        d((xrk) obj4, vqjVar.c, context);
        Object obj5 = yyhVar.c;
        List list = vqjVar.d;
        d((xrk) obj5, list, context);
        button.setVisibility(true != list.isEmpty() ? 0 : 8);
    }
}
