package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyu extends nzv {
    public View a;
    public ofs b;
    public SenderStateOuterClass$SenderState c;
    public obz d;
    public ocj e;
    public oal f;
    public MotionEvent g;
    public int h;
    private WeakReference j;
    private yyr k;

    public nyu() {
    }

    @Override // defpackage.nzv
    public final nzx a() {
        oal oalVar;
        yyr yyrVar = this.k;
        if (yyrVar != null && (oalVar = this.f) != null) {
            return new nyv(this.j, this.a, this.h, this.b, yyrVar, this.c, this.d, this.e, oalVar, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.k == null) {
            sb.append(" customMap");
        }
        if (this.f == null) {
            sb.append(" conversionContext");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.nzv
    public final void b(oal oalVar) {
        if (oalVar == null) {
            throw new NullPointerException("Null conversionContext");
        }
        this.f = oalVar;
    }

    @Override // defpackage.nzv
    public final void c(yyr yyrVar) {
        this.k = yyrVar;
    }

    @Override // defpackage.nzv
    public final void d(WeakReference weakReference) {
        this.j = weakReference;
    }

    public nyu(nzx nzxVar) {
        nyv nyvVar = (nyv) nzxVar;
        this.j = nyvVar.a;
        this.a = nyvVar.b;
        this.h = nyvVar.j;
        this.b = nyvVar.c;
        this.k = nyvVar.d;
        this.c = nyvVar.e;
        this.d = nyvVar.f;
        this.e = nyvVar.g;
        this.f = nyvVar.h;
        this.g = nyvVar.i;
    }
}
