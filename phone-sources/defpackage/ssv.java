package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ssv implements stt {
    public final stk a;
    public snw b;
    private final Context c;
    private final ArrayList d = new ArrayList();
    private snw e;
    private final xzg f;

    public ssv(stk stkVar, xzg xzgVar) {
        this.a = stkVar;
        this.c = stkVar.getContext();
        this.f = xzgVar;
    }

    @Override // defpackage.stt
    public AnimatorSet a() {
        return b(c());
    }

    final AnimatorSet b(snw snwVar) {
        ArrayList arrayList = new ArrayList();
        if (snwVar.f("opacity")) {
            arrayList.add(snwVar.a("opacity", this.a, View.ALPHA));
        }
        if (snwVar.f("scale")) {
            stk stkVar = this.a;
            arrayList.add(snwVar.a("scale", stkVar, View.SCALE_Y));
            arrayList.add(snwVar.a("scale", stkVar, View.SCALE_X));
        }
        if (snwVar.f("width")) {
            arrayList.add(snwVar.a("width", this.a, stk.v));
        }
        if (snwVar.f("height")) {
            arrayList.add(snwVar.a("height", this.a, stk.w));
        }
        if (snwVar.f("paddingStart")) {
            arrayList.add(snwVar.a("paddingStart", this.a, stk.x));
        }
        if (snwVar.f("paddingEnd")) {
            arrayList.add(snwVar.a("paddingEnd", this.a, stk.y));
        }
        if (snwVar.f("labelOpacity")) {
            arrayList.add(snwVar.a("labelOpacity", this.a, new ssu(this, Float.class)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        sin.b(animatorSet, arrayList);
        return animatorSet;
    }

    public final snw c() {
        snw snwVar = this.b;
        if (snwVar != null) {
            return snwVar;
        }
        if (this.e == null) {
            this.e = snw.c(this.c, h());
        }
        snw snwVar2 = this.e;
        snwVar2.getClass();
        return snwVar2;
    }

    @Override // defpackage.stt
    public final List d() {
        return this.d;
    }

    @Override // defpackage.stt
    public void e() {
        this.f.b();
    }

    @Override // defpackage.stt
    public void f() {
        this.f.b();
    }

    @Override // defpackage.stt
    public void g(Animator animator) {
        xzg xzgVar = this.f;
        Object obj = xzgVar.a;
        if (obj != null) {
            ((Animator) obj).cancel();
        }
        xzgVar.a = animator;
    }
}
