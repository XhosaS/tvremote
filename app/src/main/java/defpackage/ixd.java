package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixd extends exd implements ixc {
    private final agow d;
    private final ewo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixd(Context context, ewo ewoVar, agow agowVar, WindowManager windowManager) {
        super(context, windowManager);
        context.getClass();
        agowVar.getClass();
        windowManager.getClass();
        this.e = ewoVar;
        this.d = agowVar;
    }

    @Override // defpackage.jpl
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
    }

    @Override // defpackage.jpl
    public final void e(ViewGroup viewGroup) {
        viewGroup.getClass();
    }

    @Override // defpackage.ixc
    public final void j() {
        ((iwk) this.d.a()).j();
    }

    @Override // defpackage.jpk
    public final jpg k() {
        return new ixi(this.e);
    }

    public final void l(ArrayList arrayList) {
        Intent intent = new Intent("show");
        intent.putStringArrayListExtra("queries", arrayList);
        this.c.n(intent);
        jph jphVarH = h();
        if (jphVarH != null) {
            jpg jpgVar = jphVarH.a;
            if (jpgVar instanceof ixi) {
                ((ixi) jpgVar).e = this;
            }
        }
    }

    public final void m() {
        jph jphVarH = h();
        if (jphVarH == null) {
            return;
        }
        jpg jpgVar = jphVarH.a;
        if (jpgVar instanceof ixi) {
            ((ixi) jpgVar).eD();
        }
    }

    public final boolean n() {
        return h() != null;
    }
}
