package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjb extends ce implements uj, bem, dj {
    private final wit a;
    private final Context f;
    private final ui g;
    private final wja h;

    public wjb(wit witVar, Context context, ui uiVar, wja wjaVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        context.getClass();
        super(null, context, handler);
        this.a = witVar;
        this.f = context;
        this.g = uiVar;
        this.h = wjaVar;
    }

    @Override // defpackage.ce, defpackage.ca
    public final View a(int i) {
        return this.h.a.findViewById(i);
    }

    @Override // defpackage.ce
    public final LayoutInflater c() {
        Context context = this.f;
        return LayoutInflater.from(context).cloneInContext(context);
    }

    @Override // defpackage.uj
    public final ui dc() {
        return this.g;
    }

    @Override // defpackage.bcl
    public final bcg ek() {
        return ((wiw) this.a).b;
    }

    @Override // defpackage.bem
    public final bel el() {
        return ((wiw) this.a).h;
    }

    @Override // defpackage.ce
    public final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.dj
    public final void r(bq bqVar) {
        if (bqVar instanceof aeiz) {
            yqw.R(bqVar instanceof wiu, "Fragment %s attached to FragmentHost should be activity agnostic, either annotate FragmentPeer/Fragment with @ActivityAgnosticPeer/@ActivityAgnostic or remove the fragment.", bqVar.getClass());
        }
    }
}
